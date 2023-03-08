package baekjoon;

import java.io.*;

public class Fast_A_plus_B {

	public static void main(String[] args) throws IOException{
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out)); // 출력
		
//		String A = br.readLine(); // String만 입력 가능
//		String B = br.readLine();
		String T = br.readLine();
//		br.close(); // 입력완료후 닫기처리
		
//		bw.write(A); // 입력받은 내용 출력 전처리
//		bw.write(B);
//		bw.flush(); // 콘솔 출력
//		bw.close(); // 전체 과정 종료
		
		for(int i = 0; i<Integer.parseInt(T);i++) {
			String A = br.readLine(); // String만 입력 가능
			String B = br.readLine();
			String result = Integer.toString(Integer.parseInt(A)+Integer.parseInt(B));
			bw.write(result+"\n"); // 입력받은 내용 출력 전처리
		}
		br.close(); // 입력완료후 닫기처리
		bw.flush(); // 콘솔 출력
		bw.close(); // 전체 과정 종료
	}catch(NumberFormatException e) {
		
	}
	}//main method end

}// public class end

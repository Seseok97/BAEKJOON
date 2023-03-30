package baekjoon;

import java.util.Scanner;


public class Q_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		
		String[] strs=new String[str.length()];
		for(int i=0;i<str.length();i++) {
			strs[i] = str.substring(i,i+1);
		}
		
		int result=0;
		for(int i=0;i<str.length();i++) {
			result += Integer.parseInt(strs[i]);
		}
		System.out.println(result);
		
		

	}// main() method end

}// publid class end



//1t
//Scanner sc = new Scanner(System.in);
//int N = sc.nextInt();
//int num = sc.nextInt();

//2t
//char ch = (char)System.in.read();
//System.out.println(ch);

//3t
//String str = System.in.toString();
//System.out.println(str);

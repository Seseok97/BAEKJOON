package baekjoon;

import java.util.Scanner;

public class alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if((H>=0 && H<=23)&&(M>=0 && M<=59)) {
			M += 15;
			if(M>59) {
				M -= 60;
			}else if(M>=0) {
				H -=1;
			}
			
			if(H<0) {
				H = 23;
			}

			System.out.println(H+" "+M);
		}

	}

}

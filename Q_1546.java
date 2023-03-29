package baekjoon;

import java.util.Scanner;

public class Q_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double []Scores = new double[N];
		for(int i=0;i<N;i++) {
			double score = sc.nextDouble();
			Scores[i] = score;
		}
		double max=Scores[0];
		for(int i=0;i<N;i++) {
			if(max < Scores[i]) {
				max = Scores[i];
			}
		}
		for(int i=0;i<N;i++) {
			Scores[i] = (Scores[i]/max)*100;
		}
		double sum = 0;
		for(int i=0;i<N;i++) {
			sum += Scores[i];
		}
		System.out.println(sum/Scores.length);
	}// main() method end

}// public class end

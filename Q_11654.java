package baekjoon;

import java.util.Scanner;

public class Q_11654 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] uni = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
						"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
						"1","2","3","4","5","6","7","8","9","0"};
		
		int n = 0;
		for(int i=0;i<uni.length;i++) {
			if(str.equals(uni[i])) {
				n = i;
			}
		}	
		int[] ASC = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,
					97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,
					49,50,51,52,53,54,55,56,57,48};
		System.out.println(ASC[n]);

	}// main() method end

} // public class end

//char ch = 'A';
//System.out.println(Character.toString(ch));
//System.out.println(String.valueOf(ch));
////System.out.println(str.charAt(ch));
//System.out.println(str.chars());
//System.out.println((int)ch);

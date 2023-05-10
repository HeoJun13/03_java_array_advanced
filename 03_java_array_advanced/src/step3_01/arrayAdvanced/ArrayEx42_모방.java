package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * 옷 □ □ □ □     // 0 = 옷 , □ = 1~15 ,■ = 20
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx42_모방 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int Lode = 20;
		
		int[][] map = {
				{0,  1,  2,  3,  4},
				{15, 20, 20, 20, 5},
				{14, 20, 20, 20, 6},
				{13, 20, 20, 20, 7},
				{12, 11, 10, 9,  8}
			};
		
		int player = 0;
		
		while (true) {
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map.length; j++) {
					if (map[i][j] == Lode) {
						System.out.print(" ■ ");
					}
					else if (map[i][j] == player) {
						System.out.print(" P ");
					}
					else {
						System.out.print(" □ ");
					}
					}
				}
			System.out.println();
			}
		}
	}
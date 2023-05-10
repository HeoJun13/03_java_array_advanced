package step3_01.arrayAdvanced;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx44_분석 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		int size = 10;
		int[][] mono = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		
		int p1x = 0;
		int p1y = 0;
		int p2x = 0;
		int p2y = 0;
		int turn = 0;
		int win = 0;
		
		while (true) {
			
			System.out.println("===== 오목게임 =====");
			System.out.print("  ");
			for (int i = 0; i < size; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < size; i++) {
				System.out.print( i + " ");
				for (int j = 0; j < size; j++) {
					System.out.print(mono[i][j] + " ");
					
				}
				System.out.println();
			}
			
			if (win == 1) {
				System.out.println("1p승리");
			}else if (win == 2) {
				System.out.println("2p승리");
				break;
			}
			
			if(turn % 2 == 0) {
				System.out.println("[p1차례]");
				System.out.print("Y좌표 입력 : ");
				p1y= scan.nextInt();
				System.out.println("x좌표 입력 : ");
				p1x = scan.nextInt();
				if (mono[p1x][p1y] == 0) {
					mono[p1x][p1y] = 1;
					turn += 1;
				}
			}
			else if(turn % 2 == 1) {
				System.out.println("[p2차례]");
				System.out.println(" Y좌표 입력 : ");
				p2y = scan.nextInt();
				System.out.println(" x좌표 입력 : ");
				p2x = scan.nextInt();
				if (mono [p2y][p2x] == 0) {
					mono [p2y][p2x] = 2;
					turn += 1;
				}
			}
			
			// 가로검사
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - 4; j++) {
					if (mono[i][j] == 1 && mono[i][j+1]==1 && mono[i][j+2]==1 &&mono[i][j+3]==1 && mono[i][j+4]==1 ) win = 1;
					if (mono[i][j] == 2 && mono[i][j+1]==2 && mono[i][j+2]==2 &&mono[i][j+3]==2 && mono[i][j+4]==2 ) win = 2;
				}		
			} //세로검
			for (int i = 0; i < size -4; i++) {
				for (int j = 0; j < size; j++) {
					if (mono[i][j] == 1 && mono[i+1][j]==1 && mono[i+2][j]==1 &&mono[i+3][j]==1 && mono[i+4][j]==1 ) win = 1;
					if (mono[i][j] == 2 && mono[i+1][j]==2 && mono[i+2][j]==2 &&mono[i+3][j]==2 && mono[i+4][j]==2 ) win = 2;	
				}
			} // 대각선.
			for (int i = 0; i < size - 4; i++) {
				for (int j = 0; j < size - 4; j++) {
					if (mono[i][j] == 1 && mono[i+1][j+1]==1 && mono[i+2][j+2]==1 &&mono[i+3][j+3]==1 && mono[i+4][j+4]==1 ) win = 1;
					if (mono[i][j] == 2 && mono[i+1][j+1]==2 && mono[i+2][j+2]==2 &&mono[i+3][j+3]==2 && mono[i+4][j+4]==2 ) win = 2;	
				}
			}
			for (int i = 9; i < size - 7; i--) {
				for (int j = 0; j < size - 4; j++) {
					if (mono[i][j] == 1 && mono[i-1][j+1]==1 && mono[i-2][j+2]==1 &&mono[i-3][j+3]==1 && mono[i-4][j+4]==1 ) win = 1;
					if (mono[i][j] == 2 && mono[i-1][j+1]==2 && mono[i-2][j+2]==2 &&mono[i-3][j+3]==2 && mono[i-4][j+4]==2 ) win = 2;
				}
			}
		}
		scan.close();
	}	
}

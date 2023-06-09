package step3_01.arrayAdvanced;

import java.util.Scanner;

// #오목

public class ArrayEx44_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
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

		int p1Y = 0; // 1p y 변수
		int p1X = 0; // 1p x 변수
		int p2Y = 0; // 2p y 변수
		int p2X = 0; // 2p x 변수
		int turn = 0; // 턴변경 변수
		int win = 0; //	이겼을때 변수
		
		
		
		while (true) { //반복 초기상태
			
			// 전체화면 출력
			System.out.println(" ==== OMOK GAME ===="); //스타트
			System.out.print("  ");  
			for (int i = 0; i < size; i++) { //첫줄 0부터 size(10)전 9까지 반복 x축
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < size; i++) { //첫줄 0부터 size(10)전 9까지 반복 y축
				System.out.print(i + " ");
				for (int j = 0; j < size; j++) { // y 축 시작과 동시에 그칸수를 0으로 채우기
					System.out.print(omok[i][j] + " ");
				}
				System.out.println();
			}

			
			if (win == 1) {
				System.out.println("p1승리");
				break;
			} 
			else if (win == 2) {
				System.out.println("p2승리");
				break;
			}

			
			// 바둑알 두기
			if (turn % 2 == 0) { // 짝수
				System.out.println("[p1차례]"); // 
				System.out.print("Y좌표 입력 : ");
				p1Y = scan.nextInt();
				System.out.print("X좌표 입력 : ");
				p1X = scan.nextInt();
				if (omok[p1Y][p1X] == 0) {
					omok[p1Y][p1X] = 1;
					turn += 1;
				}
			} 
			else if (turn % 2 == 1) { // 홀수
				System.out.println("[p2차례]");
				System.out.print("Y좌표 입력 : ");
				p2Y = scan.nextInt();
				System.out.print("X좌표 입력 : ");
				p2X = scan.nextInt();
				if (omok[p2Y][p2X] == 0) {
					omok[p2Y][p2X] = 2;
					turn += 1;
				}
			}

			// 가로검사
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - 4; j++) { // -4인 인 이유. 0부터 5까지 반복.
					if (omok[i][j] == 1 && omok[i][j + 1] == 1 && omok[i][j + 2] == 1 && omok[i][j + 3] == 1 && omok[i][j + 4] == 1) win = 1;				
					if (omok[i][j] == 2 && omok[i][j + 1] == 2 && omok[i][j + 2] == 2 && omok[i][j + 3] == 2 && omok[i][j + 4] == 2) win = 2;					
				}
			}

			// 세로검사
			for (int i = 0; i < size - 4; i++) {
				for (int j = 0; j < size ; j++) {
					if (omok[i][j] == 1 && omok[i + 1][j] == 1 && omok[i + 2][j] == 1 && omok[i + 3][j] == 1 && omok[i + 4][j] == 1) win = 1;				
					if (omok[i][j] == 2 && omok[i + 1][j] == 2 && omok[i + 2][j] == 1 && omok[i + 3][j] == 1 && omok[i + 4][j] == 1) win = 2;				
				}
			}

			// 대각선 검사
			for (int i = 0; i < size - 4; i++) { // 0 1 2 3 4 5  6에서는 대각선으로 4개까지 가능으로 6은못한다
				for (int j = 0; j < size - 4; j++) {// 0 1 2 3 4 5 
					if (omok[i][j] == 1 && omok[i + 1][j + 1] == 1 && omok[i + 2][j + 2] == 1 && omok[i + 3][j + 3] == 1 && omok[i + 4][j + 4] == 1)  win = 1;					
					if (omok[i][j] == 2 && omok[i + 1][j + 1] == 2 && omok[i + 2][j + 2] == 2 && omok[i + 3][j + 3] == 2  && omok[i + 4][j + 4] == 2) win = 2;				
				}
			}
			
			for (int i = 9; i > size - 7; i--) { //9 8 7 6 5 4
				for (int j = 0; j < size - 4; j++) { // 0 1 2 3 4 5
					if (omok[i][j] == 1 && omok[i - 1][j + 1] == 1 && omok[i - 2][j + 2] == 1 && omok[i - 3][j + 3] == 1 && omok[i - 4][j + 4] == 1) win = 1;
					if (omok[i][j] == 2 && omok[i - 1][j + 1] == 2 && omok[i - 2][j + 2] == 2 && omok[i - 3][j + 3] == 2 && omok[i - 4][j + 4] == 2) win = 2;
				}
			}
		}
 
		scan.close();

	}

}

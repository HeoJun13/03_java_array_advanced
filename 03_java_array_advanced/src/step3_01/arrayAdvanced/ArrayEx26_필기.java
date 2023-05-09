package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다. 1 to 19
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 oneToNine 배열에 저장하고, 
 *    숫자 10~18은 tenToEightTeen 배열에 저장한다.
 */


public class ArrayEx26_필기 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		final int SIZE = 9;
		
		int[] oneToNine = new int[SIZE];
		int[] tenToEightTeen  = new int[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			oneToNine[i] = i + 1;
			tenToEightTeen[i] = SIZE + (i+1);
		}
		for (int i = 0; i < 1000; i++) {
			int rIdx = ran.nextInt(SIZE);
			int temp = oneToNine[0];
			oneToNine[0] = oneToNine[rIdx];
			oneToNine[rIdx] = temp;
			
		}
		int question = 1;
		while (true ) {
			
			if (question == 19)
				System.out.println("클리어 했습니다. 프로그램을 종료합니다");
			break;
		}
		
		System.out.println();
		
	}
	
}

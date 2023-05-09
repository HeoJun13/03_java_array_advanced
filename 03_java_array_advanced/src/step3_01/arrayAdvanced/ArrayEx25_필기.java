package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Scanner;


// 17:18
// 반복문 

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 -1로 변경한다.
 * 3. arr배열의 모든 값이 -1로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24 // i
 * 입력 : 100
 * 
 * 11, 87, 42, -1, 24
 * 입력 : 87
 * 
 * 11, -1, 42, -1, 24
 * 
 */


public class ArrayEx25_필기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		int cnt = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));
			System.out.println();
			
			
			
			int maxNum = 0;
			int maxIdx = 0;
			
			for (int i = 0; i < arr.length; i++) {
				if (maxNum < arr[i]) {
					maxNum = arr[i];
					maxIdx = i;
				}
			}
			System.out.println("# 입력 : ");
			int mymaxNum = scan.nextInt();
			
			if (mymaxNum == maxNum) {
				arr[maxIdx] = -1; // 맞추면 -1으로 변경
				cnt++; // 반복
			}
			if (cnt == 5)
				break; //5개가 -1 일때 종료
			
		}
	}
}

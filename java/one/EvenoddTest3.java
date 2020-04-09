package com.java.one;

import java.util.Scanner;

public class EvenoddTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 숫자 2개받아서 3개짜리 배열에 앞쪽부터 저장
		// 입력된 숫자를 더하기 해서,짝홀 구분 후 더해진 결과 값을 배열 3번째에 입력
		// 전체 출력
		int arr[] = new int[3];
		int sum = 0;

		System.out.println("숫자 2개 숫자 입력");
		arr[0] = sc.nextInt();// 첫번째 입력
		arr[1] = sc.nextInt();// 두번째 입력
		// 두 숫자 더하기
		int pNum = arr[0] + arr[1];

		if (pNum % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		arr[2] = pNum;

		// 출력
		for (int i = 0; i < arr.length; i++) {

			// if (i<2) {
			// System.out.print(arr[i] + ",");
			//
			//
			// } else {
			// System.out.print(arr[i]);
			// }
			if (!(i == arr.length - 1)) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.print(arr[i]);
			}
		}
		
	}
}
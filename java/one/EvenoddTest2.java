package com.java.one;

import java.util.Scanner;

public class EvenoddTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 숫자 2개받아서 3개짜리 배열에 앞쪽부터 저장
		// 입력된 숫자를 더하기 해서,짝홀 구분 후 더해진 결과 값을 배열 3번째에 입력
		// 전체 출력
		int arr[] = new int[3];
		int sum = 0;

		System.out.println("숫자 2개 숫자 입력");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

		// System.out.println("숫자입력");
		// int num = sc.nextInt();

		if (sum % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
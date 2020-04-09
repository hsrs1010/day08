package com.java.one;

import java.util.Scanner;

public class EvenoddTest {
	public static void main(String[] args) {
		// 입력 숫자 하나 받아서 짝홀 구분
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
} 
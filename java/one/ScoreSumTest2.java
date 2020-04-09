package com.java.one;

import java.util.Scanner;

public class ScoreSumTest2 {
	public static void main(String[] args) {
		// 배열 arr 5개짜리 만들고,
		// 성적 입력
		// 합계 평균 출력
		// 계속 입력
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		
		boolean flag=false;
		while (true) {
			int sum = 0;

			System.out.println(arr.length + "개 성적 입력");

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] == -1) {
					System.out.println("종료");
					flag=true;
					break;
				}
				sum += arr[i];
			}
			if (flag==true) {
				break;
			}
			System.out.println("총원은 " + arr.length);
			System.out.println("합계는 " + sum);
			System.out.println("평균은 " + (double) sum / arr.length);
			sc.close();
		}

	}
}

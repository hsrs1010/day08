package com.java.one;

import java.util.Scanner;

public class ScoreSumTest2 {
	public static void main(String[] args) {
		// �迭 arr 5��¥�� �����,
		// ���� �Է�
		// �հ� ��� ���
		// ��� �Է�
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		
		boolean flag=false;
		while (true) {
			int sum = 0;

			System.out.println(arr.length + "�� ���� �Է�");

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] == -1) {
					System.out.println("����");
					flag=true;
					break;
				}
				sum += arr[i];
			}
			if (flag==true) {
				break;
			}
			System.out.println("�ѿ��� " + arr.length);
			System.out.println("�հ�� " + sum);
			System.out.println("����� " + (double) sum / arr.length);
			sc.close();
		}

	}
}

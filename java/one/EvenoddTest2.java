package com.java.one;

import java.util.Scanner;

public class EvenoddTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �Է� ���� 2���޾Ƽ� 3��¥�� �迭�� ���ʺ��� ����
		// �Էµ� ���ڸ� ���ϱ� �ؼ�,¦Ȧ ���� �� ������ ��� ���� �迭 3��°�� �Է�
		// ��ü ���
		int arr[] = new int[3];
		int sum = 0;

		System.out.println("���� 2�� ���� �Է�");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

		// System.out.println("�����Է�");
		// int num = sc.nextInt();

		if (sum % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}
}
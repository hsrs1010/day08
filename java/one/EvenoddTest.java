package com.java.one;

import java.util.Scanner;

public class EvenoddTest {
	public static void main(String[] args) {
		// �Է� ���� �ϳ� �޾Ƽ� ¦Ȧ ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
	}
} 
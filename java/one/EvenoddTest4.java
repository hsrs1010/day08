package com.java.one;

import java.util.Scanner;

public class EvenoddTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �Է� ���� 2���޾Ƽ� 3��¥�� �迭�� ���ʺ��� ����
		// �Էµ� ���ڸ� ���ϱ� �ؼ�,¦Ȧ ���� �� ������ ��� ���� �迭 3��°�� �Է�
		// ��� �Է� �� �� �ֵ��� ����
		// ��ü ���
		int arr[] = new int[3];

		while (true) {

			System.out.println("���� 2�� ���� �Է�");

			arr[0] = sc.nextInt();// ù��° �Է�
			// Ż�� ����
			if (arr[0] == -1) {
				System.out.println("����");
				break;
			}
				arr[1] = sc.nextInt();// �ι�° �Է�

				// �� ���� ���ϱ�
				int pNum = arr[0] + arr[1];

				if (pNum % 2 == 0)
					System.out.println("¦��");
				else
					System.out.println("Ȧ��");
				arr[2] = pNum;

				// ���
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
						System.out.println(arr[i]);
					}
				}

			}

		}
	
}

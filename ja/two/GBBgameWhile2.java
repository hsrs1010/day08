package com.ja.two;

import java.util.Scanner;

public class GBBgameWhile2 {

	public static void main(String[] args) {
		// -1�� �Է� �ؼ� ����, �ݺ� �����
		// �迭�� �̿��Ͽ�
		// ���� �¸� : 10���� 3���¸�
		// ö�� �¸� : 10���� 3���¸�
		// ���º� : 10���� 4�� �¸�
		int cnt = 0; // ���� Ƚ��
		//�¸� Ƚ�� �迭
		int arr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<<RockPaperSissorsGame>>");

		while (true) {
			System.out.println("���� : 1, ���� : 2, �� : 3");
			System.out.println("ö�� �Է�");
			int cnum = sc.nextInt();

			if (cnum == -1)
				break;

			System.out.println("���� �Է�");
			int ynum = sc.nextInt();
			if (ynum == -1)
				break;
			boolean cFlag = (cnum == 1 && ynum == 3) || (cnum == 2 && ynum == 1) || (cnum == 3 && ynum == 2);

			// ö�� �¸�
			if (cFlag) {
				arr[0]++; //�¸� Ƚ�� ����
				System.out.println("ö�� �¸�");
			}

			// ���� �¸�
			else if (cnum == 3 && ynum == 1 || cnum == 1 && ynum == 2 || 
					cnum == 2 && ynum == 3) {
				arr[1]++;
				System.out.println("���� �¸�");
			} else {
				arr[2]++;
				System.out.println("���º�");

			}
			cnt++;

		}
		System.out.println("���� Ƚ�� : " + cnt);
		System.out.println("ö�� �¸� : " +cnt+"�� �� "+arr[0]+"�� �¸�");
		System.out.println("���� �¸� : " +cnt+"�� �� "+arr[1]+"�� �¸�");
		System.out.println("���º� : " +cnt+"�� �� "+arr[2]+"�� ���º�");
	}
}
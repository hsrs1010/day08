package com.java.one;

import java.util.Scanner;

public class ScoreSumTest {
	public static void main(String[] args) {
		// �迭 arr 5��¥�� �����,
		// ���� �Է�
		// �հ� ��� ���
		// ��� �Է�
		Scanner sc = new Scanner(System.in);
		while (true) {
			
		int arr[] = new int[5];
		int sum=0;
		
		System.out.println(arr.length +"�� ���� �Է�");
		if(arr[0]==-1) {
			System.out.println("����");
			break;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}	
		System.out.println("�հ�� " + sum);
		System.out.println("����� " + (double)sum/arr.length);
			
		}
	}
}

package com.ja.two;

import java.util.Scanner;

public class GBBgameWhile {

	public static void main(String[] args) {
		//-1�� �Է� �ؼ� ����, �ݺ� �����
	
		Scanner sc=new Scanner(System.in);
		System.out.println("<<RockPaperSissorsGame>>");
		
		while (true) {
			System.out.println("���� : 1, ���� : 2, �� : 3");
			System.out.println("ö�� �Է�");
			int cnum=sc.nextInt();
			System.out.println("����");
			if(cnum==-1) break;
			
			System.out.println("���� �Է�");
			int ynum=sc.nextInt();
			System.out.println("����");
			if(ynum==-1) break;
			
			boolean cFlag=(cnum==1 && ynum==3) || (cnum==2 && ynum==1) 
					|| (cnum==3 && ynum==2);
			
			
			//ö�� �¸�
			if(cFlag) {
				System.out.println("ö�� �¸�");
				}
			
			//���� �¸�
			else if(cnum==3 && ynum==1 || cnum==1 && ynum==2 
					|| cnum==2 && ynum==3) {
				System.out.println("���� �¸�");
				}
			else {
			System.out.println("���º�");
			sc.close();
			}
		}
}
}
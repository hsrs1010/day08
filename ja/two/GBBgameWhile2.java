package com.ja.two;

import java.util.Scanner;

public class GBBgameWhile2 {

	public static void main(String[] args) {
		// -1À» ÀÔ·Â ÇØ¼­ Á¾·á, ¹Ýº¹ ¸¸µé±â
		// ¹è¿­À» ÀÌ¿ëÇÏ¿©
		// ¿µÈñ ½Â¸® : 10¹øÁß 3¹ø½Â¸®
		// Ã¶¼ö ½Â¸® : 10¹øÁß 3¹ø½Â¸®
		// ¹«½ÂºÎ : 10¹øÁß 4¹ø ½Â¸®
		int cnt = 0; // °ÔÀÓ È½¼ö
		//½Â¸® È½¼ö ¹è¿­
		int arr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("<<RockPaperSissorsGame>>");

		while (true) {
			System.out.println("°¡À§ : 1, ¹ÙÀ§ : 2, º¸ : 3");
			System.out.println("Ã¶¼ö ÀÔ·Â");
			int cnum = sc.nextInt();

			if (cnum == -1)
				break;

			System.out.println("¿µÈñ ÀÔ·Â");
			int ynum = sc.nextInt();
			if (ynum == -1)
				break;
			boolean cFlag = (cnum == 1 && ynum == 3) || (cnum == 2 && ynum == 1) || (cnum == 3 && ynum == 2);

			// Ã¶¼ö ½Â¸®
			if (cFlag) {
				arr[0]++; //½Â¸® È½¼ö Áõ°¡
				System.out.println("Ã¶¼ö ½Â¸®");
			}

			// ¿µÈñ ½Â¸®
			else if (cnum == 3 && ynum == 1 || cnum == 1 && ynum == 2 || 
					cnum == 2 && ynum == 3) {
				arr[1]++;
				System.out.println("¿µÈñ ½Â¸®");
			} else {
				arr[2]++;
				System.out.println("¹«½ÂºÎ");

			}
			cnt++;

		}
		System.out.println("°ÔÀÓ È½¼ö : " + cnt);
		System.out.println("Ã¶¼ö ½Â¸® : " +cnt+"¹ø Áß "+arr[0]+"¹ø ½Â¸®");
		System.out.println("¿µÈñ ½Â¸® : " +cnt+"¹ø Áß "+arr[1]+"¹ø ½Â¸®");
		System.out.println("¹«½ÂºÎ : " +cnt+"¹ø Áß "+arr[2]+"¹ø ¹«½ÂºÎ");
	}
}
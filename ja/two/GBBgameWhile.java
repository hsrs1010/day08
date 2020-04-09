package com.ja.two;

import java.util.Scanner;

public class GBBgameWhile {

	public static void main(String[] args) {
		//-1À» ÀÔ·Â ÇØ¼­ Á¾·á, ¹Ýº¹ ¸¸µé±â
	
		Scanner sc=new Scanner(System.in);
		System.out.println("<<RockPaperSissorsGame>>");
		
		while (true) {
			System.out.println("°¡À§ : 1, ¹ÙÀ§ : 2, º¸ : 3");
			System.out.println("Ã¶¼ö ÀÔ·Â");
			int cnum=sc.nextInt();
			System.out.println("Á¾·á");
			if(cnum==-1) break;
			
			System.out.println("¿µÈñ ÀÔ·Â");
			int ynum=sc.nextInt();
			System.out.println("Á¾·á");
			if(ynum==-1) break;
			
			boolean cFlag=(cnum==1 && ynum==3) || (cnum==2 && ynum==1) 
					|| (cnum==3 && ynum==2);
			
			
			//Ã¶¼ö ½Â¸®
			if(cFlag) {
				System.out.println("Ã¶¼ö ½Â¸®");
				}
			
			//¿µÈñ ½Â¸®
			else if(cnum==3 && ynum==1 || cnum==1 && ynum==2 
					|| cnum==2 && ynum==3) {
				System.out.println("¿µÈñ ½Â¸®");
				}
			else {
			System.out.println("¹«½ÂºÎ");
			sc.close();
			}
		}
}
}
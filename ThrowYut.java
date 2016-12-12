package com.sd.yutnori;

import java.util.Random;

public class ThrowYut extends Thread {
	static int numberYut;
	static String nameYut;


	public void rolling(int kkk) {
		System.out.println("[" + Player.currentTurn + "]" + Player.currentName + "'s turn.");
		System.out.println("throw! (remain " + kkk + " )");
	
		String aa = Player.scanner.nextLine(); 

		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		int i = random.nextInt(6);
		switch (i) {
		case 1:
			nameYut = "DO";
			break;

		case 2:
			nameYut = "GAE";
			break;

		case 3:
			nameYut = "GUL";
			break;

		case 4:
			nameYut = "YUT";
			break;

		case 5:
			nameYut = "MO";
			break;

		default:
			nameYut = "BACK";
			i = -1;
			break;
		}

		numberYut = i;

		System.out.println("[ " + nameYut + " ]  " + numberYut + "moves");

	}
	
	}

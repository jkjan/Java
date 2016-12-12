package com.sd.yutnori;

import java.util.Random;
import java.util.Scanner;

public class Player extends Thread {
	static String nameA; 
	static String nameB;
	static int horseA[]; 
	static int horseB[];
	static char currentTurn;
	static String currentName; 
	static int[] currentHorse; 
	static Scanner scanner = new Scanner(System.in);

	Player() {
		nameA = null;
		nameB = null;
		horseA = new int[4];
		horseB = new int[4];
		currentTurn = ' ';
		horseA[0] = 0;
		horseA[1] = 0;
		horseA[2] = 0;
		horseA[3] = 0;
		horseB[0] = 0;
		horseB[1] = 0;
		horseB[2] = 0;
		horseB[3] = 0;
	}

	public void inputName() {
		scanner = new Scanner(System.in);
		System.out.println("Input Player A ");
		nameA = scanner.nextLine();
		System.out.println("Input Player B");
		nameB = scanner.nextLine();
		System.out.println("");
	}

	public void setCurrent(int i) {
		if (i == 0) {
			currentTurn = 'A';
			currentName = nameA;
			currentHorse = horseA;
		} else {
			currentTurn = 'B';
			currentName = nameB;
			currentHorse = horseB;
		}
	}

	public void startRandom() {
		System.out.println("Who's gonna go first");

		Random random = new Random();
		int i = random.nextInt(2); 
		setCurrent(i);
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("[" + currentTurn + "] " + currentName + " starts first.");
		System.out.println("Game begins");
		System.out.println("");
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

	public int move() {

		System.out.print("[" + currentTurn + "] " + currentName);
		System.out.print("Select the horse you want (0~3)");

		int i = -1;
		while (i < 0 || i > 3) {
			i = scanner.nextInt();
			scanner.nextLine();
			if (i < 0 || i > 3) {
				System.out.println("Wrong input");
				System.out.println("Choose other horse");
				i = -1;
				continue;
			}
			if (Player.currentHorse[i] == 31) {
				System.out.println("Wrong input");
				System.out.println("Choose other horse");
				i = -1;
				continue;
			}
			if (ThrowYut.numberYut == -1 && Player.currentHorse[i] == 0 || Player.currentHorse[i] == 31) {
				System.out.println("Wrong input");
				System.out.println("Choose other horse");
				i = -1;
				continue;
			}

		}
		System.out.println(i + "horse moves " + ThrowYut.numberYut + "much");
		int before = currentHorse[i];
		currentHorse[i] += ThrowYut.numberYut;
		int after = currentHorse[i];


		return i;

	}
}

package com.sd.yutnori;

public class Command extends Thread {
	public static void main(String[] args) {
		Player player = new Player();
		ThrowYut throwYut = new ThrowYut();
		Yutnori nori = new Yutnori();
		Hunt hunt = new Hunt();
		Win win = new Win();

		player.inputName();
		player.startRandom();

		String winner = null; 

		while (winner == null) {

			for (int i = 1; i > 0; i--) { 
				nori.disOut(); 
				throwYut.rolling(i);
				if (ThrowYut.numberYut == 4) {
					System.out.println("Yut, one more");
				i++;
				} else if (ThrowYut.numberYut == 5) {
					System.out.println("Mo, one more");
					i++;
					try {
						sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}

				int k = player.move(); 
				int re = hunt.kill(k); 
				if (re == 1) {
					System.out.println("one more");
					i += re; 
				}
				System.out.println("");
			}
			
			winner = win.check();

			if (Player.currentTurn == 'A') { 
				Player.currentTurn = 'B';
				Player.currentName = Player.nameB;
				Player.currentHorse = Player.horseB;
			} else if (Player.currentTurn == 'B') {
				Player.currentTurn = 'A';
				Player.currentName = Player.nameA;
				Player.currentHorse = Player.horseA;
			}

		}
		
	}
	}

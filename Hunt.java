package com.sd.yutnori;

public class Hunt {

	public int kill(int i) { 

		if (Player.currentTurn == 'A') {
			for (int j = 0; j < Player.horseB.length; j++) {
				if (Player.horseB[j] == Player.currentHorse[i] && Player.horseB[j] != 0 && Player.horseB[j] != 31) {
					Player.horseB[j] = 0; 

					return 1;
				}
			}

		}
		if (Player.currentTurn == 'B') {
			for (int j = 0; j < Player.horseA.length; j++) {
				if (Player.horseA[j] == Player.currentHorse[i] && Player.horseA[j] != 0 && Player.horseA[j] != 31) {
					Player.horseA[j] = 0; 
					return 1;
				}
			}
		}
		return 0;

	}
}

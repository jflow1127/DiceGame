package com.jave.dicegame.jared;

public class Business {
	public static int rollDie() {
		return ((int)(Math.random()*Math.pow(6, 1)+1));
	}

	public static void gameWinner(int tot1, String name1, int tot2, String name2) {
		if(tot1 > tot2) {
			System.out.println("The WINNER is... " + name1);
		}else if(tot1 < tot2) {
			System.out.println("The WINNER is... " + name2);
		}else {
			System.out.println("...It's a TIE!");
		}
	}



}

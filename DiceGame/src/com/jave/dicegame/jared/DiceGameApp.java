package com.jave.dicegame.jared;

public class DiceGameApp {

	public static void main(String[] args) {
		Player p1 = new Player("Jared");
		Player p2 = new Player("Bryce");
		
		p1.displayInfo();
		p2.displayInfo();
		
		Business.gameWinner(p1.getTotal(), p1.getName(), p2.getTotal(), p2.getName());

	}

}

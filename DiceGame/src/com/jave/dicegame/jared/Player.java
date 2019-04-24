package com.jave.dicegame.jared;

public class Player {
	private int id;
	private String name;
	private int die1;
	private int die2;
	private int total;
	private static int index = 1000;
	
	
	
	public Player(String name) {
		super();
		this.name = name;
		this.id = setId();
		this.die1 = Business.rollDie();
		this.die2 = Business.rollDie();
		this.total = setTotal(die1, die2);
	}
	
	public void displayInfo() {
		System.out.println("ID: "+ id +
				"\nNAME: "+ name +
				"\nDICE 1: "+ die1 +
				"\nDICE 2: "+ die2 +
				"\nTOTAL: " + total +
				"\n*******************");
	}
	
	public int getId() {
		return id;
	}
	public int setId() {
		index++;
		return index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDie1() {
		return die1;
	}

	public int getDie2() {
		return die2;
	}

	public int getTotal() {
		return total;
	}
	public int setTotal(int die1, int die2) {
		return die1+die2;
	}
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int index) {
		Player.index = index;
	}
	
	
}

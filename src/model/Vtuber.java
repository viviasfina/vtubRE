package model;

import Adapter.CurrencyAdapter;

public class Vtuber {
	private String name;
	private int age;
	private String favGame;
	private String favAnime;
	private int income;
	private String twitter;
	
	
	public Vtuber(String name, int age, String favGame, String favAnime, int income, String twitter) {
		super();
		this.name = name;
		this.age = age;
		this.favGame = favGame;
		this.favAnime = favAnime;
		this.income = income;
		this.twitter = twitter;
	}
	
	public void printAll(String currency, int i) {
		CurrencyAdapter ca = new CurrencyAdapter(currency);
		System.out.printf("| %-2d | %-15s | %-3d | %-13s | %-15s | %-8s | %-20s |\n", i, name, age, favGame, favAnime, ca.getIncome(income), twitter);
		System.out.println("|================================================================================================|");
	}

	public Vtuber() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavGame() {
		return favGame;
	}

	public void setFavGame(String favGame) {
		this.favGame = favGame;
	}

	public String getFavAnime() {
		return favAnime;
	}

	public void setFavAnime(String favAnime) {
		this.favAnime = favAnime;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	
	
	

}

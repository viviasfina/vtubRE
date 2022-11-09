package builder;

import model.Vtuber;

public class vtuberBuilder {
	Vtuber vtuber;
	
	public vtuberBuilder reset() {
		vtuber = new Vtuber();
		return this;
	}
	
	public vtuberBuilder buildName(String name) {
		vtuber.setName(name);
		return this;
	}
	
	public vtuberBuilder buildAge(int age) {
		vtuber.setAge(age);
		return this;
	}
	
	public vtuberBuilder buildfavGame(String favGame) {
		vtuber.setFavGame(favGame);
		return this;
	}
	public vtuberBuilder buildfavAnime(String favAnime) {
		vtuber.setFavAnime(favAnime);
		return this;
	}
	public vtuberBuilder buildIncome(int income) {
		vtuber.setIncome(income);
		return this;
	}
	public vtuberBuilder buildTwitter(String twitter) {
		vtuber.setTwitter(twitter);
		return this;
	}
	public Vtuber createVtuber() {
		return vtuber;
	}

}

import java.util.Scanner;
import java.util.Vector;

import Singleton.builderInstance;
import builder.vtuberBuilder;
import model.Vtuber;

public class Main {

	Scanner sc = new Scanner(System.in);
	Vtuber vtuber = null;
	Vector<Vtuber> vtuberList = new Vector<>();
	
	
	void confirm() {
		System.out.print("Press enter to continue. . .");
		sc.nextLine();
		for(int i=0; i<=30; i++) {
			System.out.println("");
		}
	}
	
	void addVtuber() {
		vtuberBuilder vb = builderInstance.getInstance();
		String name;
		int age;
		String favGame;
		String favAnime;
		int income;
		String twitter = null;
		
		do {
			System.out.print("Input vtuber's name [5-20 charater(s) (inclusive)]: ");
			name=sc.nextLine();
		} while (name.length()<5 || name.length()>20);
		
		do {
			System.out.print("Input vtuber's age [min 18 year(s) old]: ");
			age= sc.nextInt(); sc.nextLine();
		} while (age<18);
		
		do {
			System.out.print("Input vtuber's favorite game [Apex | Rust | Minecraft (case sensitive)]: ");
			favGame=sc.nextLine();
		} while (!favGame.equals("Apex") && !favGame.equals("Rust") && !favGame.equals("Minecraft"));
		
		do {
			System.out.print("Input vtuber's favorite anime [SAO | Oregairu | SPYxFAMILY (case sensitive)]: ");
			favAnime=sc.nextLine();
		} while (!favAnime.equals("SAO") && !favAnime.equals("Oregairu") && !favAnime.equals("SPYxFAMILY"));
		
		
		do {
			System.out.print("Input vtuber's income [$2000 - $100000 (inclusive)]: $ ");
			income= sc.nextInt(); sc.nextLine();
		} while (income <2000 || income >100000);
		
		String temp;
		do {
			System.out.print("Add twitter account? [Y | N (case sensitive)]: ");
			temp = sc.nextLine();
		} while (!temp.equals("Y") && !temp.equals("N"));
		
		if(temp.equals("Y")) {
			twitter= name + " Ch";
		}
		else if (temp.equals("N")) {
			twitter="-";
		}
		
		
		vtuber = vb.reset().buildName(name).buildAge(age).buildfavGame(favGame).buildfavAnime(favAnime).buildIncome(income).buildTwitter(twitter).createVtuber();
		vtuberList.add(vtuber);
		
		System.out.println("Vtuber Successfully added");
		confirm();
	
	}
	
	void viewAll(String currency) {
		int i=1;
		System.out.println("");
		System.out.println("|=============|");
		System.out.printf(" %-12s |\n", "Vtuber Lists");
		System.out.println("|================================================================================================|");
		System.out.printf("| %-2s | %-15s | %-3s | %-13s | %-15s | %-8s | %-20s |\n","No", "Name", "Age", "Favorite Game", "Favorite Anime", "Income", "Twitter");
		System.out.println("|================================================================================================|");
		for (Vtuber vtuber : vtuberList) {
			vtuber.printAll(currency, i);
			i++;
		}
	}
	
	void graduate() {
		int inp;
		do {
			System.out.println("Input vtuber you want to graduate [1 - " +vtuberList.size()+" ]: ");
			inp = sc.nextInt(); sc.nextLine();
		} while (inp<1 || inp> vtuberList.size());
		System.out.println(vtuberList.get(inp-1).getName() + " has been graduated!");
		vtuberList.remove(inp-1);
	}
	
	void printMenu() {
		int ch;
		String currency="USD";
		do {
			System.out.println("______");
			System.out.println("vtubRE");
			System.out.println("______");
			System.out.println("1. Add Vtuber");
			System.out.println("2. View All Vtuber");
			System.out.println("3. Graduate Vtuber");
			System.out.println("4. Exit");
			System.out.print(">> ");
			ch= sc.nextInt(); sc.nextLine();
			if(ch==1) {
				addVtuber();
			}
			else if(ch==2) {
				if(vtuberList.isEmpty()) {
					System.out.println("There is no vtuber in this agency!");
					confirm();
				}
				else{
					do {
						System.out.println("Income Currency");
						System.out.println("=================");
						System.out.println("1. USD");
						System.out.println("2. IDR");
						System.out.println("3. YEN");
						System.out.print(">> ");
						currency = sc.nextLine();
					} 
					while (!currency.equals("USD") && !currency.equals("IDR") && !currency.equals("YEN"));
					viewAll(currency);
					confirm();
				}
			}
			else if (ch==3) {
				if(vtuberList.isEmpty()) {
					System.out.println("There is no vtuber in this agency!");
					confirm();
				}
				else {
					viewAll(currency);
					graduate();
					confirm();
				}
			}
		}
		while(ch!=4);
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		printMenu();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}

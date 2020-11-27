package sqli.df.tp.tp_test;

public class Client {
    private String name;
    private String mood ;
	private int  nbCocktail;
    
	public Client(String n) {
		this.name = n;
		this.mood = "None";
		this.nbCocktail = 0;
	}

	public String getName() {
	   return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbCocktail() {
		return nbCocktail;
	}

	public void setNbCocktail(int nbCocktail) {
		this.nbCocktail = nbCocktail;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	
}

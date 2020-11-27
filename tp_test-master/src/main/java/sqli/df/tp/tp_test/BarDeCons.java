package sqli.df.tp.tp_test;


public class BarDeCons {

	private int capacity; // Capacite du bar (attributs privés)
	private int nbclients; //l'entier definit le nb de pers dans le bar actuellement
	
	public BarDeCons(int c) { //Majuscule car reprend nom de la classe
		this.capacity = c; //Constructor created on 15 Oct - NO RETURN for a constructor + "c" c'est un paramètre qu'on instancie le bar
	}
	
	public boolean isFull() { //created method to define status of the bar when it is complete if no return (écrire VOID)
		return capacity == nbclients; //Return True if capacity == nb de clients, otherwise False
	}
	
	public String entryInTheBar(int buddies) {
		//int tmpNbClients = buddies + nbclients;
		if(buddies + nbclients <= capacity) {
			nbclients = buddies + nbclients;
		    return "Yes";
		} else {
			return "No";
		}
	}

	public int getNbclients() { //Return clients number
		return nbclients;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setNbclients(int nbclients) {
		this.nbclients = nbclients;
	}

	public String getStatus() {
		if(nbclients == capacity)
			return "Full";
		else 
			return "NoFull";			
	}
}

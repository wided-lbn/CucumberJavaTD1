package sqli.df.tp.tp_test;


public class BarDeCons {

	private int capacity; // Bar Capacity - creation of private attribute
	private int nbclients; //Attribute for number of people currently in the bar
	private Client guests[]; //Table creation for new arriving guests to the bar
	
	public BarDeCons(int c) { //Constructor : always same name of the Class /never returning
		this.capacity = c; //Constructor created on 15th of October - NO RETURN for a constructor + "c" is a parameter to instantiate the bar
	}
	
	public boolean isFull() { //created method to define status of the bar when it is complete if no return (write VOID)
		return capacity == nbclients; //Return True if capacity == Number of clients, otherwise False
	}
	
	public String entryInTheBar(int buddies) {
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
	
	public Client[] getGuests() { //Getter and setter of Attribute Line 8
		return guests;
	}

	public void setGuests(Client[] guests) {
		this.guests = guests;
	}

}

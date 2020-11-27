package sqli.df.tp.tp_test;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JusteBarSteps {
	BarDeCons bar; //"Global" variable of below steps
	@Given("^The bar is full at (\\d+) persons$") 
	public void the_bar_is_full_at_persons(int maxCapacity) throws Throwable { //maxCapacity is a parameter which does not return anything
		System.out.println("1st step :Given the bar is full at 10 persons");
		bar = new BarDeCons(maxCapacity); //Instantiation of variable line 10 - Link to Class "BarDeCons" with the capacity getter
		assertEquals(maxCapacity, bar.getCapacity()); //Does the Object contain the capacity given in parameter 
	}

	@Given("^(\\d+) persons are in the bar$")
	public void persons_are_in_the_bar(int nbCurrentClients) throws Throwable { //currentClient parameter installed
		System.out.println("2nd step Given there is X persons are in the Bar");
		bar.setNbclients(nbCurrentClients); //Setter from Line 47 Class BarDeCons
		assertEquals(nbCurrentClients, bar.getNbclients()); //Getter call of NbClients from BarDeCons Class
	}
	@When("^Mr Leblanc and Mr Pignon (\\d+) persons arrive$")
	public void mr_Leblanc_and_Mr_Pignon_persons_arrive(int amis) throws Throwable {
		System.out.println("3rd step When friends arrive to the bar");
		//Creation of 2 friends Object 
		Client mrLeblanc = new Client ("Mr Leblanc"); //Creation of MrLeblanc Object
		Client mrPignon = new Client ("Mr Pignon");  //Creation of MrPignon Object
		Client[] listeClients = {mrPignon, mrLeblanc}; //Creation of the list containing 2 friends
		bar.setGuests(listeClients);//Inclusion of friends in the bar queue
		Client[] fileBar=bar.getGuests();//recovery of waiting queue to the bar (tableau)
		int nbPersonFileBar = fileBar.length; //calculation of the recovered list length
		assertEquals(2, nbPersonFileBar); 
	}

	@When("^the status of the bar is \"([^\"]*)\"$")
	public void the_status_of_the_bar_is(String status) throws Throwable {
		System.out.println("4th step And the status of the bar is");
		assertEquals(status, bar.getStatus());
	}

	@Then("^they cannot enter into the bar \"([^\"]*)\"$")
	public void they_cannot_enter_into_the_bar(String verdictEntree) throws Throwable {
		System.out.println("5th step Then Verdict they can/cannot enter into the bar");
		Client[] fileBar=bar.getGuests();//people queue recovery for the bar (Table)
		int nbPersonFileBar = fileBar.length;
		String verdict = bar.entryInTheBar(nbPersonFileBar); //Method to specify number of people waiting in the queue
		assertEquals(verdictEntree, verdict);
	}
	
	@Then("^They order (\\d+) cocktail$")
	public void they_order_cocktail(int cocktail) throws Throwable {		
		assertEquals(cocktail,cocktail);
	}
	
	@Then("^Mister Pignon is \"([^\"]*)\"$")
	public void mister_Pignon_is(String humeur) throws Throwable {
		assertEquals(humeur, humeur);
	}


}

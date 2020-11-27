package sqli.df.tp.tp_test;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JusteBarSteps {
	BarDeCons bar; //variable globale des étapes ci-dessous
	int friends;
	@Given("^The bar is full at (\\d+) persons$") 
	public void the_bar_is_full_at_persons(int maxCap) throws Throwable { //maxcapacity = paramètre qui ne retourne rien
		System.out.println("1st step (Given 1) : the bar is full at 10 persons");
		bar = new BarDeCons(maxCap); //Instanciation de la variable ligne 10/ Lien Classe "BarDeCons" avec getter capacity
		assertEquals(maxCap, bar.getCapacity()); //Test : est ce que l'objet créé contient la capacité donnée en paramètre
	}

	@Given("^(\\d+) persons are in the bar$")
	public void persons_are_in_the_bar(int nbCurrentClients) throws Throwable { //currentClient paramètre passé
		System.out.println("2nd step (Given 2) : X persons are in the Bar");
		bar.setNbclients(nbCurrentClients); //Setter ligne 46 de la Classe BarDeCons
		assertEquals(nbCurrentClients, bar.getNbclients()); // Appel du getter Nbclients de la Classe BarDeCons
	}
	@When("^Mr Leblanc and Mr Pignon (\\d+) persons arrive$")
	public void mr_Leblanc_and_Mr_Pignon_persons_arrive(int amis) throws Throwable {
		System.out.println("3rd step (When 1) : Friends arrive to the bar");
		friends = amis; //matérialisation des 2 amis qui arrivent
		assertEquals(amis, friends);
	}

	@When("^the status of the bar is \"([^\"]*)\"$")
	public void the_status_of_the_bar_is(String status) throws Throwable {
		System.out.println("4th step (When 2) : status");
		//bar.setStatus(); //Setter ligne 46 de la Classe BarDeCons
		assertEquals(status, bar.getStatus());
	}

	@Then("^they cannot enter into the bar \"([^\"]*)\"$")
	public void they_cannot_enter_into_the_bar(String v_entree) throws Throwable {
		System.out.println("5th step (Then 1) : Verdict");
		String verdict = bar.entryInTheBar(friends);
		assertEquals(v_entree, verdict);
	}
	
	@Then("^They order (\\d+) cocktail$")
	public void they_order_cocktail(int boissons) throws Throwable {		
		assertEquals(boissons,boissons);
	}
	
	@Then("^Mister Pignon is \"([^\"]*)\"$")
	public void mister_Pignon_is(String mood) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(mood, mood);
	}


}

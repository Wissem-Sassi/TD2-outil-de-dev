package compte_bancaire;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompteTest {

	@Test
	public void testDeCredit() {
		Compte c = new Compte(20);
		c.crediterCompte(10);
		assertEquals(30, c.getSolde());
	}
	
	@Test
	public void testSommeCrediteNegative() {
		Compte c = new Compte(50);
		c.crediterCompte(-20);
		assertEquals(70, c.getSolde());
	}
	
	@Test
	public void testDeDebit() {
		Compte cp = new Compte(50);
		cp.debiterCompte(30);
		assertEquals(20,cp.getSolde());
	}
	
	@Test
	public void testDeVirement() {
		Compte c1 = new Compte(50);
		Compte c2 = new Compte(20);
		c1.virement(c2, 10);
		assertEquals(40, c1.getSolde());
	}

}

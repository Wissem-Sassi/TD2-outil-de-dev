package compte_bancaire;

public class Compte {
	int solde;

	public Compte(int solde) {
		this.solde = solde;
	}
	
	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	public int consulterSolde() {
		return this.solde;
	}
	
	public int crediterCompte(int somme) {
		solde += somme;
		return solde;
	}
	
	public int debiterCompte(int somme) {
		solde -= somme;
		return solde;
	}
	
	public void virement(Compte compte,int somme) {
		this.solde -= somme;
		compte.solde += somme;
	}

}

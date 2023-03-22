
public class LigneDeStock {
	
	private Produit produit;
	private int quantité;
	
	public LigneDeStock(Produit produit, int quantité) {
		this.produit = produit;
		this.quantité = quantité;
	}

	public Produit getProduit() {
		return produit;
	}

	public int getQuantité() {
		return quantité;
	}

	@Override
	public String toString() {
		return "LigneDeStock [produit=" + produit + ", quantité=" + quantité + "]";
	}
	

}

import java.util.ArrayList;

public class Stock {
	
	private ArrayList<LigneDeStock> produitsEnStock;

	public Stock() {
		this.produitsEnStock = new ArrayList<>();
	}
	
	public void ajouterProduit(Produit produit, int quantité) {
		this.produitsEnStock.add(new LigneDeStock(produit, quantité));
	}

	//TODO retirer produit

	public int quantitéDispo(Produit produit) {
		for (LigneDeStock ligne : this.produitsEnStock)
			if (ligne.getProduit() == produit)
				return ligne.getQuantité();
		return 0;
	}

	@Override
	public String toString() {
		return "Stock [produitsEnStock=" + produitsEnStock + "]";
	}

}

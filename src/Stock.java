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
	
	@Override
	public String toString() {
		return "Stock [produitsEnStock=" + produitsEnStock + "]";
	}

}

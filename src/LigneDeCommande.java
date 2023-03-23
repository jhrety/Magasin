public class LigneDeCommande {

    private Produit produit;
    private int quantité;

    public LigneDeCommande(Produit produit, int quantité) {
        this.produit = produit;
        this.quantité = quantité;
    }

    public Produit getProduit() {
        return produit;
    }

    public int getQuantité() {
        return quantité;
    }

    public int prixHT() {
        return this.produit.getPrixHT()*this.quantité;
    }

    @Override
    public String toString() {
        return "LigneDeCommande{" +
                "produit=" + produit +
                ", quantité=" + quantité +
                '}';
    }
}

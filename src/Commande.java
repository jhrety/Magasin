import java.util.ArrayList;

public class Commande {

    private static int numéroMax = 0;

    private int numéroDeCommande;
    private String nomClient;
    private ArrayList<LigneDeCommande> produitsCommandés;

    public Commande(String nomClient) {
        this.nomClient = nomClient;
        this.produitsCommandés = new ArrayList<>();
        numéroMax++;
        this.numéroDeCommande = numéroMax;
    }

    public void ajouterProduit(Produit p, int q) {
        this.produitsCommandés.add(new LigneDeCommande(p,q));
    }

    public int montantHT() {
        int montant = 0;
        for (LigneDeCommande ligne : produitsCommandés) {
            montant += ligne.prixHT();
        }
        return montant;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "numéroDeCommande=" + numéroDeCommande +
                ", nomClient='" + nomClient + '\'' +
                ", montant=" + this.montantHT() +
                ", produitsCommandés=" + produitsCommandés +
                '}';
    }
}

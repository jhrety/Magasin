/*
    Cette classe définit ce qu'est un produit.
 */
public class Produit {

    private String libellé;
    private int prixHT;

    public Produit(String libellé, int prixHT) {
        this.libellé = libellé;
        this.prixHT = prixHT;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public int getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(int prixHT) {
        this.prixHT = prixHT;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "libellé='" + libellé + '\'' +
                ", prixHT=" + prixHT +
                '}';
    }
}

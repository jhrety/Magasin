public class Essais {

    public static void main(String[] args) {
    	
    	//Juste quelques essais basiques
        Produit styloVert = new Produit("stylo bille vert", 200);
        System.out.println(styloVert);
        Produit gomme = new Produit("gomme", 150);
        System.out.println(gomme);

        Commande commande = new Commande("Gaston");
        commande.ajouterProduit(styloVert, 5);
        commande.ajouterProduit(gomme, 2);
        System.out.println(commande);


    }

}

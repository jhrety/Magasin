public class Essais {

    public static void main(String[] args) {
    	
    	//Juste quelques essais basiques
        Produit styloVert = new Produit("stylo bille vert", 200);
        System.out.println(styloVert.getPrixHT());
        System.out.println(styloVert);
        Produit gomme = new Produit("gomme", 150);
        System.out.println(gomme);
        gomme.setLibellé("gomme à encre");
        System.out.println(gomme.getLibellé());
        
        Stock stock = new Stock();
        stock.ajouterProduit(gomme, 10);
        stock.ajouterProduit(styloVert, 100);
        System.out.println(stock);
        
    }

}

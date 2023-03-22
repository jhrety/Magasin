public class Essais {

    public static void main(String[] args) {
    	
    	//Juste quelques essais basiques
        Produit styloRouge = new Produit("stylo bille rouge", 200);
        System.out.println(styloRouge.getPrixHT());
        System.out.println(styloRouge);
        Produit gomme = new Produit("gomme", 150);
        System.out.println(gomme);
        gomme.setLibellé("gomme à encre");
        System.out.println(gomme.getLibellé());
    }

}

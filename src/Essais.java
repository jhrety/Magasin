public class Essais {

    public static void main(String[] args) {
        Produit stylo = new Produit("stylo bille vert", 200);
        System.out.println(stylo.getPrixHT());
        System.out.println(stylo);
        Produit gomme = new Produit("gomme", 150);
        System.out.println(gomme);
        gomme.setLibellé("gomme à encre");
        System.out.println(gomme.getLibellé());
    }

}

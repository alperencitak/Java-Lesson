package TekYonluDaireselListeYapisi;

public class Main {
    public static void main(String[] args){
        DaireselListeYapisi daireselListe = new DaireselListeYapisi();
        daireselListe.basaEkle(56);
        daireselListe.basaEkle(91);
        daireselListe.sonaEkle(14);
        daireselListe.sonaEkle(3);
        daireselListe.bastanSil();
        daireselListe.sondanSil();
        daireselListe.yazdir();
    }
}

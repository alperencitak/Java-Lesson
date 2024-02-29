package CiftYonluDaireselListeYapisi;

public class MainCl {
    public static void main(String[] args){
        CYDaireselListe Cliste = new CYDaireselListe();
        Cliste.basaEkle(49);
        Cliste.basaEkle(25);
        Cliste.basaEkle(57);
        Cliste.sonaEkle(91);
        Cliste.sonaEkle(34);
        Cliste.arayaEkle(14, 0);
        Cliste.arayaEkle(3, 2);
        Cliste.arayaEkle(76, 8);
        Cliste.bastanSil();
        Cliste.sondanSil();
        Cliste.aradanSil(2);
        Cliste.aradanSil(6);
        Cliste.aradanSil(19);
        Cliste.aradanSil(0);
        
        Cliste.yazdir();
    }
}

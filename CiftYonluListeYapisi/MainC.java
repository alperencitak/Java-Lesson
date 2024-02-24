package CiftYonluListeYapisi;

public class MainC {
    public static void main(String[] args){
        ListeYapisiÇift liste2 = new ListeYapisiÇift();
        
        liste2.sonaEkle(28);
        liste2.basaEkle(79);
        liste2.basaEkle(13);
        liste2.sonaEkle(7);
        liste2.arayaEkle(51,2);
        liste2.arayaEkle(92,15);
        liste2.bastanSil();
        liste2.sondanSil();
        liste2.aradanSil(2);
        liste2.aradanSil(0);
        liste2.aradanSil(78);
        
        liste2.bastanYazdir();
        liste2.sondanYazdir();
    }
}

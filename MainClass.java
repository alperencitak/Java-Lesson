
import java.util.Scanner;



public class MainClass {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        ListeYapisi liste1 = new ListeYapisi();
        int secim,eleman,index;
        while(true){
            System.out.println("\n\n1 - Başa eleman ekle");
            System.out.println("2 - Sona eleman ekle");
            System.out.println("3 - Seçilen indexe eleman ekle");
            System.out.println("4 - Baştan eleman sil");
            System.out.println("5 - Sondan eleman sil");
            System.out.println("6 - Seçilen indexte eleman sil");
            System.out.println("Lütfen listede yapmak istediğiniz işlemin numarasını giriniz : ");
            secim = scan.nextInt();
            switch(secim){
                case 1:
                    System.out.println("Başa eklemek istediğiniz elemanı girin: ");
                    eleman = scan.nextInt();
                    liste1.basaEkle(eleman);break;
                case 2:
                    System.out.println("Sona eklemek istediğiniz elemanı girin: ");
                    eleman = scan.nextInt();
                    liste1.sonaEkle(eleman);break;
                case 3:
                    System.out.println("Eleman eklemek istediğiniz indexi girin: ");
                    index = scan.nextInt();
                    System.out.println("Seçili indexe eklemek istediğiniz elemanı girin: ");
                    eleman = scan.nextInt();
                    liste1.arayaEkle(eleman, index);break;
                case 4:
                    liste1.bastanSil();break;
                case 5:
                    liste1.sondanSil();break;
                case 6:
                    System.out.println("Eleman silmek istediğiniz indexi girin: ");
                    index = scan.nextInt();
                    liste1.aradanSil(index);break;
                }
            System.out.print("\n\nListenin yeni hali: ");
            liste1.yazdir();
        }
    }
}

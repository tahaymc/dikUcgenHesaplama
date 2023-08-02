import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int kenar1, kenar2, secim, taban, yukseklik;
        double kenar3, alan;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz: (Alan hesaplamak için: 1, Hipotenüs hesaplamak için: 2)");
        secim= girdi.nextInt();

        if (secim==1){
            System.out.println("Taban değerini giriniz: ");
            taban= girdi.nextInt();
            System.out.println("Yükseklik değerini giriniz: ");
            yukseklik= girdi.nextInt();

            alan= (taban*yukseklik)/2;
            System.out.println("Alan: "+alan);

        } else if (secim==2) {
            System.out.println("1. Kenarı Giriniz: ");
            kenar1= girdi.nextInt();
            System.out.println("2. Kenarı Giriniz: ");
            kenar2= girdi.nextInt();

            kenar3=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
            System.out.println("Hipotenüs: " +kenar3);
        }
        else{
            System.out.println("Lütfen geçerli değer giriniz... (Alan için hesaplamak için: 1, Hipotenüs hesaplamak için: 2)");
        }






    }
}
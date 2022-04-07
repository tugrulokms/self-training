import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo?: ");
        int armutKg = input.nextInt();

        System.out.print("Elma kaç kilo?: ");
        int elmaKg = input.nextInt();

        System.out.print("Domates kaç kilo?: ");
        int domatesKg = input.nextInt();

        System.out.print("Muz kaç kilo?: ");
        int muzKg = input.nextInt();

        System.out.print("Patlıcan kaç kilo?: ");
        int patlicanKg = input.nextInt();

        input.close();

        double toplam = (armutKg * armutFiyat) + (elmaKg * elmaFiyat) + (domatesKg * domatesFiyat) + (muzKg * muzFiyat) + (patlicanKg * patlicanFiyat);

        System.out.println("Toplam tutar: " + toplam + " TL");
        
    }
}
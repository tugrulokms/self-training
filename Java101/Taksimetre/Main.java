import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Kilometre giriniz: ");
        int km = input.nextInt();

        input.close();

        double fiyat = 10 + (km * 2.2);
        
        double sonFiyat = (fiyat <= 20) ? 20 : fiyat;

        System.out.println("Yol ücreti: " + sonFiyat);
    }
}
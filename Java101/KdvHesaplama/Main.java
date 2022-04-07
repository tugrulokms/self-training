import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("KDV'si hesaplanacak tutarı giriniz: ");
            
        double tutar = input.nextDouble();
        input.close();

        double kdv = (tutar > 0 && tutar < 1000) ? (tutar * 0.18) : (tutar * 0.08);

        double kdvliTutar = tutar + kdv;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);
        System.out.println("KDV tutarı: " + kdv);
    }
}
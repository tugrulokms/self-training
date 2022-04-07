import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, tr, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        tr = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        input.close();

        int toplam = (mat + fizik + kimya + tr + tarih + muzik);
        double ortalama = toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(sonuc);

    }
}
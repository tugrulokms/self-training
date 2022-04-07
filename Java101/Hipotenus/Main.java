import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik üçgenin ilk kenarını giriniz: ");
        kenar1 = input.nextInt();

        System.out.println("Dik üçgenin ikinci kenarını giriniz: ");
        kenar2 = input.nextInt();

        double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.println("Hipotenüs: " + hipotenus);

        System.out.println("Dik üçgenin üçüncü kenarını giriniz: ");
        kenar3 = input.nextInt();

        input.close();

        int cevre = (kenar1 + kenar2 + kenar3);
        double u = cevre / 2;

        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        
        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
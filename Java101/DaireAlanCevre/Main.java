import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        int r = input.nextInt();

        double pi = 3.14;

        double cevre = 2 * pi * r;
        double alan = pi * r * r;

        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin alanı: " + alan);

        System.out.print("Alanı bulunacakdaire diliminin merkes açısını giriniz: ");
        int aci = input.nextInt() % 360;

        input.close();

        double dilimAlani = (pi * (r * r) * aci) / 360;
        System.out.println("Merkez açısı " + aci + " olan daire diliminin alanı: " + dilimAlani);
        
    }
}
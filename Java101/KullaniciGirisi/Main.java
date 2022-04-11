import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;
        boolean invalidPassword = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123"))
            System.out.println("Giriş yaptınız!");
        else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.print("Sıradaki girişi şifrenizi sıfırlamak isterseniz (1), istemezseniz herhangi başka bir sayı olarak giriniz: ");

            select = input.nextInt();

            if(select == 1) {
                System.out.print("Yeni şifrenizi giriniz: ");

                while(invalidPassword) {
                    newPassword = input.next();

                    if(newPassword.equals("java123") || newPassword.equals(password))
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    else {
                        invalidPassword = false;
                        password = newPassword;
                        System.out.println("Şifre oluşturuldu.");
                    }

                }
                
            }
                
        }

        input.close();
            
    }
}
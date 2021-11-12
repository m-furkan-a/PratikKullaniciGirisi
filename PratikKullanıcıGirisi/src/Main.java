import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	    String pass,passiki,secim;

        System.out.print("Şifre Girin : ");
        pass = input.nextLine();

        if (!pass.equals("123")){
            System.out.println("Şifre Sıfırla e/h ?");
            secim = input.nextLine();
                 if (secim.equals("h") || secim.equals("H")){
                     System.out.println("Çıkış Yapıldı");
                 }
                 if (secim.equals("e") || secim.equals("E")){
                     System.out.println("Unutulan ve Son denenen şifre girilemez...");
                     System.out.print("Yeni Şifre : ");
                     passiki= input.nextLine();
                            if (passiki.equals("123") || passiki.equals(pass)){
                                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                            }
                            else {
                                System.out.println("Şifre oluşturuldu");
                            }
                 }
        }





    }
}

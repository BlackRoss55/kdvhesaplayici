import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Fiyat giriniz: ");
        double fiyat = sc1.nextDouble();
        double kdv1 = 0.18, kdv2 = 0.08;
        double kdvfiyat = 0;
        if (fiyat < 1000 && fiyat > 0) {
            kdvfiyat = fiyat+(fiyat*kdv1);
        }
        else if (fiyat >= 1000) {
            kdvfiyat = fiyat+(fiyat*kdv2);
        }
        double kdvmiktari = (kdvfiyat-fiyat);
        System.out.println("KDV eklenmiş fiyat: " + kdvfiyat);
        System.out.println("KDV miktarı: " + kdvmiktari);
    }
}

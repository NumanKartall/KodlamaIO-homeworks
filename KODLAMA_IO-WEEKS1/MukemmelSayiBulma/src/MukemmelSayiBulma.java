
public class MukemmelSayiBulma {
    public static void main(String[] args) {

        int sayi = 6;
        int toplam = 0;

        if (sayi<0){
            System.out.println("gecersiz ifade");
            return;
        }

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
              toplam+=i;
            }
        }
        if (sayi==toplam){
            System.out.println("mukemmel sayidir");
        }else {
            System.out.println("mukemmel sayi degildir");
        }
    }
}

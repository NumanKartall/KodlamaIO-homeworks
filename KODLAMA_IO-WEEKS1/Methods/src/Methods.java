
public class Methods {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayi = new int[]{1, 3, 4, 5, 6, 9, 2};

        int aranacak = 6;
        boolean varMi = false;

        for (int sayilar : sayi) {
            if (sayilar == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {

            String mesaj = "Sayi mevcuttur: " + aranacak;
            mesajYaz(mesaj);

        } else {
            mesajYaz(aranacak + " sayisi mevcut degildir");
        }
    }

    public static void mesajYaz(String mesaj) {
        System.out.println(mesaj);

    }
}

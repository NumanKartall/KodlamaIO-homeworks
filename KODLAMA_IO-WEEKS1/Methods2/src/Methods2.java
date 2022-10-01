public class Methods2 {
    public static void main(String[] args) {
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        String mesaj= mesaj();
        System.out.println(mesaj);
        int sayi = topla(4, 5);
        System.out.println(sayi);

        int toplam = topla2(2, 3, 6, 3, 1, 5, 7, 9, 4, 2, 4, 5, 6);
        System.out.println(toplam);
    }

    //public static void ekle() {
    //    System.out.println("Eklendi");
    //}
//
    //public static void sil() {
    //    System.out.println("Silindi");
    //}
//
    //public static void guncelle() {
    //    System.out.println("Guncellendi");
    //}

    public static String mesaj(){
        return "Bugun hava cok guzel";
    }
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {  //üç nokta variable arguments yani dizi oluşturma durumu denir
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}

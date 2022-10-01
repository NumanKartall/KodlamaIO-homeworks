
public class Arrays {
    public static void main(String[] args) {

        String ogrenci1 = "Engin";
        String ogrenci2 = "Salih";
        String ogrenci3 = "Numan";
        String ogrenci4 = "Ahmet";

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Salih";
        ogrenciler[2] = "Numan";
        ogrenciler[3] = "Ahmet";

        //ogrenciler[4] = "Burhan"; olmayan bir eleman eklenirse buna "Out of bounds" yani sınırları dışında eleman eklemek olur.

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------");

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }



    }
}
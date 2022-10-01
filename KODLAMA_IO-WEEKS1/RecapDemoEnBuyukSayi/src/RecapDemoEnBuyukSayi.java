public class RecapDemoEnBuyukSayi {
    public static void main(String[] args) {

        int say1 = 10, say2 = 12, say3 = 11;

        int enBuyuk = say1;

        //  if ((say1 > say2) && (say1 > say3)) {
        //      System.out.println(say1 + " en buyuk sayidir.");
        //  } else if ((say2 > say1) && (say2 > say3)) {
        //      System.out.println(say2 + " en buyuk sayidir.");
        //  } else if ((say3 > say1) && (say3 > say2)) {
        //      System.out.println(say3 + " en buyuk sayidir.");
        //  } else {
        //      System.out.println(say1 + " = " + say2 + " = " + say3 + " sayilari esittir");
        //  }

        if (enBuyuk < say2) {
            enBuyuk = say2;
        }
        if (enBuyuk < say3) {
            enBuyuk = say3;
        }
        System.out.println("en buyuk " + enBuyuk);
    }
}

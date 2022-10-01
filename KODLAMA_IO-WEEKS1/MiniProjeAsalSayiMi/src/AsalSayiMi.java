
public class AsalSayiMi {
    public static void main(String[] args) {

        int number = -5;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("asal degil");
            return; //döndürmeyi sağlar ve koyulan yerde ifadeyi keser.
        }

        if (number < 2) {
            System.out.println("gecersiz sayi");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("sayi asal");
        } else {
            System.out.println("asal degil");
        }
    }
}

public class SayiBulma {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 3, 4, 6, 8, 7, 2, 5};

        int aranacak = 9;
        boolean varMi= false;

        for (int sayi : sayilar) {
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("sayi mevcuttur");
        }else {
            System.out.println("sayi mevcut degildir");
        }

    }
}

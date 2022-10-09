
public class RecapDemo_2 {
    public static void main(String[] args) {

        double[] myList = {7.8, 3.5, 2.7, 4.6};
        double toplam = 0;
        double max = myList[2];
        double min = myList[1];

        for (double number : myList) {

            if (max < number) {
                max = number;
            } else if (min > number) {
                min = number;
            }

            toplam += number;
            System.out.println(number);
        }

        System.out.println("Listede ki sayilarin toplami= " + toplam);
        System.out.println("-------------------------------");
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min);

    }
}

public class While_Loops {

    public static void main(String[] args) {

        /*tanımladığımız değişkeni sayaç içerisinde arrtırma yaptırmazsak sonsuz döngüye gireriz
        infinitive loop gerçekleşir sonsuz döngü*/

        int say = 1;
        while (say < 10) {
            System.out.println(say);
            say++;
        }

    }
}

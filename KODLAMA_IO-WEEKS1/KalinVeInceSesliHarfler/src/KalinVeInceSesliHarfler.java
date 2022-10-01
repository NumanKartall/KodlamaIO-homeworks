
public class KalinVeInceSesliHarfler {
    public static void main(String[] args) {

        char harf='a';

        switch (harf){
            case 'a','ı','o','u':
                System.out.println("kalin sesli harf");
                break;
            case 'e','i','ö','ü':
                System.out.println("ince sesli harf");
                break;
            default:
                System.out.println("gecersiz harf");
        }

    }
}

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String message = "     Bugun hava cok guzel      ";
        System.out.println(message);

        /*System.out.println("Eleman sayisi: " + message.length()); //string ifadenin kaç karakterden olduğunu gösterir
        System.out.println("5. eleman: " + message.charAt(4));   //belirttiğimiz eleman sayısına göre ifadeyi getirtir
        System.out.println(message.concat(" Yasasin !"));   //herhangi bit metnin yanına ifade ya da kelime eklememizi sağlar
        System.out.println(message.startsWith("B"));           //şu ifadeyle ya da karakterle başlıyor mu sorgulaması yapılır
        System.out.println(message.endsWith("l"));            //şu ifadeyle ya da karakterle bitiyor mu sorgulaması yapılır


        char[] karakterler=new char[5];
        message.getChars(0,5,karakterler,0); //belirttiğimiz yerin ifadesini tanımlayıp char halinde bize aktarır
        System.out.println(karakterler);

        System.out.println(message.indexOf('a')); //girilen karakterin kaçıncı eleman olduğunu verir.
        System.out.println(message.lastIndexOf('e')); //girilen karakterin aramsını sondan yani sağdan başlar*/


        System.out.println(message.replace(' ', '-'));
        System.out.println(message.substring(2,5));

        for (String kelime:message.split("g")){
            System.out.println(kelime); //metinde bulunan bir ya da birden fazla ifadeyi silmemizi sağlar
        }
        System.out.println(message.toLowerCase()); // metni ya da ifadeyi küçük harflere çevirir
        System.out.println(message.toUpperCase());// metni ya da ifadeyi büyük harflere cevirir

        System.out.println(message.trim()); //  mesaj ya da ifade de boşluk ya da gereksiz karakter varsa bunu silmemizi sağlar
    }
}

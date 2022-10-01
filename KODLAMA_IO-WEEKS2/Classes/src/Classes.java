
public class Classes {

    public static void main(String[] args) {
        //class lar REFERANS tiplidir

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager2.Add();
        customerManager2.Remove();
        customerManager2.Update();

        //value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);


        //diziler referans tiplidir
        String[] sehirler1={"istanbul","kocaeli","edirne"};
        String[] sehirler2={"ankara","kayseri","nevsehir"};

        sehirler2=sehirler1;
        sehirler1[0]="antalya";
        System.out.println(sehirler2[0]);
    }
}
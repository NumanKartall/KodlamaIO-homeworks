
public class MethodOverloading {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();

        int topislsonuc = dortIslem.topla(293, 214);

        System.out.println(topislsonuc);

        dortIslem.topla(34,14,93);

        System.out.println(dortIslem.topla(34,14,93));

    }
}

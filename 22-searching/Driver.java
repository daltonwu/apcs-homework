import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Random rand = new Random();
        Searching search = new Searching(8);
        for (int i=0; i < search.getLength(); i++) {
            search.add(i * 2);
        }
        System.out.println(search.toString());
        search.sort();
        System.out.println(search.toString());
        System.out.println(search.search(2, "l"));
        System.out.println(search.search(25, "b"));
    }
}

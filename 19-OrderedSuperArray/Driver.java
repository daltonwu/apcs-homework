import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        OrderedSuperArray<String> osa = new OrderedSuperArray<String>(10, 10);
        System.out.println(osa.add("YAY"));
        System.out.println(osa.add("abc"));
        System.out.println(osa.remove(0));
        System.out.println("\n\n");
        for (int i=0; i<10; i++) {
            System.out.println(osa.get(i));
        }
    }
}

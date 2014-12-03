import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        SuperArray<String> osa = new SuperArray<String>(10, 10);
        System.out.println(osa.add("Swiss cheese!"));

        System.out.println("\n\n");
        for (int i=0; i<10; i++) {
            System.out.println(osa.get(i));
        }
    }
}

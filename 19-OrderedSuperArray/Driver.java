import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        SuperArray<String> osa = new SuperArray<String>(10, 10);
        osa.add("lawl");
        System.out.println(osa.get(0));
    }
}

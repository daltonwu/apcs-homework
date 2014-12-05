import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class Driver {
    public static void main(String[] args) {
        OrderedSuperArray<String> osa = new OrderedSuperArray<String>(10, 10);
        SortedSuperArray<String> ssa = new SortedSuperArray<String>(10, 10);
        
        Scanner f = null;
        try {
            f = new Scanner(new File("words.txt"));
        } catch (Exception e) {
            System.out.println("Sum Ting Wong!" + e);
        }
        while (f.hasNext()) {
            String s = f.nextLine();
            /*System.out.println(osa.add(s));
            System.out.println(ssa.add(s));*/
            osa.add(s);
            ssa.add(s);
        }
        
        System.out.println("\n------BEGIN PROGRAM-----------");
        System.out.println(  "--------OrderedSuperArray-----");
        for (int i=0; i<10; i++) {
            System.out.println(osa.get(i));
        }

        System.out.println(  "\n-----------------");

        for (int i=0; i<10; i++) {
            System.out.println(ssa.get(i));
        }
        
        ssa.chopItUp();
        System.out.println("\n");
        for (int i=0; i<10; i++) {
            System.out.println(ssa.get(i));
        }
        System.out.println("\n");
    }
}

import java.util.Scanner;
import java.io.File;

public class Huh {
    public static void main(String[] args) {
        OrderedSuperArray osa1 = new OrderedSuperArray();
        OrderedSuperArray osa2 = new OrderedSuperArray();
        Scanner sc = null;
        try {
            sc = new Scanner(new File("words.txt"));
        } catch (Exception e) { System.out.println("Fuck off, mate."); }
        osa1.add("apple");
        osa1.add("green");
        osa1.add("fool");
        osa1.add("blizzard");
        osa1.add("tortoise");
        osa1.add("zebra");
        osa1.add("xylophone");
        osa1.add("blasphemy");
        osa1.add("Malebolge");
        osa1.add("malbolge");
        while (sc.hasNext()) {
            osa2.add(sc.nextLine());
        }
        System.out.println(osa1.toString() + "\n\n");
        System.out.println(osa2.toString());
    }    
}

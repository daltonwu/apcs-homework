import java.util.*;


public class Driver {
    private static ArrayList<Integer> ali;
    private static Random rand = new Random();
    private static int numRandInts = 20;
    private static int maxRandInt = 5;
    
    public static void main(String[] args) {
	ali = new ArrayList<Integer>(numRandInts);
	randomize(numRandInts);
	System.out.println(ali.toString());
	ali = removeDupl(ali);
	System.out.println(ali.toString());
    }
    public static void randomize(int numRandInts) {
	for(int i=0; i<numRandInts; i++) {
	    ali.add(rand.nextInt(maxRandInt));
	}
    }

    public static ArrayList<Integer> removeDupl(ArrayList<Integer> ali) {
	ArrayList<Integer> foo = new ArrayList<Integer>(ali.size());
	for(int i=0; i<ali.size(); i++) {
	    if( !foo.contains(ali.get(i)) ) {
		foo.add(ali.get(i));
	    }
	}
	return foo;
    }
}

import java.util.*;

public class Driver {
    // the stuff
    private static Random rand = new Random();

    // the number of ints to put in ArrayList or int[]
    private static int size = 20;

    // the goods
    private static ArrayList<Integer> alpha  = new ArrayList<Integer>(size);
    private static int[] beta = new int[size];
    
    
    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.println("**** Stage one, randomizing ArrayList<Integer>: ");
        
        System.out.println("Initial: ");
        clearAndInitializeArrayList(size);
        System.out.println(alpha);
        
        System.out.println("After randomization algorithm: ");
        randomizeArrayList();
        System.out.println(alpha + "\n\n");
        

        System.out.println("**** Stage two, randomizing int[]: ");
        
        System.out.println("Initial: ");
        initializeArray(size);
        System.out.println(Arrays.toString(beta));

        System.out.println("After randomization algorithm (which is crappy, btw): ");
        randomizeArray();
        System.out.println(Arrays.toString(beta) + "\n\n");
        
    }

    private static boolean clearAndInitializeArrayList(int maxInt) {
        alpha.clear();
        for (int i=0; i<maxInt; i++) {
            alpha.add(i);
        }

        // just 'cause
        return true;
    }

    private static boolean randomizeArrayList() {
        ArrayList<Integer> foo = (ArrayList<Integer>)alpha.clone();
        alpha.clear();
        while (foo.size() > 0) {
            int i = rand.nextInt(foo.size());
            alpha.add(foo.get(i));
            foo.remove(i);
        }
        
        // just 'cause
        return true;
    }
    
    private static boolean initializeArray(int maxInt) {
        for (int i=0;i<maxInt; i++) {
            beta[i] = i;
        }

        // just 'cause
        return true;
    }

    private static boolean randomizeArray() {
        // I GIVE UP. I'M JUST GOING TO DO THIS INEFFICIENTLY.
        int[] foo = new int[beta.length];
        for (int i=0; i<beta.length; i++) {
            foo[i] = beta[i];
        }
        boolean[] lolz = new boolean[beta.length];
        //System.out.println(Arrays.toString(lolz));
        //System.out.println(Arrays.toString(foo));
        for (int i=0; i<beta.length; i++) {
            do {
                int g = rand.nextInt(beta.length);
                if (!lolz[g]) {
                    lolz[g] = true;
                    beta[i] = foo[g];
                    break;
                    //System.out.println("damn, this shitty code is shit");
                }
            } while (true);
        }

        // just 'cause
        return true;
    }
    /**** THE FOLLOWING ARE BAD SCREW-UPS ****
    // self-explanatory
    private static boolean clearAndRandomizeArrayList(int numRand, int maxRand) {
        alpha.clear();
        for (int i=0; i<numRand; i++) {
            alpha.add(rand.nextInt(maxRand));
        }

        // just 'cause
        return true;
    }
    
    // can only take maxRand because int[].length is fixed
    private static boolean randomizeArray(int maxRand) {
        for (int i=0; i<numRand; i++) {
            beta[i] = rand.nextInt(maxRand);
        }

        // just 'cause
        return true;
    }
    */
}

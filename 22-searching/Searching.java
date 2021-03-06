import java.util.Arrays;

public class Searching {
    Comparable[] a;
    int lastFilledIndex = -1;
    //
    public Searching(int length) {
        a = new Comparable[length];
    }
    public int getLength() {
        return a.length;
    }
    public int getFilled() {
        return lastFilledIndex + 1;
    }
    public Comparable add(Comparable c) {
        a[++lastFilledIndex] = c;
        return a[lastFilledIndex];
    }
    public void sort() {
        Arrays.sort(a);
    }
    public String toString() {  
        return Arrays.toString(a);
    }
    public Comparable search(Comparable item, String which) {
        which = which.toLowerCase();
        if (which.equals("linear") || which.equals("l")) return linearSearch(item);
        if (which.equals("binary") || which.equals("b")) return binarySearch(item);
        if (which.equals("rbinary") || which.equals("rb")) return recursiveBinarySearch(item);
        else return "YOU SCREWED UP DUMBASS";
    }
    public Comparable linearSearch(Comparable item) {
        // Linear search.
        // If item is there, return the item.
        // If not, return null.
        for(int i=0; i < a.length; i++) {
            if(item.equals(a[i])) return item;
        }
        return null;
    }
    public Comparable binarySearch(Comparable item) {
        // Binary search.
        // If item is there, return the item.
        // If not, return null.
        int low = 0;
        int high = a.length-1;
        while(high >= low) {
            int toCheck = (low + high) / 2;
            System.out.println("In binary while, low = " + low + ", high = " + high + ", toCheck = " + toCheck);
            if(item.equals(a[toCheck])) return item;
            if(item.compareTo(a[toCheck]) > 0) {
                low = toCheck + 1;
            }
            else {
                high = toCheck - 1;
            }
        }
        return null;
    }
    public Comparable recursiveBinarySearch(Comparable item) {
        // Recursive implementation of the binary search.
        // Again, if item is there, return the item.
        // If not, return null.
        return rBinarySearch(item, 0, a.length-1);
    }
    public Comparable rBinarySearch(Comparable item, int low, int high) {
        System.out.println("In recursive binary, low = " + low + ", high = " + high + ", toCheck = " + (low + high) / 2);
        if(high < low) {
            return null;
        }
        int toCheck = (low + high) / 2;
        if(item.equals(a[toCheck])) {
            return item;
        }
        if(item.compareTo(a[toCheck]) > 0) {
            return rBinarySearch(item, toCheck + 1, high);
        }
        return rBinarySearch(item, low, toCheck - 1);
    }
}

import java.util.Random;

public class Interval implements Comparable<Interval>{
    Random rand = new Random();
    private int low, high;
    private final int randLimit = 100;
    private final int randLimitDigits = 2;
    public Interval(int l, int h) {
        this.low = l;
        this.high = h;
    }
    public Interval() {
        this.high = 1 + rand.nextInt(randLimit);
        this.low = rand.nextInt(high);
    }
    public int fiveDownLow() {
        // read fiveUpHigh() for an explanation
        return low;
    }
    public int fiveUpHigh() {
        // please don't getHigh()
        return high;
    }
    public void setLow(int low) {
        this.low = low;
    }
    public void setHigh(int high) {
        this.high = high;
    }
    @Override
    public int compareTo(Interval other) {
        if (this.low != other.fiveDownLow()) {
            return this.low - other.fiveDownLow();
        }
        else {
            if (this.high != other.fiveUpHigh()) {
                return this.high - other.fiveUpHigh();
            }
            else return 0;
        }
    }
    public String toString() {
        // toString() method with padding added,
        // to line things up.
        // Will break with negative numbers.
        int lowSpaces = 0; // num of spaces in low
        for (int i=low/10; i > 0; i /= 10) {
            lowSpaces++;
        }
        String lowWithSpaces = new String(new char[randLimitDigits-lowSpaces]).replace("\0"," ") + low;

        int highSpaces = 0; // num of spaces in high
        for (int i=high/10; i > 0; i/= 10) {
            highSpaces++;
        }
        String highWithSpaces = new String(new char[randLimitDigits-highSpaces]).replace("\0"," ") + high;
        
        return "[" + lowWithSpaces + ", " + highWithSpaces + "]";
    }
    /* BACKUP IN CASE OF FAILURE
    public String toString() {
        return "[" + low + ", " + high + "]";
    }
    */
 
}

import java.util.Random;

public class Interval {
    Random rand = new Random();
    private int low, high;
    public Interval(int l, int h) {
        this.low = l;
        this.high = h;
    }
    public Interval() {
        this.high = 1 + rand.nextInt(100);
        this.low = rand.nextInt(high);
    }
    public String toString() {
        return "[" + low + ", " + high + "]";
    }
    /*
    public String toString() {
        String lowWithSpaces = "";
        for (int i=low; i > 0; i /= 10) {
            lowWithSpaces += " ";
        }
        switch (low / 10) {
            case 0: lowWithSpaces += "  ";
                    break;
            case 1: lowWithSpaces += " ";
                    break;
            case 2:
                    break;
        }
        lowWithSpaces += " " + low;

        String highWithSpaces = "";
        switch (high / 10) {
            case 0: highWithSpaces += "  ";
                    break;
            case 1: highWithSpaces += " ";
                    break;
            case 2: 
                    break;
        }
        highWithSpaces += high;

        return "[" + lowWithSpaces + ", " + highWithSpaces + "]";
    }*/
}

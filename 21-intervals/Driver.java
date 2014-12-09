public class Driver {
    public static void main(String[] args) {
        Interval[] intervalArray = new Interval[10];
        for (int i=0; i<intervalArray.length; i++) {
            intervalArray[i] = new Interval();
        }
        for (int i=0; i<intervalArray.length; i++) {
            System.out.println(intervalArray[i]);
        }
        int foo = 16;
        System.out.println(foo);
        System.out.println(foo %= 10);
    }
}

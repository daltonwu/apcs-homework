public class Driver {
    // WHY DO THIS
    // static Interval[] intervalArray = new Interval[10];
    // WHEN I CAN DO THIS
    static SortedSuperArray<Interval> intervalArray = new SortedSuperArray<Interval>(10, 42);
    public static void main(String[] args) {
        init();
        printIntervalArray();
        intervalArray.selectionSort();
        printIntervalArray();
        intervalArray.chopItUp();
        printIntervalArray();
        intervalArray.BS();
        printIntervalArray();
    }
    public static void init() {
        for (int i=0; i<10; i++) {
            intervalArray.add(new Interval());
        }
    }
    public static void printIntervalArray() {
        System.out.println();
        for (int i=0; i<intervalArray.size(); i++) {
            System.out.println(intervalArray.get(i));
        }
        System.out.println();
    }
}

public class OrderedSuperArray<E extends Comparable<E>> extends SuperArray {

    public OrderedSuperArray(int size, int growSize) {
        super(size, growSize);
    }
    public OrderedSuperArray() {
        super(10, 10);
    }

    public boolean add(E item) {
        try {
            int index = 0;
            while (index < super.size()-1 && item.compareTo((E)super.get(index)) > 0) {
                index++;
            }
            super.add(index, item);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("OH NO, ArrayIndexOutOfBoundsException!!11!" + a);
        } catch (Throwable t) {
            System.out.println("???" + t);
        }
        return true;
    }
}

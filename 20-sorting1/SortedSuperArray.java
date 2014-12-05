import java.util.Random;

public class SortedSuperArray<E extends Comparable<E>> extends SuperArray {
    public SortedSuperArray(int size, int growSize) {
        super(size, growSize);
    }
    public SortedSuperArray() {
        super(10, 10);
    }

    public void chopItUp() {
        Random rand = new Random();
        for(int i=0; i<super.size(); i++) {
            int index = rand.nextInt(super.size());
            E temp = (E)super.get(i);
            super.set(i, super.get(index));
            super.set(index, temp);
        }
    }
    
    public void insertionSort() {
        for(int i=1; i<super.size(); i++) {
            E foo = (E)super.get(i);
            int index = 1;
            while (index < super.size() && .compareTo(foo) > 0) {
                index++;
            }
        }
    }

}

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
    // SORTING ALGORITHMS, in order from not-so-lame to LAAAME
    public void insertionSort() {
        // Inside big list: a sorted list that increases size
        // with each iteration.
        for(int i=1; i<super.size(); i++) {
            // Grab the element.
            E foo = (E)super.get(i);
            // Do everything in one go.
            int g = i;
            while (g > 0 && super.get(g-1).compareTo(foo) > 0) {
                super.set(g, super.get(g-1));
                g--;
            }
            super.set(g, foo);
        }
    }
    public void selectionSort() {
        // Pick the smallest of the big list, then
        // stick it at the beginning. Keep doing that.
        for(int i=0; i<super.size(); i++) {
            int minIndex = i;
            for(int g=i+1; g<super.size(); g++) {
                if(super.get(g).compareTo(super.get(minIndex)) < 0) {
                    minIndex = g;
                }
            }
            // Swappity swapp!
            if(minIndex != i) {
                E temp = (E)super.get(i);
                super.set(i, (E)super.get(minIndex));
                super.set(minIndex, temp);
            }
        }
    }
    public void BS() {
        // The only appropriate acronym for bubble sort
        boolean keepGoingDontGiveUp = false;
        while (!keepGoingDontGiveUp) {
            keepGoingDontGiveUp = true;
            for (int i=0; i < super.size()-1; i++) {
                E one = (E) super.get(i);
                E two = (E) super.get(i+1);
                if (one.compareTo(two) > 0) {
                    keepGoingDontGiveUp = false;
                    super.set(i, two);
                    super.set(i+1, one);
                }
            }
        }
    }
}

import java.lang.reflect.Array;

public class SuperArray<E extends Comparable<E>> {
    private E[] data;
    private int last; //last index!
    private int growSize;
    
    public SuperArray(int size, int growSize) {
        // Sets up the initial instance variables.
        //@SuppressWarnings("unchecked")
        data = (E[])new Comparable[size];
        //E[] data = (E[]) Array.newInstance(e, size);
        this.growSize = growSize;
        last = -1;
    }
    public SuperArray() {
        // Special case for the lazy person.
	this(10, 10);
    }
    
    public String toString() {
        String s = "[";
        for(int i=0; i<=last; i++) {
            s += data[i];
            if (i != last) s += ", ";
        }
        s += "]";
        return s;
    }
    public boolean add(E item) {
        // Adds an item to the end of the list, grows if needed.
        // Returns true.
	if (last >= data.length-1) {
	    this.grow(growSize);
	}
	last++;
	data[last] = (E)item;
	return true;
    }
    
    public boolean add(int index, E item) {
        // Adds item at given index, shifting everything down as needed.
        // Grows as needed.
        // Also, NO SWISS CHEESE!
        if (index > last+1) {
            return false;
        }
	if (last >= data.length-1) {
	    this.grow(growSize);
	}
        last++;
	E prevVal = item;
	for (int foo=index; foo<=last; foo++) {
	    E temp = data[foo];
	    data[foo] = prevVal;
	    prevVal = temp;
	}
        return true;
    }

    public int size() {
        // Returns the number of items in the list (not the array size).
	return last+1;
    }

    public E get(int index) {
        // Returns the item at given index of the list.
        try {
            if (index > last) {
                this.classyErrorL();
            }
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given index not within the SuperArray! " + a);
            return null;
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
            return null;
        }
        
        //return data[index];
    }

    public E set(int index, E e) {
        // Sets the item at given index to given value.
        // Returns the old value.
        try {
            if (index > last) {
                this.classyErrorL();
            }

            E toReturn = data[index];
            data[index] = e;
            return toReturn;
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given index not within the SuperArray! " + a);
            return null;
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
            return null;
        }
    }

    public E remove(int index) {
        // Removes the item at given index. [See this.add()]
        // Returns the old value.
	try {
            if (index > last) {
                this.classyErrorL();
            }
            
            E toReturn = data[index];
            for (int foo=index; foo<last; foo++) {
                data[foo] = data[foo+1];
            }
            data[last] = null; // WIPED
            last--;
            return toReturn;
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given index not within the SuperArray! " + a);
            return null;
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
            return null;
        }
    }

    public void grow(int bigger) {
	// modifies empty space at the end of the array
        E[] temp = (E[])new Object[data.length];
	//E[] temp = (E[]) Array.newInstance(E, data.length);
	System.arraycopy(data, 0, temp, 0, data.length);
        data = (E[])new Object[temp.length + bigger];
	//data = (E[]) Array.newInstance(E, temp.length + bigger);
	System.arraycopy(temp, 0, data, 0, data.length);
    }
    /*
    public void shift(int start, int phase) {
	// shift everything <phase> places,
	// starting at index <start>
	if (phase == 0 || start < 1) System.out.println("wth are you doing??");
	if (phase < 0) {
	    int[] temp = new int[data.length];
	    System.arraycopy(data, 0, temp, 0, data.length);
	    data = new int[
	}
	else {
	}
    }
    */
    public void classyErrorL() {//throws ClassyErrorException {
        //System.out.println("Error! Given index does not point to initialized portion of SuperArray!!!1!!!111!");
        //throw new ClassyErrorException();
    }
}

import java.lang.reflect.Array;

public class SuperArray<E> {
    private E[] data;
    private int last;
    private int growSize;
    
    public SuperArray(Class<E> e, int size, int growSize) {
        // Sets up the initial instance variables.
        //@SuppressWarnings("unchecked")
        E[] data = (E[]) Array.newInstance(e, size);
        this.growSize = growSize;
        last = 0;
    }
    public SuperArray(Class<E> e) {
        // Special case for the lazy person.
	this(e, 10, 10);
    }

    public boolean add(E item) {
        // Adds an item to the end of the list, grows if needed.
        // Returns true.
	if (last >= data.length-1) {
	    this.grow(growSize);
	}
	last++;
	data[last] = item;
        
	return true;
    }
    
    public boolean add(int index, E e) {
        // Adds item i at given index, shifting everything down as needed.
        // Grows as needed.
	if (last >= data.length-1) {
	    this.grow(growSize);
	}
	E prevVal = e;
	for (int foo=index; foo<last+1; foo++) {
	    E temp = data[foo];
	    data[foo] = prevVal;
	    prevVal = temp;
	}
        
        return true;
    }

    public int size() {
        // Returns the number of items in the list (not the array size).
	return last;
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
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
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
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
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
            
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given index not within the SuperArray! " + a);
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
        }
        
        E toReturn = data[index];
	for (int foo = index; foo < last; foo++) {
	    data[foo] = data[foo+1];
	}
	data[last] = null; // WIPED
	last--;
	return toReturn;
    }

    public void grow(int bigger) {
	// modifies empty space at the end of the array
	E[] temp  = (E[]) Array.newInstance(Class<E>, data.length);
	System.arraycopy(data, 0, temp, 0, data.length);
	data = (E[]) Array.newInstance(Class<E>, temp.length + bigger);
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
    public void classyErrorL() {
        System.out.println("Error! Given index does not point to initialized portion of SuperArray!!!1!!!111!");
        throw new ClassyError();
    }
}

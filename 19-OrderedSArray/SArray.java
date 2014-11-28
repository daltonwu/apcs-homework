public class OrderedSArray<E> {
    private E[] data;
    private int last;
    private int growSize;
    
    public OrderedSArray(Class<E> c, int size, int growSize) {
        // Sets up the initial instance variables.
        @SuppressWarnings("unchecked")
        data = (E[]) Array.newInstance(c, size);
        this.growSize = growSize;
        last = 0;
    }
    public OrderedSArray(Class<E> c) {
        // Special case for the lazy person.
	this(c, 10, 10);
    }

    public boolean add(int i) {
        // Adds an item to the end of the list, grows if needed.
        // Returns true.
	if (last == data.length-1) {
	    this.grow(10);
	}
	last++;
	data[last] = i;
        
	return true;
    }
    
    public void add(int index, int i) {
        // Adds item i at given index, shifting everything down as needed.
        // Grows as needed.
	if (last == data.length-1) {
	    this.grow(growSize);
	}
	int prevVal = i;
	for (int foo = index; foo < last+1; foo++) {
	    E temp = data[foo];
	    data[foo] = prevVal;
	    prevVal = temp;
	}
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
            System.out.println("Given index not within the SArray! " + a);
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
        }

        return data[index];
    }

    public E set(int index, int i) {
        // Sets the item at given index to given value.
        // Returns the old value.
        try {
            if (index > last) {
                this.classyErrorL();
            }
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given index not within the SArray! " + a);
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
        }

	E toReturn = data[index];
	data[index] = i;
	return toReturn;
    }

    public E remove(int index) {
        // Removes the item at given index. [See this.add().]
        // Returns the old value.
	try {
            if (index > last) {
                this.classyErrorL();
            }
            return data[index];
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Given index not within the SArray! " + a);
        }
        catch (IndexOutOfBoundsException i) {
            System.out.println("??? " + i);
        }
        
        E toReturn = data[index];
	for (int foo = index; foo < last; foo++) {
	    data[foo] = data[foo+1];
	}
	data[last] = 0; // WIPED
	last--;
	return toReturn;
    }

    public void grow(int bigger) {
	// modifies empty space at the end of the array
        data = (E[]) Array.newInstance(c, size);
        data = (E[]) Array.newInstance(c, size);

	
	E[] temp  = new E[data.length];
	System.arraycopy(data, 0, temp, 0, data.length);
	data = new E[temp.length + bigger];
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
        System.out.println("Error! Given index does not point to initialized portion of SArray!!!1!!!111!");
        throw new ClassyError();
    }
}

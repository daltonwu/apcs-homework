public class SArray {
    int[] data;
    int   last;

    public SArray() {
        // Sets up the initial instance variables.
	data = new int[10];
	last = 0;
    }

    public boolean add(int i) {
        // Adds an item to the end of the list, grows if needed.
        // Returns true.
	if (last == data.length-1) {
	    this.grow(5);
	}
	last++;
	data[last] = i;
	return true;
    }

    public void add(int index, int i) {
        // Adds item i at given index, shifting everything down as needed.
        // Grows as needed.
	if (last == data.length-1) {
	    this.grow(5);
	}
	int prevVal = i;
	for (int foo = index; foo < last+1; foo++) {
	    int temp = data[foo];
	    data[foo] = prevVal;
	    prevVal = temp;
	}
    }

    public int size() {
        // Returns the number of items in the list (not the array size).
	return last;
    }

    public int get(int index) {
        // Returns the item at given index of the list.
        try {
            if (index > last) {
                this.classyErrorL()
            }
            return data[index];
        }
        catch (ArrayIndexOutOfBounds a) {
            System.out.println("Given index not within the SArray! " + a);
        }
        catch (IndexOutOfBounds i) {
            System.out.println("??? " + i);
        }

        return data[index];
    }

    public int set(int index, int i) {
        // Sets the item at given index to given value.
        // Returns the old value.
        try {
            if (index > last) {
                this.classyErrorL();
            }
            return data[index];
        }
        catch (ArrayIndexOutOfBounds a) {
            System.out.println("Given index not within the SArray! " + a);
        }
        catch (IndexOutOfBounds i) {
            System.out.println("??? " + i);
        }

	int toReturn = data[index];
	data[index] = i;
	return toReturn;
    }

    public int remove(int index) {
        // Removes the item at given index. [See this.add().]
        // Returns the old value.
	try {
            if (index > last) {
                this.classyErrorL();
            }
            return data[index];
        }
        catch (ArrayIndexOutOfBounds a) {
            System.out.println("Given index not within the SArray! " + a);
        }
        catch (IndexOutOfBounds i) {
            System.out.println("??? " + i);
        }
        
        int toReturn = data[index];
	for (int foo = index; foo < last; foo++) {
	    data[foo] = data[foo+1];
	}
	data[last] = 0; // WIPED
	last--;
	return toReturn;
    }

    public void grow(int bigger) {
	// modifies empty space at the end of the array
	
	int[] temp  = new int[data.length];
	System.arraycopy(data, 0, temp, 0, data.length);
	data = new int[temp.length + bigger];
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
    }
}

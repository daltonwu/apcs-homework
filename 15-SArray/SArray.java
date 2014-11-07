public class SArray {
    int[] data;
    int   last;

    public SArray() {
    }
    public SArray() {
        // set up the initial instance variables
	data = new int[10];
	last = 0;
    }

    public boolean add(int i) {
        // adds an item to the end of the list, grow if needed
        // returns true
	if (last == data.length-1) {
	    this.grow(5);
	}
	else {
	    last++;
	    data[last] = i;
	}
	return true;
    }

    public void add(int index, int i) {
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	return last;
    }

    public int get(int index) {
        // returns the item at location index of the list
	return data[index];
    }

    public int set(int index, int i) {
        // sets the item at location index to value i
        // returns the old value
    }

    public int remove(int index) {
        // removes the item at index i
        // returns the old value
    }

    public void grow(int bigger) {
	int[] temp  = new int[data.length];
	for (int i = 0; i < data.length; i++) {
	    temp[i] = data[i];
	}
	data = new int[temp.length + bigger];
	for (int i = 0; i < temp.length; i++) {
	    data[i] = temp[i];
	}
    }
    public void shift(int start, int phase) {
	// shift everything <phase> places,
	// starting at index <start>
	if (phase == 0 || start < 1) System.out.println("wth are you doing??");
	if (phase < 0) {
	    for (int i=0; i < data.length; i++) {
		int temp = data[i];
		
	    }
	}
	else {
	}
    }
}

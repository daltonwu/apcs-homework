public class Arraystuff {
    private int[] arr;
    
    public Arraystuff(int[] arr) {
	this.arr = arr;
    }
    
    public int find(int n) {
	/** @return index of first occurrence of n in the array or -1 if not found
	 *  @param int[], number n
	 */
	for(int aye=0; aye<arr.length; aye++) {
	    if(arr[aye]==n) return aye;
	}
	return -1;
    }
    public int maxVal() {
	/** @return largest value in the array
	 */
	if(arr.length == 0) {
	    return (int)Double.NaN;
	}
	int max = arr[0];
	for(int foo : arr) {
	    if (foo > max) max = foo;
	}
	return max;
    }
}
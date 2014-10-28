public class Arraystuff {
    public int find(int[] arr,  n) {
	/** @return index of first occurrence of n in the array or -1 if not found
	 *  @param int[], number n
	 */
	for(int aye=0; aye<arr.length; aye++) {
	    if(arr[aye]==n) return aye;
	}
	return -1;
    }
    public int maxVal(int[] arr) {
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
    public int freq(int[] arr, int n) {
	int count = 0;
	for(int i : arr) {
	    if(i==n) count++;
	}
	return count;
    }
    public int sum67(int[] nums) {
	int sum = 0;
	boolean between67 = false;
	for(int i=0; i<nums.length; i++) {
	    if(!between67) {
		if(nums[i]==6) {
		    between67 = true;
		}
		else {
		    sum += nums[i];
		}
	    }
	    else {
		if(nums[i]==7) {
		    between67 = false;
		}
	    }
	}
	return sum;
    }
    public boolean more14(int[] nums) {
	int num1 = 0;
	int num4 = 0;
	for(int i=0; i<nums.length; i++) {
	    if(nums[i]==1) num1++;
	    else if(nums[i]==4) num4++;
	}
	return num1>num4;
    }
    public int[] tenRun(int[] nums) {
	int n=-1;
	for(int i=0; i<nums.length; i++) {
	    if(nums[i]%10==0) n = nums[i]/10;
	    else if(n!=-1) nums[i] = 10*n;
	}
	return nums;
    }
    public boolean tripleUp(int[] nums) {
	for(int i=0; i<nums.length-2; i++) {
	    if(nums[i+2]==nums[i+1]+1 && nums[i+1]==nums[i]+1) return true;
	}
	return false;
    }
    public boolean canBalance(int[] nums) {
	if (nums.length==0) return true;
	for (int i=0; i<nums.length; i++) {
	    if (beginSum(nums, i) == endSum(nums, i)) return true;
	}
	return false;
    }

    public int beginSum (int[] nums, int endIndex) {
	int sum = 0;
	for (int i=0; i<endIndex; i++) {
	    sum += nums[i];
	}
	return sum;
    }
    
    public int endSum (int[] nums, int startIndex) {
	int sum = 0;
	for (int i=startIndex; i<nums.length; i++) {
	    sum += nums[i];
	}
	return sum;
    }
    
    public int[] seriesUp(int n) {
	int[] sequence = new int[n*(n+1)/2];
	for(int i=0; i<n; i++) {
	    int base = i*(i+1)/2;
	    for(int g=0; g<=i; g++) {
		sequence[base+g] = g+1;
	    }
	}
	return sequence;
    }
}

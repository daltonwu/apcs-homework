public class Driver {
    public static void main(String[] args) {
	int[] arr = {1, 2, 3};
	Arraystuff t = new Arraystuff(arr);
	System.out.println(t.find(2));
	System.out.println(t.maxVal());
    }
}
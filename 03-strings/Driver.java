public class Driver {
    public static void main(String[] args) {
        String s = "mike zamansky";
	int index = s.indexOf(" ");
        String first = s.substring(0,index);
	String last = s.substring(index);
	
	System.out.print("First name: ");
	System.out.println(first);
	System.out.print("Last name: ");
	System.out.println(last);
    }
}
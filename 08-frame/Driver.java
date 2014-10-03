public class Driver {
    public static void main(String[] args) {
	Classy soClassy = new Classy();
	System.out.println(soClassy.frame(5,4));
	System.out.println(soClassy.frame(68,21) + "ooh, golden rectangle");
	System.out.println();
	
	System.out.println(soClassy.stringSplosion("Code"));
	System.out.println(soClassy.stringSplosion("abc"));
	System.out.println(soClassy.stringSplosion("ab"));
	System.out.println();
	
	System.out.println(soClassy.stringX("xxHxix"));
	System.out.println(soClassy.stringX("abxxxcd"));
	System.out.println(soClassy.stringX("xabxxxcdx"));
    }
}

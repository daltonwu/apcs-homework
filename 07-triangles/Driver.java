
public class Driver {
    public static void  main(String[] args){
	Shapes s =  new Shapes();
        
	System.out.println(s.box(5,4));
	System.out.println(s.box(4,5));
        
        System.out.println(s.tri1(3));
        System.out.println(s.tri1(5));
        
        System.out.println(s.tri2(3));
        System.out.println(s.tri2(5));
	
	System.out.println(s.tri3(4));
	System.out.println(s.tri3(6));
        
        System.out.println(s.diamond(5));
        System.out.println(s.diamond(7));

        System.out.println(s.tri4(4));
        System.out.println(s.tri4(6));
    }
}

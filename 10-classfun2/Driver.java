public class Driver {
    public static void main(String[] args){
        /*
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();
	Basechar c2;
	Warrior w2;
	Mage m2;
        System.out.println(m);
	// nope w2 = m;
	// nope w2 = c;

	// this works -- note that c2.getHealth() calls getHealth in the
	// warrior subclass
	//c2 = w;
        //System.out.println(c2.getHealth());

	//c2 = m;
        //System.out.println(c2.getHealth());
        //System.out.println( ((Mage)c2).getManna()   );

	w.setName("Groo");
	m.setName("Mr. Sage");

	w.attack(m);
	m.attack(w);
	w.attack(w);
	System.out.println(w.toString());
	System.out.println(w);
        */
        /*
        Basechar generic = new Basechar();
        Basechar test = new Basechar("Worm");
        System.out.println(generic.toString());
        System.out.println(test.toString());*/

        Mage m = new Mage("MAGE");
        System.out.println(m);
        Mage m2 = new Mage();
        System.out.println(m2);
        Mage momg = new Mage("NAMEYEAH", 42424242);
        System.out.println(momg);
        System.out.println(momg.getManna());
    }
}

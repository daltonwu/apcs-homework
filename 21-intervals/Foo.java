public class Foo {
    public static void main(String[] args) {
        //Basechar b = new Basechar("Hola", 99, 99);
        //Basechar boo = new Basechar("Cthulu", 99, 99);
        Ninja n = new Ninja("Halloa");
        Ninja nuuuu = new Ninja("ZemoNaNsky"); // kind of a cross between NaN, demon, and star wars
        //System.out.println(b.compareTo(boo));
        //System.out.println(boo.compareTo(b));
        System.out.println(n.compareTo(nuuuu));
        System.out.println(nuuuu.compareTo(n));
    }
}

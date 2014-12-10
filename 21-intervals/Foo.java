public class Foo {
    public static void main(String[] args) {
        Ninja b = new Ninja("Hola", 99, 99);
        Ninja boo = new Ninja("Cthulu", 99, 99);
        System.out.println(b.compareTo(boo));
        System.out.println(boo.compareTo(b));
    }
}

public class Driver {
    public static void main(String[] args) {
        // test everything
        StringStuff foo = new StringStuff();

        System.out.println("// nonstart\n");
        System.out.print("Expecting \"ellohere\": ");
        System.out.println(foo.nonStart("Hello", "There"));
        System.out.print("Expecting \"avaode\": ");
        System.out.println(foo.nonStart("java", "code"));
        System.out.print("Expecting \"hotlava\": ");
        System.out.println(foo.nonStart("shotl", "java"));
        System.out.print("\n\n");
        
        
        System.out.println("// makeAbba\n");
        System.out.print("Expecting \"HiByeByeHi\": ");
        System.out.println(foo.makeAbba("Hi", "Bye"));
        System.out.print("Expecting \"YoAliceAliceYo\": ");
        System.out.println(foo.makeAbba("Yo", "Alice"));
        System.out.print("Expecting \"WhatUpUpWhat\": ");
        System.out.println(foo.makeAbba("What", "Up"));
        System.out.print("\n\n");
        
        System.out.println("// diff21\n");
        System.out.print("Expecting 2: ");
        System.out.println(foo.diff21(19));
        System.out.print("Expecting 11: ");
        System.out.println(foo.diff21(10));
        System.out.print("Expecting 0: ");
        System.out.println(foo.diff21(21));


        
    }
}

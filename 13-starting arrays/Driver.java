import java.util.Arrays;

public class Driver {
  public static void main(String[] args) {
    Arraystuff tester = new Arraystuff();
    int[] a = {1,2,3};
    int[] b = {1,2};
    int[] c = {1};
    System.out.println(Arrays.toString(tester.frontPiece(a)));
    System.out.println(Arrays.toString(tester.frontPiece(b)));
    System.out.println(Arrays.toString(tester.frontPiece(c)));
    
    int[] x = {1,2,2,1};
    int[] y = {1,1};
    int[] z = {1,2,2,1,13};
    System.out.println(tester.sum13(x));
    System.out.println(tester.sum13(y));
    System.out.println(tester.sum13(z));
  }
}


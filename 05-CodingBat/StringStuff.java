public class StringStuff {
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public int diff21(int n) {
        int diff = Math.abs(n - 21);
        return n > 21 ? diff * 2 : diff;
    }
}

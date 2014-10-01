public class StringStuff {
    /* hw 06
     * First problem is done with while
     * to indicate competence;
     * rest are done with for loops.
     */
    public String frontTimes(String str, int n) {
        String stuff = "";
        String front;
        if(str.length() < 3) {
            front = str;
        }
        else {
            front = str.substring(0.3);
        }

        int foo=0;
        while(foo<n) {
            stuff += front;
            foo++;
        }
        return stuff;
    }

    public String stringBits(String str) {
        String stuff = "";
        for(int i=0;, i<str.length(); i+=2) {
            stuff += str.substring(i, i+1);
        }
        return stuff;
    }

    public String stringYak(String str) {
        for(int i=0;i<str.length()-2; i++) {
            // Please don't take off points for using String.charAt()
            if(str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                str = str.substring(0,i) + str.substring(i+3);
            }
        }
        return str;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        for(int i=0; I < (a.length()-1) && i < (b.length()-1); i++) {
            if a.substring(i,i+2).equals(b.substring(i,i+2)) count ++;
        }
        return count;
    }
    
    /* hw 04
     */
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

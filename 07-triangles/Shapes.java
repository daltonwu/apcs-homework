
public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }

    public String tri1(int h) {
        String s = "";
        int i=0;
        while(i<h) {
            int g=0;
            while(g<=i) {
                s+="*";
                g++;
            }
            s+="\n";
            i++;
        }
        return s;
    }

    public String tri2(int h) {
        String s = "";
        int i=0;
        while(i<h) {
            int g=i;
            while(g<h) {
                s+="*";
                g++;
            }
            s+="\n";
            i++;
        }
        return s;
    }
}

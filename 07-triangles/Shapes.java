
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
        for(int i=1; i<=h; i++) {
            for(int g=1; g<=h; g++) {
                if(g>h-i) {
		    s+="*";
		}
		else {
		    s+=" ";
		}
            }
            s+="\n";
        }
        return s;
    }
    
    public String tri3(int h) {
	String s = "";
	for(int i=0; i<h; i++) {
	    for(int g=0; g<2*h-1; g++) {
		if(Math.abs(h-g-1) <= i) {
		    s+="*";
		}
		else {
		    s+=" ";
		}
	    }
	    s+="\n";
	}
	return s;
    }

    public String diamond(int h) {
        String s = "";
        //triangular top, including middle row
        for(int i=0; i<h/2+1; i++) {
            for(int g=0; g<h+2; g++) {
                if(Math.abs(h-g-2) <= i) {
                    s+="*";
                }
                else {
                    s+=" ";
                }
            }
            s+="\n";
        }
        //triangular bottom, excluding middle row
        for(int i=h/2; i>0; i--) {
            for(int g=0; g<h+2; g++) {
                if(Math.abs(h-g-2) < i) {
                    s+="*";
                }
                else {
                    s+=" ";
                }
            }
            s+="\n";
        }

        return s;
    }

    public String tri4(int h) {
        String s = "";
        for(int i=h; i>0; i--) {
            for(int g=0; g<h; g++) {
                if(g>=h-i) {
                    s+="*";
                }
                else {
                    s+=" ";
                }
            }
            s+="\n";
        }
        return s;
    }
}

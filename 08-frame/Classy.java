public class Classy {
    //CONVENTION:
    // HORIZONTAL, THEN VERTICAL
    public String frame(int c, int r) {
	String foo = "";
	for(int i=0; i<r; i++) {
	    for(int g=0; g<c; g++) {
		if(i==0 || i==r-1) {
		    foo+="*";
		}
		else if(g==0 || g==c-1) {
		    foo+="*";
		}
		else {
		    foo+=" ";
		}
	    }
	    foo+="\n";
	}
	return foo;
    }
    
    public String stringSplosion(String str) {
	String stuff = "";
	for(int i=0; i<=str.length(); i++) {
	    stuff += str.substring(0,i);
	}
	return stuff;
    }
    
    public String stringX(String str) {
	for(int i=1; i<str.length()-1; i++) {
	    if(str.charAt(i)=='x') {
		str = str.substring(0,i) + str.substring(i+1);
		i--;
	    }
	}
	return str;
    }
}

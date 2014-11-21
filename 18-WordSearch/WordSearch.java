public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void addWordH(String w, int row, int col){
	int c = col;
		for (int i=0; i < w.length();i++) {
			board[row][c] = w.charAt(i);
			c++;
		}
    }
    
    public void addWordHorizontally(String w, int row, int col, boolean addForwards) {
        try {
            if (addForwards) {
                int c = col;
                for (int i=0; i<w.length(); i++) {
                    if (board[row][c]!='.' && board[row][c]!=w.charAt(i)) return;
                    c++;
                }
                c = col;
                for (int i=0; i<w.length(); i++) {
                    board[row][c] = w.charAt(i);
                    c++;
                }
            }
            else {
                int c = col;
                for (int i=w.length()-1; i>=0; i--) {
                    if (board[row][c]!='.' && board[row][c]!=w.charAt(i)) return;
                    c++;
                }
                c = col;
                for (int i=w.length()-1; i>=0; i--) {
                    board[row][c] = w.charAt(i);
                    c++;
                }
            }
        } catch (IndexOutOfBoundsException i) {}
    }

    public void addWordVertically(String w, int row, int col, boolean addDownwards) {
        try {
            if (addDownwards) {
                int r = row;
                for (int i=0; i<w.length(); i++) {
                    if (board[r][col]!='.' && board[r][col]!=w.charAt(i)) return;
                    r++;
                }
                r = row;
                for (int i=0; i<w.length(); i++) {
                    board[r][col] = w.charAt(i);
                    r++;
                }
            }
            else {
                int r = row;
                for (int i=w.length()-1; i>=0; i--) {
                    if (board[r][col]!='.' && board[r][col]!=w.charAt(i)) return;
                    r++;
                }
                r = row;
                for (int i=w.length()-1; i>=0; i--) {
                    board[r][col] = w.charAt(i);
                    r++;
                }
            }
        } catch (IndexOutOfBoundsException i) {}
    }
    
    public void addWordDiagonally(String w, int row, int col, int direction) {
        // 0 = NE           N
        // 1 = SE           ^
        // 2 = SW      W  <---> E
        // 3 = NW         L v
        //                  S
        if (direction == 0) {
            int r = row;
            int c = col;
            for (int i=w.length()
        }
        else if (direction == 1) {
        }
        else if (direction == 2) {
        }
        else if (direction == 3) {
        }
        else System.out.println("YOU SCREWED UP YOUR CARDINAL DIRECTIONS / COUNTING");
    }
		
    public static void main(String[] args) {
        WordSearch w = new WordSearch(42, 42);
        System.out.println(w);
        //w.addWordH("hello",3,15); // should work
        //w.addWordH("look",3,14); // test illegal overlap
        //w.addWordH("look",3,18); // test legal overlap
        //w.addWordH("look",-3,20); // test illegal row
        //w.addWordH("look",3,55); // test illegal col
        // etc
        //w.addWordHorizontally("omg", 4, 0, true);
        //w.addWordHorizontally("omg", 4, 2, false);
        //w.addWordHorizontally("abcdefgh", 4, 15, true);
        //w.addWordHorizontally("omg", 4, -200, false);
        //w.addWordHorizontally("omg", 4, 123012, true);
        //w.addWordHorizontally("omg", 4, 2, true);
        //w.addWordVertically("Supercalifragilisticexpialidocious", 2, 3, true);
        //w.addWordVertically("abc", 2, 3, true);
        //w.addWordVertically("abc", 2, 3, false);
        w.addWordVertically("hello", 2, 3, true);
        w.addWordVertically("lombardment", 5, 3, true);
        w.addWordVertically("low", 4, 2, false);
        w.addWordVertically("owch", 3, 2, false);
        //w.addWordVertically("ab", 0, 0, true);
        w.addWordVertically("abc", 1, 0, false);
        System.out.println(w);
            
    }
}

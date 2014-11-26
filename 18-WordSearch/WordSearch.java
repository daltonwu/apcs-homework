import java.util.Random;

public class WordSearch {
    private char[][] board;
    private Random rand = new Random();
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i=0; i<board.length; i++) {
	    for (int j=0; j<board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
 
    public String toString() {
	String s = "";
	for (int i=0; i<board.length; i++) {
	    for (int j=0; j<board[i].length; j++) {
		s += board[i][j];
	    }
	    s += "\n";
	}
	return s;
    }
    /*
    public void addWordH(String w, int row, int col){
	int c = col;
		for (int i=0; i < w.length();i++) {
			board[row][c] = w.charAt(i);
			c++;
		}
    }
    */
    public boolean addWordHorizontally(String w, int row, int col, boolean addForwards) {
        try {
            if (addForwards) {
                int c = col;
                for (int i=0; i<w.length(); i++) {
                    if (board[row][c]!='.' && board[row][c]!=w.charAt(i)) return false;
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
                    if (board[row][c]!='.' && board[row][c]!=w.charAt(i)) return false;
                    c++;
                }
                c = col;
                for (int i=w.length()-1; i>=0; i--) {
                    board[row][c] = w.charAt(i);
                    c++;
                }
            }
            return true;
        } catch (IndexOutOfBoundsException i) {return false;}
    }

    public boolean addWordVertically(String w, int row, int col, boolean addDownwards) {
        try {
            if (addDownwards) {
                int r = row;
                for (int i=0; i<w.length(); i++) {
                    if (board[r][col]!='.' && board[r][col]!=w.charAt(i)) return false;
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
                    if (board[r][col]!='.' && board[r][col]!=w.charAt(i)) return false;
                    r++;
                }
                r = row;
                for (int i=w.length()-1; i>=0; i--) {
                    board[r][col] = w.charAt(i);
                    r++;
                }
            }
            return true;
        } catch (IndexOutOfBoundsException i) {return false;}
    }
    
    public boolean addWordDiagonally(String w, int row, int col, String direction) {
        // 0 = NE           N
        // 1 = SE           ^
        // 2 = SW      W  <---> E
        // 3 = NW         L v
        //                  S
        try {
            if (direction.length() == 2) {
                int r = row;
                int c = col;
                for (int i=w.length(); i>=0; i++) {
                    if (board[r][c]!='.' && board[r][c]!=w.charAt(i)) return false;
                    
                    if (direction.toLowerCase().endsWith("s")) r++;
                    else r--;
                    if (direction.toLowerCase().endsWith("e")) c++;
                    else c--;
                }
                r = row;
                c = col;
                for (int i=w.length(); i>=0; i++) {
                    board[r][c] = w.charAt(i);
                    
                    if (direction.toLowerCase().endsWith("s")) r++;
                    else r--;
                    if (direction.toLowerCase().endsWith("e")) c++;
                    else c--;
                }
                return true;
            }
            else {
                System.out.println("YOU SCREWED UP YOUR DIRECTION");
                return false;
            }
        } catch (IndexOutOfBoundsException i) {return false;}
    }
    
    public boolean addWord(String w) {
        /*/**
         * <p>Adds word at a random location, with random orientation.
         * This implementation tries multiple times until success
         * because it's a try-hard.</p>
         * @param String w   
         */
        int triesLimit = 40; // sometimes, it's impossible to get what you want
        w = w.toLowerCase();
        while (triesLimit > 0) {
            int caser = rand.nextInt(8);
            int r = rand.nextInt(board.length);
            int c = rand.nextInt(board[0].length);
            switch (caser) {
                // 0 = h, f
                // 1 = h, b
                // 2 = v, d
                // 3 = v, u
                // 4 = NE
                // 5 = SE
                // 6 = SW
                // 7 = NW
                case 0:  if(addWordHorizontally(w, r, c, true)) return true;
                         break;
                case 1:  if(addWordHorizontally(w, r, c, false)) return true;
                         break;
                case 2:  if(addWordVertically(w, r, c, true)) return true;
                         break;
                case 3:  if(addWordVertically(w, r, c, false)) return true;
                         break;
                case 4:  if(addWordDiagonally(w, r, c, "NE")) return true;
                         break;
                case 5:  if(addWordDiagonally(w, r, c, "SE")) return true;
                         break;
                case 6:  if(addWordDiagonally(w, r, c, "SW")) return true;
                         break;
                case 7:  if(addWordDiagonally(w, r, c, "NW")) return true;
                         break;
            }
            triesLimit--;
        }
        return false;
    }

    public static void main(String[] args) {
        WordSearch w = new WordSearch(21, 42);
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
        //w.addWordVertically("hello", 2, 3, true);
        //w.addWordVertically("lombardment", 5, 3, true);
        //w.addWordVertically("low", 4, 2, false);
        //w.addWordVertically("owch", 3, 2, false);
        //w.addWordVertically("ab", 0, 0, true);
        //w.addWordVertically("abc", 1, 0, false);
        //System.out.println(w.addWordDiagonally("abc", 1, 2, "ne"));
        //w.addWordDiagonally("abc", 1, 2, "NW");
        //w.addWordDiagonally("abc", 1, 2, "nw");
        //w.addWordDiagonally("abc", 1, 2, "nw");
        //w.addWordDiagonally("abc", 1, 2, "nw");
/*        w.addWord("cactus");
        w.addWord("chicken");
        w.addWord("Betelgeuse");
        w.addWord("LaTeX");
        w.addWord("Hello, world!");*/
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "Nw");
        w.addWordDiagonally("cactus", 1, 2, "sE");
        w.addWordDiagonally("cactus", 1, 2, "sw");/*
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");
        w.addWordDiagonally("cactus", 1, 2, "NE");*/
  
        System.out.println(w);
            
    }
}

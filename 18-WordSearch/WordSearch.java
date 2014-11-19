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
	for (int i=0; i < w.length();i++){
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
		
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	//w.addWordH("hello",3,15); // should work
	//w.addWordH("look",3,14); // test illegal overlap
	//w.addWordH("look",3,18); // test legal overlap
	//w.addWordH("look",-3,20); // test illegal row
	//w.addWordH("look",3,55); // test illegal col
	// etc
        w.addWordHorizontally("omg", 4, 0, true);
        w.addWordHorizontally("omg", 4, 2, false);
        //w.addWordHorizontally("abcdefgh", 4, 15, true);
        //w.addWordHorizontally("omg", 4, -200, false);
        //w.addWordHorizontally("omg", 4, 123012, true);
        //w.addWordHorizontally("omg", 4, 2, true);
	System.out.println(w);
    }
}

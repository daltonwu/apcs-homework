public class Mage extends Basechar{
    private int manna =12345;

    public int getManna(){
	return manna;
    }

    public Mage(String name) {
        this.setName(name);
    }
    public Mage() {
        this.setName("LOLOL");
    }
    public Mage(String name, int manna) {
        this.setName(name);
        this.manna = manna;
    } 
}

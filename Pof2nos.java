package Pof2nos;
class Pof2nos {
	private int x,y,p;
	public Pof2nos() {
		x=10;
		y=7;
	}
    public Pof2nos(int a) {
    	x=a;
    	y=7;
    }
    public Pof2nos(int a, int b) {
    	x=a;
    	y=b;
    }
    public Pof2nos(Pof2nos a) {
    	x=a.x;
    	y=a.y;
    }
    public void find() {
    	p=x*y;
    }
    public void display() {
    	System.out.println(p);
    }
    

}

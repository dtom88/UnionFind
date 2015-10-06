package QuickUnionWeightedUF;


public class App {
	
	public static void main(String[] args) {
		QuickUnionWeightedUF quwuf= new QuickUnionWeightedUF(10);
		
		quwuf.union(4, 6);
		quwuf.union(4, 5);
		quwuf.union(7, 8);
		quwuf.union(4, 9);
		quwuf.union(8, 9);
		quwuf.printId();
	}

}

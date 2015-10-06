package QuickUnion;

public class App {
	
	public static void main(String[] args) {
		QuickUnionUF quuf = new QuickUnionUF(10);
		quuf.union(5, 9);
		quuf.union(4, 3);
		quuf.union(5, 7);
		quuf.union(1, 3);
		quuf.printId();
	}

}

package QuickUnionWithPathCompression;

public class App {
	
	public static void main(String[] args) {
		
		QuickUnionWithPathCompression quwpc = new QuickUnionWithPathCompression(10);
		
		quwpc.union(5, 9);
		quwpc.union(5, 6);
		quwpc.union(1, 0);
		quwpc.union(3, 9);
		quwpc.printId();
	}

}

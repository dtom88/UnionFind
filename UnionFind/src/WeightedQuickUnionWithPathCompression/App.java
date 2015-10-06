package WeightedQuickUnionWithPathCompression;

public class App {
	
	public static void main(String[] args) {
		WeightedQuickUnionWithPathCompression wquwpc = new WeightedQuickUnionWithPathCompression(10);
		
		wquwpc.union(8, 9);
		wquwpc.union(8, 7);
		wquwpc.union(3, 9);
		wquwpc.union(0, 9);
		wquwpc.union(6, 1);
		wquwpc.union(5, 4);
		wquwpc.union(2, 0);
		wquwpc.printId();
	}
}

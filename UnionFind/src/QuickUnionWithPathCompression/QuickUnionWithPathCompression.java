package QuickUnionWithPathCompression;

public class QuickUnionWithPathCompression {
	
	private int[] id;
	
	public QuickUnionWithPathCompression(int size){
		id = new int [size];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}
	
	public int root(int n){
		while(n != id[n]){
			id[n] = id[id[n]];
			n = id[n];
		}
		return n;
	}
	
	public boolean isConnected(int m, int n){
		return root(n) == root(m);
	}
	
	public void union(int m, int n){
		int root1 = root(m);
		int root2 = root(n);
		id[root2] = root1;
	}
	
	public void printId(){
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}
	}

}

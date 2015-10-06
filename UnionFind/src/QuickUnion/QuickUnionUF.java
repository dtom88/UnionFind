package QuickUnion;

public class QuickUnionUF {
	
	private int[] id;
	
	public  QuickUnionUF(int size) {
		id = new int[size];
		for (int i = 0; i < size; i++) {
			id[i] = i;
		}
	}
	
	public int root(int n){
		while(n != id[n]){
			n = id[n];
		}
		return n;
	}
	
	public boolean isConnected(int m, int n){
		return root(n) == root(m);
	}
	
	public void union(int n, int m){
		int i = root(n);
		int j = root(m);
		id[j] = i;
	}
	
	public void printId(){
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}
	}

}

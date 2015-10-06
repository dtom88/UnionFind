package QuickUnionWeightedUF;

public class QuickUnionWeightedUF {
	
	private int[] id;
	private int[] weight;
	
	public  QuickUnionWeightedUF(int size) {
		id = new int[size];
		weight = new int [size];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			weight [i] = 1;
		}
	}
	
	public int root(int n){
		while(n != id[n]){
			n = id[n];
		}
		return n;
	}

	public boolean isConnected(int n, int m){
		return root(n) == root(m);
	}
	
	public void union(int n, int m){
		int root1 = root(n);
		int root2 = root(m);
		if(weight[root1]>=weight[root2]){
			id[root2] = root1;
			weight[root1] += weight[root2];
		}
		else{
			id[root1] = root2;
			weight[root2] += weight[root1];
		}
	}
	
	public void printId(){
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}
	}

}

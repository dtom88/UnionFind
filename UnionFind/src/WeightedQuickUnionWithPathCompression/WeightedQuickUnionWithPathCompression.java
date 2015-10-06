package WeightedQuickUnionWithPathCompression;

public class WeightedQuickUnionWithPathCompression {

	private int[] id;
	private int[] weight;
	
	public WeightedQuickUnionWithPathCompression(int size){
		id = new int[size];
		weight = new int[size];
		
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
			weight[i] = 1;
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
		return root(m) == root(n);
	}
	
	public void union(int m, int n){
		int root1 = root(m);
		int root2 = root(n);
		if(weight[root1]>=weight[root2]){
			id[root2] = root1;
			weight[root1] += root2;
		}
		else{
			id[root1] = root2;
			weight[root2] += root1;
		}		
	}
	
	public void printId(){
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}
	}
}

package PercolationProblem;

public class PercolationChecker {

	private int[] id;
	private int[] weight;
	private int size;
	
	public PercolationChecker(int size){
		this.size = size;
		int systSize = size^2 +1;
		id = new int[systSize];
		weight = new int[systSize];
		
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
		return root(n) == root(m);
	}
	
	public void union(int m, int n){
		int root1 = root(m);
		int root2 = root(n);
		if(weight[root1]>=weight[root2]){
			id[root2] = root1;
			weight[root1] += weight[root2];
		}
		else {
			id[root1] = root2;
			weight[root2] += root1;
		}
	}
	
	public void printId(){
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}
	}
	
	public void openSite(int n){
		if(n == 1){
			union(n, n + 1);
			union(n, n + size);
		}
		if(n/size == 0 && n>1){
			union(n, n - 1);
			union(n, n + 1);
			union(n, n + size);
		}
		if(n == size){
			union(n, n + size);
			union(n, n - 1);
		}
		if(n/size == size -1 && n%size == 0){
			union(n, n - size);
			union(n, n + 1);
		}
		if(n/size == size && n%size == 0){
			union(n, n - size);
			union(n, n - 1);
		}
		if(n/size == size -1  && n%size > 0){
			union(n, n + 1);
			union(n, n - 1);
			union(n, n - size);
		}
		if(n%size == 1 && n/size > 0 && n/size < (size -1)){
			union(n, n + 1);
			union(n, n - size);
			union(n, n + size);
		}
		if(n%size == 0 && n/size > 0 && n/size < size){
			union(n, n - 1);
			union(n, n - size);
			union(n, n + size);
		}
		else{
			union(n, n - size);
			union(n, n + size );
			union(n, n + 1);
			union(n, n - 1);
		}
	}

}

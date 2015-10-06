package QuickFind;


public class QuickFindUF {
	
	private int[] id;

	public QuickFindUF(int size){
		id = new int[size];	
		for (int i = 0; i < id.length; i++) {
			id[i] =i;
		}
	}
	
	public boolean isConnected(int n, int m){
		return id[m] == id[n];
	}
	
	public void union(int m, int n){
		int idm = id[m];
		int idn = id[n];
		for (int i = 0; i < id.length; i++) {
			if(id[i] == idn) id[i] = idm;
		}
	}
	
	public void printId(){
		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + " ");
		}
	}
}

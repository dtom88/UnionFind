package PercolationProblem;

public class Solution {

	
	public static void main(String[] args) {
		int counter = 0;
		int N = 1000;
		for (int j = 0; j < N; j++) {
			PercolationChecker checker = new PercolationChecker(10);
			double count = Math.random()*100;
			for (int i = 0; i < count; i++) {
				int n = (int)Math.random()*100;
				checker.openSite(n);
			}
			if(checker.isConnected(0, 101)){
				counter += 1;
			}		
		}
		System.out.println(counter/N);
	}
}

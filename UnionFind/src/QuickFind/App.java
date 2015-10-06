package QuickFind;

public class App {

	public static void main(String[] args) {
		QuickFindUF qfuf = new QuickFindUF(15);
		qfuf.union(5, 8);
		qfuf.union(5, 7);
		qfuf.union(6, 7);
		qfuf.union(5, 1);
		qfuf.union(1, 8);
		qfuf.union(3, 4);
		qfuf.printId();
	}
}


public class TreeClient {

	public static void main(String[] args) {
		IntTree tree = new IntTree();
		tree.add(14);
		tree.add(9);
		tree.add(23);
		tree.add(4);
		tree.add(16);
		tree.add(15);
		tree.add(20);
		tree.add(2);
		tree.printInOrder();
		System.out.println();
		System.out.println("contains 16? "+tree.contain(16));

		System.out.println("contain 26? "+ tree.contain(26));
	}

}

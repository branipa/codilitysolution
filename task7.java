
public class task7 {

	Node root;
	static int counter = 0;

	public static void main(String[] args) {

		// BinaryTree tree = new BinaryTree(20);

		Node root = new Node(8);
		// System.out.print(root.nodeValue);
		root.left = new Node(2);
		root.right = new Node(6);
		root.left.left = new Node(8);
		root.left.right = new Node(7);
//		root.right.left = new Node(1);
		// System.out.print(root.left.nodeValue);
		System.out.print(solution(root));

	}

	public static int solution(Node r) {

		System.out.println(r.nodeValue);
		if (r.left != null) {
			if (r.left.nodeValue < r.nodeValue) {
				counter = counter + 1;
			}

			solution(r.left);
		}
		if (r.right != null) {
			if (r.right.nodeValue < r.nodeValue) {
				counter = counter + 1;
			}

			solution(r.right);
		}

		return counter;

	}

}

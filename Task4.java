import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> q = new LinkedList();
		LinkedList q1 = new LinkedList();

		q.add(1);
		q.add(2);

		System.out.println(q);
		
		q.removeLast();
		q.removeLast();
		System.out.println(q);
		
		System.out.print(q.isEmpty());
		

	}

}

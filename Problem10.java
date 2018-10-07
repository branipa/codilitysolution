import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<Integer>();

		int[] A = new int[] { 60, 80, 40 };
		int[] B = new int[] { 2, 3, 5 };

		for (int i = 0; i < A.length; i++) {
			q.add(A[i]);
		}

		int floor = 5;
		int maxCapacity = 2;
		int maxWeight = 200;

		System.out.println(solution(A, B, maxCapacity, maxWeight, floor));

	}

	public static int solution(int[] A, int[] B, int M, int X, int Y) {

		int floor = Y;
		int maxCapacity = M;
		int maxWeight = X;
		int start = 0;
		int end = 2;
		int persongoinginlift = 0;
		int calWeight = 0;
		int counter = 0;

		for (int i = 0; i < A.length;) {

			int jj = i;
			calWeight = 0;
			persongoinginlift = 0;

			for (int j = 1; j <= maxCapacity; j++) {

				calWeight = A[jj] + calWeight;

				if (jj < (A.length - 1)) {
					jj = jj + 1;
				} else {
					persongoinginlift = persongoinginlift + 1;
					break;
				}

				// System.out.println(calWeight);
				// System.out.println(persongoinginlift);

				if ((calWeight > maxWeight)) {
					break;

				} else {
					persongoinginlift = persongoinginlift + 1;
				}

			}

			start = i;
			int flag = 0;

			for (int fl = 1; fl <= floor; fl++) {

				flag = 0;
				for (int per = start; per < start + persongoinginlift; per++)

				{

					if (B[per] == fl) {
						// System.out.print("person out" + fl);
						if (flag == 0) {

							counter = counter + 1;
							flag = 1;
						}

					}

				}
			}

			i = i + persongoinginlift;
			counter = counter + 1;
		}

		return counter;
	}

}

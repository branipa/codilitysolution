
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] { 1, 2, 5, -1, 3, 5 };

		Solution solution = new Solution();
		//solution.solution(A);
		 System.out.println(solution.solution(A));

	}

	public int solution(int[] A) {

		int conditionFound = 0;
		int distance = 0;
		int pairExist = 0;

		for (int p = 0; p < A.length; p++)

		{
			for (int q = p + 1; q < A.length; q++)

			{

				if (A[p] != A[q]) {
				//	System.out.println("( " + p + "," + q + ")");
					conditionFound = 0;
					for (int i = 0; i < A.length; i++) {
						if (((A[p] < A[i]) && (A[i] < A[q])) || ((A[p] > A[i]) && (A[i] > A[q]))) {
							
							conditionFound = 1;
							pairExist = 1;
							break;
						}

					}

					if (conditionFound == 0) {
						System.out.print("( " + p + "," + q + ")");
						System.out.println(A[p] + " " + A[q]);
						if (Math.abs(p - q) > distance) {
							distance = Math.abs(p - q);
						//	System.out.print(distance);
						}
					}

				}
			}

		}

		if (pairExist == 1) {
			return distance;
		} else {
			return -1;
		}

	}

}

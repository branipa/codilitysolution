
public class ProblemStatement3 {

	public static void main(String[] args) {

		int[] a = new int[] { 0, 1, 2, 3, 4, 5 };
		int[] b = new int[] { 500000, 500000, 0, 0, 0, 20000 };
		
		ProblemStatement3 obj = new ProblemStatement3();
		System.out.print(obj.solution(a, b));
		

	}

	int  solution(int[] A, int[] B) {

		float[] c = new float[A.length];
		int counter = 0;

		for (int i = 0; i < A.length; i++) {

			c[i] = (float) A[i] + (float) B[i] / 1000000;
			// System.out.print("\n" + c[i]);

		}

		for (int p = 0; p < A.length; p++) {

			for (int q = 0; q < A.length; q++) {

				if ((0 <= p) & (p < q) & (q < A.length)) {
					 System.out.print(p + ","+ q +"\n");
					 System.out.print((c[p] * c[q]));
					 System.out.print(">=");
					 System.out.print(c[p] + c[q]);
					 System.out.print("\n");
					 Math.abs(4);
					if ((c[p] * c[q]) >= (c[p] + c[q]))

					{
						counter = counter + 1;
					//	System.out.print(p + "," + q + "because");
					//	System.out.print(c[p] * c[q]);
					//	System.out.print(",");
					//	System.out.print(c[p] + c[q]);
					//	System.out.print(",\n");
					}
				}
			}
		}
			return counter;

		
	}
}

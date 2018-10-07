
public class ProblemStatement32 {

	public static void main(String[] args) {

		int[] a = new int[] { 0, 1, 2, 2, 3, 5 };
		int[] b = new int[] { 500000, 500000, 0, 0, 0, 20000 };

		ProblemStatement3 obj = new ProblemStatement3();
		System.out.print(obj.solution(a, b));

	}

	int solution(int[] A, int[] B) {

		float[] c = new float[A.length];
		int counter = 0;
		
		

		for (int i = 0; i < A.length; i++) {

			c[i] = (float) (A[i] +  B[i] / 1000000);
			// System.out.print("\n" + c[i]);

		}

		for (int p = 0; p < A.length; p++) {

			for (int q = p + 1; q < A.length; q++) {

				System.out.print(p + "," + q + "\n");
				System.out.print((c[p] * c[q]));
				System.out.print(">=");
				System.out.print(c[p] + c[q]);
				System.out.print("\n");

				if ((c[p] * c[q]) >= (c[p] + c[q]))

				{
					counter++;
					// System.out.print(p + "," + q + "because");
					// System.out.print(c[p] * c[q]);
					// System.out.print(",");
					// System.out.print(c[p] + c[q]);
					// System.out.print(",\n");
				}

			}
		}
		return counter;

	}
}

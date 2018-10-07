import java.lang.reflect.Array;

public class ProblemStatement1 {

	public static void main(String[] args) {

		int[] A = new int[] { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };

		System.out.println(solution(A));

	}

	private static int solution(int[] a) {

		int counter = 0;
		int counter1 = 0;
		int orderCheck = 0;
		int depth = 0;

		for (int p = 0; p < a.length; p++) {
			for (int q = p + 1; q < a.length; q++) {
				for (int r = q + 1; r < a.length; r++) {
					// System.out.println(p + "-" + q + "-" + r);

					orderCheck = q - p;
					counter1 = 0;
					for (int i = p; i < q; i++) {
						if (a[i] > a[i + 1]) {
							counter1 = counter1 + 1;

						} else {
							break;
						}

					}

					if ((counter1 - orderCheck) == 0) {
						orderCheck = r - q;
						counter1 = 0;
						for (int j = q; j < r; j++) {
							if (a[j] < a[j + 1]) {
								counter1 = counter1 + 1;
							} else {
								break;

							}
						}
					}

					if ((counter1 - orderCheck) == 0) {

						System.out.println(p + "-" + q + "-" + r);
						if ((a[p] - a[q]) < a[r] - a[q]) {

							counter = a[p] - a[q];

						} else {
							counter = a[r] - a[q];
						}

						if (counter > depth)
							depth = counter;
					}

				}

			}

			
		}
		return depth;
	}
}

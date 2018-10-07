
public class ProblemStatment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] A = new int[4][4];

		A[0][0] = 0;
		A[0][1] = 1;
		A[0][2] = 9;
		A[0][3] = 3;
		A[1][0] = 7;
		A[1][1] = 5;
		A[1][2] = 8;
		A[1][3] = 3;

		A[2][0] = 9;
		A[2][1] = 2;
		A[2][2] = 9;
		A[2][3] = 4;

		A[3][0] = 4;
		A[3][1] = 6;
		A[3][2] = 7;
		A[3][3] = 1;
		System.out.println(solution(A));

	}

	static int solution(int[][] a) {

		for (int p = 0; p < a.length-1; p++) {
			for (int q = 0; q < a.length-1; q++) {
				
				System.out.println("element "+ a[p][q]);
				int rmin=1,rmax=1,cmin=1,cmax = 1;
				for (int i = 0; i < a.length-1; i++) {
					System.out.println(a[i][q]);
					if(p!=i) {
					if ((a[p][q] < a[i][q]) ) {
						cmax = 0;
						//break;
					}
					if ((a[p][q] > a[i][q]) ) {
						cmin = 0;
						//break;
					}
					}
				}

				
					for (int i = 0; i < a.length-1; i++) {
						System.out.println(a[p][i]);
						if ((q!=i)) {
						if ((a[p][q] > a[p][i])) {
							rmin = 0;
							//break;
						}
						if ((a[p][q] > a[p][i])) {
							rmax = 0;
							//break;
						}
					}

					}

				if (((rmin==1) && (cmax==1)) || ((cmin==1)&&(rmax==1))) {

					System.out.println("solution" + a[p][q]);
				}

			}

		}

		return 0;
	}

}

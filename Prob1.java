
public class Prob1 {

	
	static int count1=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = new int[] {1,4,3,5,2,8,10};
		
		
		Prob1 obj = new Prob1();
		
		if(obj.solution(A))
		{
			System.out.print("passed");
		}
		else
		{
			System.out.print("Failed");	
		}
				
	}

	public boolean solution(int[] A) {
		int index = 0;
		int counter = 0;
		int temp = 0;
		
		
		try {
		
		for (int i = 0; i < A.length; i++) {
			index=0;
			if (counter<10) {
				for (int j = i+1; j < A.length; j++) {

					if (A[i] > A[j]) {
						if (counter == 0) {
							counter = counter + 1;
							index = j;
						} else if (A[index] < A[j]) {
							counter = counter + 1;
						} else {
							index = j;
						}
					}

				}
				if(index!=0) {
				temp = A[i];
				A[i] = A[index];
				A[index] = temp;}
			}

		}

		}
		catch(Exception e)
		{
			System.out.print(e);
		}

		for(int i:A)
		System.out.print(i);
		
		if (counter > 1)

		{
			return false;
		} else {
			return true;
		}
		
	}

}

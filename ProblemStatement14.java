
public class ProblemStatement14 {

	public static void main(String[] args) {
		
		int A,B;
		A=10;
		B=20;
		
		System.out.print(solution(A,B));
		

	}
	
	static int solution(int a, int b)
	
	{
		int c=a*b;
		int counter=0;
		
		System.out.print(Integer.toBinaryString(c));
		for(int i=0;i<Integer.toBinaryString(c).length();i++)
		{
			if ((Integer.toBinaryString(c).charAt(i))=='1')
				counter =counter+1;
			
		}
		return counter;
		
	}

}

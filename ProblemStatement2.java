
public class ProblemStatement2 {
	static int counter=0;

	public static void main(String[] args) {
		
		
		IntList root = new IntList(1);
		root.next= new IntList(2);
		root.next.next= new IntList(3);
		root.next.next.next= new IntList(4);
		
		
		

		System.out.println(solution(root));

	}	
	
	public static int solution(IntList L)
	{
		counter=counter+1;
		
		
		if(L.next!=null)
		{
			
			solution(L.next);
			
		}
		
		
		return counter;
		
	}
}

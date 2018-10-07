
public class ProblemStatemetn16 {

public static void main(String[] args) {
		
		int A,B;
		A=191;
		B=5;
		
		System.out.print(solution(A,B));
		

	}
	
	static int solution(int a, int b)
	
	{
		int c=a*b;
		int counter=0;
		String bValue=Integer.toBinaryString(c);
		
		System.out.println(Integer.toBinaryString(c));
		int i=0;
		int j=0;
		String check = "";
		
		while(j<bValue.length())
		{
			for(int k=0;k<=j;k++)
			{
				check=check+bValue.charAt(k);
				
				
			}
			j=j+1;
			
				int flag=0;
				for(int m=0; m<check.length();m++)
				{
					if (check.charAt(m)==bValue.charAt(check.length()+m))
					{
						counter=counter+1;
					}
					else
					{
						flag=1;
						break;
					}
				}
			
			if (flag==0)
					System.out.println(counter);
			System.out.println(check);
			check="";
			
		}
		
		
		
		
//		for(int i=0;i<Integer.toBinaryString(c).length();i++)
//		{
//			if ((Integer.toBinaryString(c).charAt(i))=='1')
//				counter =counter+1;
//			
//		}
		return 0;
		
	}

}

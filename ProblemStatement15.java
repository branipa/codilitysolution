
public class ProblemStatement15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "(())()))(";

		solution(S);

	}

	public static void solution(String s)

	{
		String temp = "";
		String temp1 = "";
		int end = s.length() - 1;
		for (int i = 0; i <= end; i++) {
			temp = temp + s.charAt(i);
			System.out.println(temp);
			int flag=0;
			if ((s.charAt(i)) == '(') {

				for (int j = end; j > i; j--) {
					
					temp1 = temp1 + s.charAt(j);
					System.out.println("second" + temp1);
					end =end-1;
					if ((s.charAt(j)) == ')') {
						flag=1;
						break;
					}

				}

			}

//			if (flag==0)
//			{
//				System.out.println("before" + temp);
//				temp=temp.replace(temp.substring(temp.length()-1), "");
//				System.out.println("After" + temp);
//			}
				
		}

	}

}

import java.awt.List;
import java.util.ArrayList;

public class ProblemStatement12 {

	public static void main(String[] args) {

		String password = "1o1ne1two2three3Fourw4";

		System.out.print(solution(password));

	}

	static int solution(String p) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(1);
		
		
		
		
		System.out.println(list.lastIndexOf(1));
		char c;

		String temp = "";
		int storePasswordLength = 0;

		for (int i = 0; i < p.length(); i++)

		{
			temp = "";
			c = p.charAt(i);
			while (!Character.isDigit(c)) {
				temp = temp + c;
				i = i + 1;
				c = p.charAt(i);
			}
			if (temp != "")
				list.add(temp);

		}

		System.out.print(list);

		
		return storePasswordLength;

	}

}

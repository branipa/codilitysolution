class CountSquares {
 
    static int countSquares(int a, int b)
    {
        int cnt = 0; // Initialize result
 
        // Traverse through all numbers
        for (int i = a; i <= b; i++)
 
            // Check if current number 'i' is perfect
            // square
            for (int j = 1; j * j <= i; j++)
                if (j * j == i)
                    cnt++;
        return cnt;
        
        
    }
}
 
// Driver Code
public class test {
    public static void main(String[] args)
    {
        int a = 4, b = 4;
        CountSquares obj = new CountSquares();
        System.out.print("Count of squares is " + obj.countSquares(a, b));
        
        int i = 0;
        float j = 0;
        double k = 0;
        long l = 1000000000;
        
        if(i==j)
        	System.out.println("work");
        
     //   System.out.println(i);
      //  System.out.println(j);
       // System.out.println(k);
       // System.out.println(l);
        
       
    }
}
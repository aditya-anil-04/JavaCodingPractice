
// Simple Calculator

import java.util.*;

public class Calculator
{
    public static void main (double a, double b) 
    {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Enter Operator - 1 = Add, 2 = Subtract, 3 = Multiply, 4 = Divide.");
            int j = sc.nextInt();
            
            if (j < 5 && j > 0) 
            {
                i = 10;
            }
            else
            {
                i = 0;
            }
            k = j;
        }
        if (k == 1) 
        {
            System.out.println(a+b);
        }
        else if (k == 2)
        {
            System.out.println(a-b);
        }
        else if (k == 3)
        {
            System.out.println(a*b);
        }
        else
        {
            if (b == 0) 
            {
                System.out.println("Infinity");
            }
            else
            {
                System.out.println(a/b);
            }
        }
    }
}

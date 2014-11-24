/**
 * Write a description of class MyMath here.
 * 
 * @Josh Ross 
 * @10-20-14
 */
public class MyMath
{
   /**
    * Finds the gcf of the two desired integers a and b
    * @param a one of the two desired integers you would like to find the gcf of
    * @param a one of the two desired integers you would like to find the gcf of
    * @return the gcf of the two integers
    */
   public static int gcf(int a, int b)
   {
       a = Math.abs(a);
       b = Math.abs(b);
       
       if (a == 0 && b == 0)
       {
           return 0;
       }
       
       if (a == 0)
       {
           return 1;
       }
       else if (b == 0)
       {
           return 1;
       }
       
       while (a != b)
       {
          if (a > b)
          {
              a = a - b;
          }
          
          else if (a < b)
          {
              b = b - a;
          }
       }
       
       return a;
   }
   
   /**
    * Returns the factorial of the given integer
    * @param n is the integer to find the factorial of (must be positive)
    * @return the factorial of the given number or -1 if the n is negative
    */
   public static long factorial(int n)
   {
       if (n < 0)
       {
           return -1;
       }
       int sum = 1;
       for (int i =  1; i <= n; i++)
       {
           sum = sum * i;
       }
       return sum;
   }
}

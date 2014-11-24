/**
 * Write a description of class HomeworkTester here.
 * 
 * @Josh Ross 
 * @10-17-14
 */
public class HomeworkTester
{
    /**
    * Just a practice for a homework
    */
    public HomeworkTester()
    {
        //create a new fraction with value of 3/5 and name it sarah.
        Fraction sarah = new Fraction(3,5);
        
        //add 4 to sarah and print the result to the terminal window
        Fraction answer = sarah.add(4);
        System.out.println(sarah + " + 4 == " + answer);
        System.out.println(sarah);
        //secretly does System.out.println(answer.toString())
        
        //subtract 2 from sarah, store the result in answer and then print the question and result.
        answer = sarah.subtract(2); 
        System.out.println(sarah + " - 2 == " + answer);
        System.out.println(sarah);
        
        Fraction f1 = new Fraction(3,5);
        Fraction f2 = new Fraction(7,11);
        Fraction result = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " == " + result);
        
        Fraction f3 = new Fraction(2,5);
        Fraction f4 = new Fraction(4,9);
        Fraction fract_divide = f3.divide(f2);
        System.out.println(f3 + " / " + f4 + " == " + fract_divide);
        
    }  
    
    /**
    * Just a practice for a homework
    * @param n must be an integer
    */
    public static void joey2(int n)
    {
        for (int i=1; i <= n; i++)
        {
            System.out.println("Joey is confused by Max.");
        }
    }
}

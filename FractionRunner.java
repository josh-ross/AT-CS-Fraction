/**
 * Homework tester with the fraction class.
 * 
 * @author (Josh Ross) 
 * @version (a version number or a date)
 */
public class FractionRunner
{
   /**
    * Just a practice for a homework
    */
   public FractionRunner()
   {
       System.out.println("Hello!!!");
       Fraction f1 = new Fraction(2,3);
       Fraction f2 = new Fraction(1,5);
       Fraction f3 = new Fraction();
       f1.setNumerator(7); // This is called dereferencing (happening at f1)
       f3.setNumerator(9);
     //^^^^^^^^^^^^^^^^^^ EXTERNAL method call
     
     // f3.eatCookie(); this will be an ERROR because there is no such method in the Fraction class
     
     int x=9;
     // x.setNumerator(7); ERROR: int cannot be dereferenced because it is a primative data type
     
     System.out.println(f3.getNumerator());
   }
   
   /**
    * Just a practice for a homework
    */
   public void testMultiplyMethod()
   {
       Fraction f1 = new Fraction(2,3);
       System.out.println(f1);
       Fraction result = f1.multiply(5);
       System.out.println(result);
       System.out.print(f1);
   }
   
   /**
    * Just a practice for a homework
    */
   public void testDivideMethod()
   {
       Fraction f1 = new Fraction(2,3);
       System.out.println(f1);
       Fraction result = f1.divide(5);
       System.out.println(result);
       System.out.print(f1);
   }
}

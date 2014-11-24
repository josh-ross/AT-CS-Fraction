/**
 * Represents a fraction
 * 
 * @author (Josh Ross) 
 * @version (9-17-14)
 */
public class Fraction
{
    // declare fields
    private int numerator; // declares a field of type int named numerator
    private int denominator;
    
    // define any constructors (gives values to fields)-- recall that the purpose of a constructor is to initialize the
    // fields of an instance of this class
    /**
     * Creates a fraction with an initial value of 1/1.
     */
    public Fraction()
    {
      numerator = 1;
      denominator = 1;
    }
    
    /**
     * Creates a fraction with the specified numerator and denominator
     * @param userNumerator the desired numerator for this fraction
     * @param userDenominator the desired denominator for this fraction
     * (must not be 0).
     */
    public Fraction (int userNumerator, int userDenominator)
    {
        numerator = userNumerator;
        denominator = userDenominator;
        reduce();
    }
    // define any methods
    /**
     * Returns the value of the numerator.
     * @return the numerator of this fraction.
     */
    public int getNumerator()
    //               ^^  parenthesis are empty because we do not need more info to do this task
    //     ^^^ means that this method will return an int
    {
        return numerator;
    }
    
    /**
     * Returns the value of the denominator
     * @return the denominator of this fraction.
     */
    public int getDenominator()
    {
        return denominator;
    }
    
    /**
     * Changes the numerator of this fraction to a specified value.
     * @param newNumerator the desired numerator for this fraction
     */
    public void setNumerator(int newNumerator)
    //                       ^^^^^^^^^^^^^^^^^ formal parameter
    {
        numerator = newNumerator;
        reduce();
    }
    
    /**
     * Changes the denominator of this fraction to a specified value.
     * @param newDenominator the desired denominator of this fraction.
     * (must not be zero).
     */
    public void setDenominator (int newDenominator)
    {
        denominator = newDenominator;
        reduce();
    }
    
    /**
     * Returns the value of the specified numerator divided by the specified denominator.
     * @return the value of the fraction
     */
    public double getValue()
    {
        return ((double) getNumerator() ) / getDenominator();
        //               ^^^^^^^ and  ^^^^^^^^^^ both are internal method calls
    }
    
    /**
    * Creates a fraction that is a copy of another fraction.
    * This is a copy constructor
    * @param other the fraction object you wish to copy
    */
    public Fraction(Fraction other)
    {
        numerator = other.getNumerator();
        // or you can do numerator = other.numerator;
        denominator = other.getDenominator();
        // or you can do denominator = other.denominator;
    }
    
    /**
     * Returns the sum of this fraction and a specified integer
     * @param num the number to add to this fraction (must be an integer)
     * @return the sum of num and the fraction
     */
    public Fraction add(int num)
    {
        Fraction result = new Fraction((num*denominator)+numerator, denominator);
        return result;
    }
    
    /**
     * Returns the sum of this fraction and a specified fraction
     * @param other the fraction to add to this fraction
     * @return the sum of this fraction and the specified fraction
     */
    public Fraction add(Fraction other)
    {
        Fraction result = new Fraction(((numerator*other.denominator) + (other.numerator*denominator)), (denominator*other.denominator));
        return result;
    }
    
    /**
     * Returns the difference of this fraction and a specified integer
     * @param num the number to subtract from this fraction (must be an integer)
     * @return the difference of num and the fraction
     */
    public Fraction subtract(int num)
    {
        Fraction result = new Fraction((numerator-(num*denominator)), denominator);
        return result;
    }
    
    /**
     * Returns the difference of this fraction and a specified fraction
     * @param other the fraction to subtract from this fraction
     * @return the difference of fraction and this fraction
     */
    public Fraction subtract(Fraction other)
    {
        Fraction result = new Fraction(((numerator*other.denominator) - (other.numerator*denominator)), (denominator*other.denominator));
        return result;
    }
    
    /**
     * Returns a string representation of this fraction in the form numerator/denominator
     * @return a string representation of this fraction in the form numerator/denominator
     */
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    /**
     * Returns the product of this fraction and the specified integer
     * @param num the number to multiply the numerator by
     * @return the product of this fraction and num
     */
    public Fraction multiply(int num)
    {
        Fraction result = new Fraction ((num*numerator) , denominator);
        return result;
    }
    
     /**
     * Returns the product of this fraction and the specified fraction
     * @param other the fraction to multiply this fraction by
     * @return the product of this fraction and the other
     */
    public Fraction multiply(Fraction other)
    {
        Fraction result = new Fraction ((other.numerator*numerator), (other.denominator*denominator));
        return result;
    }
    
   /**
     * Returns the quotient of this fraction and the specified integer
     * @param num the number to divide the denominator by
     * @return the quotient of this fraction and num
     */
    public Fraction divide(int num)
    {
        Fraction result = new Fraction (numerator , (num*denominator));
        return result;
    }
    
    /**
     * Returns the quotient of this fraction and the specified fraction
     * @param other the fraction to divide this fraction by
     * @return the quotient of this fraction and the other
     */
    public Fraction divide(Fraction other)
    {
        Fraction result = new Fraction ((other.denominator*numerator), (other.numerator*denominator));
        return result;
    }
    
    /**
     * This method will reduce this fraction to lowest terms. This is a MUTATOR method so it will change 
     * the state of this fraction object.
     */
    private void reduce()
    {
        int gcf = MyMath.gcf(numerator,denominator);
        numerator = numerator/gcf;
        denominator = denominator/gcf;
         if (numerator < 0 && denominator < 0)
        {
            numerator = numerator-(2*numerator);
            denominator = denominator-(2*denominator);
        }
    }
}

/**
 * Makes a copy of a Fraction object
 * 
 * @Josh Ross 
 * @10-15-14
 */
public class FractionTester
{
    /**
    * Just a practice for a homework
    */
    public FractionTester()
    {
        Fraction f = new Fraction(3,5);
        System.out.println("f=" + f);
        //Fraction g = f;
        //above makes g an ALIAS of f, not a copy
        Fraction g = new Fraction(f);
        //                        ^ data type is a Fraction
        
        System.out.println("g=" + g);
        
        //Change numerator of to 7
        g.setNumerator(7);
        // above is an external metho call
        // syntax: object.method()
        System.out.println("g=" + g);
        System.out.println("f=" + f);
    }
}

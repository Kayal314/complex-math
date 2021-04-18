
/**
 * @author      Pritam Kayal <b><i>Contact: </i>himalayandaredevil@gmail.com</b>
 * @version     1.0                 (current version number of program)
 * @since       1.0          (the version of the package this class was first added to)
 */

final public class CmpMath {
    /**
     * Don't let anyone instantiate this class.
     */
    private CmpMath() {}

    /**
     * The {@code double} value that is closer than any other to
     * <i>e</i>, the base of the natural logarithms.
     */
    public static final double E = 2.7182818284590452354;

    /**
     * The {@code double} value that is closer than any other to
     * <i>pi</i>, the ratio of the circumference of a circle to its
     * diameter.
     */
    public static final double PI = 3.14159265358979323846;

    /**
     * The {@code Complex} value of the base <i>e</i> logarithm of the complex
     * number <i>num</i>
     */
    public static Complex ln(Complex num)
    {
        double real = StrictMath.log(num.getModulus());
        double imaginary = num.getArgument();
        return new Complex(real, imaginary);
    }

    /**
     * The {@code Complex} value of the logarithm of {@code Complex}
     * num to the base {@code int} <i>base</i>
     */
    public static Complex log(Complex num, int base)
    {
        double real = StrictMath.log(num.getModulus())/StrictMath.log(base);
        double imaginary = num.getArgument()/StrictMath.log(base);
        return new Complex(real, imaginary);
    }

    /**
     * The {@code Complex} value of the base 10 logarithm of the complex
     * number <i>num</i>
     */
    public static Complex log10(Complex num)
    {
        double real = StrictMath.log(num.getModulus())*StrictMath.log10(E);
        double imaginary = num.getArgument()*StrictMath.log10(E);
        return new Complex(real, imaginary);
    }

    /**
     * Raises <i>e</i> to the power of the {@code Complex} number num*/
    public static Complex exp(Complex num)
    {
        double commonFactor = StrictMath.exp(num.getReal());
        double real = StrictMath.cos(num.getImaginary());
        double imaginary = StrictMath.sin(num.getImaginary());
        return new Complex(real*commonFactor,imaginary*commonFactor);
    }

    /**
     * The {@code Complex} value of {@code double} <i>num</i> raised
     * to the {@code double} power <i>power</i>
     */
    public static Complex pow(double num, double power)
    {
        if(num<0&&(long)power!=power) {
            double commonFactor = StrictMath.pow(-num, power);
            double real = StrictMath.cos(PI * power);
            double imaginary = StrictMath.signum(PI * power);
            return new Complex(real * commonFactor, imaginary * commonFactor);
        }
        return new Complex(StrictMath.pow(num,power),0);
    }

    /**
     * The {@code Complex} value of {@code Complex} <i>num</i> raised to the {@code double}
     * power <i>pow</i>
     */
    public static Complex pow(Complex num, double power)
    {
        double modPow = StrictMath.pow(num.getModulus(),power);
        double real = StrictMath.cos(num.getArgument()*power);
        double imaginary = StrictMath.sin(num.getArgument()*power);
        return new Complex(real*modPow,imaginary*modPow);
    }

    /**
     * The {@code Complex} value of <i>(one of the)</i> square roots of {@code Complex} num
     * */
    public static Complex sqrt(Complex num)
    {
        double modSqrt = StrictMath.sqrt(num.getModulus());
        double real = StrictMath.cos(num.getArgument()/2);
        double imaginary = StrictMath.sin(num.getArgument()/2);
        return new Complex(real*modSqrt,imaginary*modSqrt);
    }

    /**
     * The {@code Complex} value of <i>(one of the)</i> cube roots of {@code Complex} num
     * */
    public static Complex cbrt(Complex num)
    {
        double modCbrt = StrictMath.cbrt(num.getModulus());
        double real = StrictMath.cos(num.getArgument()/3);
        double imaginary = StrictMath.sin(num.getArgument()/3);
        return new Complex(real*modCbrt,imaginary*modCbrt);
    }

    /**
     * The {@code Complex} inverse sine of {@code double} value num
     * */
    public static Complex asin(double num)
    {
        if(StrictMath.abs(num)<=1)
            return new Complex(StrictMath.asin(num),0);
        Complex ans = ln(new Complex(0,num+StrictMath.sqrt(num*num-1)));
        ans=ans.by(new Complex(0,1));
        return ans;
    }

    /**
     * The {@code Complex} inverse cosine of {@code double} value num
     * */
    public static Complex acos(double num)
    {
        if(StrictMath.abs(num)<=1)
            return new Complex(StrictMath.acos(num),0);
        Complex ans = ln(new Complex(num-StrictMath.sqrt(num*num-1),0));
        ans=ans.by(new Complex(0,1));
        return ans;
    }

    /**
     * The {@code Complex} inverse tangent of {@code double} value num
     * */
    public static Complex atan(double num)
    {
        return new Complex(StrictMath.atan(num),0);
    }

    /**
     * The {@code Complex} sine of the {@code} Complex number num*/
    public static Complex sin(Complex num)
    {
        double real = StrictMath.sin(num.getReal())*StrictMath.cosh(num.getImaginary());
        double imaginary = StrictMath.cos(num.getReal())*StrictMath.sinh(num.getImaginary());
        return new Complex(real,imaginary);
    }

    /**
     * The {@code Complex} cosine of the {@code} Complex number num*/
    public static Complex cos(Complex num)
    {
        double real = StrictMath.cos(num.getReal())*StrictMath.cosh(num.getImaginary());
        double imaginary = -StrictMath.sin(num.getReal())*StrictMath.sinh(num.getImaginary());
        return new Complex(real,imaginary);
    }

    /**
     * The {@code Complex} tangent of the {@code} Complex number num*/
    public static Complex tan(Complex num)
    {
        double a = num.getReal();
        double b = num.getImaginary();
        double real = StrictMath.tan(a)-StrictMath.tan(a)*StrictMath.tanh(b)*StrictMath.tanh(b);
        double imaginary = StrictMath.tanh(b)*StrictMath.tan(a)*StrictMath.tan(a)+StrictMath.tanh(b);
        double commonInvFactor = 1+StrictMath.pow(StrictMath.tan(a)*StrictMath.tanh(b),2);
        return new Complex(real/commonInvFactor,imaginary/commonInvFactor);
    }

    /**
     * returns a random imaginary number <i><b>z = x + iy</b></i>
     * such that 0 <= <b>x </b>< 1 and 0 <= <b>y </b> < 1*/
    public static Complex random()
    {
        return new Complex(StrictMath.random(),StrictMath.random());
    }

    /** The {@code Complex} value of the hyperbolic sine <b>(sinh)</b> of {@code Complex} num
     * */
    public static Complex sinh(Complex num)
    {
        double real = StrictMath.sinh(num.getReal())*StrictMath.cos(num.getImaginary());
        double imaginary = StrictMath.sin(num.getImaginary())*StrictMath.cosh(num.getReal());
        return new Complex(real,imaginary);
    }

    /** The {@code Complex} value of the hyperbolic cosine <b>(cosh)</b> of {@code Complex} num
     * */
    public static Complex cosh(Complex num)
    {
        double real = StrictMath.cosh(num.getReal())*StrictMath.cos(num.getImaginary());
        double imaginary = StrictMath.sin(num.getImaginary())*StrictMath.sinh(num.getReal());
        return new Complex(real,imaginary);
    }

    /** The {@code Complex} value of the hyperbolic tangent <b>(tanh)</b> of {@code Complex} num
     * */
    public static Complex tanh(Complex num)
    {
        return sinh(num).by(cosh(num));
    }


}


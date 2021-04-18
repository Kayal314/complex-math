import java.util.Objects;

final public class Complex {
    private double real;
    private double imaginary;

    /**
     * {@code double} <i><b>real</b></i> is the real part of the complex number
     * and {@code double} <i><b>imaginary</b></i> is the imaginary part of the complex
     * number*/
    public Complex(double real, double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    /**
     * represents the {@code Complex} in standard mathematical notation <i><b>a + ib</b></i>
     * where <i><b>a</b></i> is the real part and <i><b>b</b></i> is the imaginary part*/
    @Override
    public String toString()
    {
        String rep = Double.toString(getReal());
        if(getImaginary()==0.0)
            return rep;
        if(getReal()==0.0)
            return getImaginary()+ "i";
        String sign;
        if(getImaginary()<0)
            sign = " - ";
        else
            sign = " + ";
        rep = rep + sign + Math.abs(getImaginary())+ "i";
        return rep;
    }

    /**
     * Checking for equality of two {@code Complex} objects
     * factoring a small error allowance, which might be caused due to
     * multiple computations on the object*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex num = (Complex) o;
        double epsilon = 0.000000000000001;
        return StrictMath.abs(num.getReal()-getReal())<epsilon &&
                StrictMath.abs(num.getImaginary()-getImaginary())<epsilon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    /**
     * Returns if <i><b>this = x + iy</b></i> is a real number i.e. if <i><b>y == 0</b></i>*/
    public boolean isReal()
    {
        return getImaginary() == 0;
    }

    /**
     * Returns if <i><b>this = x + iy</b></i> is a purely imaginary number i.e.
     * if <i><b>x == 0</b></i>*/
    public boolean isPurelyImaginary()
    {
        return getReal() == 0;
    }

    /**
     * returns the {@code double} imaginary part of <i><b>this</b></i> {@code Complex} number*/
    public double getImaginary() {
        return imaginary;
    }

    /**
     * returns the {@code double} real part of <i><b>this</b></i> {@code Complex} number*/
    public double getReal() {
        return real;
    }

    /**
     * returns the {@code double} argument of <i><b>this</b></i> {@code Complex} number*/
    public double getArgument()
    {
        return StrictMath.atan(imaginary/real);
    }

    /**
     * returns the {@code double} modulus of <i><b>this</b></i> {@code Complex} number*/
    public double getModulus()
    {
        return StrictMath.sqrt(real*real+imaginary*imaginary);
    }

    /**
     * Returns the conjugate of <i><b>this</b></i> complex number.
     * If <i><b>this = x + iy</b></i> then the conjugate of <i><b>this</b></i>
     * is <i><b>x - iy</b></i>*/
    public Complex getConjugate()
    {
        return new Complex(getReal(),-getImaginary());
    }

    /**
     * changes the {@code double} imaginary part of <i><b>this</b></i> {@code Complex} number*/
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * changes the {@code double} real part of <i><b>this</b></i> {@code Complex} number*/
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * adds <i><b>this</b></i> {@code Complex} number to the {@code Complex} number <i><b>num</b></i>
     * and returns the {@code Complex} sum*/
    public Complex plus(Complex num)
    {
        double realPart=getReal()+num.getReal();
        double imaginaryPart=getImaginary()+num.getImaginary();
        return new Complex(realPart,imaginaryPart);
    }

    /**
     * subtracts the {@code Complex} number <i><b>num</b></i> from <i><b>this</b></i> {@code Complex} number
     * and returns the {@code Complex} difference*/
    public Complex minus(Complex num)
    {
        double realPart=getReal()-num.getReal();
        double imaginaryPart=getImaginary()-num.getImaginary();
        return new Complex(realPart,imaginaryPart);
    }

    /**
     * multiplies <i><b>this</b></i> {@code Complex} number to the {@code Complex} number <i><b>num</b></i>
     * and returns the {@code Complex} product*/
    public Complex times(Complex num)
    {
        double realPart=getReal()*num.getReal()-getImaginary()*num.getImaginary();
        double imaginaryPart=getReal()*num.getImaginary()+getImaginary()*num.getReal();
        return new Complex(realPart,imaginaryPart);
    }

    /**
     * divides <i><b>this</b></i> {@code Complex} number by the {@code Complex} number <i><b>num</b></i>
     * and returns the {@code Complex} quotient*/
    public Complex by(Complex num)
    {
        double realPart=getReal()*num.getReal()+getImaginary()*num.getImaginary();
        double imaginaryPart=getImaginary()*num.getReal()-getReal()*num.getImaginary();
        double modulusSq = num.getImaginary()*num.getImaginary()+num.getReal()*num.getReal();
        realPart/=modulusSq;
        imaginaryPart/=modulusSq;
        return new Complex(realPart,imaginaryPart);
    }


}

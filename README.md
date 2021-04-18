# complex-math
An equivalent of java.lang.Math class for complex numbers. It contains a datatype (class) for storing complex numbers and the class CmpMath for computations

To store complex numbers, use the class Complex; the constructor: Complex(double real, double imaginary)

CmpMath contains all functions in the Math class for complex numbers. For example: (the Complex numbers are represented as a+ib for convenience)
sin(a+ib)
cos(a+ib)
tan(a+ib)
sinh(a+ib)
cosh(a+ib)
tanh(a+ib)
asin(double n) for all real numbers
acos(double n) for all real numbers
atan(double n) for all real numbers
ln(a+ib)
log(a+ib, base of logarithm)
log10(a+ib)
exp(a+ib)
pow(double a, double b) 
pow(a+ib, power)
sqrt(a+ib)
cbrt(a+ib)
random() 

The Complex class contains the following functions:
String toString()
boolean equals(Object o)
int hashCode()
double getReal()
double getImaginary()
double getModulus()
double getArgument()
Complex getConjugate()
void setReal(double a)
void setImaginary(double b)
Complex plus(Complex z)
Complex minus(Complex z)
Complex times(Complex z)
Complex by(Complex z)
boolean isReal()
boolean isPurelyImaginary()

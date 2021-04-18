# complex-math
An equivalent of java.lang.Math class for complex numbers. It contains a datatype (class) for storing complex numbers and the class CmpMath for computations <br>

To store complex numbers, use the class <i>Complex</i>; the constructor: Complex(double real, double imaginary)<br>

<i>CmpMath</i> contains all functions in the Math class for complex numbers. For example: (the Complex numbers are represented as a+ib for convenience) <br>
sin(a+ib) <br>
cos(a+ib) <br>
tan(a+ib) <br>
sinh(a+ib) <br>
cosh(a+ib) <br>
tanh(a+ib) <br>
asin(double n) for all real numbers <br>
acos(double n) for all real numbers <br>
atan(double n) for all real numbers <br>
ln(a+ib) <br>
log(a+ib, base of logarithm) <br>
log10(a+ib) <br>
exp(a+ib) <br>
pow(double a, double b) <br>
pow(a+ib, power) <br>
sqrt(a+ib) <br>
cbrt(a+ib) <br>
random <br> <br>
The <i>Complex</i> class contains the following functions: <br>
String toString() <br>
boolean equals(Object o) <br>
int hashCode() <br>
double getReal() <br>
double getImaginary() <br>
double getModulus() <br>
double getArgument() <br>
Complex getConjugate() <br>
void setReal(double a) <br>
void setImaginary(double b) <br>
Complex plus(Complex z) <br>
Complex minus(Complex z) <br>
Complex times(Complex z) <br>
Complex by(Complex z) <br>
boolean isReal() <br>
boolean isPurelyImaginary() <br>

public class ComplexNumber {
    private int real;
    private int imaginary;

    public void ComplexNumber(int a, int b) {
        real = a;
        imaginary = b;
    }

    public String toString(){
        if (imaginary == 0) {
            return real + "";
        }
        else if (real == 0) {
            return imaginary + "i";
        }
        else {
            if (imaginary < 0) {
                return real + " - " + imaginary + "i";
            }
            else {
                return real + " + " + imaginary + "i";
            }
        }
    }

    public void addition(int a, int b) {
        real += a;
        imaginary += b;
    }

    public void difference(int a, int b) {
        real -= a;
        imaginary -= b;
    }

    public void multiply(int a, int b) {
        real = real * a - imaginary * b;
        imaginary = real * b + imaginary * a;
    }

    public void conjugation() {
        imaginary = -imaginary;
    }

    public String trigonometricForm() {
        double r = Math.sqrt(real * real + imaginary * imaginary);
        double cos = (double) real / r;
        double sin = (double) imaginary / r;
        return r + " * " + "(" + cos + " + " + "i * " + sin;
    }
}
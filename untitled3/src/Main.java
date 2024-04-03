import javax.security.auth.login.LoginException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Vector vector = new Vector();
        vector.Vector(1, 1, 1); // задаём координаты вектора
        System.out.println(vector.toString()); // выводим координаты вектора
        vector.addition(1, 2, 3); // складываем с нашим вектором вектор (1, 2, 3)
        System.out.println(vector.toString()); // выводим координаты нового вектора
        vector.difference(1, 3, 5); // вычитаем из нашего вектора вектор (1, 3, 5)
        System.out.println(vector.toString()); // выводим координаты нового вектора
        System.out.println(vector.scalarProduct(5, -12, -1)); // найдём и выведем скалярное произведение нашего вектора и вектора (5, -12, -1)
        System.out.println(vector.cos(-23, 78, 100)); //найдём и выведем косинус угла между нашим вектором и вектором (-23, 78, 100)

        Time time = new Time();
        time.Time(1, 23, 57); // задаём время
        System.out.println(time.toString()); // выводим время
        time.addition(85952, 1, 9); // складываем наше время с новым
        System.out.println(time.toString()); // выводим новое время на экран
        time.difference(0, 1, 9);
        System.out.println(time.toString()); // выводим время

        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.ComplexNumber(10, 50); // создаём комплексное число с действительной чатсью 10 и мнимой 50
        System.out.println(complexNumber.toString()); // выводим наше комплексное число
        complexNumber.addition(1, 2); // прибавляем к нашему комплексному числу новое
        System.out.println(complexNumber.toString()); // выводим получившееся комплексное число
        complexNumber.difference(-10, 20); // вычитаем из нашего комплексного числа другое
        System.out.println(complexNumber.toString()); // выводим получившееся комплексное число
        complexNumber.multiply(3, 5); // умножаем наше комплексное число на другое
        System.out.println(complexNumber.toString()); // выводим получившееся комплексное число
        complexNumber.conjugation(); // найдём сопряжённое к нашему комплексное число
        System.out.println(complexNumber.toString()); // выведем его на экран
        System.out.println(complexNumber.trigonometricForm()); // переведём наше комплексное число в тригонометрическую форму записи и выведем его
    }
}
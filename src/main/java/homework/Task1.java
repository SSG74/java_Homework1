//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package homework;

public class Task1 {

    public int Triangle;

    public static int Triangle (int num){
        if (num == 1){
            return 1;
        }
        return Triangle(num-1) + num;
    }
}

//Вывести все простые числа от 1 до 1000
package houmw;


public class PrimeTest {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public int Prime;
    public static int Prime (){
        for (int i = 1; i < 1000; i++){
            if (isPrime(i))
                System.out.println(i);
        }
        return 1;
    }

}

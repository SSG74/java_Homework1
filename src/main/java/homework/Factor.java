package homework;

public class Factor {

    public int Factor;

    public static int Factor (int num){
        if (num == 1){
            return 1;
        }
        return Factor(num-1) * num;
    }
}

import java.util.*;

public class decimaldeletion{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        float N = sc.nextFloat();
        
        if (N - (int) N < 0.5){
            System.out.println((int) N);
        }
        else{
            System.out.println((int) N + 1);
        }
    }
}
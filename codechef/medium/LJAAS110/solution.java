import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long factorial = 1;
        int i = 1;
        
        if (n > 0) {
            do {
                factorial *= i;
                i++;
            } while (i <= n);
        }
        
        System.out.println(factorial);
        
        sc.close();
    }
}
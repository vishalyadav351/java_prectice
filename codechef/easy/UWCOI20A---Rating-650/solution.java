import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int T = scanner.nextInt();
            
            while (T > 0) {
                int N = scanner.nextInt();
                int maxHeight = Integer.MIN_VALUE;
                
                for (int i = 0; i < N; i++) {
                    int height = scanner.nextInt();
                    if (height > maxHeight) {
                        maxHeight = height;
                    }
                }
                
                System.out.println(maxHeight);
                T--;
            }
        }
        
        scanner.close();
    }
}
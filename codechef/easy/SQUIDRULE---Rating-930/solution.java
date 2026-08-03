import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt(); 
            
            while (t-- > 0) {
                int n = scanner.nextInt(); 
                int[] a = new int[n];
                
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                
                boolean isNonDecreasing = true;
                
                for (int i = 1; i < n; i++) {
                    if (a[i] < a[i - 1]) {
                        isNonDecreasing = false;
                        break;
                    }
                }
                
                if (isNonDecreasing) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        
        scanner.close();
    }
}
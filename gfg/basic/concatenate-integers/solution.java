import java.util.Scanner;

class GFG {
    public static String concatenate(int a, int b) {
        return String.valueOf(a) + String.valueOf(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(concatenate(a, b));
        }
        sc.close();
    }
}
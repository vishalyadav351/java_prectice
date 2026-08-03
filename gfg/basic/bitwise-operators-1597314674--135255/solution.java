import java.util.Scanner;

class GFG {
    public static void bitWiseOp(int a, int b, int c) {
        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = ~e;

        System.out.println(d + " " + e + " " + f + " " + g);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            bitWiseOp(a, b, c);
        }
        sc.close();
    }
}
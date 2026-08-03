import java.util.Scanner;

class GFG {
    public static void utility(String a, String b, String separator) {
        System.out.println(a + separator + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            String separator = sc.next();
            utility(a, b, separator);
        }
        sc.close();
    }
}
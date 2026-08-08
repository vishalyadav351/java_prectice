import java.util.Scanner;

class GFG {
    public static boolean isVowel(char c) {
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            char c = sc.next().charAt(0);
            System.out.println(isVowel(c));
        }
        sc.close();
    }
}
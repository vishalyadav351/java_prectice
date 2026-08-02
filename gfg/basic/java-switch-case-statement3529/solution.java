import java.util.List;

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        if (choice == 1) {
            double r = arr.get(0);
            return Math.PI * r * r;
        } else {
            double l = arr.get(0);
            double b = arr.get(1);
            return l * b;
        }
    }
}
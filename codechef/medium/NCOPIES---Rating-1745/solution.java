import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;

        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;

            StringTokenizer st = new StringTokenizer(line);
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            String a = br.readLine().trim();

            long onesInA = 0;
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    onesInA++;
                }
            }

            long totalOnes = onesInA * m;

            if (totalOnes == 0) {
                System.out.println(n * m);
                continue;
            }

            if (totalOnes % 2 != 0) {
                System.out.println(0);
                continue;
            }

            long targetOnes = totalOnes / 2;

            long copyIndex = targetOnes / onesInA;
            long remOnesNeeded = targetOnes % onesInA;


            if (remOnesNeeded == 0) {
                copyIndex--;
                remOnesNeeded = onesInA;
            }

            long validPositions = 0;
            long currentOnes = 0;

            for (int i = 0; i < n; i++) {
                if (a.charAt(i) == '1') {
                    currentOnes++;
                }
                if (currentOnes == remOnesNeeded) {
                    validPositions++;
                }
            }

            System.out.println(validPositions);
        }
    }
}
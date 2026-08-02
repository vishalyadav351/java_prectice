import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            if (st == null) break;

            int n = Integer.parseInt(st.nextToken());
            int compressedSize = 0;
            int previousValue = -1;

            for (int i = 0; i < n; i++) {
                while (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int currentValue = Integer.parseInt(st.nextToken());

                if (currentValue != previousValue) {
                    compressedSize++;
                    previousValue = currentValue;
                }
            }
            sb.append(compressedSize).append("\n");
        }

        System.out.print(sb.toString());
    }
}
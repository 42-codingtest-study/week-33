import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659 {

    static int[] sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        generateArr(n, new StringTokenizer(br.readLine()));

        BOJ_11659 intervalSumPrinter = new BOJ_11659();
        intervalSumPrinter.printIntervalSum(m, br, st);
    }

    private void printIntervalSum(int m, BufferedReader br, StringTokenizer st) throws IOException {
        int fromIdx, toIdx;

        for (int idx = 0; idx < m; idx++) {
            st = new StringTokenizer(br.readLine());
            fromIdx = Integer.parseInt(st.nextToken()) - 1;
            toIdx = Integer.parseInt(st.nextToken()) - 1;
            if (fromIdx == 0)
                System.out.println(sum[toIdx]);
            else
                System.out.println(sum[toIdx] - sum[fromIdx - 1]);
        }
    }

    private static void generateArr(int n, StringTokenizer st) {
        sum = new int[n];

        int value = Integer.parseInt(st.nextToken());
        sum[0] = value;

        for (int idx = 1; idx < n; idx++) {
            value = Integer.parseInt(st.nextToken());
            sum[idx] = sum[idx - 1] + value;
        }
    }
}

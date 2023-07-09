import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11660 {
    private static int[][] sum;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        generateArr(n, br, st);

        BOJ_11660 twoDivIntervalSumPrinter = new BOJ_11660();
        twoDivIntervalSumPrinter.printIntervalSum(m, br, st);

    }

    private static void generateArr(int n, BufferedReader br, StringTokenizer st) throws IOException {
        sum = new int[n+1][n+1];
        for (int y = 1; y <= n; y++) {
            st = new StringTokenizer(br.readLine());
            for (int x = 1; x <= n; x++) {
                sum[y][x] = sum[y-1][x] + sum[y][x-1] - sum[y-1][x-1] + Integer.parseInt(st.nextToken());
            }
        }
    }

    private void printIntervalSum (int m, BufferedReader br, StringTokenizer st) throws IOException {
        int y1, x1, y2, x2, res;

        for (int idx = 0; idx < m; idx++) {
            st = new StringTokenizer(br.readLine());
            y1 = Integer.parseInt(st.nextToken());
            x1 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            res = sum[y2][x2] - sum[y1-1][x2] - sum[y2][x1-1] + sum[y1-1][x1-1];
            System.out.println(res);
        }
    }
}

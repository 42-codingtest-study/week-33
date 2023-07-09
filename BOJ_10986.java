import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10986 {

    private static int[] remainderSum;
    private static int[] counterArr;
    private static long count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        generateRemainderSumArr(n, m, new StringTokenizer(br.readLine()));

        BOJ_10986 validIntervalPrinter = new BOJ_10986();
        validIntervalPrinter.printValidIntervalCount(n);
    }

    private static void generateRemainderSumArr(int n, int m, StringTokenizer st) throws IOException {
        remainderSum = new int[n + 1];
        counterArr = new int[1000];

        // S[i] = S[i - 1] + A[i]
        for (int idx = 1; idx <= n; idx++) {
            remainderSum[idx] += (remainderSum[idx - 1] + Integer.parseInt(st.nextToken())) % m;
            counterArr[remainderSum[idx] % m]++;
        }
    }

    private void printValidIntervalCount(int n) {
        countvalidInterval();
        printResult();
    }

    private static void countvalidInterval() {
        count += counterArr[0];
        for (int idx = 0; idx < counterArr.length; idx++) {
            if (counterArr[idx] > 1)
                count += computeCombination(counterArr[idx]);
        }
    }

    private static long computeCombination(long num) {
        return num * (num - 1) / 2;
    }

    private void printResult() {
        System.out.println(count);
    }

}

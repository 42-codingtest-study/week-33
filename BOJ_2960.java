import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 2부터 N까지 모든 정수를 적는다.
 * 아직 지우지 않은 수 중 가장 작은 수를 찾는다.
 * 이것을 P라고 하고, 이 수는 소수이다.
 * P를 지우고, 아직 지우지 않은 P의 배수를
 * 크기 순서대로 지운다. 아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
 *
 * 2 3 4 5 6 7
 */
public class BOJ_2960 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        BOJ_2960 eratosNumberPrinter = new BOJ_2960();
        eratosNumberPrinter.printKthErasedNumber(n, k);
    }

    private void printKthErasedNumber(int n, int k) {
        int result = eratos(n, k);
        print(result);
    }

    private int eratos(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int count = 0;
        int targetNumber = 0;
        for (int idx = 2; idx <= n; idx++) {
            numbers.add(idx);
        }

        while (numbers.size() != 0) {
            int p = numbers.get(0);
            targetNumber = 0;
            while (targetNumber <= n) {
                targetNumber += p;
                if (numbers.contains(targetNumber))
                    ++count;
                    if (count == k)
                        break;
                    numbers.remove(Integer.valueOf(targetNumber));
            }
            if (count == k)
                break;
        }
        return targetNumber;
    }

    private void print(int number) {
        System.out.println(number);
    }
}

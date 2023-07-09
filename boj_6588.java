import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_6588 {
    public static final int MAX = 1000001;
    public static boolean[] isPrime = new boolean[MAX];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        boolean flag;
        erasto();

        while (true) {
            num = Integer.parseInt(br.readLine());
            if (num == 0)
                break;
            flag = false;

            for (int idx = 2; idx <= num/ 2; idx++) {
                if (!isPrime[idx] && !isPrime[num - idx]) {
                    printRes(num, idx, num-idx);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }

    static void    erasto() {
        isPrime[0] = true;
        isPrime[1] = true;
        for (int idx = 2; idx * idx < MAX; idx++) {
            for (int jdx = 2; idx * jdx < MAX; jdx++) {
                isPrime[idx * jdx] = true;
            }
        }
    }

    static void    printRes(int num, int a, int b) {
        System.out.println(num + " = " + a + " + " + b);
    }
}

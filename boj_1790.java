import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1790 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long tmpK = K;
        long len = 1;
        long numCnt = 9;
        long res = 0;

        while (tmpK > numCnt * len) {
            tmpK -= numCnt * len;
            res += numCnt;
            numCnt *= 10;
            len++;
        }

        res = (res + 1) + ((tmpK - 1) / len);

        if (res > N) {
            System.out.print(-1);
        } else {
            int idx = (int) ((tmpK - 1) % len);
            System.out.print(String.valueOf(res).charAt(idx));
        }

        /**
         *
         * 예를 들어, 입력값이 123과 234인 경우를 살펴보겠습니다.
         *
         * 1부터 123까지의 수를 이어서 만들면 "123456789101112131415161718192021..."와 같은 문자열이 됩니다.
         *
         * 여기서 앞에서 234번째 자리 숫자를 구하려고 합니다.
         *
         * 우선, tmpK라는 변수에 입력값인 234를 저장합니다.
         *
         * 그리고 len이라는 변수를 1로 초기화하고, numCnt라는 변수를 9로 초기화합니다. res 변수는 0으로 초기화합니다.
         *
         * 그리고 while 루프를 통해 tmpK가 numCnt * len보다 큰 경우에는 다음 작업을 수행합니다.
         *
         * tmpK에서 numCnt * len을 빼고, res에는 numCnt를 더해줍니다. numCnt는 10씩 곱해주고, len은 1씩 증가합니다.
         *
         * 이 작업을 반복하면서 tmpK가 numCnt * len보다 작아질 때까지 진행합니다.
         *
         * 이렇게 하면 while 루프를 마치고 난 후의 res 값은 120입니다.
         *
         * 그 다음에는 res에 (tmpK - 1) / len + 1을 더해줍니다.
         *
         * 이 때, (tmpK - 1)을 len으로 나눈 몫에 1을 더하는 이유는 인덱스가 0부터 시작하기 때문입니다.
         *
         * 따라서 res 값은 120 + ((234 - 1) / 3) + 1 = 121 + 77 = 198이 됩니다.
         *
         * 마지막으로, res가 N보다 큰지 확인하고, 만약 크다면 -1을 출력하고 프로그램을 종료합니다.
         *
         * 만약 res가 N보다 작거나 같다면, (tmpK - 1)을 len으로 나눈 나머지를 인덱스로 사용하여 res 값을 문자열로 변환한 후, 해당 인덱스의 문자를 출력합니다.
         *
         * 따라서 123과 234를 입력값으로 주었을 때, 결과값은 8이 됩니다.
         *
         * res += numCnt;라인에서 res에 numCnt를 더해주는 이유는 새로운 숫자가 자릿수에 따라 몇 번 등장하는지를 계산하기 위해서입니다.
         *
         * 처음에는 1자리 숫자인 1부터 9까지는 각각 한 번씩 등장합니다. 따라서 numCnt를 9로 초기화하고, 이후에는 자릿수가 2자리인 10부터 99까지는 10번씩 등장하므로 numCnt에 10을 더해줍니다. 이후에는 자릿수가 3자리인 100부터 999까지는 100번씩 등장하므로 numCnt에 100을 더해주는 식으로 계속해서 자릿수에 따라 등장 횟수를 더해주는 것입니다.
         *
         * 즉, res 변수는 현재까지 등장한 숫자의 개수를 나타내는 변수이며, numCnt를 더해주는 것은 다음 자릿수의 숫자 등장 횟수를 업데이트하기 위한 작업입니다.
         */

    }
}
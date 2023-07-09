//문제: 20922
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

solution(input);
function solution(input) {
  const [N, K] = input.shift().split(" ").map(Number);
  const arr = input[0].split(" ").map(Number);
  const intMap = {};
  let maxLength = 0;
  let i = 0;
  let j = 0;

  while (i <= j && j < N) {
    while (intMap[arr[j]] === K) {
      intMap[arr[i]]--;
      i++;
    }
    maxLength = Math.max(maxLength, j - i + 1);
    intMap[arr[j]] = (intMap[arr[j]] ?? 0) + 1;
    // ?? null 병합 연산자임 intMap[arr[j]]가 null이나 undefined 면 0이 선택되고 아니면 intMap[arr[j]]가 선택됨
    j++;
  }

  console.log(maxLength);
}

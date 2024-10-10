package exam01;

public class Q1 {
    // 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
    int num1 = 20;
    double num2 = 3.5; // int -> double

    // int result = num1 * (int)num2; // 오답
        /*
        오답인 이유: 예를 들어 num2가 3.63이라 했을 때, num2앞에 int를 붙여 형변환을 해주면 답이 60이 나오고,
        연산 먼저 하고 총 결과에 int를 해주면 답이
         */
    int result = (int)(num1*num2); // 정답

}

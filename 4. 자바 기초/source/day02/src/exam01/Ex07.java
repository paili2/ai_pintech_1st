package exam01;

public class Ex07 {
    public static void main(String[] args) {
        /**
         * 단락 회로 평가
         * 논리 연산에서 이미 값이 결정된 경우 다음 항 연산X
         */
        int num1 = 10;
        // boolean result = num1 ++ > 10 && (num1 = num1+20) > 20;
        System.out.println(num1);

        boolean result = ++num1 > 10 || (num1 = num1 + 20) <30; // 11, 이미 앞에서 참이기 때문에 뒤에는 계산하지 않음
        System.out.println(result);
    }
}

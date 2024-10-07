package exam01;

public class Ex11 {
    /** 연산 중 자동 형 변환
     * 연산은 같은 자료형만 가능  -> 연산을 위해서 자동 형변환
     * @param args
     */
    public static void main(String[] args) {
        int num1= 10;
        double num2 = 3.0;

        double result = num1 / num2; //int -> double
        System.out.println(result);
    }
}

package exam01;

public class Q5 {
    //  구구단을 단보다 곱하는 수가 크거나 같은 경우만 출력하는 프로그램을 만들어 보세요.

    public static void main(String[] args) {
        // 구구단을 홀수 단만 출력하도록 프로그램을 만드시오.


        for (int i = 2; i<=9; i++) { //단
            System.out.printf("--- %d단 --- %n",i);
            for (int j = 1; j<=9; j++) { //곱하는 수
                if(j<i) {
                    continue;
                } System.out.printf("%d X %d = %d%n", i, j, i * j);
            }


        /*
        for (int i = 2; i<=9; i++) { //단
            System.out.printf("--- %d단 --- %n",i);
            for (int j = 1; j<=9; j++) { //곱하는 수
                if(j>=i) {
                    System.out.printf("%d X %d = %d%n", i, j, i * j);
                }
            }*/

            }
            }


}

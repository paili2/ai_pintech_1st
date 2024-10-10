package exam03;

import java.time.LocalDate;

public class Ex05 {
    public static void main(String[] args) {
        int result1 = solution(27);
        int result2 = solution(23);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int solution(int age) {

        LocalDate date = LocalDate.now();
        int year = date.getYear();

        return year - age - 1;
    }
}

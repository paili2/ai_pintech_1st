package exam02;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = new int[] {10, 20, 30, 40, 50, 60}; // 선언과 동시에 초기화

        System.out.printf("length=%d%n", nums.length);


        for (int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        for(int num : nums) { //향상된 for 문
            System.out.println(num);
        }
    }
}

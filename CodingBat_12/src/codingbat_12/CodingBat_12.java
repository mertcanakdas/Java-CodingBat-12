package codingbat_12;

import java.util.Random;
import java.util.Arrays;

public class CodingBat_12 {

    public static int[] nums() {
        Random rn = new Random();
        int[] nums = new int[rn.nextInt(20) + 1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rn.nextInt(100) + 1;

        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static int[] tenRun(int[] nums) {

        boolean onunKatiBulundu = false;
        int onunKati = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!onunKatiBulundu && nums[i] % 10 == 0) {
                onunKatiBulundu = true;
                onunKati = nums[i];

            }
            if (onunKatiBulundu && nums[i] % 10 != 0) {
                nums[i] = onunKati;
            }
            if (onunKatiBulundu && nums[i] % 10 == 0) {
                onunKati = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));

        return nums;
    }

    public static void main(String[] args) {
        tenRun(nums());

    }

}

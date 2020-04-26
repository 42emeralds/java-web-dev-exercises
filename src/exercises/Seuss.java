package exercises;

import java.util.Arrays;

public class Seuss {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 1) {
               System.out.println(nums[i]);
            }
        }

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] spaceSplit = seuss.split("\\.");
        System.out.println(Arrays.toString(spaceSplit));



    }
}

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] passin = {2,5,5,11};
        main.twoSum(passin, 10);
        System.out.println(Arrays.toString(main.twoSum(passin, 9)));
    }

    public int[] twoSum(int[] nums, int target) {

        int i;
        int j;

        for(i=0; i<nums.length; i++) {
            int valueOne = nums[i];

            for(j=i+1; j<nums.length; j++) {
                int valueTwo = nums[j];

                if(valueOne+valueTwo == target) {
                    int[] returnPosition = {i,j};
                    return returnPosition;
                }
            }
        }
        return null;
    }
}
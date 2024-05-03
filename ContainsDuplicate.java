// (TLE METHOD): not efficient for large arrays!!!!!!!
/* 
 * public class Solution {
    public static void main (String args[]){
        int[] nums = {1, 2, 3, 4, 5, 1};
        boolean duplicate;
        
        System.out.println(containsDuplicate(nums));
    }
    
    public static boolean containsDuplicate(int[] nums) {
        int array = nums.length;
        
        for (int i = 0; i < array; i++){
            int element = nums[i];
            for (int j = i + 1; j < array; j++){
                if (nums[j] == element){
                    return true;
                }
            }
        } return false;
    }
}
*/

// (SORTING METHOD)
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main (String args[]){
        int[] nums = {1, 2, 3, 4, 5, 1};
        
        System.out.println(containsDuplicate(nums));
    }
    
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // sorting é para deixar os numeros em ordem crescente e facilitar a vida do caba
        int array = nums.length;

        for (int i = 1; i < array; i++){
            if (nums [i] == nums [i - 1]){
                return true;
            }
        } return false;
    }
}












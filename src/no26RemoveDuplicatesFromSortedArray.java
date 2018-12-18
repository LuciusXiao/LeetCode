
/***
 * 26. 删除排序数组中的重复项
 * 原题地址：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/
 * @author Lucius
 */
public class no26RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i =0;
        int j =1;
        while (i < n) {
            if (i > 0 && nums[i-1] != nums[i] ) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        System.out.println("length:"+removeDuplicates(nums));

    }
}


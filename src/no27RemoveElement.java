import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 移除元素
 * 原题地址：https://leetcode-cn.com/problems/remove-element/description/
 * @author Lucius
 */
public class no27RemoveElement {

    public static  int removeElement(int[] nums, int val) {
        int length = nums.length;
        if (nums == null || length == 0) {
            return 0;
        }
        int i =0;
        while (i < length) {
            if (nums[i] == val) {
                nums[i] = nums[length-1];
                length--;
            } else {
                i++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println("length:"+removeElement(nums,3));
    }
}


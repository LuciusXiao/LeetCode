/***
 * 原题地址：https://leetcode-cn.com/problems/reverse-integer/description/
 * @author Lucius
 */
import java.util.*;

public class no7ReverseInteger {

    public static void main(String[] args) {
        int x = -123;
        String xStr = String.valueOf(x);
        StringBuffer xStrB = new StringBuffer(xStr);
        xStrB.reverse();
        if (x < 0) {
            if (xStr != null && !xStr.isEmpty()) {
                xStrB.deleteCharAt(xStr.length()-1);
            }
            try {
               x = -Integer.valueOf(xStrB.toString());
            } catch (Exception e) {

            }
        } else {
            try {
                x = Integer.valueOf(xStrB.toString());
            } catch (Exception e) {

            }
        }

        System.out.println("goono:"+x);
    }
}

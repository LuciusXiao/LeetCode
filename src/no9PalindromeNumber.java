/***
 * 原题地址：https://leetcode-cn.com/problems/palindrome-number/description/
 * @author Lucius
 */
public class no9PalindromeNumber {
    public boolean isPalindrome(int x) {
        String intString = Integer.toString(x);
        char []stringarry = intString.toCharArray();
        StringBuffer app = new StringBuffer();
        if (stringarry != null && stringarry.length>0) {
            for (int j = stringarry.length-1 ; j >= 0; j--) {
                app.append(stringarry[j]);
            }
        }
        if (app.toString().equals(intString)) {
            return true;
        } else {
            return false;
        }

    }
}

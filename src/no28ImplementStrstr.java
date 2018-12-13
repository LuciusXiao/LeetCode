/***
 * 原题地址：https://leetcode-cn.com/problems/implement-strstr/description/
 * @author Lucius
 */
public class no28ImplementStrstr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        if (haystack.length() == 0  || haystack.length() < needle.length()) {
            return -1;
        }
        CharSequence needles = needle;
        if (!haystack.contains(needles)) {
            return -1;
        }
        for (int i = 0; i < haystack.length()-needle.length()+1 ; i++) {
            if (haystack.substring(i,i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}

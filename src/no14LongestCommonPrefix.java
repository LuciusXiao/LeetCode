/***
 * 原题地址：https://leetcode-cn.com/problems/longest-common-prefix/description/
 * @author Lucius
 */
public class no14LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer results = new StringBuffer();
        if (strs != null && strs.length > 0 ) {
            //取最小长度
            int length = strs[0].length();
            for (String st : strs) {
                if (st.length() <= length) {
                    length = st.length();
                }
            }
            //寻找公共前缀
            String temp = "";
            boolean exits = false;
            for (int i=0 ; i < length ; i++) {
                temp = strs[0].substring(i,i+1);
                for (String st : strs) {
                    if (!temp.equals(st.substring(i,i+1))) {
                        exits = true;
                        break;
                    }
                }
                if (exits) {
                    break;
                } else {
                    results.append(temp);
                }
            }
        }
        return results.toString();
    }
}

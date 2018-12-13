/***
 * 原题地址：https://leetcode-cn.com/problems/duplicate-emails/description/
 * @author Lucius
 */
select Email from Person group by Email having count(*)>1
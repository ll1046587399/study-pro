
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 394 👎 0

package com.lei.leetcode.editor.cn;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
        solution.isAnagram("dba", "ded");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {

           /* if(s.length() != t.length()){
                return false;
            }
            int[] sArr = new int[s.length()];
            int[] tArr = new int[t.length()];
            String s1 = "";
            StringBuilder sb = new StringBuilder();
            StringBuilder tb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int value = s.charAt(i);
                sArr[i] = s.charAt(i);
                int j = i - 1;
                for (; j >= 0; j--) {
                    if(value>=sArr[j]){
                        break;
                    }else{
                        int k = sArr[j];
                        sArr[j] = sArr[j+1];
                        sArr[j+1] = k;
                    }
                }
            }
            for (int i = 0; i < t.length(); i++) {
                int value = t.charAt(i);
                tArr[i] = t.charAt(i);
                int j = i - 1;
                for (; j >= 0; j--) {
                    if(value>=tArr[j]){
                        break;
                    }else{
                        int k = tArr[j];
                        tArr[j] = tArr[j+1];
                        tArr[j+1] = k;
                    }
                }
            }
            return Arrays.equals(sArr, tArr);*/
            if (s.length() != t.length()) {
                return false;
            }
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            return Arrays.equals(str1, str2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
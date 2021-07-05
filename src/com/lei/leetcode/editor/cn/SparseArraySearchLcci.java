
//稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。 
//
// 示例1: 
//
//  输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""],
// s = "ta"
// 输出：-1
// 说明: 不存在返回-1。
// 
//
// 示例2: 
//
//  输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], 
//s = "ball"
// 输出：4
// 
//
// 提示: 
//
// 
// words的长度在[1, 1000000]之间 
// 
// Related Topics 二分查找 
// 👍 49 👎 0

package com.lei.leetcode.editor.cn;
public class SparseArraySearchLcci {
    public static void main(String[] args) {
        Solution solution = new SparseArraySearchLcci().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findString(String[] words, String s) {
        int low = 0;
        int high = words.length -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(words[mid].equals(s)){
                return mid;
            }
            if("".equals(words[mid])){
                if(s.equals(words[low])){
                    return low;
                }else {
                    low++;
                }
            }else if(words[mid].compareTo(s) < 0){
                low = mid + 1;
            }else{
                high = mid -1;
            }

        }

        return  -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
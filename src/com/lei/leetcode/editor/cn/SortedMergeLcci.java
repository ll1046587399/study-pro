
//给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。 
//
// 初始化 A 和 B 的元素数量分别为 m 和 n。 
//
// 示例: 
//
// 输入:
//A = [1,2,3,0,0,0], m = 3
//B = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
//
// 说明: 
//
// 
// A.length == n + m 
// 
// Related Topics 数组 双指针 
// 👍 110 👎 0

package com.lei.leetcode.editor.cn;
public class SortedMergeLcci {
    public static void main(String[] args) {
        Solution solution = new SortedMergeLcci().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int pm = m-1;
        int pn = n-1;
        while(pm >= 0 || pn >= 0){
            if(pm < 0){
                A[pn] = B[pn];
                pn--;
            }else if(pn < 0){
                break;
            }else if(A[pm] > B[pn]){
                A[pm+pn+1] = A[pm];
                pm--;
            }else{
                A[pm+pn+1] = B[pn];
                pn--;
            }
        }


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
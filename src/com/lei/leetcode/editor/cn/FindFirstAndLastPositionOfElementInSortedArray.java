
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。 
//
// 如果数组中不存在目标值 target，返回 [-1, -1]。 
//
// 进阶： 
//
// 
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4] 
//
// 示例 2： 
//
// 
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1] 
//
// 示例 3： 
//
// 
//输入：nums = [], target = 0
//输出：[-1,-1] 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// nums 是一个非递减数组 
// -109 <= target <= 109 
// 
// Related Topics 数组 二分查找 
// 👍 1062 👎 0

package com.lei.leetcode.editor.cn;
public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Solution solution = new FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        int nums[] = {0,0,0,0,0,1,1,2,2,3,4,4,5,5,5,5,6,7};
        int[] result = solution.searchRange(nums,0);
        System.out.println(result[0]+"/"+result[1]);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int result[] ={-1,-1};
        while(low<=high){
            int mid = low + (high - low)/2;
            if(result[0] != -1 && result[1] != -1){
                return result;
            }
            if(target == nums[mid]){
                if(mid==0 || nums[mid-1]<target){
                    result[0] = mid;
                }else{
                    //找最小值  [low,mid-1]
                    int newLow = low;
                    int newHigh = mid -1;
                    while (newLow <= newHigh){
                        int newMid = newLow + (newHigh -newLow)/2;
                        if(nums[newMid] == target){
                            if(newMid == 0 ||  target > nums[newMid-1]){
                                result[0] = newMid;
                                break;
                            }else{
                                newHigh = newMid -1;
                            }
                        }else if(target < nums[newMid]){
                            newHigh = newMid -1;
                        }else{
                            newLow = newMid +1;
                        }
                    }
                }
                if(mid == nums.length-1 || nums[mid+1]>target){
                    result[1] = mid;
                }else{
                    //找最大值  [mid+1, high]
                    int newLow = mid+1;
                    int newHigh = high;
                    while (newLow <= newHigh){
                        int newMid = newLow + (newHigh -newLow)/2;
                        if(nums[newMid] == target){
                            if(newMid == nums.length-1 || target < nums[newMid+1]){
                                result[1] = newMid;
                                break;
                            }else{
                                newLow = newMid +1;
                            }
                        }else if(target < nums[newMid]){
                            newHigh = newMid -1;
                        }else{
                            newLow = newMid +1;
                        }
                    }
                }
            }
            if(target < nums[mid]){
                high = mid -1;
            }
            if(target > nums[mid]){
                low = mid + 1;
            }

        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
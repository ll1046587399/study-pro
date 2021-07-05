####  方法：二分查找
二分查找是一种基于比较目标值和数组中间元素的教科书式算法。
- 如果目标值等于中间元素，则找到目标值。
- 如果目标值较小，继续在左侧搜索。
- 如果目标值较大，则继续在右侧搜索。

![在这里插入图片描述](https://pic.leetcode-cn.com/7a4ab726d42b162fd14b3d09fa979e47c95322ba53584e0646309c3b2fa9bdf1-file_1578027100655)


**算法：**
- 初始化指针 `left = 0`, `right = n - 1`。
- 当 `left <= right`：
	- 比较中间元素 `nums[pivot]` 和目标值 `target` 。
		- 如果 `target = nums[pivot]`，返回 `pivot`。
		- 如果 `target < nums[pivot]`，则在左侧继续搜索 `right = pivot - 1`。
		- 如果 `target > nums[pivot]`，则在右侧继续搜索 `left = pivot + 1`。

![在这里插入图片描述](https://pic.leetcode-cn.com/8ce178fcc07617d6448a086593c0bacc0d126d922a9a96f5c0b7995f1a16547a-file_1578027100677)


![在这里插入图片描述](https://pic.leetcode-cn.com/e4e6a6becfb7a40e32f13ff17948abe9fdbcf26be7a2932950d5f6b0ffdd8afb-file_1578027100686)


```python [solution1-Python]
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        while left <= right:
            pivot = left + (right - left) // 2
            if nums[pivot] == target:
                return pivot
            if target < nums[pivot]:
                right = pivot - 1
            else:
                left = pivot + 1
        return -1
```

```java [solution1-Java]
class Solution {
  public int search(int[] nums, int target) {
    int pivot, left = 0, right = nums.length - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target) return pivot;
      if (target < nums[pivot]) right = pivot - 1;
      else left = pivot + 1;
    }
    return -1;
  }
}
```

```c++ [solution1-C++]
class Solution {
  public:
  int search(vector<int>& nums, int target) {
    int pivot, left = 0, right = nums.size() - 1;
    while (left <= right) {
      pivot = left + (right - left) / 2;
      if (nums[pivot] == target) return pivot;
      if (target < nums[pivot]) right = pivot - 1;
      else left = pivot + 1;
    }
    return -1;
  }
};
```

**复杂度分析**

* 时间复杂度：![\mathcal{O}(\logN) ](./p__mathcal{O}_log_N__.png) 。
* 空间复杂度：![\mathcal{O}(1) ](./p__mathcal{O}_1__.png) 。
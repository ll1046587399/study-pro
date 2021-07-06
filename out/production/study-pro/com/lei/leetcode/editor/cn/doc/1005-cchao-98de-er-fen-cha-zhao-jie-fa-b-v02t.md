![WX20210609-223700@2x.png](https://pic.leetcode-cn.com/1623249448-JGHOxY-WX20210609-223700@2x.png)


### 解题思路
二分法
1. 左右边界l,r, 中间点m
2. 找到中间点
   - 如果为空，则往右走，如果找不到，则返回错误
   - 如果中点大于s，则r=m-1
   - 如果中点小于s，则l=m+1
   - 如果中点相等，则返回

### 代码

```cpp
class Solution {
public:
    int findString(vector<string>& words, string s) {
        // 考虑为空的边缘情况
        if (words.empty())
        {
            return -1;
        }

        int n = words.size();
        int l = 0;
        int r = n - 1;
        while (l <= r)
        {
            int m = (l+r) >> 1;
            // 很坑的地方，需要特别小心
            int tempM = m;
            // cout << "before " << l << " ~ " << r << " " << m << endl;
            // 找到第一个右侧的非控制
            while (m <= r && words[m] == "")
            {
                ++m;
            }

            // 发现已经超过r的范围都找不到，那么收缩r的范围
            if (m > r)
            {
                // 需要按照原来m再减1
                r = tempM - 1;
                continue;
            }

            if (words[m] == s)
            {
                return m;
            }
            else if (words[m] < s)
            {
                l = m + 1;
            }
            else
            {
                r = m - 1;
            }
            // cout << l << " ~ " << r << " " << m << endl;
        }

        return -1;
    }
};
```
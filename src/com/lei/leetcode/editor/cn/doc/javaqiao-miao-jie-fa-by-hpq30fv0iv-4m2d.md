### 解题思路
用int数组来保存26个字符，模拟哈希表。

### 代码

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())   //长度不相同，直接返回false 
            return false;
        int[] v = new int[26];  //模拟哈希表
        for(char c : s.toCharArray())   //存储s字符串的每个字符
            v[c - 'a']++;
        for (char c : t.toCharArray())  //遍历t字符串
            if (--v[c - 'a'] < 0)   //如果小于0，代表两个字符串不相等，直接返回false 
                return false;
        return true;
    }
}

```
### 复杂度分析
- 时间复杂度：O(n)
- 空间复杂度：O(1)
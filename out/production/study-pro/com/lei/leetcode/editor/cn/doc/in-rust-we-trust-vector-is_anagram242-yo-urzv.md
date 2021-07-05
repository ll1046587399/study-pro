### 解题思路
使用array[26] 记录字符（a-z）的数量。

### 代码

```rust

impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        let mut map = vec![0;26];
        for c in s.chars() {
            let n = (c as u8 - 'a' as u8) as usize;
            map[n] += 1;
        }
        for c in t.chars() {
            let n = (c as u8 - 'a' as u8) as usize;
            if map[n] <= 0 {
                return false;
            } 
            map[n] -= 1;
        }
        for i in 0..26  {
            if map[i] != 0 {
                return false;
            }
        }
        true
    }
}
```
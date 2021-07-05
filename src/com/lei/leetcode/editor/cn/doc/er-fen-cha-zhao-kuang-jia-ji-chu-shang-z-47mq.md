### 解题思路
if(words[m].equals("")&&!words[l].equals(s)){
    l++;
    continue;
}else if(words[l].equals(s)){
    return l;

### 代码

```java
class Solution {
    public int findString(String[] words, String s) {
        int l=0,r=words.length;
        while(l<r){
            int m=l+(r-l)/2;
            if(words[m].equals("")&&!words[l].equals(s)){
                l++;
                continue;
            }else if(words[l].equals(s)){
                return l;
            }
            if(words[m].equals(s)){
                return m;
            }else if(words[m].compareTo(s)<0){
                l=m+1;
            }else if(words[m].compareTo(s)>0){
                r=m;
            }
        }
        return -1;
    }
}
```
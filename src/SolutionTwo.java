import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/16 10:06
 * @Version 1.0
 */

public class SolutionTwo {
    int[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        int n= s.length();
        memo = new int[n];
        // -1未使用,0 false，1 true
        Arrays.fill(memo,-1);
        return dp(s,0,wordDict);
    }

    // 定义S[i..]能否由wordDict组成
    public boolean dp(String s,int i,List<String> wordDict){
        // base
        if(i==s.length()){
            return true;
        }
        // 消除重复
        if(memo[i]!=-1){
            return memo[i]==1?true:false;
        }
        // 进行遍历
        // 尝试将wordDict中的word加入到其中去
        for(String word:wordDict){
            int wordL = word.length();
            // 长度超过了
            if(i+wordL>s.length()){
                continue;
            }
            // 是否相等
            String subStr = s.substring(i,i+wordL);
            if(!subStr.equals(word)){
                continue;
            }
            // 相等 进行下一步判断S[i+wordL,....]是否能够由wordDict组成
            if(dp(s,i+wordL,wordDict)){
                // 能够组成
                memo[i] = 1;
                return true;
            }
        }
        // 尝试失败
        memo[i]= 0;
        return false;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        SolutionTwo b = new SolutionTwo();
        b.wordBreak(s,wordDict);
    }
}

/**
 * @Author: shanzhihua
 * @Date: 2022/7/6 16:47
 * @Version 1.0
 */

public class Solution {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        // 记录面积
        int res = 0;
        while(left<right){
            int area = Math.min(height[left],height[right])*(right-left);
            res = Math.max(res,area);
            // 双指针 记录面积
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // 盛最多的水的容器
        int[] b = new int[]{1,8,6,2,5,4,8,3,7};
        Solution a = new Solution();
        System.out.println(a.maxArea(b));
    }
}

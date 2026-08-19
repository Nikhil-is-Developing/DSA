class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxw=0;
        while(left<right){
            int width=right-left;
            int ht=Math.min(height[left],height[right]);
            int currentw=width*ht;
            maxw=Math.max(maxw,currentw);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxw;
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        if(n==0){
            return;
        }
        rev(nums,0,k-1);
        rev(nums,k-1,n);
        rev(nums,0,n-1);
    }
    public void rev(int [] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right --;
        }
        
    }
}
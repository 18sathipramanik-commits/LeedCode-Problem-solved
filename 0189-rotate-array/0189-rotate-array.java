class Solution {
     static void rotated(int[] nums ,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
     } 
    public void rotate(int[] nums, int k) {
        int left=0;
        int right=nums.length;
         k=k %nums.length;
        rotated(nums ,left,right-1);
        rotated(nums,left,k-1);
        rotated(nums,k,right-1);
    }
}
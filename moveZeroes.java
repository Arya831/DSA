class Solution {
    public void  moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        for(int j=index;j<nums.length;j++){
            nums[j]=0;
        }
        
    }
    public static void main(String[]args){
        Solution s=new Solution();
        int nums[]={0,1,0,3,12};
        s.moveZeroes(nums);
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++)
        for(int j=i+1;j<nums.length;j++){
            int result=nums[i]+nums[j];
            if(result == target ){
            System.out.println("sum is "+ result);
            return new int []{i,j};  

            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[])  {
        Solution sol=new Solution();
    int nums[]={1,2,3,4,5,6};
    int target=7;
     int[] result=sol.twoSum(nums,target);
     System.out.println("indices are"+result[0]+" "+result[1]);
    }
}      
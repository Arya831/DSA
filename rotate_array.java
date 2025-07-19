class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       int[]result=new int[n];
       k=k%n;
     
       for(int i=0;i<n;i++){
       int newposition=(i+k)%n;
       result[newposition]=nums[i];


       } 
       for(int i=0;i<n;i++){
        nums[i]=result[i];
       }
        
    }
    public static void main(String []args){
        Solution s=new Solution();
        int[]nums={1,2,3,4,5,6,7};
        int k=3;
        s.rotate(nums,k);
        for(int i=0;i<nums.length;i++){
            System.out.println("result "+nums[i]);
        }
    }
}
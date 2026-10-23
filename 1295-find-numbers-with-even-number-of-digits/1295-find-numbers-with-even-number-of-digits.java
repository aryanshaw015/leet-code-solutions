class Solution {
    public int findNumbers(int[] nums) {
        int count=0;int c=0;int a=0;
        for(int i=0;i<nums.length;i++){
            a=nums[i];
            while(a>0){
                c++;
                a=a/10;
            }
            if(c%2==0){
                count++;
            }
            c=0;
        }
        return count;
    }
}
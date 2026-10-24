class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        outerLoop:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    arr[0]=i;arr[1]=j;
                    break outerLoop;
                }
            }
        }
        return arr;
    }
}
//second approach(without using break statement)
/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
*/
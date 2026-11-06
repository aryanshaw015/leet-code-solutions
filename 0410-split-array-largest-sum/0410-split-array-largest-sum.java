class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0; //start is the minimum value a subarray can contain(when m=nums.length then sum of each subarray will be euqal to its element so the larget leemnt will serve as the maximum of all the subarrays)
        int end=0; //end is the maximum value a subarray can contain (when m=1; then sum of all elements in the subarray(s) i.e. one subarray will be maximum)
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            //calculate the pieces in which we can divide the array with this max sum as mid element
            int pieces=1; //every array has 1 pieces always
            int sum=0;
            for(int num:nums){
                if(sum+num>mid){
                    //you cannot add this in this subarray, make new one
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;}
            else
                end=mid;


        }
        return end; //here start=end
    }
}
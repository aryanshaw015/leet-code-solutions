class Solution {
    public int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        if(pivot==-1){ //if pivot is not found that means is not a rotated soorted array
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
        }
        //when nums[pivot] itself is the target
        if(nums[pivot]==target){
            return pivot;
        }
        //if target is bigger than the starting element then it must lie in first half(ascending) of array
        if(target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        //if target is smaller than the starting element then it must lie the second half(ascending) of the array
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }



    int binarysearch(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }




    int findpivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //it comprises of 4 cases
            int mid=start+(end-start)/2;
            //case 1
            if(mid<end && arr[mid]>arr[mid+1]) //here we have added and as it may happen that the last element of the array is the mid element at that time this wil throw an exception as mid+1 doesnt exist so to prevent that we have provided an extra constraint
                return mid;
            //case 2
            else if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            //case 3
            else if(arr[mid] <= arr[start])
                end=mid-1; //we are doing mid-1 as if it would have been mid elemnt then it would have come in first two cases
            //case 4
            else
                start=mid+1;//we are doing mid+1 as if it would have been mid elemnt then it would have come in first two cases
            }
        return -1;
    }
}
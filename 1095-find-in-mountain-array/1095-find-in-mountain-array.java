/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
//this question is not compelted it is just done by gemini i odnt know the api oops thing
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // Step 1: Find the peak index
        int peak = findPeakIndex(mountainArr);

        // Step 2: Search in the ascending part (0 to peak)
        int firstHalf = binarySearch(mountainArr, target, 0, peak, true);
        if (firstHalf != -1) {
            return firstHalf;
        }

        // Step 3: Search in the descending part (peak + 1 to length - 1)
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    private int findPeakIndex(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int binarySearch(MountainArray arr, int target, int start, int end, boolean isAscending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid); // Cached to minimize API calls

            if (midVal == target) {
                return mid;
            }

            if (isAscending) {
                if (target > midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < midVal) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
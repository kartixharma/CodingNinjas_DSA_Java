public class Solution {
    public static int search(int []nums, int target) {
        return bin(nums, target, 0, nums.length);
    }
    public static int bin(int[] nums, int target, int si, int ei){
        if(si==ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(target<nums[mid]){
            return bin(nums, target, si, mid);
        }
        if(target==nums[mid]){
            return mid;
        }
            return bin(nums, target, mid+1, nums.length);
    }
}
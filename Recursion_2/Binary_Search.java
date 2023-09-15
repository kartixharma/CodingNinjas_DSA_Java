public class solution {
    public static int binarySearch(int []nums, int target) {
        return bin(nums, target, 0, nums.length-1);
    }
    public static int bin(int[] nums, int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid=(ei+si)/2;
        if(target<nums[mid]){
            return bin(nums, target, si, mid-1);
        }
        if(target==nums[mid]){
            return mid;
        }
            return bin(nums, target, mid+1, ei);
    }
}
package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = { -1, 0, 5 };
        int ans = solution.search(nums, -1);
        System.out.println(ans);
    }

}

class Solution {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        for (int i = startIndex; i <= endIndex;) {
            int binaryIndex = (startIndex + endIndex) / 2;
            if (nums[binaryIndex] == target) {
                return binaryIndex;
            }
            if (nums[binaryIndex] > target) {
                endIndex = binaryIndex - 1;
            }
            if (nums[binaryIndex] < target) {
                startIndex = binaryIndex + 1;
                i++;
            }
        }
        return -1;
    }
}
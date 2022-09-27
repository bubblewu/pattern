package com.bubble.pattern;

/**
 * @author wu gang
 * date: 2022-06-13 22:29
 **/
public class TestMain {

    public static void main(String[] args) {
//        System.out.println(cal(2, 0));
//        System.out.println(cal(2, 1));
//        System.out.println(cal(2, 2));
//        System.out.println(cal(2, 3));

        // 二分查找
        // N个元素的有序（升序）整数数组，找目标target
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(find(nums, target));
        System.out.println(find(nums, 8));

        System.out.println("------");

        int[] nums2 = new int[] {1, 3, 5, 6};
        System.out.println(searchInsert(nums2, 0));
        System.out.println(searchInsert(nums2, 7));
        System.out.println(searchInsert(nums2, 5));
        System.out.println(searchInsert(nums2, 2));
        System.out.println(searchInsert(new int[] {1, 3}, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        // 边界处理
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int size = nums.length - 1;
        if (target < nums[0]) {
            return 0;
        }
        if (target > nums[size]) {
            return size + 1;
        }

        // 要求时间复杂度为O(logN)，可使用二分查找法实现
        int left = 0, right = size;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cur = nums[mid];
            if (cur == target) {
                return mid;
            } else if (cur < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    /**
     * 二分查找：N个元素的有序（升序）整数数组，找目标target
     *
     * @param nums   升序数组
     * @param target 目标值
     * @return 位置
     */
    public static int find(int[] nums, int target) {
        // 边界检查
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

//        // 时间复杂度为：O(n)
//        for (int i = 0; i < nums.length; i++) {
//            if (target == nums[i]) {
//                return i;
//            }
//        }

        // 二分查找，时间复杂度 O(logN)
        int left = 0, right = nums.length - 1;
        while (left <= right) {
//            int mid = left + ((right - left) >> 1);
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
    }


    public static int cal(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int t = cal(x, n / 2);
        if (n % 2 == 1) {
            return t * t * x;
        }
        return t * t;
    }

}

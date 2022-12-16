package examination.other;

import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        Main10 main10 = new Main10();
        System.out.println(main10.sum(19));
    }

    public int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int i = n % 10;
        n = n / 10;
        return i * i + sum(n);
    }
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return isCommonElementMap(sMap, tMap);
    }

    public boolean isCommonElementMap(Map<Character, Integer> m1, Map<Character, Integer> m2) {
        Set<Character> keySet = m1.keySet();
        for (Character key : keySet) {
            if (!(m1.get(key).equals(m2.get(key)))) {
                return false;
            }
        }
        Set<Character> keySet2 = m2.keySet();
        for (Character key2 : keySet2) {
            if (!(m2.get(key2).equals(m1.get(key2)))) {
                return false;
            }
        }
        return true;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int minLen = Integer.MAX_VALUE;
        // 前缀和
        int[] sumArray = new int[len + 1];
        for (int i = 1; i <= len; i++) {
            sumArray[i] = sumArray[i - 1] + nums[i - 1];
        }
        for (int i = 0; i < len; i++) {
            int q = i;
            while (q < len) {
                if (sumArray[q + 1] - sumArray[i] >= target) {
                    if (q - i + 1 < minLen) {
                        minLen = q - i + 1;
                    }
                    break;
                } else {
                    ++q;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> allSumList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int pLeft = 0, pRight = nums.length;
                while (pLeft < pRight) {
                    int sum = nums[i] + nums[j] + nums[pLeft] + nums[pRight];
                    if (sum == target) {
                        List<Integer> sumList = new ArrayList<>();
                        sumList.add(nums[i]);
                        sumList.add(nums[j]);
                        sumList.add(nums[pLeft]);
                        sumList.add(nums[pRight]);
                        allSumList.add(sumList);
                        while (pLeft < pRight && nums[pLeft] == nums[pRight]) {
                            ++pLeft;
                        }
                        ++pLeft;
                        while (pLeft < pRight && nums[pRight] == nums[pRight - 1]) {
                            --pRight;
                        }
                        --pRight;
                    }
                    if (sum > target) {
                        --pRight;
                    }
                    if (sum < target) {
                        ++pLeft;
                    }
                }
            }
        }
        return allSumList;
    }
}

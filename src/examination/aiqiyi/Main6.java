package examination.aiqiyi;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String s = input.substring(1, input.length() - 1);
        String[] split = s.split(",");
        Integer[] result = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(String.valueOf(split[i]));
        }
        Integer[] output = avoidFlood(result);
        List<Integer> objects = Arrays.asList(output);
        System.out.println(objects);

    }

    public static Integer[] avoidFlood(Integer[] rains) {
        int[] cnt = new int[rains.length];
        int index = 0;
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] == 0) {
                cnt[index++] = i;
            }
        }
        Integer[] output = new Integer[rains.length];
        int curIndex = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] != 0) {
                output[i] = -1;
                if (map.containsKey(rains[i]) && map.get(rains[i]) < i) {
                    int small = map.get(rains[i]);
                    int j = curIndex;
                    while (j < index) {
                        if (cnt[j] > small) {
                            break;
                        }
                        j++;
                    }
                    if (j >= index) {
                        return new Integer[0];
                    }
                    if (cnt[j] > i) {
                        return new Integer[0];
                    }
                    output[cnt[j]] = rains[i];
                    cnt[j] = -1;
                    if (j == curIndex) {
                        while (curIndex < index && cnt[curIndex] == -1) {
                            curIndex++;
                        }
                    }
                }
                map.put(rains[i], i);
            }
        }
        for (int i = 0; i < index; i++) {
            if (cnt[i] != -1) {
                output[cnt[i]] = 1;
            }
        }
        return output;
    }
}

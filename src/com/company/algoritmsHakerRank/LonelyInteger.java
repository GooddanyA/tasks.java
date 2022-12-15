package com.company.algoritmsHakerRank;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class LonelyInteger {
    //поиск элемента в списке, который не дублируется
    public static int lonelyinteger(List<Integer> arr) {
        int count = 0;
        boolean check;

        for (int i = 0; i < arr.size(); i++) {
            check = true;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != null && arr.get(i).equals(arr.get(j))) {
                    arr.remove(j);
                    check = false;
                    break;
                }
            }
            if (check) {
                count = arr.get(i);
                break;
            }
        }
        return count;
    }
 /
    public static SortedMap<String, Integer> wordCount(String[] strings) {
        TreeMap<String, Integer> tm = new TreeMap();
        for (String str : strings) {
            if (tm.containsKey(str)) {
                tm.put(str, tm.get(str) + 1);
            } else {
                tm.put(str, 1);
            }
        }

        return tm;
    }

}

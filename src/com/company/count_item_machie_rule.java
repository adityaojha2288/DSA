package com.company;

import java.util.List;
import java.util.Objects;

public class count_item_machie_rule {
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int i = 0;
        if (Objects.equals(ruleKey, "type")) {
            i = 0;
        }
        if (Objects.equals(ruleKey, "color")) {
            i = 1;
        }
        if (Objects.equals(ruleKey, "name")) {
            i = 2;
        }
        for (List<String> item : items) {

            if (Objects.equals(item.get(i), ruleValue)) {
                count++;
            }
        }
        return count;
    }
}

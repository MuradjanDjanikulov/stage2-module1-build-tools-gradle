package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean isAllPositive = false;
        for (String e : args) {
            if (!StringUtils.isPositiveNumber(e)) {
                return isAllPositive;
            }
        }
        isAllPositive = true;
        return isAllPositive;
    }
}
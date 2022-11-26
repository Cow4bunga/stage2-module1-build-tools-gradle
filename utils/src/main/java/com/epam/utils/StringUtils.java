package com.epam.utils;

import static org.apache.commons.lang3.math.NumberUtils.isCreatable;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || !isCreatable(str))
            return false;
        return Integer.parseInt(str) > 0;
    }
}

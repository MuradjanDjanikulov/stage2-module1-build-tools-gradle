package com.epam.demo;

import com.epam.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    void isAllPositiveNumbers() {
        assertTrue(StringUtils.isPositiveNumber("10"));
        assertTrue(StringUtils.isPositiveNumber("3.14"));
        assertFalse(StringUtils.isPositiveNumber("-5"));
        assertFalse(StringUtils.isPositiveNumber("abc"));
        assertFalse(StringUtils.isPositiveNumber(""));
        assertFalse(StringUtils.isPositiveNumber(null));
    }
}
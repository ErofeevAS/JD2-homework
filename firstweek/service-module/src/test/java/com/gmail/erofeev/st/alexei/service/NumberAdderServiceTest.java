package com.gmail.erofeev.st.alexei.service;

import com.gmail.erofeev.st.alexei.service.impl.NumberAdderServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class NumberAdderServiceTest {

    @Test
    public void shouldReturnZeroForEmptyString() {
        NumberAdderService numberAdderService = NumberAdderServiceImpl.getInstance();
        int result = numberAdderService.add("");
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldReturnSameNumberForSingleArgument() {
        final int EXPECTED_RESULT = 112312;
        final String INPUT_DATA = "112312";
        NumberAdderService numberAdderService = NumberAdderServiceImpl.getInstance();
        int result = numberAdderService.add(INPUT_DATA);
        Assert.assertEquals(EXPECTED_RESULT, result);
    }

    @Test
    public void shouldReturnTheSumForDoubleArgumentWithCommaSeparator() {
        final int EXPECTED_RESULT = 3;
        final String SEPARATOR = ",";
        final String INPUT_DATA = "1" + SEPARATOR + "2";
        NumberAdderService numberAdderService = NumberAdderServiceImpl.getInstance();
        int result = numberAdderService.add(INPUT_DATA);
        Assert.assertEquals(EXPECTED_RESULT, result);
    }
    @Test
    public void shouldReturnTheSumForDoubleArgumentWithSemicolonSeparator() {
        final int EXPECTED_RESULT = 3;
        final String SEPARATOR = ";";
        final String INPUT_DATA = "1" + SEPARATOR + "2";
        NumberAdderService numberAdderService = NumberAdderServiceImpl.getInstance();
        int result = numberAdderService.add(INPUT_DATA);
        Assert.assertEquals(EXPECTED_RESULT, result);
    }
    @Test
    public void shouldReturnTheSumForDoubleArgumentWithVerticalSlashSeparator() {
        final int EXPECTED_RESULT = 3;
        final String SEPARATOR = "|";
        final String INPUT_DATA = "1" + SEPARATOR + "2";
        NumberAdderService numberAdderService = NumberAdderServiceImpl.getInstance();
        int result = numberAdderService.add(INPUT_DATA);
        Assert.assertEquals(EXPECTED_RESULT, result);
    }
    @Test
    public void shouldReturnTheSumForDoubleArgumentWithLineFeedSeparator() {
        final int EXPECTED_RESULT = 3;
        final String SEPARATOR = "\n";
        final String INPUT_DATA = "1" + SEPARATOR + "2";
        NumberAdderService numberAdderService = NumberAdderServiceImpl.getInstance();
        int result = numberAdderService.add(INPUT_DATA);
        Assert.assertEquals(EXPECTED_RESULT, result);
    }
}

package com.gmail.erofeev.st.alexei.service.impl;

import com.gmail.erofeev.st.alexei.service.NumberAdderService;
import com.gmail.erofeev.st.alexei.service.exception.DataNotValidException;
import com.gmail.erofeev.st.alexei.service.exception.WrongNumberOfArgumentsException;

public class NumberAdderServiceImpl implements NumberAdderService {
    private static NumberAdderService instance;
    private final static int AMOUNT_OF_ARGUMENTS = 2;
    private final static String regex = "[,;|\n]";

    private NumberAdderServiceImpl() {

    }

    public static NumberAdderService getInstance() {
        if (instance == null) {
            instance = new NumberAdderServiceImpl();
        }
        return instance;
    }

    @Override
    public int add(String line) {
        if (line.isEmpty()) {
            return 0;
        } else {
            int sum;
            int firstNumber;
            int secondNumber;
            int[] validData = validate(line);
            firstNumber = validData[0];
            secondNumber = validData[1];
            sum = firstNumber + secondNumber;
            return sum;
        }
    }

    private int[] validate(String line) {
        String[] numbers = line.split(regex);
        int[] validData;
        if (!(numbers.length >= 1 && numbers.length <= AMOUNT_OF_ARGUMENTS)) {
            throw new WrongNumberOfArgumentsException("Number of arguments: " + numbers.length);
        }
        try {
            int firstNumber;
            int secondNumber;
            firstNumber = Integer.parseInt(numbers[0]);
            if (numbers.length == 1) {
                secondNumber = 0;
            } else {
                secondNumber = Integer.parseInt(numbers[1]);
            }
            validData = new int[]{firstNumber, secondNumber};
        } catch (NumberFormatException e) {
            throw new DataNotValidException(" Data must be number: " + e, e);
        }
        return validData;
    }
}

package com.gmail.erofeev.st.alexei.service.impl;

import com.gmail.erofeev.st.alexei.service.NumberAdderService;

public class NumberAdderServiceImpl implements NumberAdderService {
    private static NumberAdderService instance;

    private NumberAdderServiceImpl() {

    }

    public static NumberAdderService getInstance() {
        if (instance == null) {
            instance = new NumberAdderServiceImpl();
        }
        return instance;
    }

    @Override
    public int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else {
            int sum;
            String regex = ",|;|\\||\n";
            String[] numbers = s.split(regex);
            if(numbers.length>1) {
                sum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
                return sum;
            }
            else{
                return Integer.parseInt(numbers[0]);
            }

        }

    }
}

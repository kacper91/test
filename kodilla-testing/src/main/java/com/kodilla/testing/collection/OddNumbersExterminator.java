package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public int exterminate(ArrayList<Integer> numbers) {
        List<Integer> exterminateList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                exterminateList.add(numbers.get(i));

            }
        }
        return exterminateList.size();

    }
}





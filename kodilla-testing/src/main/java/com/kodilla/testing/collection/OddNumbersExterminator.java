package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    public static void main(String[] args) {

            ArrayList<Integer> numbers = new ArrayList<>();

            Random randomGenerator = new Random();
            for (int i = 0; i < 20; i++) {
                numbers.add(randomGenerator.nextInt(50));
//                System.out.println(numbers.get(i));
            }
            System.out.println("Elements in numbers list: " + numbers.size());

        OddNumbersExterminator tester = new OddNumbersExterminator(); //stworzenie obiektu tester
        tester.exterminate(numbers); //wywolanie metody exterminate
        }

        public int exterminate(ArrayList<Integer> numbers){
        List<Integer> exterminateList = new ArrayList<Integer>();
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0) {
                exterminateList.add(numbers.get(i));

            }
        } return exterminateList.size();

         }
    }

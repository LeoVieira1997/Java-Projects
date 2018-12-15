package com.leonardovieira;

public class Main {

    public static void main(String[] args) {
        int number = 3;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;
        while((number <= finishNumber) && (count < 5)){
            if (!isEvenNumber(number)){
//                System.out.println(number + " isn't even");
                number++;
                continue;
            }
            System.out.println(number + " is even");
            sum += number;
            number++;
            count++;
        }
        System.out.println(sum);

    }

    public static boolean isEvenNumber(int number){
        if ((number % 2) == 0){
            return true;
        }
        return false;
    }

}

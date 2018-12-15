package com.leonardovieira;

public class SumThreeAndFiveChallenge {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1, j = 0; i <= 650; i++){
            if ((i % 3 == 0) && (i % 5 == 0) && (j < 5)){
                j++;
                System.out.println("The number " + i + " can be divided both by 3 and 5");
                sum += i;
            } else if (j == 5){
                break;
            }
        }
        System.out.println("The sum of the five numbers is " + sum);
    }

}

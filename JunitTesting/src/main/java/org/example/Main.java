package org.example;

import java.util.Scanner;

public class Main {

    public static int Add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        numbers = numbers.replace("\n", ",");

        String[] numArray = numbers.split(",");

        boolean negativeNumbers = false;

        int sum = 0;

        for (String numStr : numArray) {

            int number = Integer.parseInt(numStr.trim());

            if (number < 0) {
                negativeNumbers = true;
            } else if (number <= 1000) {
                sum += number;
            }
        }

        if (negativeNumbers) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String line;
        while (!(line = sc.nextLine()).isEmpty()) {
            str.append(line).append("\n");
        }
        String a = str.toString().trim();
        try {
            System.out.print(Add(a));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

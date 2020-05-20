package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();//retrieving how many elements
        scanner.nextLine();

         int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);//
        System.out.println("min =" + returnedMin);

        }
        public static int[] readIntegers (int count) {
            int[] array = new int [count]; //every space is 0
            for (int i = 0; i < array.length; i++) {
                System.out.println("Enter a number: ");
                int number = scanner.nextInt(); // storing int from the console in the variable number
                scanner.nextLine(); // we can input more numbers
                array[i] = number;//records numbers which were entered

            }
            return array;
        }

        private static int findMin(int[] array) {
            int min = Integer.MAX_VALUE;//int needs to be less or equal to max integer value

            for (int i = 0; i < array.length; i++) {
                int value = array[i];//retrieve value from position i
                if(value < min) {//comparing elements with int value of int
                    min = value;

                }
            }
            return min;

        }
    }


package com.company;

public class Main {

    public static void main(String[] args) {
/*
    1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
    b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
*/
        int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100};
        System.out.println(ages[0] - ages[ages.length - 1]); //before adding 100, answer was -90

//  c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        int sum = 0;
            for (double age : ages) {
                sum += age;
            }

            int averageAge = sum / ages.length;
            System.out.println(averageAge);

/* =============================================================================================================================//

    2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
    a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
    b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
*/
        String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
            int[] lengths = new int[names.length]; //new array, same size of names array

            for(int index = 0; index < names.length; index++) {
                String name = names[index]; //index of 5
                lengths[index] = name.length(); //method
            }

            int totalLength = 0; // lengths will be added onto totalLength

            for (int length : lengths) {
                totalLength += length;
        }
            double average = totalLength / lengths.length;
            System.out.println("total length= " + totalLength + ", average length= " + average);

            String allNames = ""; //empty string

            for (String name : names) {
                allNames += name + " "; //iterate through all the names, concatenated together stored in allNames, separated by spaces
            }
            System.out.println(allNames);

// ===========================================================================================================================================//

    //5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        int [] nameLengths = new int[names.length];

            for (int index = 0; index < names.length; index++) {
                String name = names [index];
                nameLengths[index] = names.length;
                System.out.println(name + ", " + lengths[index]);
            }
// ===========================================================================================================================================//

    //6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        int sumNameLengths = 0;
            for (String name : names) {
                sumNameLengths += name.length();
            }
            System.out.println(sumNameLengths); //23

// ===========================================================================================================================================//

    //7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
        String words = concatenateWords ("Hiya", 5);
                System.out.println(words);

// ===========================================================================================================================================//

    //8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

        String concat = concatenateWords("Andrew", "Liam");
            System.out.println(concat);

// ===========================================================================================================================================//

    //9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        int[] numbers = {6,7,8,9};
            System.out.println(greaterThan100(numbers));

// ===========================================================================================================================================//

    //10.	Write a method that takes an array of double and returns the average of all the elements in the array.
        double[] elements = {5, 11, 12, 13};
            System.out.println(averageArray(elements));

// ===========================================================================================================================================//

    //11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        double[] firstArray = {1.0, 5.0, 6.5, 7.3};
        double[] secondArray = {23.0, 15.0};

        boolean greaterArray = avgTwoArrays (firstArray, secondArray);
        System.out.println(greaterArray);

// ===========================================================================================================================================//

    //12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        boolean isHotOutside = true;
        double moneyInPocket = 20.00;

        boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println(buyDrink);

// ===========================================================================================================================================//

    //13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
            //This method will decide if I should continue to study.

        boolean isTired = false;
        boolean completedHw = true;
        double timeStudy = 15.00;

        boolean continueLearning = continuedlearning(isTired, timeStudy, completedHw);
        System.out.println(continueLearning);

    }

    //-------------------------------------------------------------------------------------------------------------------------------//
    //7.
            private static String concatenateWords(String word, int numberOfTimes) {
                String words = ""; //collector, empty string

                while(numberOfTimes > 0) {
                    words += word; //concatenate words onto word
                    numberOfTimes -= 1; //terminate the loop body
                }
                return words;
            }

    //8. =============================================================================================================================//
            private static String concatenateWords(String first, String second) {
                return first + " " + second;
            }

    //9. =============================================================================================================================//
            private static boolean greaterThan100(int[] numbers) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                return sum > 100;
            }
    //10. =============================================================================================================================//
            private static int averageArray(double[] elements) {
                int sum = 0;
                for (double element : elements) {
                    sum += element;
                }
                return sum / elements.length;
            }
    //11. =============================================================================================================================//

            private static boolean avgTwoArrays(double[] firstArray, double[] secondArray) {
                double avg1 = average(firstArray);
                double avg2 = average(secondArray);

                return  avg1 < avg2;
            }

            private static double average(double[] firstArray) {
                double total = 0.0;

                for(int index = 0; index < firstArray.length; index++) {
                    total += firstArray[index];
                }
                return total / firstArray.length;
            }

    //12. =============================================================================================================================//
            private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
                return isHotOutside && moneyInPocket > 10.50;
            }

    //13. =============================================================================================================================//

            private static boolean continuedlearning(boolean isTired, double timeStudy, boolean completedHw) {
                return isTired || timeStudy > 10.00 && completedHw;
            }
}




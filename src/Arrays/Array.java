package Arrays;
// Arrays are used to store multiple values in a single variable
// To declare an array, define the variable type with square brackets [ ]
// String[] cars; variable that holds an array of strings.
// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// int[] myNum = {10, 20, 30, 40};

// new: You can also create an array by specifying its size with new.
// This makes an empty array with space for a fixed number of elements, which you can fill later:

// String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};
// same as
// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// you don't need new
// IF YOU WANT NEW

// String[] cars = new String[4];
// null, null, null, null

//for (type variable : arrayname) {
//        // code block to be executed
//}

public class Array {
    public static void main(String[] args) {
        String[] cars = new String[4]; // size is 4

        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";
        //  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int len = cars.length;
        System.out.println(len); // 4
        for (String car : cars) { // for-each Loop through cars
            // for each String in the cars array (here called car), print its value.
            // it only gives you the values, not their positions (indexes) in the array.
            System.out.println(car); // Volvo BMW ...
        }

        // If you need ONLY elements of array use for-each (only read )
        // If you need elements AND indexed use for
        // ("Seat number " + i + " is taken by " + seats[i]);

        int[] numbers = {1, 2, 3};

        for (int n : numbers) {
            n = n * 10; // This only changes the local variable 'n'
            // only changes pointer
            // In a for-each loop, the variable you declare is a copy of the element in the array.
            // If you want to actually overwrite numbers[0], you need the index (i), which for-each doesn't give you.
        }

        System.out.println(numbers[0]); // Still prints 1, not 10!
    }
}

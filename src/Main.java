public class Main {
    public static void main(String[] args) {
        // Integer array.
        int[] arr = {1, 56, 7, 28, 97, 12, 99};

        // Q1. Write a Java program to find the maximum and minimum value of an array.
        minMax(null);

        // Q2. Write a Java program to reverse an array of integer values.
        reverse(arr);

        // Q3. Write a Java program to remove a specific element from an array.
        removeElement(arr, 97);

        // Q4. Write a Java program to find the index of an array element.
        findIndex(arr, 12);

        // Q5. Write a Java program to test if an array contains a specific value.
        findElement(arr, 97);
    }

    /**
     * Finds the minimum and maximum value in an Array.
     *
     * @param arr Integer array.
     */
    public static void minMax(int[] arr) {
        // Checks if entered array is not null or not empty.
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Assuming the first element in the array as the minimum and maximum value.
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Checks for minimum value.
            if (arr[i] < min) {
                min = arr[i];
            }

            // Checks for maximum value.
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Prints the minimum and max values.
        System.out.println("Minimum Value = " + min);
        System.out.println("Maximum Value = " + max);
    }

    /**
     * Reverses an array of integer values.
     *
     * @param arr Integer array.
     */
    public static void reverse(int[] arr) {
        // Checks if entered array is not null or not empty.
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Stores elements of arr.
        StringBuilder stringBuilder = new StringBuilder();

        // Stores elements in reverse order.
        int[] reverse = new int[arr.length];

        // Stores elements of arr. in reverse order.
        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]).append("_");
        }

        // Creates a String array that stores the elements of arr. in reverse order.
        String[] reverseArrString = stringBuilder.toString().split("_");

        // Converts elements of reverseArrString from String to int and store it in reverse array.
        for (int i = 0; i < reverseArrString.length; i++) {
            reverse[i] = Integer.parseInt(reverseArrString[i]);
        }

        // Prints all the elements of reverse array.
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();
    }

    /**
     * Removes an element from an integer array.
     *
     * @param arr     Integer array.
     * @param element Element is removed from array.
     */
    public static void removeElement(int[] arr, int element) {
        // Checks if entered array is not null or not empty.
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Checks whether element is present in arr.
        boolean isElementPresent = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                isElementPresent = true;
                break;
            }
        }

        // Checks if element is not present in the array.
        if (!isElementPresent) {
            System.out.println(element + " is not present in array. Cannot remove element.");
            return;
        }

        // Stores all elements of arr. except element.
        StringBuilder stringBuilder = new StringBuilder();

        // StringBuilder contains all elements of arr. except the element that is to be removed.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                continue;
            }
            // Add elements to stringBuilder
            stringBuilder.append(arr[i]).append("_");
        }

        // Stores all elements of stringBuilder in a String array.
        String[] arrNoElement = stringBuilder.toString().split("_");

        // Stores left out elements in a new array.
        int[] newArr = new int[arr.length - 1];

        // Parsing elements in arrNoElement to Integer and storing it in newArr.
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = Integer.parseInt(arrNoElement[i]);
        }

        // Prints all the elements of newArr.
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Finds the index of element in the array.
     *
     * @param arr     Integer array.
     * @param element Index of this element is looked for.
     */
    public static void findIndex(int[] arr, int element) {
        // Checks if entered array is not null or not empty.
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Stores whether element is present in arr.
        boolean isElementPresent = false;

        // Finds the index of element in arr.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                isElementPresent = true;
                System.out.println(arr[i] + " is present at index " + i);
                break;
            }
        }

        // Checks if element was not present in arr.
        if (!isElementPresent) {
            System.out.println(element + " is not present in the array.");
        }
    }

    /**
     * Finds the element in the array.
     *
     * @param arr     Integer array.
     * @param element Element is looked out for.
     */
    public static void findElement(int[] arr, int element) {
        // Checks if entered array is not null or not empty.
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        // Stores whether element is present in arr.
        boolean isElementPresent = false;

        // Finds the element in arr.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                isElementPresent = true;
                System.out.println(arr[i] + " is present in the array");
                break;
            }
        }

        // Checks if element was not present in arr.
        if (!isElementPresent) {
            System.out.println(element + " is not present in the array.");
        }
    }
}
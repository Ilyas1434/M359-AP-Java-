package Unit7;

import java.util.ArrayList;

/**
 * In this java file we will explore these key algorithms with ArrayLists
 * Determine a minimum or maximum value
 * Compute a sum, average, or mode
 * Determine if at least one element has a particular property
 * Determine if all elements have a particular property
 * Access all consecutive pairs of elements
 * Determine the presence or absence of duplicate elements
 * Determine the number of elements meeting specific criteria
 * (already did this last lesson with evens)
 * Shift or rotate elements left or right
 * Reverse the order of the elements
 */
public class Notes_7_4_Examples {
    public static void main(String[] args) {

        // Define ArrayLists to be used for testing the methods
        ArrayList<Integer> numsNoRepeats = new ArrayList<>();
        numsNoRepeats.add(2);
        numsNoRepeats.add(5);
        numsNoRepeats.add(3);
        numsNoRepeats.add(8);
        numsNoRepeats.add(9);
        numsNoRepeats.add(1);


        ArrayList<Integer> numsRepeats = new ArrayList<>();
        numsRepeats.add(2);
        numsRepeats.add(5);
        numsRepeats.add(1);
        numsRepeats.add(2);
        numsRepeats.add(6);
        numsRepeats.add(8);


        ArrayList<Integer> orderedNums = new ArrayList<>();
        orderedNums.add(2);
        orderedNums.add(3);
        orderedNums.add(8);
        orderedNums.add(11);
        orderedNums.add(15);
        orderedNums.add(19);


        ArrayList<String> names = new ArrayList<>();
        names.add("Mya");
        names.add("John");
        names.add("Kim");
        names.add("Sanjana");
        names.add("Adi");
        names.add("Noah");

    }

    /**
     * Finds the smallest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMin(ArrayList<Integer> list) {
        int smallestValue = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < smallestValue) {
                smallestValue = list.get(i);
            }
        }
        return smallestValue;
    }

    /**
     * Finds the largest value in the ArrayList
     * @param list
     * @return returns its int value
     */
    public static int findMax(ArrayList<Integer> list) {
        int greatestValue = list.get(0);
        for(int i = 0; i > list.size(); i++) {
            if(list.get(i) < greatestValue) {
                greatestValue = list.get(i);
            }
        }
        return greatestValue;
    }

    /**
     * Finds the sum of all values in the ArrayList
     * @param list
     * @return returns the int value for the sum
     */
    public static int findSum(ArrayList<Integer> list) {
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    /**
     * Finds the average as a double of all Integer values
     * @param list
     * @return double average value
     */
    public static double findAverage(ArrayList<Integer> list) {
        double sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    /**
     * Determines if all values are in increasing order
     * @param list
     * @return true or false if increasing
     */
    public static boolean isIncreasing(ArrayList<Integer> list) {
        for(int i = 0; i < list.size() -1; i++) {
            if(!list.get(i) <= list.get(i+1)) {
                return false;
            }
        }
        return false;
    }

    /**
     * Checks if any values within the ArrayList are repeated anywhere else
     * in the ArrayList
     * @param list
     * @return true if any values are repeated, false otherwise
     */
    public static boolean hasDuplicates(ArrayList<String> list) {
        // use a nested for loop to compare each value to all the values after it.
        // Common mistake is returning too early
        
        }
        return false;


    /**
     * Creates a new ArrayList of Strings that is equal to the original ArrayList
     * in reverse order.  Original ArrayList is unchanged.
     * @param list
     * @return new ArrayList of Strings in reverse order
     */
    public static ArrayList<String> revArrayList(ArrayList<String> list) {
        ArrayList<String> ret = new ArrayList<String>();
        for(int i = list.size() - 1; i--)
    }

    /**
     * Shifts all values in list to the Left and the value at index 0 is moved
     * to index list.size() - 1.
     * @param list
     */
    public static void shiftLeft(ArrayList<String> list) {
            list.add(list.remove(0));
        }

    }


}

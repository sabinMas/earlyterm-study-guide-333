import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int maxNumber = nums[0];
        int minNumber = nums[0];
        for(int num : nums){
            //find min and max and then subtract min from max
            if (num > maxNumber){
                maxNumber = num;
            } else if(num < minNumber){
                minNumber = num;
            }
                 
        }
        return maxNumber - minNumber;
    }
    // TODO: Implement the other methods from the README AND tests for each one
    public static String longestWord(ArrayList<String> words, char firstLetter){
        String longest = ""; 
        for(String word : words){
            if(word.charAt(0) == firstLetter && word.length() > longest.length()){
                longest = word;
            }
            
        } 
        return longest;      
    }

    public static int lessThanLongerThan(HashMap<String, String> words, int n, int m){
       int counter = 0;

        for(String word : words.values()){
            if(word.length() > n && word.length() < m){
                counter++;
            }
        }
        return counter;
    }


    public static int diffOddEven(HashSet<Integer> nums){
        int evenNums = 0;
        int oddNums = 0;
        for(int num : nums){
            if(num % 2 == 0){
            evenNums++;
            } else{
                oddNums++;
            }
        }
        return oddNums - evenNums;
    }


    public static int secondLargest(HashMap<Integer, Integer> map){
        TreeSet<Integer> keys = new TreeSet<>(map.keySet());
        keys.remove(keys.last());
        return keys.last();
    }




    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}

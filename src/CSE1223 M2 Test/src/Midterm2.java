import java.util.Arrays;
import java.util.Scanner;

/**
 * Midterm exam - Summer 2020
 * This exam is open book, open note, but must be completed
 * as a SOLO effort - no partners or others are to be consulted
 * on this exam. Outside sources should be restricted to just
 * the material used in class and the Java API - you should
 * not need to consult or use any other documentation.
 *
 * My name below indicates that in accordance with the Ohio
 * State University Code of Student Conduct I understand that this exam is
 * to be completed without consulting others or using outside
 * sources other than the ones listed in the instructions above. And
 * that I will not discuss this exam with anyone who has not taken it
 * until after it has been graded and returned.
 *
 * @author Andrew Chen
 * @version 07/13/2020
 */
import java.util.Scanner;

public class Midterm2 {
    /*
     * The following method should return an array where each index contains
     * a prefix of the input word that grows by one character each index.
     *
     * E.g.,
     * if word = "OSU", then stringTriangle(word)
     * should return the array {"O", "OS", "OSU"}
     *
     * and if word = "1223", then stringTriangle(word)
     * should return the array {"1", "12", "122", "1223"}.
     */
    public static String[] stringTriangle(String word) {
        int l = word.length();
        String[] arr = new String[l];
        // Obviously, the length of output is the same as length of the word
        for (int i = 1; i <= l; i++) {
            arr[i-1] = word.substring(0, i);
            // If we start from 0, we would get an empty string in the array
        }
        return arr;
    }

    /*
     * This method should return true if and only if the input array contains
     * no duplicate integers.
     *
     * E.g.,
     * if arr = {1,2,3}, then noDuplicates(arr) should return true
     *
     * and if arr = {1,2,3,2}, then noDuplicates(arr) should return false.
     */
    public static boolean noDuplicates(int[] arr) {
        int l = arr.length;
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            // Not optimized but worked
            for (int j = 0; j < i; j++) {
                if ((i!=j) && (arr[i] == arr[j])) {
                    flag = false;
                    break; // Break is dangerous but convenient
                }
                else {
                    flag = true;
                }
            }
        }
        return flag;
    }

    /*
     * This method should return true if and only if every element in
     * the input array falls in the range between min and max, inclusive.
     *
     * E.g.,
     * if arr = {1,2,3}, then inRange(arr, 1, 5) should return true,
     *
     * if arr = {2,6,3}, then inRange(arr, 1, 5) should return false,
     *
     * and if arr = {0,2,5}, then inRange(arr, 1, 5) should also return false.
     */
    public static boolean inRange(int[] arr, int min, int max) {
        Arrays.sort(arr); // Professor said it is allowed to use .sort()
        boolean flag = false;
        int begin = arr[0];
        int end = arr[arr.length -1];
        if ((begin >= min) && (end <= max)) {
            flag = true;
        }
        else {
            flag = false;
        }
        return flag;
    }

    /*
     * A permutation is an array of integers where each number in the range 1 to n
     * occurs exactly once. Use the previous two methods, noDuplicates() and inRange(),
     * to implement a method that returns true if and only if the input array is a
     * permutation.
     *
     * E.g.,
     * if arr = {2,1,3}, then isPermutation(arr) should return true,
     *
     * if arr = {0,2,1}, then isPermutation(arr) should return false,
     *
     * and if arr = {1,2,2,2,3}, then isPermutation(arr) should also return false.
     *
     * NOTE: For full credit on this problem you MUST make use of the methods noDuplicates() and inRange().
     */
    public static boolean isPermutation(int[] arr) {
        int n = arr.length; // I didn't know what n is, so set it as the length of array
        boolean flag = false;
        flag = (noDuplicates(arr) && (inRange(arr, 1, n)));
        return flag;

    }

    /*
     * For the last method on the exam, create a method that does multiple searches.
     * Your code should search the array of Strings text for the first index that each
     * String in the array queries appears at and return an array of ints of those indexes.
     * If a String in queries does not appear in text, then the int should be set to -1.
     *
     * E.g.,
     * if text = {"Hello", "Goodbye"} and queries = {"Goodbye", "Go Bucks!", "Hello"},
     * then multiIndexOf(text, queries) should return {1, -1, 0}
     *
     * and if text = {"Knock", "Knock", "Hello", "Goodbye"} and queries = {"Goodbye", "Knock", "Knock"},
     * then multiIndexOf(text, queries) should return {3, 0, 0}.
     */
    public static int[] multiIndexOf(String[] text, String[] queries) {
        // Just a simple search without no strict requirements
        int textL = text.length;
        int queryL = queries.length;
        int[] arr = new int[queryL];
        // I think it's comparatively low efficient to fill it with -1
        // but it worked
        for (int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }
        for (int i = 0; i < queryL; i++) {
            for (int j = 0; j < textL; j++) {
                if (queries[i].equals(text[j])) {
                    arr[i] = j;
                    break;
                }
            }
        }
        return arr;
    }

    /*
     * The following method should return true in and only if the String str
     * appears in the array of Strings arr.
     *
     * E.g.,
     * if arr = {"Hello", "Goodbye"} and str = "Goodbye", then contains(arr, str) should return true
     *
     * and if arr = {"Hello", "Goodbye"} and str = "Who's there?", then contains(arr, str) should return false.
     */
    public static boolean contains(String[] arr, String str) {
        int l = arr.length;
        boolean flag = false;
        for (int i = 0; i < l; i++){
            if (arr[i].equals(str)){
                flag = true;
                break; // I think it is not necessary to keep checking
                // break is risky but convenient
            }
            else {
                flag = false;
            }
        }
        return flag;
    }

    /*
     * The goal of this method is to prompt the user with a question and require that they
     * reply with a valid response. To that end, this method should repeatedly prompt the user
     * with the query String until they enter a response that is contained in the responses array.
     * Checking the response should be done using your contains() method. Your implementation should
     * return the user's final, valid response.
     *
     * Example transcripts for this method are shown in the instrutions at the top of the page.
     *
     * Your method should NOT close the Scanner.
     *
     * NOTE: For full credit, your method MUST make use of the above contains() method.
     */
    public static String getValidResponse(String query, String[] responses, Scanner input) {
        boolean check = false;
        query = "What is your name? ";
        System.out.println(query);
        String userAns = input.nextLine();
        check = contains(responses, userAns);
        while (! check) {
            System.out.println("Enter a valid response.");
            System.out.print(query);
            userAns = input.nextLine();
            check = contains(responses, userAns);
            if (check) {
                userAns = userAns; //Maybe it unnecessary, just for security
                break;
            }
        }

        if (check) {
            userAns = userAns; //Maybe it unnecessary, just for security
        }
        return userAns;
    }



    public static void main(String[] args) {
        /*
         * Any testing code should appear below this comment
         * and should be removed in your final submission.
         */

        // Any testing code should appear above this comment
        System.out.println("stringTriangle test");
        String[] triArray = stringTriangle("Goodbye");
        System.out.println(Arrays.toString(triArray));
        System.out.println("noDuplicates test");
        int[] hasDupes = {0,3,2,2,1};
        int[] noDupes = {0,1,3,9,-2};
        System.out.println(noDuplicates(hasDupes));
        System.out.println(noDuplicates(noDupes));
        int[] rangeArr = {0,4,2,-1,5};
        System.out.println("inRange test");
        System.out.println(inRange(rangeArr,2,8));
        System.out.println(inRange(rangeArr,-3,4));
        System.out.println(inRange(rangeArr,-1,5));
        System.out.println("isPermutation test");
        int[] perm = {4,3,5,2,1};
        int[] notPerm = {4,2,0,1,2};
        int[] notPerm2 = {1,2,0};
        System.out.println(isPermutation(perm));
        System.out.println(isPermutation(notPerm));
        System.out.println(isPermutation(notPerm2));
        System.out.println("multiIndexOf test");
        String[] searchIn = {"Is", "but", "a", "dream", "within", "a", "dream"};
        String[] searchFor = {"within", "dream", "Poe", "Is", "raven"};
        System.out.println(Arrays.toString(multiIndexOf(searchIn, searchFor)));
        System.out.println("contains test");
        String[] words = {"Two", "roads", "diverged", "in", "a", "yellow", "wood"};
        System.out.println(contains(words, "Two"));
        System.out.println(contains(words, "in"));
        System.out.println(contains(words, "wood"));
        System.out.println(contains(words, "Hello"));
        System.out.println("getValidResponse test");
        Scanner input = new Scanner(System.in);
        String question = "Is the sky blue? ";
        String[] responses = {"Yes", "No", "I don't know"};
        getValidResponse(question, responses, input);
        input.close();
    }
}
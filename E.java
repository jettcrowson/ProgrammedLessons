import java.util.Scanner;

public class E extends Puts{
    public static void main(String[] args){
        puts("Chapter 60: Excersise 1: Total sum is" + arraySum(new int[]{0, 1, 2, 3}));
        puts("Chapter 60: Excersise 2: ");
        puts(twiceArray(new int[]{13, -4, 82, 17}));
        puts("Chapter 60: Excersise 3");
        puts(sumTwoArrays(new int[]{ 13, -22,  82,  17}, new int[]{-12,  24, -79, -13}));
        puts("Chapter 60: Excersise 4");
        puts(sameSum(new int[]{ 13, -22,  82,  17}));
        puts("Chapter 60: Excersise 5");
        puts(reverseArray(new int[]{0, 1, 2, 3}));
        puts("-----");
        puts("Chapter 61: Excersise 1");
        puts(variousSums(new int[]{3, 2, 5, 7, 9, 12, 97, 24, 54}));
        puts("Chapter 61: Excersise 2");
        puts(largestTwo(new int[]{3, 1, 5, 7, 4, 12, -3, 8, -2}));
        puts("Chapter 61: Excersise 3");
        puts(closestToZero(new int[]{3, 1, 5, 7, 4, 12, -3, 8, -2}));
        puts("Chapter 61: Excersise 5");
        puts(detectPanagram("The quick brown fox jumps over the lazy dog."));
        puts("Chapter 67: Excersise 1");
        puts(multiSum(new int[][]{ {3, 2, 5}, {1, 4, 4, 8, 13}, {9, 1, 0, 2}, {0, 2, 6, 3, -1, -8}}));
        puts("Chapter 67: Excersise 2");
        puts(rowSum(new int[][]{{3, 2, 5}, {1, 4, 4, 8, 13}, {9, 1, 0, 2}, {0, 2, 6, 3, -1, -8}}));
        puts("Chapter 67: Excersise 3");
        puts(collumnSums(new int[][]{{3, 2, 5}, {1, 4, 4, 8, 13}, {9, 1, 0, 2}, {0, 2, 6, 3, -1, -8}}));

    }
    public static int[] collumnSums(int[][] arr){
        int collumns = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].length  > collumns){
                collumns = arr[i].length;
            }
        }
        int[] sums = new int[collumns];
        for(int i = 0; i < arr.length; i++){
            for(int x = 0; x < arr[i].length; x++){
                sums[x] += arr[i][x];
            }
        }
        return sums;
    }
    public static int[] rowSum(int[][] arr){
        int[] totals = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int x = 0; x < arr[i].length; x++){
                totals[i] += arr[i][x];
            }
        }
        return totals;
    }
    public static int multiSum(int[][] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            for(int x = 0; x < arr[i].length; x++){
                total += arr[i][x];
            }
        }
        return total;
    }
    public static boolean detectPanagram(String s){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int[] occurrences = new int[26];
        for(int i = 0; i < s.length(); i++){
            if(letters.indexOf(s.charAt(i)) != -1){
                occurrences[letters.indexOf(s.charAt(i))] += 1;
            }
        }
        for(int i = 0; i < occurrences.length; i++){
            if(occurrences[i] == 0){
                return false;
            }
        }
        return true;
    }
    public static int closestToZero(int[] arr){
        int closest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(Math.abs(arr[i]) < closest){
                closest = arr[i];
            }
        }
        return closest;
    }
    public static int[] largestTwo(int[] arr){
        int[] largest = new int[]{arr[0], arr[0]};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest[0]){
                largest[1] = largest[0];
                largest[0] = arr[i];
            }
        }
        return largest;
    }
    public static int[] variousSums(int[] arr){
        int[] sums = new int[3];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                sums[2] += arr[i];
            }else{
                sums[1] += arr[i];
            }
            sums[0] += arr[i];
        }
        return sums;
    }
    public static int[] reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        int reversedIndex = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            reversed[reversedIndex] = arr[i];
            reversedIndex++;
        }
        return reversed;
    }
    public static int[] sameSum(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = 25 - arr[i];
        }
        return result;
    }
    public static int[] sumTwoArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
    public static int[] twiceArray(int[] arr){
        int[] doubledArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            doubledArr[i] = arr[i] * 2;
        }
        return doubledArr;
    }
    public static int arraySum(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }

}
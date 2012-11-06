package ab2.aufgabe1.a;

import common.Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * ALP III - Julian
 * <p/>
 * User: Baka
 * Date: 06.11.12
 * Time: 12:11
 * To change this template use File | Settings | File Templates.
 */
public class main {
    public static void main(String[] args){
        System.out.println("hallo123");

        int[] test = new int[]{1,2,3};
        List<int[]> result = permutations(test);

        System.out.println("length: " + result.size());


    }

    /**
     * performs a slow sort on the target array and returns the sorted array
     * @param array unsorted array
     * @return sorted array
     */
    private static int[] slowSort(int[] array){
        if (isSorted(array)){
            // array has 0 or 1 elements or is already sorted
            return array;
        }



        return null;
    }

    /**
     * generates all permutations of a given array
     * @param array
     * @return
     */
    private static List<int[]> getPermutations(int[] array){
        List<int[]> perms = new ArrayList<int[]>();




        if (array.length == 2){
            perms.add(array);
            perms.add(Helper.reverse(array));
        }else{




        }

        return null;
    }

    private static List<int[]> permutations(int[] array){
        List<int[]> perms = new ArrayList<int[]>();
        perms.add(array);
        int a = 0;
        int b = 1;

        int[] perm = array;
        do{
            perm = permStep(perm, a, b);
            a = a == perm.length - 1 ? 0 : a+1;
            b = b == perm.length - 1 ? 0 : b+1;
            perms.add(perm);
        }while (!perm.equals(array));


        return perms;
    }

    private static int[] permStep(int[] src, int a, int b){
        int[] result = (int[]) src.clone();
        int temp = result[a];
        result[a] = result[b];
        result[b] = temp;
        return result;
    }

    /**
     * checks, if the array is sorted
     * @param array
     * @return TRUE when sorted, else false
     */
    private static boolean isSorted(int[] array){
        for (int i = 1; i < array.length; i++){
            if (array[i-1] > array[i]){
                return false;
            }
        }
        return true;
    }
}

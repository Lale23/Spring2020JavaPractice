package day20_ArraysContinue;
import java.util.Arrays;
public class CombineTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length]; // can contain all the elemnts from array1 and array 2

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }


        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));


        System.out.println("===============================================");

        int q [] = {1, 2, 3, 4, 5};
        int q2 []= {6, 7, 8, 9};

        int q3 []= new int [q.length + q2.length];

        for ( int i =q.length; i<0; i++){
            q3[i]=q[i];
        }
        for (int i=0; i<q2.length; i++ ){
            q3[q.length +i]= q3[i];

        }
        System.out.println(Arrays.toString(q3));





    }
}
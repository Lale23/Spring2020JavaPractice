package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Task {

      /*
    1. write a program that can remove all the special characters from a list of Character
    2. write a program that can remove all the numbers that can divisble by 3 or 5 in arrayList
     */

      /*
      1. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
2. write a program that can return the duplicated objects from a an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList

      */

/*
    public static void main(String[] args) {
        Predicate <Integer> uniq = x -> x.;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,2,3,4,5,6)); //1,5,6


        Collections.frequency(list, uniq);

        list.removeIf(uniq);

        System.out.println(list);


 */











      /*
3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
 */





}

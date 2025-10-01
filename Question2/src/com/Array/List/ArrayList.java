package com.Array.List;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 4, 5, 20, 30, 6);

		 System.out.println("Original list: " + numbers);
        System.out.println("Numbers divisible by 5:");
        
        numbers.stream()
               .filter(number -> number % 5 == 0)
               .forEach(System.out::println);

	}

}

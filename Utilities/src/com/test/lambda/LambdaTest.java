package com.test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
	
	public static void main (String[] args){
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> consumer = x -> System.out.print(x);
		
		integers.forEach(consumer);
	}

}

package pegadev;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class main {


	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(10, 1, 1000, 100);
		Collections.sort(numbers,(a,b)->a.compareTo(b));
		//System.out.println(numbers);
		Integer n =4;
		Function<Integer,Integer> modulo = (Integer a)-> a%n; 
		assert modulo.apply(8) == 2;
		

	}

}

package StreamsandLambda_Concept;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class StreamMax {
	
	//@Test
	public void elementMax() {
		
		int [] arr = {11,22,44,55,66,110,220};
		
		List<Integer> array = Arrays.asList(11,22,44,55,66,110,220);
		
		Integer max = array.stream().max((x,y)->x.compareTo(y)).get();
		
		System.out.println(max);
	}
	
	
	
	@Test
	public void elementMin() {
		
		int [] arr = {11,22,44,55,66,110,220};
		
		List<Integer> myArray = Arrays.asList(11,22,44,55,66,110,220);
		
		Integer min = myArray.stream().min((x,y)->x.compareTo(y)).get();
		
		System.out.println(min);
		
		
	}

}

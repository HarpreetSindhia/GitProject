package StreamsandLambda_Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsLambda {
	
	//@Test
	public void streamCount() {
		
		//Count the names starts with alphabet A 
		String[] names = {"Anaahadbir","Agam","Arnav","Baurn","Harpreet", "Alexa"};
		
		//Convert Array into ArrayList
		
		Long countNumber = Arrays.asList(names).stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(countNumber);
		
		
	}
	
	//@Test
	public void streamLength() {
		
		//Print names with length > 4
		ArrayList<String> name = new ArrayList<>();
		name.add("Anaahadbir");
		name.add("Agam");
		name.add("Aaarav");
		name.add("Rose");
		name.add("Jack");
		name.add("Miley");
		
		name.stream().filter(s->s.length()>4).collect(Collectors.toList()).forEach(s->System.out.println(s));
			
		
	}
	
	//@Test
	public void streamLimit() {
		
		//Print the first name only
		Stream.of("Anaahadbir","Miley","Haley","Jack","Rose").filter(s->s.length()>4).limit(1).collect(Collectors.toList()).forEach(t->System.out.println(t));

}
	
	//@Test
	public void streamMap() {
		
		//Print the names into upper case
		Stream.of("Harpreet","Aantesh","Angie","Haley","Yuvan").map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(t-> System.out.println(t));
	}
	
	//@Test
	public void streamSquare() {
		
		//Print the square root of each number
		int [] numbers = {2,5,9,4,7};
		
		List.of(2,5,9,4,7).stream().map(a->a*a).collect(Collectors.toList()).forEach(r->System.out.println(r));	
		
		
	}
	
	//@Test
	public void numberPresentOrNot() {
		
		//Check if this number is present or not
		int[] newNumbers = {85,89,58,64,51,27};
		
		Boolean matchFound = List.of(85,89,58,64,51,27).stream().collect(Collectors.toList()).contains(85);
		
		System.out.println(matchFound);
		
		Assert.assertTrue(matchFound);
		
 	}
	
	//@Test
	public void duplicateNumber() {
		
		int[] romanNumbers = {88,99,77,66,55,88,99,55};//88,99,55
		
		List<Integer> numbers = Arrays.asList(88,99,77,66,55,88,99,55);
		
		numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
        .collect(Collectors.toSet()).forEach(s->System.out.println(s));
		
 	}
	
	
	//@Test
	public void getDuplicateNumbers() {
		
		//Print duplicate numbers from the array.
		int[] duplicate = {52,65,54,65,85,52,76,76,90};
		
		List<Integer> numbers = Arrays.asList(52,65,54,65,85,52,76,76,90);//52,65,76
		
		numbers.stream().filter(s->Collections.frequency(numbers, s) > 1).collect(Collectors.toSet()).forEach(e->System.out.println(e));
		
		
			
	}
	
	//@Test
	public void streamMerge() {
		
		
		int[] duplicate = {52,65,54,65,85,52,76,76,90};
		
		int[] numericNumbers = {8,48,56,64,72,80};
		
		
		List<Integer> list = Arrays.asList(52,65,54,65,85,52,76,76,90);
		
		List<Integer> new_List = Arrays.asList(8,48,56,64,72,80);
		
		
		Stream<Integer> newStream = Stream.concat(list.stream(), new_List.stream());
		
		newStream.collect(Collectors.toSet()).forEach(r->System.out.println(r));
		
	}
	
	
	//@Test
	public void streamConcat() {
		
		String[] name = {"Aman", "Happy","Nav","Yuvan"};
		
		String[] new_Name = {"Anaahadbir","Navdeep","Harpreet"};
		
		List<String> list1 = Arrays.asList(name);
		
		List<String> list2 = Arrays.asList(new_Name);
		
		Stream<String> new_Stream = Stream.concat(list1.stream(),list2.stream());
		
		//new_Stream.collect(Collectors.toSet()).forEach(t->System.out.println(t));
		
		Boolean match = new_Stream.anyMatch(r->r.equalsIgnoreCase("Happy"));
		
		Assert.assertTrue(match);
		
		
	
	}
	
	
	//@Test
	public void streamAnyMatch() {
		
		String [] names = {"Angie","Jolly","Senorita","Cristina","Erika"};
		
		List<String> updatedNames = Arrays.asList(names);
		
		Boolean matchFound = updatedNames.stream().anyMatch(z->z.equalsIgnoreCase("Senorita"));
		
		Assert.assertTrue(matchFound);
		
		
		
	}
	
	@Test
	public void streamMax() {
		
		int [] array = {78,55,96,100,45};
		
		List<Integer> revisedArray = Arrays.asList(78,55,96,100,45);
		
		Integer maxValue = revisedArray.stream().max((a,b)->a.compareTo(b)).get();
		
		System.out.println(maxValue);
	}
	
}

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LambdaTest {

	
	private Lambda lambda=new Lambda() ;
	
	@Test
	public void testconcat() {
List<String>l1=new ArrayList<String>();
List<Integer>l2=new ArrayList<Integer>();
l1.add("1");l1.add("2");l1.add("3");
l1.add("4");l1.add("5");
l2.add(6);l2.add(7);
l2.add(8);l2.add(9);l2.add(10);
List<String>l3=lambda.concat(l1, l2);

		assertEquals(l3.size(),10);

		}
	
	@Test
	public void testisPalindrome() {
		assertEquals(lambda.isPalindrome("lafal"),true);
		}
	
	@Test
	public void testRepeatedCharCoounter() {
		String text="Ecrire une fonction lambda java + test JUnit pour compter le nombre d’occurrences d'un motdonné dans un texte. avec lambda . ";
		String mot="lambda";
		assertEquals(lambda.RepeatedCharCoounter(text, mot),2);
		
		}
	@Test
	public void testRepeatedCharFinder() {
		
		assertEquals(lambda.RepeatedCharFinder("stress"),"t".charAt(0));
		
		}
	
	
	
	
	
	
	
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

	public List<String> concat(List<String> l1, List<Integer> l2) {
		l2.forEach(e->{
			l1.add(""+e);
		});
		
		return l1;
		
		}
	
	
	public boolean isPalindrome(String text) {
return text.equals(new StringBuilder(text).reverse().toString());
	
		}
	
	
	public int RepeatedCharCoounter(String text,String mot) {
		int number=0;
		String str[] = text.split(" ");
		List<String> l = new ArrayList<String>();
		l = Arrays.asList(str);
		
		for (String ch : l) {
			if(mot.equals(ch)){
				number++;
			}
		}
		
		
		return number;
		
		}
	
	public char RepeatedCharFinder(String text) {
		char c = 0 ;
		int n=0;
		for(int i=0;i<text.length();i++){
			c=text.charAt(i);
			n=0;
			for(int j=i;j<text.length();j++){
				if(c==text.charAt(j)){
				n++;
				}
			}
			if(n==1)
				break;
			
		}
		
		return c;
		
		}
	
	

}

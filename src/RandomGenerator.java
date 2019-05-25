import java.util.Random;
import java.util.stream.Collectors;

public class RandomGenerator {
	
	public String randomNumberGenerator() {
		int mobile;
		
		Random rand = new Random();
		mobile = rand.nextInt(99999999);
		return "011"+mobile;
		
	}
	
	public String randomStringGenerator() {
		String abcdvalue;
		Random rand = new Random();
		abcdvalue = rand.toString();
		return abcdvalue;
		
	}
	
	

}

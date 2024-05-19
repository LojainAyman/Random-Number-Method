import java.util.Arrays;
import java.util.Random;

public class myClass {



		

		    public static int[] generateRandomNumbers() {
		        int[] numbers = new int[20];
		        Random random = new Random();

		        for (int i = 0; i < numbers.length; i++) {
		            numbers[i] = random.nextInt(100) + 1;
		        }

		        return numbers;
		    }

		    public static int[] getNumbersGreaterThan50(int[] numbers) {
		        return Arrays.stream(numbers)
		                .filter(num -> num > 50)
		                .toArray();
		    }

		    public static void main(String[] args) {
		        int[] randomNumbers = generateRandomNumbers();
		        int[] result = getNumbersGreaterThan50(randomNumbers);

		        System.out.println(Arrays.toString(result));
		    }
	
		

	}



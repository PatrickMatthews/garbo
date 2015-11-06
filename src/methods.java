public class methods {
	public static void main(String[] args) {
		char letter = generateRandomCharacters();
		testGenerateRandomCharacters();
		//System.out.println("\nHello\n");

	}
public static char generateRandomCharacters(){
	
	int startingValue = 65;
	int endingValue   = 90 - 65 + 1;
	char letterRandom = (char)(startingValue + Math.random()*(endingValue));
	//System.out.println(letterRandom);
	return letterRandom;
   }
public static void testGenerateRandomCharacters(){
	
int alpha = 1;
	for (alpha = 65; alpha<=90;alpha++){
		
		System.out.println("Our letter is: " + (char)alpha);
		boolean haveMatch = false;
		while (!haveMatch){
			char letter = generateRandomCharacters();
			generateRandomCharacters();
			System.out.print((char)letter);
			if (letter == alpha){
				haveMatch = true;
			}
		}
	}
	generateRandomCharacters();
	
	}
}

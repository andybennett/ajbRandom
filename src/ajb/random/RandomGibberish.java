package ajb.random;

public class RandomGibberish {

	public static void main(String[] args) {

		System.out.println(RandomGibberish.anyRandomGibberish(2));

	}

	private static char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'y' };
	private static char[] constants = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r',
			's', 't', 'v', 'w', 'x', 'y', 'z' };

	public static String anyRandomGibberish(int noOfSyllables) {

		String result = "";

		for (int i = 0; i < noOfSyllables; i++) {

			result += createRandomSyllable(RandomInt.anyRandomIntRange(2, 3));

		}

		return result;
	}

	private static String createRandomSyllable(int size) {

		String result = "";

		boolean vowel = false;

		for (int i = 0; i < size; i++) {

			if (vowel) {

				result += vowels[RandomInt.anyRandomIntRange(0, vowels.length - 1)];
				vowel = false;

			} else {

				result += constants[RandomInt.anyRandomIntRange(0, constants.length - 1)];
				vowel = true;

			}

		}

		return result;

	}
}

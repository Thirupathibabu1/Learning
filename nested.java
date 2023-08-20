package programs;

public class nested {

	public static void main(String[] args) {
		int temperature = 31;
		boolean isRainy = false;

		if (temperature > 30) {
		System.out.println("It's hot.Wear light clothes.");
		if (isRainy) {
		System.out.println("Don't forget to carry an umbrella.");
		}
		}

	}

}

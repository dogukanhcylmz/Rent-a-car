import java.util.Scanner;

public class Prelab03Q1 {

	public static void main(String[] args) {

		String cars[] = { "Ford, Fiesta, 2015", "Ford, Focus, 2011", "Opel, Astra, 2018", "Opel, Insignia, 2017",
				"Honda, Civic, 2016", "BMW, 118i, 2015", "BMW, 320d, 2016", "Mercedes, CLK 500, 2007",
				"Mercedes, S 600, 2010", "Bugatti, Chiron, 2018" };
		int prices[] = { 100, 150, 180, 200, 170, 230, 260, 250, 280, 500 };
		int counts[] = { 10, 3, 5, 2, 4, 3, 2, 4, 2, 1 };

		Scanner scan = new Scanner(System.in);
		String welcoming1 = "Welcome to Rent a Car Company";
		System.out.println(welcoming1);

		do {

			String welcoming2 = "1 View All\n2 View Available\n3 View Brands\n4 View By Price\n5 Rent\n6 Return\n7 Exit";
			System.out.println(welcoming2);

			System.out.print("Operation: ");
			int operation = scan.nextInt();

			switch (operation) {

			case 1:

				for (int i = 0; i < cars.length; i++) {
					String pair1 = cars[i].substring(0, cars[i].indexOf(","));
					String pair2 = cars[i].substring(cars[i].indexOf(" "), cars[i].lastIndexOf(","));
					System.out.println(i + 1 + "-" + pair1 + pair2 + " " + "(" + prices[i] + " TL)");

				}
				System.out.println();

				break;
			case 2:

				for (int i = 0; i < cars.length; i++) {
					String pair1 = cars[i].substring(0, cars[i].indexOf(","));
					String pair2 = cars[i].substring(cars[i].indexOf(" "), cars[i].lastIndexOf(","));
					System.out.println(i + 1 + "-" + pair1 + pair2 + " " + "(" + prices[i] + " TL)" + "-" + counts[i]
							+ " available.");
				}
				System.out.println();

				break;
			case 3:
				String brands[] = new String[cars.length];

				for (int i = 0; i < cars.length; i++) {
					String x = cars[i];
					String pair = x.substring(0, x.indexOf(","));
					brands[i] = pair;
				}

				for (int i = 0; i < brands.length; i++) {
					if (i == 0)
						System.out.println(brands[i]);

					else if (i > 0) {
						if (!brands[i].equals(brands[i - 1])) {
							System.out.println(brands[i]);

						}
					}
				}
				System.out.println();

				break;
			case 4:
				System.out.println("Enter minimum and maximum prices: ");
				int min = scan.nextInt();
				int max = scan.nextInt();
           
		if(min>=100 && max>=100) {
				for (int j = 0; j < cars.length; j++) {
					if (min <= prices[j] && max >= prices[j]) {
						// System.out.println(j +"-" +cars[j]);
						int i;
						String pair1 = null;
						String pair2 = null;

						for (i = 0; i < cars.length; i++) {
							pair1 = cars[j].substring(0, cars[j].indexOf(","));
							pair2 = cars[j].substring(cars[j].indexOf(" "), cars[j].lastIndexOf(","));

						}
						System.out.println(j + 1 + "-" + pair1 + pair2 + " " + "(" + prices[j] + " TL)");

					}
					if (min >= prices[j] && max <= prices[j]) {
						System.out.println("No cars found between these prices!");
						break;
						}

				}
}
else
	System.out.println("No cars found between these prices!");
				
				
				System.out.println();
				break;

			case 5:

				for (int i = 0; i < cars.length; i++) {
					String pair1 = cars[i].substring(0, cars[i].indexOf(","));
					String pair2 = cars[i].substring(cars[i].indexOf(" "), cars[i].lastIndexOf(","));
					System.out.println(i + 1 + "-" + pair1 + pair2 + " " + "(" + prices[i] + " TL)");
				}
				System.out.print("Please select a car to rent:");
				int selectCar = scan.nextInt();
				int rentNumber = selectCar;
				
				if(selectCar<=10 && selectCar>=1) {
				if(counts[rentNumber-1]>0) {
				int k = selectCar;
				if (k == rentNumber) {
					String pair1 = cars[k - 1].substring(0, cars[k - 1].indexOf(","));
					String pair2 = cars[k - 1].substring(cars[k - 1].indexOf(" "), cars[k - 1].lastIndexOf(","));
					String pair3 = cars[k - 1].substring(cars[k - 1].lastIndexOf(" ") + 1, cars[k - 1].length());
					System.out.println("You have rented " + pair1 + pair2 + " (" + pair3 + "). Daily price is "
							+ prices[rentNumber - 1] + " TL.");
				}
				}
				else
				
					
					System.out.println("no");
				
				counts[rentNumber - 1]--;
				}
				
				else
					System.out.println("Wrong car no");

					

				
				System.out.println();

				break;

			case 6:
				// int i;
				for (int i = 0; i < cars.length; i++) {
					String pair1 = cars[i].substring(0, cars[i].indexOf(","));
					String pair2 = cars[i].substring(cars[i].indexOf(" "), cars[i].lastIndexOf(","));
					System.out.println(i + 1 + "-" + pair1 + pair2 + " " + "(" + prices[i] + " TL)");
				}
				System.out.print("Please select a car to return:");
				int reTurn = scan.nextInt();
				int rentedCar = reTurn;

				int a = reTurn;
				if (a == rentedCar) {
					String pair1 = cars[a - 1].substring(0, cars[a - 1].indexOf(","));
					String pair2 = cars[a - 1].substring(cars[a - 1].indexOf(" "), cars[a - 1].lastIndexOf(","));
					String pair3 = cars[a - 1].substring(cars[a - 1].lastIndexOf(" ") + 1, cars[a - 1].length());
					System.out.println("You have returned " + pair1 + pair2 + " (" + pair3
							+ "). Thank you for choosing our company.");

					counts[rentedCar - 1]++;

				}
				System.out.println();

				break;

			case 7:
				System.out.println("Good bye.");
				System.exit(0);

			}

		} while (true);

	}

}

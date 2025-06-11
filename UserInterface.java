package cars24;
import java.util.Scanner;

public class UserInterface {

    public static CarInfo extractDetails(String carDetails) {
        String[] parts = carDetails.split(":");
        if (parts.length != 4) {
            return null;
        }

        String id = parts[0].trim();
        String name = parts[1].trim();
        String type = parts[2].trim();
        String city = parts[3].trim();

        return new CarInfo(id, name, type, city);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Car Details");
        String input = sc.nextLine();

        CarInfo car = extractDetails(input);
        if (car != null) {
            String result = car.checkAvailability();

            if (!result.equals("Invalid Details")) {
                System.out.println("Car Id: " + car.getCarId());
                System.out.println("CarName: " + car.getCarName());
                System.out.println("CarType: " + car.getCarType());
                System.out.println("City: " + car.getCity());
            }

            System.out.println(result);
        } else {
            System.out.println("Invalid Details");
        }

        sc.close();
    }
}


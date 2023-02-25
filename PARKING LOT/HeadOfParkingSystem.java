import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeadOfParkingSystem {
    public static void parkingVehicle(Scanner sc) {

        // getting an input from users
        System.out.println("Enter your vehicle No:");
        String vehicleNo = sc.next();
        System.out.println("Enter your vehicle type (1.two weeler, 2.four weeler)");
        int vehicleType = sc.nextInt();

        Vehicle vehicle = new Vehicle(vehicleNo, (vehicleType == 1) ? "twoWeeler" : "fourWeeler");
        Ticket ticket = Parking.placeVehicle(vehicle);

        // allocating slot no for user
        if (ticket != null){
            System.out.println("Please note, your slot No is " + ticket.getSlotNo());
        }
    }

    public static void takeOffVehicle(Scanner sc) {

        // getting an input from the user
        System.out.println("Enter your vehicle No :");
        String vehicleNo = sc.next();
        System.out.println("Enter your vehicle type (1.two Weeler, 2.four Weeler) :");
        int vehicleType = sc.nextInt();
        System.out.println("Enter your slot Number :");
        int slotNo = sc.nextInt();

        Parking.removeVehicle(new Ticket(vehicleNo, (vehicleType == 1) ? "twoWeeler" : "fourWeeler", slotNo));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> options = new ArrayList<>();
        options.addAll(Arrays.asList("parking an vehicle", "want to takeoff your vehicle", "Exit"));

        String wantToGo = "yes";

        while (wantToGo.equals("yes")) {

            System.out.println("Choose any one of the options : ");
            for (int i = 1; i <= 2; i++) {
                System.out.println(i + ") " + options.get(i - 1));
            }

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    parkingVehicle(sc);
                    break;
                case 2:
                    takeOffVehicle(sc);
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            System.out.println("Want to continue?");
            String input = sc.next();
            if (!input.equals("yes")) {
                break;
            }
        }
        System.out.println("Thank you!");
        sc.close();
    }
}

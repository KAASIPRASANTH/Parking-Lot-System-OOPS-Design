import java.util.*;

class Parking {
    static Map<Integer, Ticket> customers;
    static {
        customers = new HashMap<>();
    }

    static Ticket placeVehicle(Vehicle vehicle) {
        if (ParkingSlot.isAvailable(vehicle)) {
            Ticket ticket = ParkingSlot.Entry(vehicle);
            customers.put(ticket.getSlotNo(), ticket);
            return ticket;
        }
        System.out.println("We don't have enough place to park your vehicle, sorry!");
        return null;
    }

    static void removeVehicle(Ticket ticket) {

        if (customers.get(ticket.getSlotNo()) != null) {
            ParkingSlot.Exit(ticket);
            customers.remove(ticket.getSlotNo());
            System.out.println("Slot No " + ticket.getSlotNo() + " is now free");
            return;
        }
        System.out.println("Your vehicle wasn't placed here");
    }
}

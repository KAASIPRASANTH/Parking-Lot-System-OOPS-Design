import java.util.*;

class ParkingSlot {
    static Map<String, PriorityQueue<Integer>> slots;
    static {
        slots = new HashMap<>();
        PriorityQueue<Integer> twoWeeler = new PriorityQueue<>((slot1, slot2) -> {
            return slot2 - slot1;
        });
        PriorityQueue<Integer> fourWeeler = new PriorityQueue<>((slot1, slot2) -> {
            return slot2 - slot1;
        });
        for (int slotNo = 1; slotNo <= 3; slotNo++) {
            twoWeeler.add(slotNo);
            fourWeeler.add(slotNo);
        }
        slots.put("twoWeeler", twoWeeler);
        slots.put("fourWeeler", fourWeeler);
    }

    static boolean isAvailable(Vehicle vehicle) {
        return slots.get(vehicle.getVehicleType()).size() > 0;
    }

    static Ticket Entry(Vehicle vehicle) {
        return new Ticket(vehicle.getVehicleNo(), vehicle.getVehicleType(), slots.get(vehicle.getVehicleType()).poll());
    }

    static void Exit(Ticket ticket) {
        slots.get(ticket.getVehicleType()).add(ticket.getSlotNo());
    }
}

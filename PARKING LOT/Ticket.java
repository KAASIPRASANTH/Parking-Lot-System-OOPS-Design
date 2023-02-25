class Ticket {
    String vehicleNo;
    String vehicleType;
    int slotNo;

    Ticket(String vehicleNo, String vehicleType, int slotNo) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.slotNo = slotNo;
    }

    String getVehicleNo() {
        return this.vehicleNo;
    }

    String getVehicleType() {
        return this.vehicleType;
    }

    int getSlotNo() {
        return this.slotNo;
    }
}
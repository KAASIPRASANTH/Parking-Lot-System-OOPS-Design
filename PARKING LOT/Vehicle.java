class Vehicle {
    String vehicleNo;
    String vehicleType;

    Vehicle(String vehicleNo, String vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }
    String getVehicleNo(){
        return this.vehicleNo;
    }
    String getVehicleType(){
        return this.vehicleType;
    }
}
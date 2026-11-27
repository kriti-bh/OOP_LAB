interface ParkingCharge {
    double calculateCharge();
    void displayParkingDetails();
}

class VehicleParking {
    String vehicleNumber;
    String vehicleType;
    int parkingHours;

    VehicleParking(String number, String type, int hours) {
        vehicleNumber = number;
        vehicleType = type;
        parkingHours = hours;
    }
}

class TwoWheeler extends VehicleParking implements ParkingCharge {

    TwoWheeler(String number, int hours) {
        super(number, "Two Wheeler", hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 20;
        else
            return 40 + (parkingHours - 2) * 10;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
    }
}

class FourWheeler extends VehicleParking implements ParkingCharge {

    FourWheeler(String number, int hours) {
        super(number, "Four Wheeler", hours);
    }

    public double calculateCharge() {
        if (parkingHours <= 2)
            return parkingHours * 50;
        else
            return 100 + (parkingHours - 2) * 30;
    }

    public void displayParkingDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Parking Hours: " + parkingHours);
        System.out.println("Total Parking Charge: Rs. " + calculateCharge());
    }
}

class Main {
    public static void main(String[] args) {
        ParkingCharge p;

        p = new TwoWheeler("KA01AB1234", 4);

        System.out.println("--- Two Wheeler Details ---");
        p.displayParkingDetails();

        p = new FourWheeler("KA05CD5678", 5);

        System.out.println("\n--- Four Wheeler Details ---");
        p.displayParkingDetails();

        System.out.println("\nName: Kriti Basavaraj Halgali");
        System.out.println("USN: 1WN25CS113");
    }
}

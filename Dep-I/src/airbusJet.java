public class airbusJet {
    private final AircraftServices aircraftServices;
    public airbusJet(AircraftServices aircraftServices) {
        this.aircraftServices = aircraftServices;
    }
    public void operate(){
        aircraftServices.supplyAircraftServices();
        System.out.println("Aircraft is ready for operation.");
        System.out.println();
    }
}

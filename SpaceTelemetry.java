public class SpaceTelemetry {
    public static void main(String[] args){
    int tick = 1;
     ++tick;
     byte SectorID = 0b00000111;
     int SystemStatus = 0x2F;
     long distance = 12500000;
     char signalGrade = 'A';


    double orbitalSpeed = 27540.68;
    int truncatedSpeed = (int) orbitalSpeed;

    float batteryChange = 84.5f;

    float remainingPower = 100 - batteryChange;
    float batteryLevel = 50;
    boolean oxygenOK = true;

    boolean isSystemFunctioning= batteryLevel > 20.0f && oxygenOK == true;

    System.out.println("=============================================");
    System.out.println("          MARS ROVER TELEMETRY HUB        ");
    System.out.println("=============================================");

    System.out.println("  Mission Cycle           :  "+ tick);
    System.out.println("  Sector ID               :  "+ SectorID);
    System.out.println("  System Hex Status       :  "+ SystemStatus);
    System.out.println("  Distance Traveled       :  "+ distance + " m");
    System.out.println("  Signal Grade            :  "+ signalGrade);

    System.out.println("---------------------------------------------");

    System.out.println("  Orbital Speed (Exact)   :  "+ orbitalSpeed + " km/h");
    System.out.println("  HUD Display Speed (int) :  "+ truncatedSpeed + " km/h");
    System.out.println("  Power Consumed          :  "+ remainingPower + "%");
    System.out.println("---------------------------------------------");
    System.out.println("  Systems Nominal         :  "+ isSystemFunctioning);
    System.out.println("=============================================");

    }

}

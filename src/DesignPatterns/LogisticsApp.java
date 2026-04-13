package DesignPatterns;

public class LogisticsApp {
    public static void main(String[] args) {
        // Road delivery
        LogisticsFactory roadLogistics = new RoadLogistics();
        // distance is in miles and measured from Carlisle, PA
        roadLogistics.planDelivery("Chicago", 645);
        System.out.println();

        // Sea delivery
        LogisticsFactory seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery("Hawaii", 4810);
        System.out.println();

        // air delivery
        LogisticsFactory airLogistics = new AirLogistics();
        airLogistics.planDelivery("Paris (France, not Texas)", 3792);
        System.out.println();
    }
}

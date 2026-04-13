package DesignPatterns;

abstract class LogisticsFactory {
   public abstract Transport createTransport();
   
   public void planDelivery(String destination, double distance) {
        Transport transport = createTransport();
        System.out.println("Planning delivery using " + transport.getName());
        double cost = transport.calculateCost(distance);
        System.out.println("Estimated cost: $" + cost);
        transport.deliver(destination);
   }
}

// Concrete Creators
class RoadLogistics extends LogisticsFactory {
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends LogisticsFactory {
    public Transport createTransport() {
        return new Ship();
    }
}

class AirLogistics extends LogisticsFactory {
    public Transport createTransport() {
        return new Airplane();
    }
}
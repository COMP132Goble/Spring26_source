package DesignPatterns;

interface Transport {
    void deliver(String destination);
    double calculateCost(double distance);
    String getName();
}

class Truck implements Transport {
    public void deliver(String destination) {
        System.out.println("Driving by truck to " + destination);
    }

    public double calculateCost(double distance) {
        return distance * 0.5;          // $0.50 per mile
    }

    public String getName() {
        return "Truck";
    }
}

class Ship implements Transport {
    public void deliver(String destination) {
        System.out.println("Shipping by ship to " + destination);
    }

    public double calculateCost(double distance) {
        return distance * 0.2;          // $0.20 per mile
    }

    public String getName() {
        return "Ship";
    }
}

class Airplane implements Transport {
    public void deliver(String destination) {
        System.out.println("Flying by air to " + destination);
    }

    public double calculateCost(double distance) {
        return distance * 1.5;          // $1.50 per mile
    }

    public String getName() {
        return "Airplane";
    }
}

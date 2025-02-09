abstract class Drone {
    protected String id, status = "IDLE";
    protected int capacity, currentLoad = 0, speed;

    public Drone(String id, int capacity, int speed) {
        this.id = id;
        this.capacity = capacity;
        this.speed = speed;
    }
    public boolean loadCargo(int weight) {
        if (currentLoad + weight <= capacity) {
            currentLoad += weight;
            return true;
        }
        return false;
    }
    public void unloadCargo() { currentLoad = 0; }
    public double flightTime(double distance) { return distance / speed; }
    public String getId() { return id; }
}
class DeliveryTask {
    private CelestialBody origin, destination;
    private Cargo cargo;
    private Drone drone;

    public DeliveryTask(CelestialBody origin, CelestialBody destination, Cargo cargo) {
        this.origin = origin;
        this.destination = destination;
        this.cargo = cargo;
    }
    public boolean assignDrone(Drone drone) {
        if (drone.loadCargo(cargo.getWeight())) {
            this.drone = drone;
            return true;
        }
        return false;
    }
    public void completeTask() {
        if (drone != null) {
            drone.unloadCargo();
            System.out.println("✅ Delivered from " + origin.getName() + " to " + destination.getName());
        }
    }
}
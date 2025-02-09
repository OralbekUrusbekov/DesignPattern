class CelestialBody {
    protected String name;
    protected int x, y;

    public CelestialBody(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public double distanceTo(CelestialBody other) {
        return Math.hypot(this.x - other.x, this.y - other.y);
    }
    public String getName() { return name; }
}
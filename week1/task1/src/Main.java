import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Drone> drones = new ArrayList<>();
        List<DeliveryTask> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n🚀 **Galactic Delivery System**");
            System.out.println("1️⃣ Add Light Drone");
            System.out.println("2️⃣ Add Heavy Drone");
            System.out.println("3️⃣ Create Delivery");
            System.out.println("4️⃣ Complete Delivery");
            System.out.println("5️⃣ Exit");
            System.out.print("👉 Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Light Drone ID: ");
                    String lightId = scanner.nextLine();
                    drones.add(new LightDrone(lightId));
                    System.out.println("✅ Light Drone " + lightId + " added.");
                    break;
                case 2:
                    System.out.print("Enter Heavy Drone ID: ");
                    String heavyId = scanner.nextLine();
                    drones.add(new HeavyDrone(heavyId));
                    System.out.println("✅ Heavy Drone " + heavyId + " added.");
                    break;
                case 3:
                    if (drones.isEmpty()) {
                        System.out.println("❌ No drones available. Add drones first!");
                        break;
                    }
                    System.out.print("Enter Origin (e.g. Earth): ");
                    String originName = scanner.nextLine();
                    System.out.print("Enter Destination (e.g. Space Station): ");
                    String destName = scanner.nextLine();

                    CelestialBody origin = new Planet(originName, 0, 0);
                    CelestialBody destination = new SpaceStation(destName, 100, 200);

                    System.out.print("Enter Cargo Weight: ");
                    int weight = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Cargo Description: ");
                    String description = scanner.nextLine();

                    Cargo cargo = new Cargo(weight, description);
                    tasks.add(new DeliveryTask(origin, destination, cargo));
                    System.out.println("✅ New Delivery Created: " + origin.getName() + " -> " + destination.getName());
                    break;
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No delivery tasks available.");
                        break;
                    }
                    DeliveryTask task = tasks.remove(0);
                    Drone assignedDrone = drones.get(0);

                    if (task.assignDrone(assignedDrone)) {
                        task.completeTask();
                        System.out.println("Delivery completed with drone " + assignedDrone.getId());
                    } else {
                        System.out.println("Delivery failed. Drone capacity exceeded.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting Galactic Delivery System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

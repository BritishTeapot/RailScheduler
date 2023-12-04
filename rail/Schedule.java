package rail;

import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Schedule {
    Network network;
    Set<Section> sections;
    Set<Route> routes;

    public Schedule(Network network, Set<Section> sections, Set<Route> routes) {
        this.network = network;
        this.sections = sections;
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "network=" + network +
                ", sections=" + sections +
                ", routes=" + routes +
                '}';
    }

    public String getTrainPositions(int step) {
        return routes.stream()
                .map(route -> getTrainPosition(route, step))
                .collect(Collectors.joining("\n"));
    }

    private String getTrainPosition(Route route, int step) {
        List<Track> path = route.getPath();

        if (step < path.size()) {
            return path.get(step).toString();
        } else {
            return "*finished*";
        }
    }

    public static Schedule inputSchedule(Scanner scanner, boolean provideFeedback) {
        Network network = Network.inputNetwork(scanner, provideFeedback);

        if (provideFeedback) {
            System.out.println("Enter number of sections:");
        }
        int numSections = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Set<Section> sections = new HashSet<>();

        for (int i = 0; i < numSections; i++) {
            Section section = Section.inputSection(scanner, provideFeedback);
            sections.add(section);
        }

        if (provideFeedback) {
            System.out.println("Enter number of routes in the schedule:");
        }
        int numRoutes = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Set<Route> routes = new HashSet<>();

        for (int i = 0; i < numRoutes; i++) {
            Route route = Route.inputRoute(scanner, provideFeedback);
            routes.add(route);
        }

        return new Schedule(network, sections, routes);
    }
}
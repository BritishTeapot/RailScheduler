package rail;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Route {
    List<Track> path;

    public Route(List<Track> path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Route{" +
                "path=" + path +
                '}';
    }

    public List<Track> getPath() {
        return path;
    }

    public static Route inputRoute(Scanner scanner, boolean provideFeedback) {
        List<Track> path = new ArrayList<>();

        if (provideFeedback) {
            System.out.println("Enter number of tracks in the Route:");
        }
        int numTracks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (provideFeedback) {
            System.out.println("Enter your path:");
        }
        for (int i = 0; i < numTracks; i++) {
            path.add(Track.inputTrack(scanner, false));
        }

        return new Route(path);
    }
}

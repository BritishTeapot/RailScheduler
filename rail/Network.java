package rail;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Network {
    Set<Track> tracks;
    Map<Track, Set<Track>> adjacencyList;

    public Network(Set<Track> tracks, Map<Track, Set<Track>> adjacencyList) {
        this.adjacencyList = adjacencyList;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "rail.Network{" +
                "adjacencyList=" + adjacencyList +
                '}';
    }

    public boolean contains(Track vertex) {
        return adjacencyList.containsKey(vertex);
    }

    public boolean isConnected(Track from, Track to) {
        Set<Track> connections = adjacencyList.get(from);
        return connections != null && connections.contains(to);
    }


    public static Network inputNetwork(Scanner scanner, boolean provideFeedback) {
        Map<Track, Set<Track>> adjacencyList = new HashMap<>();
        Set<Track> tracks = new HashSet<>();

        if (provideFeedback) {
            System.out.println("Enter number of tracks in the Network:");
        }
        int numTracks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numTracks; i++) {
            Track track = Track.inputTrack(scanner, provideFeedback);
            tracks.add(track);
            Set<Track> adjacentTracks = new HashSet<>();
            if (provideFeedback) {
                System.out.println("Enter number of tracks connected to " + track + ":");
            }
            int numConnections = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (provideFeedback) {
                System.out.println("Enter connected tracks' labels:");
            }
            for (int j = 0; j < numConnections; j++) {
                Track connectedTrack = Track.inputTrack(scanner, false);
                adjacentTracks.add(connectedTrack);
            }
            adjacencyList.put(track, adjacentTracks);
        }

        return new Network(tracks, adjacencyList);
    }
}

package rail;

import java.util.Map;
import java.util.Set;

public class Network {
    Map<Track, Set<Track>> adjacencyList;

    public Network(Map<Track, Set<Track>> adjacencyList) {
        this.adjacencyList = adjacencyList;
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
}

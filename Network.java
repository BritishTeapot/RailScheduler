import java.util.Set;

class Network {
    Set<Track> vertices;

    public Network(Set<Track> vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "Network{" +
                "vertices=" + vertices +
                '}';
    }
}
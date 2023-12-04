import java.util.List;

class Route {
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
}
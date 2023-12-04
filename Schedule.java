import java.util.Set;


class Schedule {
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
}
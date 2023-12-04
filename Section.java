import java.util.Set;

class Section {
    Set<Track> tracks;

    public Section(Set<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Section{" +
                "tracks=" + tracks +
                '}';
    }
}
import java.util.Set;

public class Section {
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

    public boolean contains(Track track) {
        return tracks.contains(track);
    }
}

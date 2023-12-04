package rail;

import java.util.Objects;

public class Track {
    String trackLabel;

    public Track(String trackLabel) {
        this.trackLabel = trackLabel;
    }

    @Override
    public String toString() {
        return trackLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(trackLabel, track.trackLabel);
    }
}

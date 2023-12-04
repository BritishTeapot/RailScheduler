package rail;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Section {
    Set<Track> tracks;

    public Section(Set<Track> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "rail.Section{" +
                "tracks=" + tracks +
                '}';
    }

    public boolean contains(Track track) {
        return tracks.contains(track);
    }

    public static Section inputSection(Scanner scanner, boolean provideFeedback) {
        Set<Track> tracks = new HashSet<>();

        if (provideFeedback) {
            System.out.println("Enter number of tracks in the Section:");
        }
        int numTracks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (provideFeedback) {
            System.out.println("Enter tracks' labels:");
        }
        for (int i = 0; i < numTracks; i++) {
            tracks.add(Track.inputTrack(scanner, false));
        }

        return new Section(tracks);
    }
}

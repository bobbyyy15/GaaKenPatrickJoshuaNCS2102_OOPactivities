package Artists;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Justin Bieber", "Canadian", 30, "Music");
        artist.displayInfo();

        System.out.println();

        Artist singer = new Singer("Justin Bieber", "Canadian", 30, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Artist painter = new Painter("Bob Ross", "American", 52, "Art", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Artist dancer = new Dancer("DJ Loonyo", "Filipino", 28, "Choreo-Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Artist writer = new Writer("Masashi Kishimoto", "Japanese", 50, "Series", WritingStyle.ANIME);
        writer.displayInfo();
    }
}

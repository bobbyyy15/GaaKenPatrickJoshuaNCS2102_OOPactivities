package Artists;

enum Genre {
    POP,
    ROCK,
    CLASSICAL,
    JAZZ,
    HIPHOP,
    RNB,
    ANIME
}

public class Singer extends Artist {
    private Genre genre;

    public Singer(String name, String nationality, int age, String specialty, Genre genre) {
        super(name, nationality, age, specialty);
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Singer Info ==");
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }

    public static void main(String[] args) {
        Singer singer = new Singer("Justin Bieber", "Canadian", 30, "Music", Genre.POP);
        singer.displayInfo();
    }
}

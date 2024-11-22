package Artists;

enum WritingStyle {
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA,
    ANIME
}

public class Writer extends Artist {
    private WritingStyle writingStyle;

    public Writer(String name, String nationality, int age, String specialty, WritingStyle writingStyle) {
        super(name, nationality, age, specialty);
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    public void setWritingStyle(WritingStyle writingStyle) {
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Writer Info ==");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }

    public static void main(String[] args) {
        Writer writer = new Writer("Masashi Kishimoto", "Japanese", 50, "Manga", WritingStyle.ANIME);
        writer.displayInfo();
    }
}

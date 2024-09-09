package Models;

public class BookGenre {

        private String genreName;
        private String genreDescription;
        private int genreBookCount;

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreDescription() {
        return genreDescription;
    }

    public void setGenreDescription(String genreDescription) {
        this.genreDescription = genreDescription;
    }

    public int getGenreBookCount() {
        return genreBookCount;
    }

    public void setGenreBookCount(int genreBookCount) {
        this.genreBookCount = genreBookCount;
    }

    public BookGenre(String genreName, String genreDescription, int genreBookCount) {
        this.genreName = genreName;
        this.genreDescription = genreDescription;
        this.genreBookCount = genreBookCount;


    }
}

package FilmsApp.FactoriesLib;

import FilmsApp.Genre;

public class GenreCreatorFactory {
    int count = 1;

    public Genre newGenre(String name) {
        Genre genre = new Genre();
        genre.genreId = count++;
        genre.name = name;
        return genre;
    }
}
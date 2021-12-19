package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {
    @Test
    public void shouldSetDefault() {
        MoviesManager manager = new MoviesManager();
        assertEquals(10, manager.getMoviesLimit());
    }

    @Test
    public void shouldAddMovie() {
        MoviesManager manager = new MoviesManager(10);
        Movie movie0 = new Movie(1, "Бладшот", "боевик");
        manager.add(movie0);
        Movie[] movies = manager.get();
        assertEquals(1, movies.length);

    }

    @Test
    public void shouldReturnLimitedNumberOfMovies() {
        MoviesManager manager = new MoviesManager(2);
        Movie movie0 = new Movie(1, "Бладшот", "боевик");
        Movie movie1 = new Movie(2, "Вперёд", "мультфильм");
        Movie movie2 = new Movie(3, "Отель Белград", "комедия");

        manager.add(movie0);
        manager.add(movie1);
        manager.add(movie2);

        Movie[] expectedMovies = {
                movie2, movie1,
        };

        Movie[] movies = manager.get();
        assertEquals(2, movies.length);
        assertArrayEquals(expectedMovies, movies);
    }

}
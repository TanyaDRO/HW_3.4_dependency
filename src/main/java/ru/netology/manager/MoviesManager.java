package ru.netology.manager;

import ru.netology.domain.Movie;

public class MoviesManager {
    Movie[] movies = new Movie[0];
    int moviesLimit;

    public int getMoviesLimit() {
        return moviesLimit;
    }

    public MoviesManager() {
        moviesLimit = 10;
    }

    public MoviesManager(int moviesLimit) {
        this.moviesLimit = moviesLimit;
    }

    public void add(Movie item) {
        // создаём новый массив размером на единицу больше
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        // копируем массив
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }

    public Movie[] get() {
        int numberOfMovies;
        if (moviesLimit > movies.length) {
            numberOfMovies = movies.length;
        } else {
            numberOfMovies = moviesLimit;
        }

        Movie[] result = new Movie[numberOfMovies];

        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < numberOfMovies; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}



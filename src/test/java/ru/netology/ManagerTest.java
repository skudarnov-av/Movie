package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {

    String[] FilmsFive = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five"};
    String[] FilmsNine = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six", "film_seven", "film_eight", "film_nine"};
    String[] FilmsTen = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six", "film_seven", "film_eight", "film_nine", "Film_Ten"};
    String[] FilmsMoreTen = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six", "film_seven", "film_eight", "film_nine", "film_Ten", "film_eleven",};

    @Test
    void addOneMovie() {
        Manager poster = new Manager();

        poster.add("Film_one");

        String[] expected = new String[]{"Film_one"};
        String[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void moviePlusMovie() {
        Manager poster = new Manager();
        poster.setMoveList(FilmsFive);

        poster.add("film_six");

        String[] expected = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six"};
        String[] actual = poster.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void addAndFindLast() {
        Manager poster = new Manager();
        poster.add("film_one");
        poster.add("film_two");
        poster.add("film_three");


        String[] expected = new String[]{"film_three", "film_two", "film_one"};
        String[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void NineFilmAndFindLast() {
        Manager poster = new Manager();
        poster.setMoveList(FilmsNine);


        String[] expected = new String[]{"film_nine", "film_eight", "film_seven", "film_six", "film_five", "film_four", "film_three", "film_two", "film_one"};
        String[] actual = poster.findLast();

        assertArrayEquals(expected, actual);

    }

    @Test
    void TenFilmAndFindLast() {
        Manager poster = new Manager();
        poster.setMoveList(FilmsTen);


        String[] expected = new String[]{"Film_Ten", "film_nine", "film_eight", "film_seven", "film_six", "film_five", "film_four", "film_three", "film_two", "film_one"};
        String[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void MaxFilmAndFindLast() {
        Manager poster = new Manager();
        poster.setMoveList(FilmsMoreTen);
        String[] expected = new String[]{"film_eleven", "film_Ten", "film_nine", "film_eight", "film_seven", "film_six", "film_five", "film_four", "film_three", "film_two"};
        String[] actual = poster.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    void MoreMaxGivenMaxFilmsFindLast() {
        Manager poster = new Manager(4);
        poster.setMoveList(FilmsFive);


        String[] expected = new String[]{"film_five", "film_four", "film_three", "film_two"};
        String[] actual = poster.findLast();

        assertArrayEquals(expected, actual);

    }


}

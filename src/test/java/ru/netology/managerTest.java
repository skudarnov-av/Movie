package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class managerTest {

        String[] FilmsFive = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five"};
        String[] FilmsNine = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six", "film_seven", "film_eight", "film_nine"};
        String[] FilmsTen = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six", "film_seven", "film_eight", "film_nine", "Film_Ten"};
        String[] FilmsMoreTen = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six", "film_seven", "film_eight", "film_nine", "film_Ten", "film_eleven",};

        @Test
        void addOneMovie() {
            manager poster = new manager();

            poster.add("Film_one");

            String[] expected = new String[]{"Film_one"};
            String[] actual = poster.findAll();

            assertArrayEquals(expected, actual);
        }

        @Test
        void moviePlusMovie() {
            manager poster = new manager();
            poster.setMoveList(FilmsFive);

            poster.add("film_six");

            String[] expected = new String[]{"film_one", "film_two", "film_three", "film_four", "film_five", "film_six"};
            String[] actual = poster.findAll();

            assertArrayEquals(expected, actual);
        }

        @Test
        void addAndFindLast() {
            manager poster = new manager();
            poster.add("film_one");
            poster.add("film_two");
            poster.add("film_three");
            poster.findLast();

            String[] expected = new String[]{"film_three", "film_two", "film_one"};
            String[] actual = poster.findAll();

            assertArrayEquals(expected, actual);
        }

        @Test
        void NineFilmAndFindLast() {
            manager poster = new manager();
            poster.setMoveList(FilmsNine);

            poster.findLast();
            String[] expected = new String[]{"film_nine", "film_eight", "film_seven", "film_six", "film_five", "film_four", "film_three", "film_two", "film_one"};
            String[] actual = poster.findAll();

            assertArrayEquals(expected, actual);

        }

        @Test
        void TenFilmAndFindLast() {
            manager poster = new manager();
            poster.setMoveList(FilmsTen);

            poster.findLast();

            String[] expected = new String[]{"Film_Ten", "film_nine", "film_eight", "film_seven", "film_six", "film_five", "film_four", "film_three", "film_two", "film_one"};
            String[] actual = poster.findAll();

            assertArrayEquals(expected, actual);
        }

        @Test
        void MaxFilmAndFindLast() {
            manager poster = new manager();
            poster.setMoveList(FilmsMoreTen);
            poster.findLast();
            String[] expected = new String[]{"film_eleven", "film_Ten", "film_nine", "film_eight", "film_seven", "film_six", "film_five", "film_four", "film_three", "film_two"};
            String[] actual = poster.findAll();

            assertArrayEquals(expected, actual);
        }

        @Test
        void MoreMaxGivenMaxFilmsFindLast() {
            manager poster = new manager(4);
            poster.setMoveList(FilmsFive);

            poster.findLast();

            String[] expected = new String[]{"film_five", "film_four", "film_three", "film_two"};
            String[] actual = poster.findAll();

            assertArrayEquals(expected, actual);

        }


}

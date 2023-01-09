package ru.netology;

public class manager {
    private String[] moveList = new String[0];

    private int maxMovies;

    public manager() {
        maxMovies = 10;
    }

    public manager(int maxMovies) {
        this.maxMovies = maxMovies;
    }

    public int getMaxMovies() {
        return maxMovies;
    }

    public void setMaxMovies(int maxMovies) {
        this.maxMovies = maxMovies;
    }

    public String[] getMoveList() {
        return moveList;
    }

    public void setMoveList(String[] moveList) {
        this.moveList = moveList;
    }

    public void add(String addMovie) {

        String[] tmp = new String[moveList.length + 1];
        for (int i = 0; i < moveList.length; i++) {
            tmp[i] = moveList[i];
        }

        tmp[tmp.length - 1] = addMovie;
        moveList = tmp;

    }

    public String[] findAll() {
        return moveList;
    }

    public void findLast() {
        int resultLength;
        if (moveList.length > maxMovies) {
            resultLength = maxMovies;
        } else {
            resultLength = moveList.length;
        }

        String[] tmp = new String[resultLength];
        int lastIndex = moveList.length - 1;

        for (int i = 0; i < resultLength; i++) {
            tmp[i] = moveList[lastIndex - i];

        }
        moveList = tmp;


    }

}

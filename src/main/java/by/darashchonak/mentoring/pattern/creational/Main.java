package by.darashchonak.mentoring.pattern.creational;

import by.darashchonak.mentoring.pattern.creational.factory.MagicMazeFactory;
import by.darashchonak.mentoring.pattern.creational.factory.NormalMazeFactory;

public class Main {

    public static void main(String[] args) {

        new MazeGame(new NormalMazeFactory()).createMaze();
        new MazeGame(new MagicMazeFactory()).createMaze();
    }

}

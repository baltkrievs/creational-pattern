package by.darashchonak.mentoring.pattern.creational;

import by.darashchonak.mentoring.pattern.creational.factory.MagicMazeGame;
import by.darashchonak.mentoring.pattern.creational.factory.NormalMazeGame;

public class Main {

    public static void main(String[] args) {

        new NormalMazeGame().createMaze();
        new MagicMazeGame().createMaze();
    }

}

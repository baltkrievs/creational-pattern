package by.darashchonak.mentoring.pattern.creational.factory;

import by.darashchonak.mentoring.pattern.creational.MazeGame;

public class NormalMazeGame extends MazeGame {

    @Override
    public MazeFactory getFactory() {
        return new NormalMazeFactory();
    }

}

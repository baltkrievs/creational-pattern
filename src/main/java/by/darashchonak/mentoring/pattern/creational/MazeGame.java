package by.darashchonak.mentoring.pattern.creational;

import by.darashchonak.mentoring.pattern.creational.factory.MazeFactory;
import by.darashchonak.mentoring.pattern.creational.normal.DoorWall;

public class MazeGame {

    private MazeFactory factory;

    public MazeGame(MazeFactory factory) {
        this.factory = factory;
    }

    public Maze createMaze() {

        Maze aMaze = new Maze();
        Room r1 = factory.createRoom(1);
        Room r2 = factory.createRoom(2);
        DoorWall d = factory.creatreDoorWall(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.NORTH, factory.creatreWall());
        r1.setSide(Direction.EAST, d);
        r1.setSide(Direction.SOUTH, factory.creatreWall());
        r1.setSide(Direction.WEST, factory.creatreWall());
        r2.setSide(Direction.NORTH, factory.creatreWall());
        r2.setSide(Direction.EAST, factory.creatreWall());
        r2.setSide(Direction.SOUTH, factory.creatreWall());
        r2.setSide(Direction.WEST, d);
        return aMaze;
    }
}
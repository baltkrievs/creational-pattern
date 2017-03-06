package by.darashchonak.mentoring.pattern.creational.factory;

import by.darashchonak.mentoring.pattern.creational.Room;
import by.darashchonak.mentoring.pattern.creational.Wall;
import by.darashchonak.mentoring.pattern.creational.normal.DoorWall;

public interface MazeFactory {

    public Room createRoom(int num);

    public DoorWall creatreDoorWall(Room room1, Room room2);

    public default Wall creatreWall() {
        return new Wall();
    }

}

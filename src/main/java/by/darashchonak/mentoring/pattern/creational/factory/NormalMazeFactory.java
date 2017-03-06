package by.darashchonak.mentoring.pattern.creational.factory;

import by.darashchonak.mentoring.pattern.creational.Room;
import by.darashchonak.mentoring.pattern.creational.normal.DoorWall;
import by.darashchonak.mentoring.pattern.creational.normal.NormalRoom;

public class NormalMazeFactory implements MazeFactory {

    @Override
    public Room createRoom(int num) {
        return new NormalRoom(num);
    }

    @Override
    public DoorWall creatreDoorWall(Room room1, Room room2) {
        return new DoorWall(room1, room2);
    }

}

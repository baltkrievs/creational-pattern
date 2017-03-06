package by.darashchonak.mentoring.pattern.creational.factory;

import by.darashchonak.mentoring.pattern.creational.Room;
import by.darashchonak.mentoring.pattern.creational.magic.MagicDoorWall;
import by.darashchonak.mentoring.pattern.creational.magic.MagicRoom;
import by.darashchonak.mentoring.pattern.creational.normal.DoorWall;

public class MagicMazeFactory implements MazeFactory {

    @Override
    public Room createRoom(int num) {
        return new MagicRoom(num);
    }

    @Override
    public DoorWall creatreDoorWall(Room room1, Room room2) {
        return new MagicDoorWall(room1, room2);
    }

}

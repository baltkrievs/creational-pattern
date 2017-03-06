package by.darashchonak.mentoring.pattern.creational;

import java.util.HashMap;
import java.util.Map;

public abstract class Room {

    private Map<Direction, Wall> sides = new HashMap<Direction, Wall>();
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
    }

    public Wall getSide(Direction direction) {
        return sides.get(direction);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }

    public int getRoomNo() {
        return roomNo;
    }
}
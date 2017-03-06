package by.darashchonak.mentoring.pattern.creational.normal;

import by.darashchonak.mentoring.pattern.creational.Room;
import by.darashchonak.mentoring.pattern.creational.Wall;

public class DoorWall extends Wall {

    @SuppressWarnings("unused")
    private Room r1;
    @SuppressWarnings("unused")
    private Room r2;
    @SuppressWarnings("unused")
    private boolean isOpen;

    public DoorWall(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
        this.isOpen = false;
    }
}
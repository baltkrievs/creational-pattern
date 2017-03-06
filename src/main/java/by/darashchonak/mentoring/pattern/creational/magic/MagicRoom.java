package by.darashchonak.mentoring.pattern.creational.magic;

import by.darashchonak.mentoring.pattern.creational.Room;

public class MagicRoom extends Room {

    private BodyTrap trap = new BodyTrap();

    public BodyTrap getTrap() {
        return trap;
    }

    public MagicRoom(int roomNo) {
        super(roomNo);
    }

}

package by.darashchonak.mentoring.pattern.creational.magic;

import by.darashchonak.mentoring.pattern.creational.Room;
import by.darashchonak.mentoring.pattern.creational.normal.DoorWall;

public class MagicDoorWall extends DoorWall {

    private Spell spell = new Spell("bla bla spell");

    public MagicDoorWall(Room r1, Room r2) {
        super(r1, r2);
    }

    public String getSpell() {
        return spell.getSpellName();
    }

}

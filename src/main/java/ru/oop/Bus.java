package ru.oop;

/**
 * Автобус
 */
public class Bus implements Transport {
    private Position position;

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void roadTo(Position destination, Person person) {

    }
}

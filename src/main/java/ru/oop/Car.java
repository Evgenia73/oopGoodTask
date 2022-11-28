package ru.oop;

/**
 * Легковой автомобиль
 */
public class Car implements Transport {
    private Position position;

    @Override
    public void roadTo(Position destination, Person person) {
    }
    @Override
    public void setPosition(Position position) {
        this.position = position;
    }
    @Override
    public Position getPosition() {
        return position;
    }
}

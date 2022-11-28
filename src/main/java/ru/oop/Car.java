package ru.oop;

/**
 * Легковой автомобиль
 */
public class Car implements Transport {
    Position position;

    /**
     * Довезти человека на автомобиле как можно ближе к пункту назначения.
     * Если не удаётся довезти человека ровно в требуемое место,
     * то в person.setPosition() положить ближайщую позицию, куда автомобиль смог довести,
     * иначе person.setPosition(destination)
     *
     * @param person      человек, которого требуется перевезти
     * @param destination местоположение пункта назначения
     */
    @Override
    public void roadTo(Position destination, Person person) {
    }
    @Override
    public void setPosition(Position position) {
    }
    @Override
    public Position getPosition() {
        return position;
    }
}

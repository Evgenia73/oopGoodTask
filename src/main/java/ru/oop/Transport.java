package ru.oop;

public interface Transport extends Positioned{
    /**
     * Довезти человека как можно ближе к пункту назначения.
     * Если не удаётся довезти человека ровно в требуемое место,
     * то в person.setPosition() положить ближайщую позицию, куда траспорт смог довести,
     * иначе person.setPosition(destination)
     *
     * @param person      человек, которого требуется перевезти
     * @param destination местоположение пункта назначения
     */
    void roadTo(Position destination, Person person);
}

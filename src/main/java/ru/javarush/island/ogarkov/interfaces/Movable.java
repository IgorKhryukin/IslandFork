package ru.javarush.island.ogarkov.interfaces;

import ru.javarush.island.ogarkov.location.Cell;

public interface Movable {
    boolean move(Cell startCell);
}

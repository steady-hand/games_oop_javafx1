package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void position() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        assertThat(figure.position()).isEqualTo(Cell.C1);
    }

    @Test
    void copy() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        assertThat(figure.copy(Cell.D2).position()).isEqualTo(Cell.D2);
    }

    @Test
    void way() {
        BishopBlack figure = new BishopBlack(Cell.C1);
        figure.way(Cell.G5);
        int size = Math.abs(Cell.C1.getX() - Cell.G5.getX());
        Cell[] steps = new Cell[size];
        steps[0] = Cell.D2;
        steps[1] = Cell.E3;
        steps[2] = Cell.F4;
        steps[3] = Cell.G5;
        Cell[] result = figure.way(Cell.G5);
        assertArrayEquals(result, steps);
    }
}
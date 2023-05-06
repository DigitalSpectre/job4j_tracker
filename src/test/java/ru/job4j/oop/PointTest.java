package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PointTest {
    @Test
    public void When200To000Then2(){
        double expected = 2;
        Point a3d = new Point(2, 0, 0);
        Point b3d = new Point(0, 0, 0);
        double out = a3d.distance3d(b3d);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void When100To110Then1(){
        double expected = 1;
        Point a3d = new Point(1, 0, 0);
        Point b3d = new Point(1, 1, 0);
        double out = a3d.distance3d(b3d);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void When220To222Then2(){
        double expected = 2;
        Point a3d = new Point(2, 2, 0);
        Point b3d = new Point(2, 2, 2);
        double out = a3d.distance3d(b3d);
        assertThat(out).isEqualTo(expected);
    }
}
package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016Ignore
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final Point first;
    protected final Point second;
    protected final Point third;

    protected final double a;
    protected final double b;
    protected final double c;

    public Triangle(final Point first,
                    final Point second,
                    final Point third) {
        this.first = first;
        this.second = second;
        this.third = third;

        a = this.first.distanceTo(this.second);
        b = this.second.distanceTo(this.third);
        c = this.third.distanceTo(this.first);
    }

    public boolean exists() {
        return a + b > c && b + c > a && c + a > b;
    }

    public double area() {
        if (!exists()) {
            throw new IllegalStateException();
        }
        double p = (a + b + c) / 2;
        return Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}

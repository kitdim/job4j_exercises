package ru.parsentev.task_013;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class MonoArray {
    private static final Logger log = getLogger(MonoArray.class);

    private final int[] values;

    public MonoArray(final int[] values) {
        this.values = values;
    }

    public boolean exists() {
        boolean flag = false;
        int tempItem = values[0];
        for (var item : values) {
            if (item != tempItem) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}

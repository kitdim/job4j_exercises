package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        boolean flag = true;
        int count = 0;
        for (var item : values) {
            if (item == 1) {
                count++;
                if (count == 3) {
                    flag = true;
                    break;
                }
            }
            else {
                count = 0;
                flag = false;
            }
        }
        return flag;
    }
}

package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.singleton.TrackerSingleEnum;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexey Denisenko
 * @version 0.1
 * @since 29.01.2019
 */

public class SingleEnumTest {

    TrackerSingleEnum tracker = TrackerSingleEnum.INSTANCE;

    /**
     * Тест на проверку добавления заявки через класс синглтона.
     */

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    /**
     * Тест на проверку синглетности.
     */

    @Test
    public void singletonTest() {
        TrackerSingleEnum tracker2 = TrackerSingleEnum.INSTANCE;
        assertThat(tracker, is(tracker2));
    }
}
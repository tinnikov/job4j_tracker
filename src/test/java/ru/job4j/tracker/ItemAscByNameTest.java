package ru.job4j.tracker;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemAscByNameTest {

    @Test
    public void itemAcByName() {
        List<Item> items = Arrays.asList(
                new Item("Tinnikov Konstantin"),
                new Item("Abramov Nikolay"),
                new Item("Baranov Petr"),
                new Item("Zaharov Alexsandr")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Abramov Nikolay"),
                new Item("Baranov Petr"),
                new Item("Tinnikov Konstantin"),
                new Item("Zaharov Alexsandr")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void itemDescByName() {
        List<Item> items = Arrays.asList(
                new Item("Tinnikov Konstantin"),
                new Item("Abramov Nikolay"),
                new Item("Baranov Petr"),
                new Item("Zaharov Alexsandr")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item("Zaharov Alexsandr"),
                new Item("Tinnikov Konstantin"),
                new Item("Baranov Petr"),
                new Item("Abramov Nikolay")
        );
        assertThat(items, is(expected));
    }

}
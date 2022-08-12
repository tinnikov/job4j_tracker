package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByAscNameAndAscPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Tinnikov Konstantin", 1),
                new Job("Tinnikov Konstantin", 0)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorByAscName() {
        Comparator<Job> cmpNamePriority = new JobAscByName();
        int rsl = cmpNamePriority.compare(
                new Job("Blinov Nikolay", 0),
                new Job("Tinnikov Konstantin", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompatorByDescName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Blinov Nikolay", 0),
                new Job("Tinnikov Konstantin", 0)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompatorAscPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Tinnikov Konstantin", 0),
                new Job("Tinnikov Konstantin", 0)
        );
        assertThat(rsl).isEqualTo(0);
    }
}
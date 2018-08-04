package pl.sda.designpatterns.observer;

import java.util.UUID;

public class Student implements Observer<ExamResults> {

    private final UUID uuid = UUID.randomUUID();

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return uuid.equals(student.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    @Override
    public void update(ExamResults data) {
        final Double aDouble = data.getResults().get(uuid.toString());
        if (aDouble == null) return;
        if (aDouble > 0.6) {
            System.out.printf("%s: Passed :)\n", uuid.toString());
        } else {
            System.out.printf("%s: Fail :(\n", uuid.toString());
        }
    }
}

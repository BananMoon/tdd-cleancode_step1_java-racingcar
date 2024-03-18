package racingcar.domain;

import racingcar.exception.NameLengthExceededException;

import java.util.Objects;

public class Name {

    private static final int NAME_LENGTH_LIMIT = 5;

    private final String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > NAME_LENGTH_LIMIT) {
            throw new NameLengthExceededException(name);
        }
    }

    public String get() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

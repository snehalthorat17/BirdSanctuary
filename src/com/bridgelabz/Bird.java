package com.bridgelabz;

import java.util.Objects;

public abstract class Bird {

    enum Color {RED, GREEN, BLUE, WHITE, BLACK, BLACK_WHITE};
    Color color;
    String id;
    String name;

    @Override
    public String toString() {
        return "Bird{" + "color=" + color + ", id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return id.equals(bird.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

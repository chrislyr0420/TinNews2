package com.laioffer.tinnews2.model;

import java.util.Objects;

/**
 * This is the model where store the Source of the news, defined by id and name
 */
public class Source {
    public String id;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Source)) return false;
        Source source = (Source) o;
        return Objects.equals(id, source.id) &&
                Objects.equals(name, source.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Source{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

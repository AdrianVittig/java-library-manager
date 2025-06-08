package org.informatics.entity;

import java.io.Serializable;
import java.util.*;

public class Library implements Serializable {
    private long id;
    private String name;
    private Set<Author> authorSet;
    private Set<Employee> employeesSet;
    private Set<Book> booksSet;

    private static long nextId = 0;

    public Library(String name, Set<Author> authorSet, Set<Employee> employeesSet, Set<Book> booksSet) {
        this.id = ++nextId;
        this.name = name;
        this.authorSet = new HashSet<>();
        this.employeesSet = new HashSet<>();
        this.booksSet = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }

    public Set<Employee> getEmployeesSet() {
        return employeesSet;
    }

    public void setEmployeesSet(Set<Employee> employeesSet) {
        this.employeesSet = employeesSet;
    }

    public Set<Book> getBooksSet() {
        return booksSet;
    }

    public void setBooksSet(Set<Book> booksSet) {
        this.booksSet = booksSet;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return id == library.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorSet=" + authorSet +
                ", employeesSet=" + employeesSet +
                ", booksSet=" + booksSet +
                '}';
    }
}

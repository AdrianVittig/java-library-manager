package org.informatics.entity;

import org.informatics.util.CoverType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Book implements Serializable {
    private long id;
    private String title;
    private Set<Author> authorSet;
    private String publisher;
    private String isbn;
    private Set<String> genreSet;
    private LocalDate publicationDate;
    private Set<CoverType> coverTypeSet;

    private static long nextId = 0;

    public Book(String name, String publisher, String isbn, LocalDate publicationDate) {
        this.id = ++nextId;
        this.title = name;
        this.authorSet = new HashSet<>();
        this.publisher = publisher;
        this.isbn = isbn;
        this.genreSet = new HashSet<>();
        this.publicationDate = publicationDate;
        this.coverTypeSet = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<Author> authorSet) {
        this.authorSet = authorSet;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<String> getGenreSet() {
        return genreSet;
    }

    public void setGenreSet(Set<String> genreSet) {
        this.genreSet = genreSet;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Set<CoverType> getCoverTypeSet() {
        return coverTypeSet;
    }

    public void setCoverTypeSet(Set<CoverType> coverTypeSet) {
        this.coverTypeSet = coverTypeSet;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authorSet=" + authorSet +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genreSet=" + genreSet +
                ", publicationDate=" + publicationDate +
                ", coverTypeSet=" + coverTypeSet +
                '}';
    }
}

package com.tvestergaard.exercises.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity @Table(name = "book", schema = "orm-exercises", catalog = "") public class BookEntity
{
    private int id;
    private String title;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id", nullable = false) public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Basic @Column(name = "title", nullable = false, length = 255) public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return id == that.id &&
                Objects.equals(title, that.title);
    }

    @Override public int hashCode()
    {
        return Objects.hash(id, title);
    }
}

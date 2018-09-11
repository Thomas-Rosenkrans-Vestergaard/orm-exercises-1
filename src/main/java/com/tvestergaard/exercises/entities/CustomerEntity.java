package com.tvestergaard.exercises.entities;

import javax.persistence.*;

@Entity @Table(name = "customer", schema = "orm-exercises", catalog = "")
public class CustomerEntity
{

    private int    id;
    private String firstName;
    private String lastName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Basic @Column(name = "first_name", nullable = false, length = 255) public String getFirstName()
    {
        return this.firstName;
    }

    @Basic @Column(name = "last_name", nullable = false, length = 255) public String getLastName()
    {
        return this.lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}

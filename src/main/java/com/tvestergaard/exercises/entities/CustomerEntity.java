package com.tvestergaard.exercises.entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity @Table(name = "customer", schema = "orm-exercises", catalog = "")
public class CustomerEntity
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;

    @Basic @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;

    @Column(name = "customer_type", nullable = false, length = 255) @Enumerated(value = EnumType.ORDINAL)
    private CustomerType type;

    @ElementCollection
    @CollectionTable(
            name = "hobby",
            joinColumns = @JoinColumn(name = "customer_id")
    )
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private List<String> hobbies = new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    @MapKeyColumn(name = "phoneNumber")
    @Column(name = "phoneDescription")
    @Cascade(org.hibernate.annotations.CascadeType.DELETE)
    private Map<String, String> phoneNumbers = new HashMap<>();

    public void addPhone(String phoneNumber, String description)
    {
        phoneNumbers.put(phoneNumber, description);
    }

    public String getPhoneDescription(String phoneNumber)
    {
        return phoneNumbers.get(phoneNumber);
    }

    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public CustomerType getType()
    {
        return this.type;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setType(CustomerType type)
    {
        this.type = type;
    }

    public void addHobby(String h)
    {
        hobbies.add(h);
    }

    public List<String> getHobbies()
    {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies)
    {
        this.hobbies = hobbies;
    }
}

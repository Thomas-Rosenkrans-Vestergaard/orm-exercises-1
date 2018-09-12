package com.tvestergaard.exercises;

import com.tvestergaard.exercises.entities.BookEntity;
import com.tvestergaard.exercises.entities.CustomerEntity;
import com.tvestergaard.exercises.entities.CustomerType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Tester
{

    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpau");
        EntityManager        em  = emf.createEntityManager();

        BookEntity bookEntity = new BookEntity();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        bookEntity.setTitle("book-1");
        em.persist(bookEntity);
        BookEntity bookEntity2 = new BookEntity();
        bookEntity2.setTitle("book-2");
        em.persist(bookEntity2);
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName("New");
        customerEntity.setLastName("Name");
        customerEntity.setType(CustomerType.IRON);
        customerEntity.addHobby("Gaming");
        customerEntity.addPhone("89348723", "Mobil");
        customerEntity.addPhone("39211233", "Hjem");
        em.persist(customerEntity);
        transaction.commit();
    }
}

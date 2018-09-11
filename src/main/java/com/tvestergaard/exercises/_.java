package com.tvestergaard.exercises;

import com.tvestergaard.exercises.entities.BookEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class _
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
        transaction.commit();
    }
}

package com.mark;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

  public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateTest");
    EntityManager entityManager = factory.createEntityManager();

    entityManager.getTransaction().begin();

    Book book = Book.builder().name("War and Peace").build();

    entityManager.persist(book);
    entityManager.getTransaction().commit();;
    entityManager.close();
    factory.close();
  }
}

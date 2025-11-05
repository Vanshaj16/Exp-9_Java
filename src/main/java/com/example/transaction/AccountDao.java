package com.example.transaction;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
    @PersistenceContext
    private EntityManager entityManager;

    public Account findById(int id) {
        return entityManager.find(Account.class, id);
    }

    public void update(Account acc) {
        entityManager.merge(acc);
    }
}

package com.example.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

    @Autowired
    private AccountDao accountDao;

    @Transactional
    public void transferMoney(int fromId, int toId, double amount) {
        Account from = accountDao.findById(fromId);
        Account to = accountDao.findById(toId);

        if (from.getBalance() < amount) {
            throw new RuntimeException("❌ Insufficient balance!");
        }

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        accountDao.update(from);
        accountDao.update(to);

        System.out.println("💸 Transferred " + amount + " from " + from.getName() + " to " + to.getName());
    }
}

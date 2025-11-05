package com.example.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        BankService bankService = context.getBean(BankService.class);
        bankService.transferMoney(1, 2, 500.0);

        System.out.println("✅ Transaction completed successfully!");
        context.close();
    }
}

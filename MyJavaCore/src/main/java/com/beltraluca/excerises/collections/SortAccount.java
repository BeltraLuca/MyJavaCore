package com.beltraluca.excerises.collections;

import java.time.*;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortAccount {

    public static class Account {
        double amount;
        double interestRate;
        LocalDateTime duePayment;

        public Account(double amount, double interestRate, LocalDateTime duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDateTime duePayment) {
            this.duePayment = duePayment;
        }
    }

    public static void sortByAmount(List<Account> accounts){
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.getAmount(),o2.getAmount());
            }
        });
    }
    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Double.compare(o1.getInterestRate(),o2.getInterestRate());
            }
        });
    }
    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort(new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return o1.getDuePayment().compareTo(o2.getDuePayment());
            }
        });
    }
}

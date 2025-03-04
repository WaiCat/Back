package org.example.stream.tansactionApp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TransactionManager {
    private List<Transaction>transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }


    // 조건에 맞는 트랙잭션 반환
    public List<Transaction> filterTransactions(String type) {
        Predicate<Transaction> predicate = t -> t.getType().equals(type);
        return transactions.stream()
                .filter(predicate).collect(Collectors.toList());
    }

    //트랜잭션 금액 반환
    public List<Double> mapAmounts(double rate) {
        Function<Transaction, Double> function = amount -> amount.getAmount()*(1- rate/100);
        return transactions.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    //트랜잭션 처리
    public void processTransactions(Consumer<Transaction> consumer) {
        for(Transaction t : transactions){
            consumer.accept(t);
        }
    }
}

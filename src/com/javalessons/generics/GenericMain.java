package com.javalessons.generics;

public class GenericMain {

    public static void main(String[] args) {

        Account<String, String> acc1 = new Account("biba", 100);
        Account<Integer,Integer> acc2 = new Account(221122, 100);

        System.out.println(acc1.getId() + " " + acc2.getId());

        acc1.senderMoney(acc1.getId(), "boba");


    }


}

class Account<T, M> implements sender<M> {

    private T id;
    private int money;

    Account(T id, int money) {
        this.id = id;
        this.money = money;

    }

    public T getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public void senderMoney(M id, M id2) {
        System.out.println("Money sent from " + id + " to " + id2);
    }
}

class Transaction <T extends Account>{

}

interface sender<M> {
    void senderMoney(M id, M id2);
}

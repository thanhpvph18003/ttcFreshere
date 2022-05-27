package bai1;

import java.util.*;

class MyBill implements Comparator {
    public static List<MyBill> mybill = new ArrayList<>();
    int id;
    String name;
    long money;
    String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MyBill() {
        super();
    }

    public MyBill(int id, String name, long money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    @Override
    public String toString() {
        return id +"\t" + name +"\t"+money+"\t" + date;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}



package com.itcast;

/**
 * @author wangzhineng
 * @date 2019-10-14 - 17:13
 */
public class Account {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String username;

    private Double balance;

    public Account(String username, Double balance) {
        this.username = username;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

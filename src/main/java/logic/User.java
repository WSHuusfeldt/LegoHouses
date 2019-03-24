/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;



/**
 *
 * @author APC
 */
public class User {
    private String username;
    private int balance;
    private RoleEnum role;

    public User(String username, int balance, RoleEnum role) {
        this.username = username;
        this.balance = balance;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public int getBalance() {
        return balance;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", balance=" + balance + ", role=" + role + '}';
    }
    
}

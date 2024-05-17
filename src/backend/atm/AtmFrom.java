package backend.atm;

import backend.user.UserFrom;
import db.dbConfig.DbConfig;
import helpers.interfaces.iAtmOperations.IAtmOperations;

public class AtmFrom implements IAtmOperations {
    private UserFrom user;
    private int balance;

    public AtmFrom(UserFrom user) {
        this.user = user;
        this.balance = Integer.parseInt(user.getBalance());
    }

    public int getBalance() {
        return balance;
    }

    public boolean deposit(int amount) {
        balance += amount;
        user.setBalance(String.valueOf(balance));
        new DbConfig(user).updateUser();
        return true;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            user.setBalance(String.valueOf(balance));
            new DbConfig(user).updateUser();
            return true;
        }
        return false;
    }

    public String checkBalance() {
        return user.getBalance();
    }

    public boolean changePin(String newPin) {
        user.setPinNumber(newPin.strip());
        new DbConfig(user).updateUser();
        return true;
    }

    public boolean fastCash(String flag) {
        int amount = 0;
        switch (flag) {
            case "100":
                amount = 100;
                break;
            case "500":
                amount = 500;
                break;
            case "1000":
                amount = 1000;
                break;
            case "2000":
                amount = 2000;
                break;
            case "5000":
                amount = 5000;
                break;
            case "10000":
                amount = 10000;
                break;
            case "20000":
                amount = 20000;
                break;
            default:
                break;
        }
        if (balance >= amount) {
            balance -= amount;
            user.setBalance(String.valueOf(balance));
            new DbConfig(user).updateUser();
            return true;
        }
        return false;
    }

}

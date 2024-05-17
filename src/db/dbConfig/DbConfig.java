package db.dbConfig;

import backend.signup.UserFrom;
import helpers.GetPathName;
import helpers.interfaces.iUserOperations.IUserOperations;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class DbConfig implements IUserOperations {
    private UserFrom userFrom;

    public DbConfig() {
    }

    public DbConfig(UserFrom userFrom) {
        this.userFrom = userFrom;
    }

    public void save() {
        // Save data to database
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(userFrom.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserFrom findUserByAccNoAndPass(String accountNumber, String password) {
        // Find user by account number and password
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            while ((data = reader.readLine()) != null) {
                UserFrom user = new UserFrom();
                user = user.parseUserFrom(data);
                if (user.getAccountNumber().trim().equals(accountNumber) && user.getPassword().equals(password)) {
                    return user;

                }
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public UserFrom findUserByCardNoAndPin(String cardNo, String pin) {
        // Find user by card number and pin
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            while ((data = reader.readLine()) != null) {
                UserFrom user = new UserFrom();
                user = user.parseUserFrom(data);
                if (user.getCardNo().trim().equals(cardNo) && user.getPinNumber().trim().equals(pin)) {
                    return user;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public boolean updateUser() {
        // Update user
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            File tempFile = new File(path + "/db/myTempFile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String data;
            while ((data = reader.readLine()) != null) {
                UserFrom user = new UserFrom();
                user = user.parseUserFrom(data);
                if (user.getAccountNumber().equals(userFrom.getAccountNumber())) {
                    writer.write(userFrom.toString());
                } else {
                    writer.write(data);
                }
                writer.newLine();
            }
            writer.close();
            reader.close();
            Files.move(tempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            tempFile.delete();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteUser(String id) {
        // Delete user
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            File tempFile = new File(path + "/db/myTempFile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String data;
            while ((data = reader.readLine()) != null) {
                UserFrom user = new UserFrom();
                user = user.parseUserFrom(data);
                if (user.getAccountNumber().equals(id)) {
                    continue;
                }
                writer.write(data);
                writer.newLine();
            }
            writer.close();
            reader.close();
            Files.move(tempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            tempFile.delete();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public UserFrom[] findAll() {
        // Find all users
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            UserFrom[] users = new UserFrom[100];
            int i = 0;
            while ((data = reader.readLine()) != null) {
                UserFrom user = new UserFrom();
                user = user.parseUserFrom(data);
                users[i] = user;
                i++;
            }
            reader.close();
            return users;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

}

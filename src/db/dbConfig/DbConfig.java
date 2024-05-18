package db.dbConfig;

import helpers.GetPathName;
import helpers.interfaces.iUserOperations.IUserOperations;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import backend.userForm.UserForm;
import backend.adminForm.AdminForm;

public class DbConfig implements IUserOperations {
    private UserForm userForm;
    private AdminForm adminForm;

    public DbConfig() {
    }

    public DbConfig(UserForm userForm) {
        this.userForm = userForm;
    }

    public DbConfig(AdminForm adminForm) {
        this.adminForm = adminForm;
    }

    public void save() {
        // Save data to database
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(userForm.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UserForm findUserByAccNoAndPass(String accountNumber, String password) {
        // Find user by account number and password
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            while ((data = reader.readLine()) != null) {
                UserForm user = new UserForm();
                user = user.parseUserForm(data);
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

    public UserForm findUserByCardNoAndPin(String cardNo, String pin) {
        // Find user by card number and pin
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            while ((data = reader.readLine()) != null) {
                UserForm user = new UserForm();
                user = user.parseUserForm(data);
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
                UserForm user = new UserForm();
                user = user.parseUserForm(data);
                if (user.getAccountNumber().equals(userForm.getAccountNumber())) {
                    writer.write(userForm.toString());
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
                UserForm user = new UserForm();
                user = user.parseUserForm(data);
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

    public UserForm[] findAll() {
        // Find all users
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            UserForm[] users = new UserForm[100];
            int i = 0;
            while ((data = reader.readLine()) != null) {
                UserForm user = new UserForm();
                user = user.parseUserForm(data);
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

    public UserForm findUserById(String id) {
        // Find user by id
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/users-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            while ((data = reader.readLine()) != null) {
                UserForm user = new UserForm();
                user = user.parseUserForm(data);
                if (user.getAccountNumber().equals(id)) {
                    return user;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void saveAdmin() {
        // Save admin data to database
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/admin-logs.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(adminForm.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AdminForm findAdminByEmailAndPass(String email, String password) {
        // Find admin by email and password
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/admin-logs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String data;
            while ((data = reader.readLine()) != null) {
                AdminForm admin = new AdminForm();
                admin = admin.parseAdminForm(data);
                if (admin.getEmail().trim().equals(email) && admin.getPassword().equals(password)) {
                    return admin;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public boolean updateAdmin() {
        // Update admin
        String path = GetPathName.getPathName();
        try {
            File file = new File(path + "/db/admin-logs.txt");
            File tempFile = new File(path + "/db/myTempFile.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
            String data;
            while ((data = reader.readLine()) != null) {
                AdminForm admin = new AdminForm();
                admin = admin.parseAdminForm(data);
                if (admin.getEmail().equals(adminForm.getEmail())) {
                    writer.write(adminForm.toString());
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

}

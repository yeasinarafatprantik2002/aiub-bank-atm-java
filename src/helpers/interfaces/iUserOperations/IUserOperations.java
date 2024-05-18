package helpers.interfaces.iUserOperations;

import backend.userForm.UserForm;

public interface IUserOperations {

    public void save();

    public UserForm findUserByAccNoAndPass(String accountNumber, String Password);

    public UserForm findUserByCardNoAndPin(String cardNo, String pin);

    public boolean updateUser();

    public boolean deleteUser(String id);

    public UserForm[] findAll();

}
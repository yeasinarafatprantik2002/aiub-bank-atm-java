package helpers.interfaces.iUserOperations;

import backend.user.UserFrom;

public interface IUserOperations {

    public void save();

    public UserFrom findUserByAccNoAndPass(String accountNumber, String Password);

    public UserFrom findUserByCardNoAndPin(String cardNo, String pin);

    public boolean updateUser();

    public boolean deleteUser(String id);

    public UserFrom[] findAll();

}
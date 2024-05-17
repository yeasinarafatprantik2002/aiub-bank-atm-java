package helpers.interfaces.iAtmOperations;

/**
 * InnerIAtmOperations
 */
public interface IAtmOperations {

    public boolean withdraw(int amount);

    public boolean deposit(int amount);

    public boolean fastCash(String flag);

    public String checkBalance();

    public boolean changePin(String newPin);

}

package backend.userForm;

import backend.user.User;

public class UserForm extends User {

    private String role = "user";

    public UserForm() {
    }

    public UserForm(String accountNumber, String password, String name, String fname, String gender, String email,
            String maritalStatus,
            String add,
            String city, String state,
            String pinCode,
            String religion, String category, String income, String education, String occupation, String pan,
            String aadhar, String senior,
            String existing, String accountType, String cardNo, String pinNumber, String services, String date,
            String balance) {
        super(accountNumber, password, name, fname, gender, email,
                maritalStatus,
                add,
                city, state,
                pinCode,
                religion, category, income, education, occupation, pan,
                aadhar, senior,
                existing, accountType, cardNo, pinNumber, services, date,
                balance);

    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        String data = super.toString() + "#" + role;

        return data;
    }

    public UserForm parseUserForm(String data) {
        String[] values = data.trim().split("#");
        String accountNumber = values[0];
        String password = values[1];
        String name = values[2];
        String fname = values[3];
        String gender = values[4];
        String email = values[5];
        String maritalStatus = values[6];
        String add = values[7];
        String city = values[8];
        String state = values[9];
        String pinCode = values[10];
        String religion = values[11];
        String category = values[12];
        String income = values[13];
        String education = values[14];
        String occupation = values[15];
        String pan = values[16];
        String aadhar = values[17];
        String senior = values[18];
        String existing = values[19];
        String accountType = values[20];
        String cardNo = values[21];
        String pinNumber = values[22];
        String services = values[23];
        String date = values[24];
        String balance = values[25];
        String role = values[26];

        UserForm user = new UserForm();
        user.setAccountNumber(accountNumber);
        user.setPassword(password);
        user.setName(name);
        user.setFname(fname);
        user.setGender(gender);
        user.setEmail(email);
        user.setMaritalStatus(maritalStatus);
        user.setAdd(add);
        user.setCity(city);
        user.setState(state);
        user.setPinCode(pinCode);
        user.setReligion(religion);
        user.setCategory(category);
        user.setIncome(income);
        user.setEducation(education);
        user.setOccupation(occupation);
        user.setPan(pan);
        user.setAadhar(aadhar);
        user.setSenior(senior);
        user.setExisting(existing);
        user.setAccountType(accountType);
        user.setCardNo(cardNo);
        user.setPinNumber(pinNumber);
        user.setServices(services);
        user.setDate(date);
        user.setBalance(balance);
        user.setRole(role);

        return user;
    }

}

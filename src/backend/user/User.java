package backend.user;

public abstract class User {
    private String name;
    private String fname;;
    private String email;
    private String maritalStatus;
    private String add;
    private String city;
    private String state;
    private String pinCode;
    private String gender;
    private String religion;
    private String category;
    private String income;
    private String education;
    private String pan;
    private String aadhar;
    private String senior;
    private String existing;
    private String accountType;
    private String cardNo;
    private String services;
    private String date;
    private String balance;
    private String accountNumber;
    private String pinNumber;
    private String password;
    private String occupation;

    public User() {
    }

    public User(String accountNumber, String password, String name, String fname, String gender, String email,
            String maritalStatus,
            String add,
            String city, String state,
            String pinCode,
            String religion, String category, String income, String education, String occupation, String pan,
            String aadhar, String senior,
            String existing, String accountType, String cardNo, String pinNumber, String services, String date,
            String balance) {
        this.name = name;
        this.fname = fname;
        this.gender = gender;
        this.email = email;
        this.maritalStatus = maritalStatus;
        this.add = add;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.religion = religion;
        this.category = category;
        this.income = income;
        this.education = education;
        this.occupation = occupation;
        this.pan = pan;
        this.aadhar = aadhar;
        this.senior = senior;
        this.existing = existing;
        this.accountType = accountType;
        this.cardNo = cardNo;
        this.pinNumber = pinNumber;
        this.services = services;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.password = password;
        this.date = date;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public String getEmail() {
        return email;
    }

    public String getAdd() {
        return add;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getGender() {
        return gender;
    }

    public String getReligion() {
        return religion;
    }

    public String getCategory() {
        return category;
    }

    public String getIncome() {
        return income;
    }

    public String getEducation() {
        return education;
    }

    public String getPan() {
        return pan;
    }

    public String getAadhar() {
        return aadhar;
    }

    public String getSenior() {
        return senior;
    }

    public String getExisting() {
        return existing;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getServices() {
        return services;
    }

    public String getDate() {
        return date;
    }

    public String getBalance() {
        return balance;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    public void setExisting(String existing) {
        this.existing = existing;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    @Override
    public String toString() {
        String data = accountNumber + "#" + password + "#" + name + "#" + fname + "#" + gender + "#" + email + "#"
                + maritalStatus
                + "#" + add + "#" + city + "#" + state + "#" + pinCode + "#" + religion + "#" + category + "#" + income
                + "#" + education + "#" + occupation + "#" + pan + "#"
                + aadhar + "#"
                + senior + "#"
                + existing + "#" + accountType + "#" + cardNo + "#" + pinNumber + "#" + services + "#" + date + "#"
                + balance;

        return data;
    }

}

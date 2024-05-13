package backend.signup;

public class SignupForm {
    private String name;
    private String fname;;
    private String email;
    private String maritalStatus;
    private String add;
    private String city;
    private String state;
    private String pin;
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

    private String data;

    public SignupForm(String accountNumber, String password, String name, String fname, String gender, String email,
            String maritalStatus,
            String add,
            String city, String state,
            String pin,
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
        this.pin = pin;
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

    public String getPin() {
        return pin;
    }

    public String getGender() {
        return gender;
    }

    public String getReligion() {
        return religion;
    }

    public String getPinCode() {
        return pin;
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

    public void setPin(String pin) {
        this.pin = pin;
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
        data = "Account Number = " + accountNumber + "\n" + "Password = " + password + "\n" + "Pin Number = "
                + pinNumber
                + "\n"
                + "Card Number = " + cardNo + "\n"
                + "State = " + state + "\n" + "City = "
                + city + "\n" + "Pin Code = " + pin
                + "\n" + "Address = " + add
                + "\n" + "Email = " + email + "\n" + "Marital Status = " + maritalStatus + "\n" + "Father's Name = "
                + fname + "\n" + "Name = " + name + "\n"
                + "Gender = " + gender + "\n"
                + "Religion = " + religion + "\n" + "Category = " + category + "\n" + "Income = " + income + "\n"
                + "Education = " + education + "\n" + "Occupation = " + occupation + "\n" + "PAN = " + pan + "\n"
                + "Aadhar = " + aadhar + "\n"
                + "Senior Citizen = " + senior + "\n" + "Existing Account = " + existing + "\n" + "Account Type = "
                + accountType + "\n" + "Services = " + services + "\n" + "Date = " + date + "\n" + "Balance = "
                + balance + "\n";
        return data;
    }

    public void delete() {
        data = "";

    }

    public static SignupForm parse(String accountNumberLine, String passsworLne, String pinNumberLine,
            String cardNoLine,
            String stateLine,
            String cityLine, String pinCodeLine, String addLine,
            String emailLine, String maritalStatusLine, String fnameLine, String nameLine, String genderLine,
            String religionLine,
            String categoryLine,
            String incomeLine, String educationLine, String occupationLine, String panLine, String aadharLine,
            String seniorLine,
            String existingLine, String accountTypeLine, String servicesLine, String dateLine, String balanceLine) {

        String[] accountNumberParts = accountNumberLine.split("=");
        String accountNumber = accountNumberParts[1].trim();

        String[] passwordParts = passsworLne.split("=");
        String password = passwordParts[1].trim();

        String[] pinNumberParts = pinNumberLine.split("=");
        int pinNumber = Integer.parseInt(pinNumberParts[1].trim());

        String[] cardNoParts = cardNoLine.split("=");
        String cardNo = cardNoParts[1].trim();

        String[] stateParts = stateLine.split("=");
        String state = stateParts[1].trim();

        String[] cityParts = cityLine.split("=");
        String city = cityParts[1].trim();

        String[] pinCodeParts = pinCodeLine.split("=");
        String pinCode = pinCodeParts[1].trim();

        String[] addParts = addLine.split("=");
        String add = addParts[1].trim();

        String[] emailParts = emailLine.split("=");
        String email = emailParts[1].trim();

        String[] maritalStatusParts = maritalStatusLine.split("=");
        String maritalStatus = maritalStatusParts[1].trim();

        String[] fnameParts = fnameLine.split("=");
        String fname = fnameParts[1].trim();

        String[] nameParts = nameLine.split("=");
        String name = nameParts[1].trim();

        String[] genderParts = genderLine.split("=");
        String gender = genderParts[1].trim();

        String[] religionParts = religionLine.split("=");
        String religion = religionParts[1].trim();

        String[] categoryParts = categoryLine.split("=");
        String category = categoryParts[1].trim();

        String[] incomeParts = incomeLine.split("=");
        String income = incomeParts[1].trim();

        String[] educationParts = educationLine.split("=");
        String education = educationParts[1].trim();

        String[] occupationParts = occupationLine.split("=");
        String occupation = occupationParts[1].trim();

        String[] panParts = panLine.split("=");
        String pan = panParts[1].trim();

        String[] aadharParts = aadharLine.split("=");
        String aadhar = aadharParts[1].trim();

        String[] seniorParts = seniorLine.split("=");
        String senior = seniorParts[1].trim();

        String[] existingParts = existingLine.split("=");
        String existing = existingParts[1].trim();

        String[] accountTypeParts = accountTypeLine.split("=");
        String accountType = accountTypeParts[1].trim();

        String[] servicesParts = servicesLine.split("=");
        String services = servicesParts[1].trim();

        String[] dateParts = dateLine.split("=");
        String date = dateParts[1].trim();

        String[] balanceParts = balanceLine.split("=");
        int balance = Integer.parseInt(balanceParts[1].trim());

        return new SignupForm(accountNumber, password, name, fname, gender, email, maritalStatus, add, city, state,
                pinCode,
                religion, category, income, education, occupation, pan, aadhar, senior, existing, accountType, cardNo,
                pinNumber + "", services, date, balance + "");
    }

}

package backend.signup;

public class SignupForm {
    private String name;
    private String fname;;
    private String email;
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

    private String data;

    public SignupForm(String name, String fname, String gender, String email, String add, String city, String state,
            String pin,
            String religion, String category, String income, String education, String pan, String aadhar, String senior,
            String existing, String accountType, String cardNo, String services, String date) {
        this.name = name;
        this.fname = fname;
        this.gender = gender;
        this.email = email;
        this.add = add;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.religion = religion;
        this.category = category;
        this.income = income;
        this.education = education;
        this.pan = pan;
        this.aadhar = aadhar;
        this.senior = senior;
        this.existing = existing;
        this.accountType = accountType;
        this.cardNo = cardNo;
        this.services = services;
        this.date = date;

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

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    @Override
    public String toString() {
        data = "Pin Code = " + pin + "\n" + "Card Number = " + cardNo + "\n" + "State = " + state + "\n" + "City = "
                + city
                + "\n" + "Address = " + add
                + "\n" + "Email = " + email + "\n" + "Father's Name = " + fname + "\n" + "Name = " + name + "\n"
                + "Gender = " + gender + "\n"
                + "Religion = " + religion + "\n" + "Category = " + category + "\n" + "Income = " + income + "\n"
                + "Education = " + education + "\n" + "PAN = " + pan + "\n" + "Aadhar = " + aadhar + "\n"
                + "Senior Citizen = " + senior + "\n" + "Existing Account = " + existing + "\n" + "Account Type = "
                + accountType + "\n" + "Services = " + services + "\n" + "Date = " + date + "\n";
        return data;
    }

    public void delete() {
        data = "";
        
    }

    public static SignupForm parse(String pinLine, String cardNoLine, String stateLine, String cityLine, String addLine,
            String emailLine, String fnameLine, String nameLine, String genderLine, String religionLine,
            String categoryLine,
            String incomeLine, String educationLine, String panLine, String aadharLine, String seniorLine,
            String existingLine, String accountTypeLine, String servicesLine, String dateLine) {

        String[] pinParts = pinLine.split("=");
        int pin = Integer.parseInt(pinParts[1].trim());

        String[] cardNoParts = cardNoLine.split("=");
        int cardNo = Integer.parseInt(cardNoParts[1].trim());

        String[] stateParts = stateLine.split("=");
        String state = stateParts[1].trim();

        String[] cityParts = cityLine.split("=");
        String city = cityParts[1].trim();

        String[] addParts = addLine.split("=");
        String add = addParts[1].trim();

        String[] emailParts = emailLine.split("=");
        String email = emailParts[1].trim();

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

        return new SignupForm(name, fname, gender, email, add, city, state, String.valueOf(pin), religion, category,
                income,
                education, pan, aadhar, senior, existing, accountType, String.valueOf(cardNo), services, date);
    }

}

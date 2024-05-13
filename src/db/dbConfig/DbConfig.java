package db.dbConfig;

import backend.signup.SignupForm;
import helpers.GetPathName;

import java.io.*;

public class DbConfig {
    private SignupForm signupForm;

    public DbConfig() {
    }

    public DbConfig(SignupForm signupForm) {
        this.signupForm = signupForm;
    }

    public void save() {
        // Save data to database
        String path = GetPathName.getPathName();
        try (PrintWriter writer = new PrintWriter(new FileWriter(path + "/db/db.txt", true))) {
            writer.print(signupForm);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SignupForm findUserByAccNoAndPass(String accountNumber, String Password) {
        // Find user by account number and password
        String path = GetPathName.getPathName();
        try (BufferedReader reader = new BufferedReader(new FileReader(path + "/db/db.txt"))) {
            String accountNumberLine;
            String passsworLne;
            String pinNumberLine;
            String cardNoLine;
            String stateLine;
            String cityLine;
            String pinCodeLine;
            String addLine;
            String emailLine;
            String maritalStatusLine;
            String fnameLine;
            String nameLine;
            String genderLine;
            String religionLine;
            String categoryLine;
            String incomeLine;
            String educationLine;
            String occupationLine;
            String panLine;
            String aadharLine;
            String seniorLine;
            String existingLine;
            String accountTypeLine;
            String servicesLine;
            String dateLine;
            String balanceLine;

            while ((accountNumberLine = reader.readLine()) != null &&
                    (passsworLne = reader.readLine()) != null &&
                    (pinNumberLine = reader.readLine()) != null &&
                    (cardNoLine = reader.readLine()) != null &&
                    (stateLine = reader.readLine()) != null &&
                    (cityLine = reader.readLine()) != null &&
                    (pinCodeLine = reader.readLine()) != null &&
                    (addLine = reader.readLine()) != null &&
                    (emailLine = reader.readLine()) != null &&
                    (maritalStatusLine = reader.readLine()) != null &&
                    (fnameLine = reader.readLine()) != null &&
                    (nameLine = reader.readLine()) != null &&
                    (genderLine = reader.readLine()) != null &&
                    (religionLine = reader.readLine()) != null &&
                    (categoryLine = reader.readLine()) != null &&
                    (incomeLine = reader.readLine()) != null &&
                    (educationLine = reader.readLine()) != null &&
                    (occupationLine = reader.readLine()) != null &&
                    (panLine = reader.readLine()) != null &&
                    (aadharLine = reader.readLine()) != null &&
                    (seniorLine = reader.readLine()) != null &&
                    (existingLine = reader.readLine()) != null &&
                    (accountTypeLine = reader.readLine()) != null &&
                    (servicesLine = reader.readLine()) != null &&
                    (dateLine = reader.readLine()) != null &&
                    (balanceLine = reader.readLine()) != null) {
                if (!accountNumberLine.isEmpty() && !passsworLne.isEmpty() && !pinNumberLine.isEmpty()
                        && !cardNoLine.isEmpty() && !stateLine.isEmpty() && !cityLine.isEmpty()
                        && !pinCodeLine.isEmpty() && !addLine.isEmpty() && !emailLine.isEmpty()
                        && !maritalStatusLine.isEmpty() &&
                        !fnameLine.isEmpty()
                        && !nameLine.isEmpty() && !genderLine.isEmpty() && !religionLine.isEmpty()
                        && !categoryLine.isEmpty() && !incomeLine.isEmpty() && !educationLine.isEmpty()
                        && !occupationLine.isEmpty() &&
                        !panLine.isEmpty() && !aadharLine.isEmpty() && !seniorLine.isEmpty()
                        && !existingLine.isEmpty() && !accountTypeLine.isEmpty() && !servicesLine.isEmpty()
                        && !dateLine.isEmpty() && !balanceLine.isEmpty()) {
                    try {
                        SignupForm user = SignupForm.parse(accountNumberLine, passsworLne, pinNumberLine, cardNoLine,
                                stateLine, cityLine, pinCodeLine, addLine, emailLine, maritalStatusLine, fnameLine,
                                nameLine, genderLine,
                                religionLine, categoryLine, incomeLine, educationLine, occupationLine, panLine,
                                aadharLine, seniorLine,
                                existingLine, accountTypeLine, servicesLine, dateLine, balanceLine);
                        if (user.getAccountNumber().equals(accountNumber) && user.getPassword().equals(Password)) {
                            return user;
                        }

                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

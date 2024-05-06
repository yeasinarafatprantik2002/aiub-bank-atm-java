package db.dbConfig;

import backend.signup.SignupForm;
import helpers.GetPathName;

import java.io.*;

public class DbConfig {
    private SignupForm signupForm;

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

    public SignupForm findUserByPinAndCardNo(String pin, String cardNo) {
        // Find user by pin
        String path = GetPathName.getPathName();
        try (BufferedReader reader = new BufferedReader(new FileReader(path + "/db/db.txt"))) {
            String pinLine;
            String cardNoLine;
            String stateLine;
            String cityLine;
            String addLine;
            String emailLine;
            String fnameLine;
            String nameLine;
            String genderLine;
            String religionLine;
            String categoryLine;
            String incomeLine;
            String educationLine;
            String panLine;
            String aadharLine;
            String seniorLine;
            String existingLine;
            String accountTypeLine;
            String servicesLine;
            String dateLine;

            while ((pinLine = reader.readLine()) != null &&
                    (cardNoLine = reader.readLine()) != null &&
                    (stateLine = reader.readLine()) != null &&
                    (cityLine = reader.readLine()) != null &&
                    (addLine = reader.readLine()) != null &&
                    (emailLine = reader.readLine()) != null &&
                    (fnameLine = reader.readLine()) != null &&
                    (nameLine = reader.readLine()) != null &&
                    (genderLine = reader.readLine()) != null &&
                    (religionLine = reader.readLine()) != null &&
                    (categoryLine = reader.readLine()) != null &&
                    (incomeLine = reader.readLine()) != null &&
                    (educationLine = reader.readLine()) != null &&
                    (panLine = reader.readLine()) != null &&
                    (aadharLine = reader.readLine()) != null &&
                    (seniorLine = reader.readLine()) != null &&
                    (existingLine = reader.readLine()) != null &&
                    (accountTypeLine = reader.readLine()) != null &&
                    (servicesLine = reader.readLine()) != null &&
                    (dateLine = reader.readLine()) != null) {
                if (!pinLine.isEmpty() &&
                        !cardNoLine.isEmpty() &&
                        !stateLine.isEmpty() &&
                        !cityLine.isEmpty() &&
                        !addLine.isEmpty() &&
                        !emailLine.isEmpty() &&
                        !fnameLine.isEmpty() &&
                        !nameLine.isEmpty() &&
                        !genderLine.isEmpty() &&
                        !religionLine.isEmpty() &&
                        !categoryLine.isEmpty() &&
                        !incomeLine.isEmpty() &&
                        !educationLine.isEmpty() &&
                        !panLine.isEmpty() &&
                        !aadharLine.isEmpty() &&
                        !seniorLine.isEmpty() &&
                        !existingLine.isEmpty() &&
                        !accountTypeLine.isEmpty() &&
                        !servicesLine.isEmpty() &&
                        !dateLine.isEmpty()) {
                    try {
                        SignupForm user = SignupForm.parse(pinLine, cardNoLine, stateLine, cityLine, addLine, emailLine,
                                fnameLine, nameLine, genderLine, religionLine, categoryLine, incomeLine, educationLine,
                                panLine,
                                aadharLine, seniorLine, existingLine, accountTypeLine, servicesLine, dateLine);
                        if (user.getPin() == pin && user.getCardNo() == cardNo) {
                            return user;
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing user data" + e.getMessage());
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    public SignupForm[] findAllUser() {
        // Find all users
        String path = GetPathName.getPathName();
        try (BufferedReader reader = new BufferedReader(new FileReader(path + "/db/db.txt"))) {
            String pinLine;
            String cardNoLine;
            String stateLine;
            String cityLine;
            String addLine;
            String emailLine;
            String fnameLine;
            String nameLine;
            String genderLine;
            String religionLine;
            String categoryLine;
            String incomeLine;
            String educationLine;
            String panLine;
            String aadharLine;
            String seniorLine;
            String existingLine;
            String accountTypeLine;
            String servicesLine;
            String dateLine;

            SignupForm[] users = new SignupForm[100];
            int i = 0;
            while ((pinLine = reader.readLine()) != null &&
                    (cardNoLine = reader.readLine()) != null &&
                    (stateLine = reader.readLine()) != null &&
                    (cityLine = reader.readLine()) != null &&
                    (addLine = reader.readLine()) != null &&
                    (emailLine = reader.readLine()) != null &&
                    (fnameLine = reader.readLine()) != null &&
                    (nameLine = reader.readLine()) != null &&
                    (genderLine = reader.readLine()) != null &&
                    (religionLine = reader.readLine()) != null &&
                    (categoryLine = reader.readLine()) != null &&
                    (incomeLine = reader.readLine()) != null &&
                    (educationLine = reader.readLine()) != null &&
                    (panLine = reader.readLine()) != null &&
                    (aadharLine = reader.readLine()) != null &&
                    (seniorLine = reader.readLine()) != null &&
                    (existingLine = reader.readLine()) != null &&
                    (accountTypeLine = reader.readLine()) != null &&
                    (servicesLine = reader.readLine()) != null &&
                    (dateLine = reader.readLine()) != null) {
                if (!pinLine.isEmpty() &&
                        !cardNoLine.isEmpty() &&
                        !stateLine.isEmpty() &&
                        !cityLine.isEmpty() &&
                        !addLine.isEmpty() &&
                        !emailLine.isEmpty() &&
                        !fnameLine.isEmpty() &&
                        !nameLine.isEmpty() &&
                        !genderLine.isEmpty() &&
                        !religionLine.isEmpty() &&
                        !categoryLine.isEmpty() &&
                        !incomeLine.isEmpty() &&
                        !educationLine.isEmpty() &&
                        !panLine.isEmpty() &&
                        !aadharLine.isEmpty() &&
                        !seniorLine.isEmpty() &&
                        !existingLine.isEmpty() &&
                        !accountTypeLine.isEmpty() &&
                        !servicesLine.isEmpty() &&
                        !dateLine.isEmpty()) {
                    try {
                        SignupForm user = SignupForm.parse(pinLine, cardNoLine, stateLine, cityLine, addLine, emailLine,
                                fnameLine, nameLine, genderLine, religionLine, categoryLine, incomeLine, educationLine,
                                panLine,
                                aadharLine, seniorLine, existingLine, accountTypeLine, servicesLine, dateLine);
                        users[i] = user;
                        i++;
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing user data" + e.getMessage());
                    }

                }

            }
            return users;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public SignupForm updatePinByCardNo(String cardNo, String data) {
        // Update user by card number
        String path = GetPathName.getPathName();
        try (BufferedReader reader = new BufferedReader(new FileReader(path + "/db/db.txt"))) {
            String pinLine;
            String cardNoLine;
            String stateLine;
            String cityLine;
            String addLine;
            String emailLine;
            String fnameLine;
            String nameLine;
            String genderLine;
            String religionLine;
            String categoryLine;
            String incomeLine;
            String educationLine;
            String panLine;
            String aadharLine;
            String seniorLine;
            String existingLine;
            String accountTypeLine;
            String servicesLine;
            String dateLine;

            while ((pinLine = reader.readLine()) != null &&
                    (cardNoLine = reader.readLine()) != null &&
                    (stateLine = reader.readLine()) != null &&
                    (cityLine = reader.readLine()) != null &&
                    (addLine = reader.readLine()) != null &&
                    (emailLine = reader.readLine()) != null &&
                    (fnameLine = reader.readLine()) != null &&
                    (nameLine = reader.readLine()) != null &&
                    (genderLine = reader.readLine()) != null &&
                    (religionLine = reader.readLine()) != null &&
                    (categoryLine = reader.readLine()) != null &&
                    (incomeLine = reader.readLine()) != null &&
                    (educationLine = reader.readLine()) != null &&
                    (panLine = reader.readLine()) != null &&
                    (aadharLine = reader.readLine()) != null &&
                    (seniorLine = reader.readLine()) != null &&
                    (existingLine = reader.readLine()) != null &&
                    (accountTypeLine = reader.readLine()) != null &&
                    (servicesLine = reader.readLine()) != null &&
                    (dateLine = reader.readLine()) != null) {
                if (!pinLine.isEmpty() &&
                        !cardNoLine.isEmpty() &&
                        !stateLine.isEmpty() &&
                        !cityLine.isEmpty() &&
                        !addLine.isEmpty() &&
                        !emailLine.isEmpty() &&
                        !fnameLine.isEmpty() &&
                        !nameLine.isEmpty() &&
                        !genderLine.isEmpty() &&
                        !religionLine.isEmpty() &&
                        !categoryLine.isEmpty() &&
                        !incomeLine.isEmpty() &&
                        !educationLine.isEmpty() &&
                        !panLine.isEmpty() &&
                        !aadharLine.isEmpty() &&
                        !seniorLine.isEmpty() &&
                        !existingLine.isEmpty() &&
                        !accountTypeLine.isEmpty() &&
                        !servicesLine.isEmpty() &&
                        !dateLine.isEmpty()) {
                    try {

                        SignupForm user = SignupForm.parse(pinLine, cardNoLine, stateLine, cityLine, addLine, emailLine,
                                fnameLine, nameLine, genderLine, religionLine, categoryLine, incomeLine, educationLine,
                                panLine,
                                aadharLine, seniorLine, existingLine, accountTypeLine, servicesLine, dateLine);
                        if (user.getCardNo() == cardNo) {
                            user.setPin(data);
                            return user;

                        }

                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing user data" + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteByCardNo(String cardNo) {
        // Delete user by card number
        String path = GetPathName.getPathName();
        try (BufferedReader reader = new BufferedReader(new FileReader(path + "/db/db.txt"))) {
            String pinLine;
            String cardNoLine;
            String stateLine;
            String cityLine;
            String addLine;
            String emailLine;
            String fnameLine;
            String nameLine;
            String genderLine;
            String religionLine;
            String categoryLine;
            String incomeLine;
            String educationLine;
            String panLine;
            String aadharLine;
            String seniorLine;
            String existingLine;
            String accountTypeLine;
            String servicesLine;
            String dateLine;

            while ((pinLine = reader.readLine()) != null &&
                    (cardNoLine = reader.readLine()) != null &&
                    (stateLine = reader.readLine()) != null &&
                    (cityLine = reader.readLine()) != null &&
                    (addLine = reader.readLine()) != null &&
                    (emailLine = reader.readLine()) != null &&
                    (fnameLine = reader.readLine()) != null &&
                    (nameLine = reader.readLine()) != null &&
                    (genderLine = reader.readLine()) != null &&
                    (religionLine = reader.readLine()) != null &&
                    (categoryLine = reader.readLine()) != null &&
                    (incomeLine = reader.readLine()) != null &&
                    (educationLine = reader.readLine()) != null &&
                    (panLine = reader.readLine()) != null &&
                    (aadharLine = reader.readLine()) != null &&
                    (seniorLine = reader.readLine()) != null &&
                    (existingLine = reader.readLine()) != null &&
                    (accountTypeLine = reader.readLine()) != null &&
                    (servicesLine = reader.readLine()) != null &&
                    (dateLine = reader.readLine()) != null) {
                if (!pinLine.isEmpty() &&
                        !cardNoLine.isEmpty() &&
                        !stateLine.isEmpty() &&
                        !cityLine.isEmpty() &&
                        !addLine.isEmpty() &&
                        !emailLine.isEmpty() &&
                        !fnameLine.isEmpty() &&
                        !nameLine.isEmpty() &&
                        !genderLine.isEmpty() &&
                        !religionLine.isEmpty() &&
                        !categoryLine.isEmpty() &&
                        !incomeLine.isEmpty() &&
                        !educationLine.isEmpty() &&
                        !panLine.isEmpty() &&
                        !aadharLine.isEmpty() &&
                        !seniorLine.isEmpty() &&
                        !existingLine.isEmpty() &&
                        !accountTypeLine.isEmpty() &&
                        !servicesLine.isEmpty() &&
                        !dateLine.isEmpty()) {
                    try {
                        SignupForm user = SignupForm.parse(pinLine, cardNoLine, stateLine, cityLine, addLine, emailLine,
                                fnameLine, nameLine, genderLine, religionLine, categoryLine, incomeLine, educationLine,
                                panLine,
                                aadharLine, seniorLine, existingLine, accountTypeLine, servicesLine, dateLine);
                        if (user.getCardNo() == cardNo) {
                            user.delete();
                            
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing user data" + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

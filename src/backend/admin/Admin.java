package backend.admin;

public class Admin {
    private String name;
    private String email;
    private String password;
    private String gender;
    private static String id;
    private static int count = 0;

    static {
        id = "A" + String.format("%03d", count);
    }

    {
        count++;
    }

    public Admin() {
    }

    public Admin(String name, String email, String gender, String password) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.password = password;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String data = id + "#" + name + "#" + email + "#" + password + "#" + gender;

        return data;

    }
}

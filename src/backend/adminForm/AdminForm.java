package backend.adminForm;

import backend.admin.Admin;

public class AdminForm extends Admin {

    private String role = "admin";
    private String id;

    public AdminForm() {
        super();
    }

    public AdminForm(String name, String email, String password, String gender) {
        super(name, email, gender, password);

    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String data = super.toString() + "#" + role;

        return data;

    }

    public AdminForm parseAdminForm(String data) {
        String[] values = data.trim().split("#");
        id = values[0];
        String name = values[1];
        String email = values[2];
        String password = values[3];
        String gender = values[4];

        return new AdminForm(name, email, password, gender);
    }

}

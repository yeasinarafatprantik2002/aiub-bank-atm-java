package backend.adminForm;

import backend.admin.Admin;

public class AdminForm extends Admin {

    private String role = "admin";

    public AdminForm() {
        super();
    }

    public AdminForm(String name, String email, String password) {
        super(name, email, password);

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

    public AdminForm parseAdminForm(String data) {
        String[] values = data.trim().split("#");
        String name = values[0];
        String email = values[1];
        String password = values[2];

        return new AdminForm(name, email, password);
    }

}

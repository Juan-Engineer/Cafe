
package models;

public class Employees {
    private int id;
    private String full_name;
    private String username;
    private String address;
    private String phone;
    private String mail;
    private String password;
    private String role;
    private String created;
    private String updated;
    
    //Constructor sin parámetros
    public Employees() {
    }
    
    //Constructor con parámetros
    public Employees(int id, String full_name, String username, String address, String phone, String mail, String password, String role, String created, String updated) {
        this.id = id;
        this.full_name = full_name;
        this.username = username;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
        this.role = role;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
    
    
    
}

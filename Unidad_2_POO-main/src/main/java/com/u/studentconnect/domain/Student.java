//package com.u.domain;
package com.u.studentconnect.domain;

public class Student {
    private String fullName;
    private String address;
    private String phone;
    private String email;
    public Student(String fullName, String address, String phone,
        String email) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    public String getFullName() { return fullName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    @Override
    public String toString() {
        return String.format("Estudiante: %s | Dir: %s | Tel: %s | E-mail: %s",
        fullName, address, phone, email);
    }
}
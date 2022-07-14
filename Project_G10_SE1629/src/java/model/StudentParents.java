/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NCC
 */
public class StudentParents {

    private int id;
    private String firstName, lastName;
    private boolean gender;
    private String date, phone, gmail, address;
    private Campus campus;
    private User user;
    private Student student;

    public StudentParents() {
    }

    public StudentParents(int id, String firstName, String lastName, boolean gender, String date, String phone, String gmail, String address, Campus campus, User user, Student student) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.date = date;
        this.phone = phone;
        this.gmail = gmail;
        this.address = address;
        this.campus = campus;
        this.user = user;
        this.student = student;
    }

    public StudentParents(int id, String firstName, String lastName, boolean gender, String date, String phone, String gmail, String address, Campus campus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.date = date;
        this.phone = phone;
        this.gmail = gmail;
        this.address = address;
        this.campus = campus;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentParents{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", date=" + date + ", phone=" + phone + ", gmail=" + gmail + ", address=" + address + ", campus=" + campus + ", user=" + user + ", student=" + student + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NCC
 */
public class Student {

    private int id;
    private String firstName, lastName;
    private boolean gender;
    private String dateOfBirth, phone, gmail, address, dateOfStart, dateOfEnd;
    private Specializedin specializedin;
    private Campus campus;
    private Status status;
    private byte[] imgStudent;
    private String codeStudent;
    private User user;
    private boolean active;

    public Student() {
    }

    public Student(int id, boolean active) {
        this.id = id;
        this.active = active;
    }

    public Student(int id, String firstName, String lastName, boolean gender, String dateOfBirth, String phone, String gmail, String address, String dateOfStart, String dateOfEnd, Specializedin specializedin, Campus campus, Status status, byte[] imgStudent, String codeStudent, User user, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gmail = gmail;
        this.address = address;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.specializedin = specializedin;
        this.campus = campus;
        this.status = status;
        this.imgStudent = imgStudent;
        this.codeStudent = codeStudent;
        this.user = user;
        this.active = active;
    }

    public Student(String firstName, String lastName, boolean gender, String dateOfBirth, String phone, String gmail, Specializedin specializedin, Campus campus, User user) {
        this.id = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gmail = gmail;
        this.specializedin = specializedin;
        this.campus = campus;
        this.user = user;

    }

    public Student(int id, String firstName, String lastName, boolean gender, String dateOfBirth, String phone, String gmail, String address, String dateOfStart, String dateOfEnd, Specializedin specializedin, Campus campus, Status status, String codeStudent) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gmail = gmail;
        this.address = address;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.specializedin = specializedin;
        this.campus = campus;
        this.status = status;
        this.codeStudent = codeStudent;
    }

    public Student(int id, String firstName, String lastName, boolean gender, String dateOfBirth, String phone, String gmail, String address, String dateOfStart, String dateOfEnd, Specializedin specializedin, Campus campus, Status status, String codeStudent, User user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.gmail = gmail;
        this.address = address;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.specializedin = specializedin;
        this.campus = campus;
        this.status = status;
        this.codeStudent = codeStudent;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public String getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(String dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public Specializedin getSpecializedin() {
        return specializedin;
    }

    public void setSpecializedin(Specializedin specializedin) {
        this.specializedin = specializedin;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public byte[] getImgStudent() {
        return imgStudent;
    }

    public void setImgStudent(byte[] imgStudent) {
        this.imgStudent = imgStudent;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone + ", gmail=" + gmail + ", address=" + address + ", dateOfStart=" + dateOfStart + ", dateOfEnd=" + dateOfEnd + ", specializedin=" + specializedin.toString() + ", campus=" + campus.toString() + ", user=" + user.toString() + '}';
    }

}

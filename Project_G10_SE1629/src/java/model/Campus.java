/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NCC
 */
public class Campus {

    private int id;
    private String name,address, dateOfStart, dateOfEnd;

    public Campus() {
    }

    public Campus(int id) {
        this.id = id;
    }

    public Campus(int id, String name, String address, String dateOfStart, String dateOfEnd) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Campus{" + "id=" + id + ", name=" + name + ", address=" + address + ", dateOfStart=" + dateOfStart + ", dateOfEnd=" + dateOfEnd + '}';
    }
 

}

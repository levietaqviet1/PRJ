/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyUntils;

/**
 *
 * @author NCC
 */
public class Validate {

    public boolean checkInputStringNotEmail(String t){
        return t.matches("[a-z0-9]+");
    }
     public boolean checkInputStringEmail(String t){
        return t.matches("^([\\w!#$%&'*+\\-/=?^_`{|}~]+\\.)*([\\w!#$%&'*+\\-/=?^_`{|}~]+)@[a-zA-Z0-9\\-]+(\\.[a-zA-Z0-9\\-]+)*$");
    }
    
}

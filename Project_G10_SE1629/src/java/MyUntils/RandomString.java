/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyUntils;

import java.util.Random;

/**
 *
 * @author BachDuc
 */
public class RandomString {
    public static String RandomStringg() {
        String randomString = "";
        Random random = new Random();
        while (randomString.length() != 6) {
            char randomizedCharacter = (char) (random.nextInt(26) + 'a');
            randomString += randomizedCharacter;
        }
        return randomString;
    }
    
}

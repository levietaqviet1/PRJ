/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Random;

/**
 *
 * @author BachDuc
 */
public class RandomString {
    public static String RandomString() {
        String randomString = "";
        Random random = new Random();
        while (randomString.length() != 5) {
            char randomizedCharacter = (char) (random.nextInt(26) + 'a');
            randomString += randomizedCharacter;
        }
        return randomString;
    }
}

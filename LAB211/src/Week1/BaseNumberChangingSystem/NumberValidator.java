/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.BaseNumberChangingSystem;

/**
 *
 * @author Admin
 */
public class NumberValidator {
    public static boolean isValid(String value, int baseChoice) {
        switch (baseChoice) {
            case 1: return validateBinary(value);
            case 2: return validateDecimal(value);
            case 3: return validateHexadecimal(value);
            default: return false;
        }
    }
    
    private static boolean validateBinary(String value) {
        return value.matches("[01]+");
    }
    
    private static boolean validateDecimal(String value) {
        return value.matches("\\d+");
    }
    
    private static boolean validateHexadecimal(String value) {
        return value.matches("[0-9A-Fa-f]+");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.BaseNumberChangingSystem;

/**
 *
 * @author Admin
 */
public class NumberConverter {
    public String convert(String value, int fromBase, int toBase) {
        try {
            // First convert to decimal
            int decimal = Integer.parseInt(value, fromBase);
            
            // Then convert to target base
            return switch (toBase) {
                case 2 -> Integer.toBinaryString(decimal);
                case 10 -> String.valueOf(decimal);
                case 16 -> Integer.toHexString(decimal).toUpperCase();
                default -> null;
            };
        } catch (NumberFormatException e) {
            return null;
        }
    }
}

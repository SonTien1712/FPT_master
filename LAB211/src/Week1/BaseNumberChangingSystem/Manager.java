/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.BaseNumberChangingSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager {
    private final Scanner scanner;
    private final Map<Integer, BaseOption> baseOptions;
    private final NumberConverter converter;
    
    public Manager() {
        this.scanner = new Scanner(System.in);
        this.baseOptions = initializeBaseOptions();
        this.converter = new NumberConverter();
    }
    
    private Map<Integer, BaseOption> initializeBaseOptions() {
        Map<Integer, BaseOption> options = new HashMap<>();
        options.put(1, new BaseOption(2, "Binary"));
        options.put(2, new BaseOption(10, "Decimal"));
        options.put(3, new BaseOption(16, "Hexadecimal"));
        return options;
    }
    
    public void start() {
        while (true) {
            displayMenu();
            if (handleUserInput()) {
                break;
            }
        }
        scanner.close();
    }
    
    private void displayMenu() {
        System.out.println("\nNumber System Converter");
        System.out.println("=====================");
        System.out.println("1. Binary (Base 2)");
        System.out.println("2. Decimal (Base 10)");
        System.out.println("3. Hexadecimal (Base 16)");
        System.out.println("4. Exit");
    }
    
    private boolean handleUserInput() {
        try {
            // Get input base
            System.out.print("\nSelect input base (1-3): ");
            int fromChoice = Integer.parseInt(scanner.nextLine().trim());
            
            if (fromChoice == 4) {
                System.out.println("Goodbye!");
                return true;
            }
            
            if (!baseOptions.containsKey(fromChoice)) {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                return false;
            }
            
            // Get output base
            System.out.print("Select output base (1-3): ");
            int toChoice = Integer.parseInt(scanner.nextLine().trim());
            
            if (!baseOptions.containsKey(toChoice)) {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                return false;
            }
            
            processConversion(fromChoice, toChoice);
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        }
        return false;
    }
    
    private void processConversion(int fromChoice, int toChoice) {
        // Get input value
        System.out.print("Enter " + baseOptions.get(fromChoice).getName() + " number: ");
        String value = scanner.nextLine().trim();
        
        // Validate input
        if (!NumberValidator.isValid(value, fromChoice)) {
            System.out.println("Invalid " + baseOptions.get(fromChoice).getName() + " number!");
            return;
        }
        
        // Perform conversion
        String result = converter.convert(value, 
                                       baseOptions.get(fromChoice).getBase(),
                                       baseOptions.get(toChoice).getBase());
        
        if (result != null) {
            System.out.println("\nResult: " + result);
        } else {
            System.out.println("Conversion error occurred!");
        }
    }
}

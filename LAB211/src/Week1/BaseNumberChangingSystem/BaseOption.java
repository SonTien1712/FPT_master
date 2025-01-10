/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1.BaseNumberChangingSystem;

/**
 *
 * @author Admin
 */
public class BaseOption {
    private final int base;
    private final String name;
    
    public BaseOption(int base, String name) {
        this.base = base;
        this.name = name;
    }
    
    public int getBase() {
        return base;
    }
    
    public String getName() {
        return name;
    }
}

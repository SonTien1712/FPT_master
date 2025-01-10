/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author Admin
 */
public class Test 
{
    public static void main(String args[])
    {
        //LetterandCharcount
        LetterandCharcount counter = new LetterandCharcount();
        String content = counter.getInput();
        counter.analyze(content);
        counter.display();
        //LinearSearch
        LinearSearch searcher = new LinearSearch();
        searcher.getInput();        
        searcher.displayArray(searcher.createArray(searcher.getLength()),searcher.getSearch());
        //
        
        
    }
}

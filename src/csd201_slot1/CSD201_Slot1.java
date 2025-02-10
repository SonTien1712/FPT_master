/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csd201_slot1;

import java.lang.reflect.Array;

/**
 *
 * @author Admin
 */
public class CSD201_Slot1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
       
    }
    public void addStu()
    {
        
    }
    int capacity =3
;
    public void insertFist(Student s)
    {
        int newcapa = capacity*2;
        Student newA[] = new Student[newcapa];
        for(int i=0;i<newcapa;i++)
        {
         newA[i]=data[i];   
        }
    }
    
    
    Student data[] = new Student[5];
    
    public class Student
    {        
    String name;
    String Sclass;
    int score;
    

    public Student(String name, String Sclass, int score) {
            this.name = name;
            this.Sclass = Sclass;
            this.score = score;
        }
    
    

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSclass() {
            return Sclass;
        }

        public void setSclass(String Sclass) {
            this.Sclass = Sclass;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" + "name=" + name + ", Sclass=" + Sclass + ", score=" + score + '}';
        }
        
    
    
    }
    

    
    
}




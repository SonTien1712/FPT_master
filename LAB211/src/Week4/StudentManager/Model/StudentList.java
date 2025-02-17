/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.StudentManager.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentList 
{
    private static ArrayList<Student> sList = new ArrayList<>();

    public static ArrayList<Student> getsList() {
        return sList;
    }
    
    public boolean checkStudent(Student s)
    {
//        while(Student stu)
        for(Student student : StudentList.getsList())
        {
            if(student.equals(s)) return false;
        }
        return true;
    }
    public boolean createList(Student s)
    {   
        if(checkStudent(s))
        {
    sList.add(s);
        }return false;
    }
    public List<Student> find(String name)
    {
        List<Student> s = new ArrayList<>();
        for(Student st: sList)
        {
            if(st.getStudentName().toLowerCase().contains(name))
            {
                s.add(st);
            }
        }

        return s;
        
    }
    public void sortStudent()
    {
        Collections.sort(sList,new Comparator<Student>() {
                    @Override
                    public int compare(Student s1, Student s2)
                    {
                        return s1.getStudentName().compareTo(s2.getStudentName());
                    }
                });
    }
   
    public void showStudent()
    {
        for(Student s : StudentList.getsList())
        {
            System.err.println(s.toString());           
        }
    }
    public void updateStudent(Student s)
    {

        
        
    }
     public void deleteStudent(int id)
    {
        sList.removeIf(n -> n.getId()==id);
    }
     public void reportStudent()
     {
         Map<String,Integer> ds= new HashMap<>();
         for(Student s :sList   )
         {
             String key = s.getId() + "|" + s.getStudentName() + "|" + s.getCourseName();
             ds.put(key, ds.getOrDefault(key, 0) +1 );
         }
         for (Map.Entry<String,Integer> infor: ds.entrySet()) {
             System.out.println(infor.getKey() + "|" + infor.getValue());
             
         }
     }
    
    
}

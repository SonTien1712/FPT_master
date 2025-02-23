/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4.StudentManager.Model;

import Week5.CourseManagement.Controller.DataInput;

import java.util.*;

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
    public Student find(int id)
    {

        for(Student st: sList)
        {
            if(st.getStudentName().toLowerCase().equals(id))
            {
                return st;
            }
        }
        return null;
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
    public void updateStudent()
    {
        Student update= find(DataInput.inputPositiveInt());
        while(true)
        {
            //update id
            System.out.println("ID");
            int id=DataInput.inputPositiveInt();
            if(id==0)
            {

            }
        }

        
        
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

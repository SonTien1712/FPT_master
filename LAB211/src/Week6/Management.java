package Week6;

import Week5.AirPortManagement.Controller.DataInput;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Management
{
    public void addWorker(ArrayList<Worker> lw) throws Exception
    {
        System.out.println("---Add worker---");
        System.out.println("Enter id");
        String id;
        do
        {
             id = DataInput.inputString();
        }while(!checkId(lw,id));
        System.out.println("enter name");
        String name = DataInput.inputString();
        System.out.println("enter age");
        Date age;
        do {
           age  = DataInput.inputDate();
        }while(Math.abs(age.getYear()-LocalDate.now().getYear())>=18&&Math.abs(age.getYear()-LocalDate.now().getYear())<=50);

        System.out.println("enter salary");
        int salary = DataInput.inputPositiveInt();
        System.out.println("enter work place");
        String workplace = DataInput.inputString();
        Worker w = new Worker(id,name,age,salary,workplace);
        lw.add(w);
    }

    public boolean checkId(ArrayList<Worker> lw , String id)
    {
        for(Worker worker : lw)
        {
            if(id.equalsIgnoreCase(worker.getId()))
            {
                return true;
            }
        }
        return false;
    }

    public void changeSalary(String status,ArrayList<History> lh)
    {
        
    }




}

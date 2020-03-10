/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhienNgo
 */
public class Sub {
    private String Name;
    private int DayOfWeek1;
    private int DayOfWeek2;
    private int Begin1;
    private int End1;
    private int Begin2;
    private int End2;

    public Sub(String name,int dayOfWeek1, int begin1 , int end1, int dayOfWeek2 , int begin2 , int end2)
    {
        Name = name;

        DayOfWeek1 = dayOfWeek1;
        Begin1 = begin1;
        End1 = end1;

        DayOfWeek2 = dayOfWeek2;
        Begin2 = begin2;
        End2 = end2;

    }

    public String getName()
    {
        return Name;
    }

    public void setName(String S)
    {
        Name = S;
    }

    public int getDayOfWeek1()
    {
        return DayOfWeek1;
    }

    public void setDayOfWeek1(int dayOfWeek)
    {
        DayOfWeek1 = dayOfWeek;
    }


    public int getDayOfWeek2()
    {
        return DayOfWeek2;
    }

    public void setDayOfWeek2(int dayOfWeek)
    {
        DayOfWeek2 = dayOfWeek;
    }

    public int getBegin1()
    {
        return Begin1;
    }

    public void setBegin1(int begin)
    {
        Begin1 = begin;
    }

    public int getBegin2()
    {
        return Begin2;
    }

    public void setBegin2(int begin)
    {
        Begin2 = begin;
    }

    public int getEnd1()
    {
        return End1;
    }

    public void setEnd1(int end1)
    {
        End1 = end1;
    }

    public int getEnd2()
    {
        return End2;
    }

    public void setEnd2(int end1)
    {
        End2 = end1;
    }

}

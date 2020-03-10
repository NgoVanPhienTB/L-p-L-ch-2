
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhienNgo
 */
public class Subject {
    private String Name;
    private List<LearnDay> lst;
    private boolean State;

    public Subject()
    {
        Name = null;
        lst = new ArrayList<LearnDay>();
        State  = false;
    }


    public Subject(String name)
    {
        Name = name;
        lst = new ArrayList<LearnDay>();
        State = false;
    }
    public String getName()
    {
        return Name;
    }

    public void setName(String S)
    {
        Name = S;
    }

    public boolean getState()
    {
        return State;
    }

    public void setState(boolean b)
    {
        State = b;
    }
    public List<LearnDay> getList()
    {
        return lst;
    }

    public int Lenght()
    {
        return lst.size();
    }

    public boolean IsEq(LearnDay ld1 ,LearnDay ld2)
    {

        boolean is_dayOfweek1 = ld1.getDayOfWeek1()==ld2.getDayOfWeek1();
        boolean is_Begin1 = ld1.getBegin1() == ld2.getBegin1();
        boolean is_End1 = ld1.getEnd1() == ld2.getEnd1();
        boolean is_dayOfweek2 = ld1.getDayOfWeek2()==ld2.getDayOfWeek2();
        boolean is_Begin2 = ld1.getBegin2() == ld2.getBegin2();
        boolean is_End2 = ld1.getEnd2() == ld2.getEnd2();


        if(is_dayOfweek1 && is_Begin1 && is_End1 && is_dayOfweek2 && is_Begin2 && is_End2)
        {
            return true;
        }
        return false;
    }

    public boolean IsChecker_Permutation(LearnDay ld)
    {
        LearnDay temp = new LearnDay(ld.getDayOfWeek2(),ld.getBegin2(),ld.getEnd2(),ld.getDayOfWeek1(),ld.getBegin1(),ld.getEnd1());

        for(int i = 0 ; i < lst.size() ; i++)
        {
            if(IsEq(lst.get(i),temp)|| IsEq(lst.get(i),ld))
            {
                return true;
            }
        }
        return false;
    }

    public boolean Add_LearnDay(LearnDay ld)
    {
        return lst.add(ld);
    }


}

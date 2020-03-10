/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhienNgo
 */
public class SubTemp {
    private String Name;
    private String LearnDay1;
    private String LearnDay2;

    public SubTemp(String name , String learnDay1 ,String learnDay2)
    {
        Name = name;
        LearnDay1 = learnDay1;
        LearnDay2 = learnDay2;
    }

    public String getName()
    {
        return Name;
    }

    public String getLearnDay1()
    {
        return LearnDay1;
    }

    public String getLearnDay2()
    {
        return LearnDay2;
    }


}

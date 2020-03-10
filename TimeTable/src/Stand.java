/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhienNgo
 */
public class Stand {


    public static String Stand_Str(String S)
    {
        S=S.trim();
        String Temp_S = new String();
        char c='0';
        for(int i = 0 ; i < S.length() ; i++)
        {

            if( (c==' ' && S.charAt(i) != ' ') || (c != ' ' && S.charAt(i) ==' ')  )
            {
                Temp_S += String.valueOf(S.charAt(i)) ;
            }
            else if(S.charAt(i) != ' ')
            {
                Temp_S += String.valueOf(S.charAt(i));
            }
            c=S.charAt(i);
        }
        return Temp_S.toUpperCase();
    }

    public static int Stand_Int(String S)
    {
        int Temp_Int = 0 ;

        try{
            Temp_Int = Integer.parseInt(S.trim());
        }
        catch(Exception e)
        {
            Temp_Int = 0;
        }
        return Temp_Int;

    }

    public static int Check_dayOfweek(String S)
    {

        if( Stand_Int(S) <= 1 || Stand_Int(S) > 6 )
        {
            return 0;
        }

        return Stand_Int(S);
    }

    public static int Check_Begin(String S)
    {
        if(Stand_Int(S)<=0 || Stand_Int(S)>12)
        {
            return 0;
        }

        return Stand_Int(S);
    }

    public static int Check_End(String S1 , String S2)
    {
        if(Stand_Int(S1) > Stand_Int(S2) || Stand_Int(S2) > 12)
        {
            return 0;
        }
        return Stand_Int(S2);
    }
}

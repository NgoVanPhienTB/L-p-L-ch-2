
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhienNgo
 */
public class TimeTable extends JFrame {

    private JTable timeTable;
    private JScrollPane sp;
    private JLabel TKB;
    private List<String> lst;

    public TimeTable()
    {

        TKB = new JLabel();
        TKB.setText("Thời Khóa Biểu");
        TKB.setBounds(410,50, 250, 50);
        TKB.setFont(new Font("Arial",Font.BOLD,22));
        add(TKB);


       /* String [] Col = {"Thứ Hai"," Thứ Ba","Thứ Tư","Thứ Năm","Thứ Sáu"};
        timeTable = new JTable(Row,Col);


        timeTable.setFont(new Font("Arial",Font.BOLD,12));
        //timeTable.getColumnModel().getColumn(0).setPreferredWidth(3);
        //timeTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        sp = new JScrollPane(timeTable);
        sp.setBounds(50, 100, 900 , 300);

        add(sp);*/


        setSize(1000,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }


    public  void CreateRow( List<Sub> timetable)
    {
        String[][] Row = new String[5][6];
        for(int i = 0 ; i < timetable.size();i++)
        {
            Sub sub = timetable.get(i);
            if(sub.getDayOfWeek1() != 0)
            {
                String str1 = String.format("%s (%d - %d)",sub.getName(),sub.getBegin1(),sub.getEnd1());
                for(int j = 0 ; j < 5 ; j++)
                {
                    if( Row[j][sub.getDayOfWeek1()-2] == null)
                    {
                        Row[j][sub.getDayOfWeek1()-2] = str1;
                        break;
                    }
                }

            }

            if(sub.getDayOfWeek2() !=0)
            {
                String str2 = String.format("%s (%d - %d)",sub.getName(),sub.getBegin2(),sub.getEnd2());
                for(int j = 0 ; j < 5 ; j++)
                {
                    if( Row[j][sub.getDayOfWeek2()-2] == null)
                    {
                        Row[j][sub.getDayOfWeek2()-2] = str2;
                        break;
                    }
                }
            }
        }

        String [] Col = {"Thứ Hai"," Thứ Ba","Thứ Tư","Thứ Năm","Thứ Sáu"};
        timeTable = new JTable(Row,Col);


        timeTable.setFont(new Font("Arial",Font.BOLD,12));
        //timeTable.getColumnModel().getColumn(0).setPreferredWidth(3);
        //timeTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        sp = new JScrollPane(timeTable);
        sp.setBounds(50, 100, 900 , 300);

        add(sp);

    }
   /* public void CreateTimetable(List<Sub> timetable)
    {
        lst = new ArrayList<String>();
        for(int i = 0 ; i < timetable.size() ; i++)
        {
            Sub sub = timetable.get(i);
            if(sub.getDayOfWeek1() != 0)
            {
                String str1 = String.format("%s (%d - %d)",sub.getName(),sub.getBegin1(),sub.getEnd1());
                lst.add(str1);
            }

            if(sub.getDayOfWeek2() !=0)
            {
                String str2 = String.format("%s (%d - %d)",sub.getName(),sub.getBegin2(),sub.getEnd2());
                lst.add(str2);
            }
        }



    }

  /*  public static void main(String[] args)
    {
        new TimeTable().setVisible(true);
    }*/
}


import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhienNgo
 */
public class nCorV_19 extends JFrame implements ActionListener{

    String[][] Rows={};
    String[] Cols={"STT","Tên Môn Học" , "Buổi Học (1)" , "Buổi Học (2)"};
    List<Sub> lst_Sub ;
    boolean[] State = new boolean[60];


    private JLabel label_ScheduleTerm;
    private JLabel label_SubjectName;
    private JLabel label_DayOfWeek1;
    private JLabel label_DayOfWeek2;
    private JLabel label_SubjectList;
    private JLabel label_Begin1;// Môn Học Bắt Đầu Vào Thứ Tiết Mấy
    private JLabel label_End1;
    private JLabel label_Begin2;
    private JLabel label_End2;
    private JTextField tf_SubjectName;
    private JTextField tf_DayOfWeek1;
    private JTextField tf_DayOfWeek2;
    private JTextField tf_Begin1;
    private JTextField tf_End1;
    private JTextField tf_Begin2;
    private JTextField tf_End2;
    private JButton bnt_AddToList;
    private JButton bnt_CreateTimetable;
    private JButton bnt_CreateOptionalTimetable;
    private JTable table_SubjectList;
    JScrollPane sp;

    //----------------------------------------------------------------------   ////

    private List<Subject> lst_Subject;

    private Stack<Sub> StackSub;

    //----------------------------------------------------------------------  ////
    public nCorV_19()
    {
        label_ScheduleTerm = new JLabel();
        label_SubjectName  = new JLabel();
        label_DayOfWeek1 = new JLabel();
        label_DayOfWeek2  = new JLabel();
        label_SubjectList  = new JLabel();
        label_Begin1  = new JLabel();// Môn Học Bắt Đầu Vào Thứ Tiết Mấy
        label_End1  = new JLabel();
        label_Begin2  = new JLabel();
        label_End2 = new JLabel();
        tf_SubjectName = new JTextField();
        tf_DayOfWeek1= new JTextField();
        tf_DayOfWeek2 = new JTextField();
        tf_Begin1 = new JTextField();
        tf_End1 = new JTextField();
        tf_Begin2 = new JTextField();
        tf_End2 = new JTextField();
        bnt_AddToList = new JButton();
        bnt_CreateTimetable = new JButton();
        bnt_CreateOptionalTimetable = new JButton();

        /// ---------------------------------------------------- Khởi Tạo Danh Sách Môn Học -------------

        lst_Subject = new ArrayList<Subject>();
        StackSub = new Stack();
        /// ------------------------------------------------------------  Tạo Bảng


        table_SubjectList = new JTable(Rows,Cols);    // table_SubjectList.setBounds(550, 200, 550 , 300);
        table_SubjectList.setFont(new Font("Arial",Font.BOLD,12));
        table_SubjectList.getColumnModel().getColumn(0).setPreferredWidth(3);
        table_SubjectList.getColumnModel().getColumn(1).setPreferredWidth(200);
        sp = new JScrollPane(table_SubjectList);
        sp.setBounds(550, 200, 600 , 300);

        add(sp);
        /// ------------------------------------------                   Label Lên Lịch Học Kỳ
        label_ScheduleTerm.setText("Lên Lịch Học Kỳ");
        label_ScheduleTerm.setBounds(460,0, 250, 50);
        label_ScheduleTerm.setFont(new Font("Arial",Font.BOLD,22));
        add(label_ScheduleTerm);

        /// ------------------------------------------   Label Tên Môn Học

        label_SubjectName.setText("Tên Môn Học :");
        label_SubjectName.setBounds(10, 150,100, 30);
        label_SubjectName.setFont(new Font("Arial",Font.BOLD,12));
        add(label_SubjectName);

        /// -------------------------------------------- Text Field Tên Môn Học

        tf_SubjectName.setBounds(100, 150, 250, 30);
        tf_SubjectName.setFont(new Font("Arial",Font.BOLD,12));
        add(tf_SubjectName);

        /// ------------------------------------------ Label Buổi Học 1

        label_DayOfWeek1.setText("Buổi Học (1) : ");
        label_DayOfWeek1.setBounds(10,200,100, 30);
        label_DayOfWeek1.setFont(new Font("Arial",Font.BOLD,12));
        add(label_DayOfWeek1);

        ///-------------------------------------------- Text Field Buổi Học 1
        tf_DayOfWeek1.setBounds(100, 200, 40, 25);
        tf_DayOfWeek1.setFont(new Font("Arial",Font.BOLD,12));
        add(tf_DayOfWeek1);
        /// ------------------------------------------  Label Buổi Học 2

        label_DayOfWeek2.setText("Buổi Học (2) : ");
        label_DayOfWeek2.setBounds(10,250,100, 30);
        label_DayOfWeek2.setFont(new Font("Arial",Font.BOLD,12));
        add(label_DayOfWeek2);

        ///------------------------------------------- Text Field Buổi Học 2

        tf_DayOfWeek2.setBounds(100, 250, 40, 25);
        tf_DayOfWeek2.setFont(new Font("Arial",Font.BOLD,12));
        add(tf_DayOfWeek2);

        /// ------------------------------------------ Label Begin1

        label_Begin1.setText("Tiết Bắt Đầu (1) : ");
        label_Begin1.setBounds(170, 200, 100, 30);
        label_Begin1.setFont(new Font("Arial",Font.BOLD,12));
        add(label_Begin1);

        ///-------------------------------------------- Text Field Begin1

        tf_Begin1.setBounds(280, 200, 40, 25);
        tf_Begin1.setFont(new Font("Arial",Font.BOLD,12));
        add(tf_Begin1);

        ///  ---------------------------------------- Label End1

        label_End1.setText("Tiết Kết Thúc (1) :");
        label_End1.setBounds(350, 200, 100, 30);
        label_End1.setFont(new Font("Arial",Font.BOLD,12));
        add(label_End1);

        ///---------------------------------------------- Text Field End1

        tf_End1.setBounds(460,200,40,25);
        tf_End1.setFont(new Font("Arial",Font.BOLD,12));
        add(tf_End1);
        /// ------------------------------------------ Label Begin2

        label_Begin2.setText("Tiết Bắt Đầu (2) : ");
        label_Begin2.setBounds(170, 250, 100, 30);
        label_Begin2.setFont(new Font("Arial",Font.BOLD,12));
        add(label_Begin2);

        ///-------------------------------------------  Text Field Begin2

        tf_Begin2.setBounds(280, 250, 40, 25);
        tf_Begin2.setFont(new Font("Arial",Font.BOLD,12));
        add(tf_Begin2);

        ///  ---------------------------------------- Label End2

        label_End2.setText("Tiết Kết Thúc (2) :");
        label_End2.setBounds(350, 250, 100, 30);
        label_End2.setFont(new Font("Arial",Font.BOLD,12));
        add(label_End2);
        //------------------------------------------------  Text Field End2

        tf_End2.setBounds(460,250,40,25);
        tf_End2.setFont(new Font("Arial",Font.BOLD,12));
        add(tf_End2);

        //------------------------------------------------  Label Danh Sách Môn Học

        label_SubjectList.setText("Danh Sách Môn Học");
        label_SubjectList.setBounds(700, 140, 200, 30);
        label_SubjectList.setFont(new Font("Arial",Font.BOLD,18));
        add(label_SubjectList);

        //------------------------------------------------  Button Thêm Vào Danh Sách Môn Học

        bnt_AddToList.setText("Thêm Vào Danh Sách      ===>");
        bnt_AddToList.setBounds(100,350,300,30);
        bnt_AddToList.setFont(new Font("Arial",Font.BOLD,14));
        add(bnt_AddToList);
        bnt_AddToList.setActionCommand("AddToList");
        bnt_AddToList.addActionListener(this);

        ///-----------------------------------------------  Button Tạo Thời Khóa Biểu Mặc Định

        bnt_CreateTimetable.setText("Tạo Thời Khóa Biểu");
        bnt_CreateTimetable.setBounds(600,550,250,30);
        bnt_CreateTimetable.setFont(new Font("Arial",Font.BOLD,14));
        add(bnt_CreateTimetable);
        bnt_CreateTimetable.setActionCommand("CreateTimetable");
        bnt_CreateTimetable.addActionListener(this);



        ///----------------------------------------------- Button Tạo Thời Khóa Biểu Tùy Chọn
        bnt_CreateOptionalTimetable.setText("Tạo Thời Khóa Biểu Tùy Chọn");
        bnt_CreateOptionalTimetable.setBounds(900,550,250,30);
        bnt_CreateOptionalTimetable.setFont(new Font("Arial",Font.BOLD,14));
        add(bnt_CreateOptionalTimetable);
        bnt_CreateOptionalTimetable.setActionCommand("CreateOptionalTimetable");
        bnt_CreateOptionalTimetable.addActionListener(this);





        setSize(1200,700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

    }

    public int Lenght()
    {
        int lenght = 0;
        for(int i = 0 ; i < lst_Subject.size();i++)
        {
            for(int ij = 0 ; ij < lst_Subject.get(i).Lenght() ; ij++)
            {
                lenght++;
            }

        }
        return lenght;
    }


    public void Insert_ListSub()
    {
        List<SubTemp> lstTemp = new ArrayList<SubTemp>();
        for(int i = 0 ; i < lst_Subject.size() ; i ++)
        {
            for(int ij = 0 ; ij < lst_Subject.get(i).Lenght() ; ij++)
            {
                String Name = lst_Subject.get(i).getName();
                String LearnDay1 =
                        String.format("Thứ %d(Tiết %d - %d)",
                                lst_Subject.get(i).getList().get(ij).getDayOfWeek1(),
                                lst_Subject.get(i).getList().get(ij).getBegin1(),
                                lst_Subject.get(i).getList().get(ij).getEnd1()
                        );
                String LearnDay2 =
                        String.format("Thứ %d(Tiết %d - %d)",
                                lst_Subject.get(i).getList().get(ij).getDayOfWeek2(),
                                lst_Subject.get(i).getList().get(ij).getBegin2(),
                                lst_Subject.get(i).getList().get(ij).getEnd2()
                        );

                lstTemp.add(new SubTemp(Name,LearnDay1,LearnDay2));
            }
        }

        String[][] Row= new String[Lenght()][4];

        for(int i = 0; i < Lenght() ; i++)
        {
            Row[i][0]= String.valueOf(i+1);
            Row[i][1] = lstTemp.get(i).getName();
            Row[i][2] = lstTemp.get(i).getLearnDay1();
            Row[i][3] = lstTemp.get(i).getLearnDay2();
        }

        table_SubjectList = new JTable(Row,Cols);
        table_SubjectList.setFont(new Font("Arial",Font.BOLD,12));
        table_SubjectList.getColumnModel().getColumn(0).setPreferredWidth(3);
        table_SubjectList.getColumnModel().getColumn(1).setPreferredWidth(200);
        sp = new JScrollPane(table_SubjectList);
        sp.setBounds(550, 200, 600 , 300);
        add(sp);
    }




    @Override
    public void actionPerformed(ActionEvent e)
    {
        if("AddToList".equals(e.getActionCommand()))
        {


            Subject sub = new Subject();
            if( tf_SubjectName.getText().length() == 0 )
            {
                JOptionPane.showMessageDialog(rootPane, " Bạn Chưa Nhập Tên Môn Học ");
                return ;
            }


            if(Stand.Check_dayOfweek(tf_DayOfWeek1.getText())== 0)
            {
                JOptionPane.showMessageDialog(rootPane, " Bạn Hãy Nhập Lại Buổi Học (1) !!!. Các ký tự phải là ký tự số. Phải lớp hơn 1 nhỏ hơn 7.");
                return;
            }

            if(Stand.Check_Begin(tf_Begin1.getText())== 0)
            {
                JOptionPane.showMessageDialog(rootPane, " Bạn Hãy Nhập Lại Tiết Bắt Đầu (1) !!!. Các ký tự phải là ký tự số.Phải lớp hơn 0 nhỏ hơn 13  ");
            }

            if(Stand.Check_End(tf_Begin1.getText(), tf_End1.getText())== 0)
            {
                JOptionPane.showMessageDialog(rootPane, " Bạn Hãy Nhập Lại Tiết Kết Thúc (1) !!!. Các ký tự phải là ký tự số và Tiết Kết Thúc Phải Lớn Hơn Tiết Bắt Đầu và nhỏ hơn 13. ");
            }

            /*if(Stand.Check_dayOfweek(tf_DayOfWeek2.getText())== 0)
            {
                JOptionPane.showMessageDialog(rootPane, " Bạn Hãy Nhập Lại Buổi Học (2) !!!. Các ký tự phải là ký tự số. Phải lớp hơn 1 nhỏ hơn 9. ");
                return;
            }

            if(Stand.Check_Begin(tf_Begin2.getText())== 0 )
            {
                JOptionPane.showMessageDialog(rootPane, " Bạn Hãy Nhập Lại Tiết Bắt Đầu (2) !!!. Các ký tự phải là ký tự số. Phải lớp hơn 0 nhỏ hơn 13 ");
            }

            if(Stand.Check_End(tf_Begin2.getText(), tf_End2.getText())== 0)
            {
                JOptionPane.showMessageDialog(rootPane, " Bạn Hãy Nhập Lại Tiết Kết Thúc (2) !!!. Các ký tự phải là ký tự số và Tiết Kết Thúc Phải Lớn Hơn hoặc Bằng Tiết Bắt Đầu và nhỏ hơn 13.");
            }
             */




            Subject subject = new Subject( Stand.Stand_Str(tf_SubjectName.getText()));
            ////------------------------------------------------------------
            LearnDay learnDay =
                    new LearnDay
                            (Stand.Stand_Int(tf_DayOfWeek1.getText()),Stand.Stand_Int(tf_Begin1.getText()),Stand.Stand_Int(tf_End1.getText()),Stand.Stand_Int(tf_DayOfWeek2.getText()),Stand.Stand_Int(tf_Begin2.getText()),Stand.Stand_Int(tf_End2.getText()));
            //-----------------------------------------------------------------

            subject.Add_LearnDay(learnDay);
            if(lst_Subject.isEmpty())
            {
                lst_Subject.add(subject);
                Insert_ListSub();
                return;
            }
            else
            {
                for(int i = 0 ; i < lst_Subject.size();i++)
                {
                    if(subject.getName().equals(lst_Subject.get(i).getName()) )
                    {
                        if(lst_Subject.get(i).IsChecker_Permutation(learnDay))
                        {
                            JOptionPane.showMessageDialog(rootPane, "Lịch Của Môn Học Đã Có !!!");
                            Insert_ListSub();
                            return;
                        }
                        lst_Subject.get(i).Add_LearnDay(learnDay);
                        Insert_ListSub();
                        return;
                    }


                }
                lst_Subject.add(subject);
                Insert_ListSub();
                return;
            }
        }

        if("CreateTimetable".equals( e.getActionCommand()))
        {
            Subject sub1 = new Subject("CNPM");
            LearnDay ld1 = new LearnDay(2,1,4,6,7,9);
            LearnDay ld11 = new LearnDay(3,1,4,5,10,12);
            LearnDay ld12 = new LearnDay(4,7,9,6,1,4);

            sub1.Add_LearnDay(ld1);
            sub1.Add_LearnDay(ld11);
            sub1.Add_LearnDay(ld12);
            Subject sub2 = new Subject("CN WEB");
            LearnDay ld2 = new LearnDay(4,1,3);
            LearnDay ld3 = new LearnDay(6,7,9);
            LearnDay ld31 = new LearnDay(3,7,9);
            LearnDay ld32 = new LearnDay(2,7,9);
            sub2.Add_LearnDay(ld2);
            sub2.Add_LearnDay(ld3);
            sub2.Add_LearnDay(ld31);
            sub2.Add_LearnDay(ld32);
            Subject sub3 = new Subject("HDH");
            LearnDay ld4 = new LearnDay(6,10,12,4,10,12);
            LearnDay ld5 = new LearnDay(4,1,3,3,10,12);
            LearnDay ld51 = new LearnDay(5,8,10,2,10,12);
            sub3.Add_LearnDay(ld51);
            sub3.Add_LearnDay(ld4);
            sub3.Add_LearnDay(ld5);
            lst_Subject.add(sub1);
            lst_Subject.add(sub2);
            lst_Subject.add(sub3);

            Create_Insert();
            Try();
            TimeTable time_table = new TimeTable();
            time_table.CreateRow(lstSub);
            time_table.setVisible(true);

        }
        if("CreateOptionalTimetable".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(rootPane,"sdffdgdfgfdg");
        }
    }

      public void Create_Insert()
      {
          for(int i = 0 ; i < 60 ; i++)
          {
              State[i] = false;
          }
      }


      public boolean Check_State_Small(int Day, int N1 ,int N2)
      {
          if(Day == 0 || N1 == 0 || N2 == 0)
          {
              return true;
          }
          for(int i = (Day-2)*12 + N1 - 1 ; i < (Day-2)*12 + N2 ; i++)
          {
              if(State[i] == true)
              {
                  return false;
              }
          }

          return true;
      }


      public boolean Check_State_Big(LearnDay ld)
      {
          boolean b1 = Check_State_Small(ld.getDayOfWeek1(),ld.getBegin1(),ld.getEnd1());
          boolean b2 = Check_State_Small(ld.getDayOfWeek2(),ld.getBegin2(),ld.getEnd2());
          if(b1 && b2)
          {
              return true;
          }

          return false;

      }

      public void ChangeState(LearnDay ld , boolean b)
      {
          if(ld.getDayOfWeek1() < 2)
          {
              return ;
          }
          for(int i = (ld.getDayOfWeek1()-2)*12 + ld.getBegin1() - 1 ; i < (ld.getDayOfWeek1()-2)*12 +  ld.getEnd1(); i++)
          {
              State[i] = b;
          }

          if(ld.getDayOfWeek2() < 2)
          {
              return ;
          }
          for(int i = (ld.getDayOfWeek2()-2)*12 + ld.getBegin2() - 1 ; i < (ld.getDayOfWeek2()-2)*12 + ld.getEnd2(); i++)
          {
              State[i] = b;
          }
      }

      private Stack<Sub> lstSub;
      public Stack<Sub> Try()
      {
          lstSub = new Stack<Sub>();
          if(StackSub.size() == lst_Subject.size())
          {
              for(int i = 0 ; i < StackSub.size();i++)
              {
                  Sub s = StackSub.get(i);
                  lstSub.push(new Sub(s.getName(),s.getDayOfWeek1(),s.getBegin1(),s.getEnd1(),s.getDayOfWeek2(),s.getBegin2(),s.getEnd2()));
              }
             return lstSub;

          }
          for(int i = 0 ; i < lst_Subject.size(); i++)
          {
              if(lst_Subject.get(i).getState() == false)
                {

                  for(int ij = 0 ; ij < lst_Subject.get(i).getList().size(); ij++)
                   {

                       LearnDay LD = lst_Subject.get(i).getList().get(ij);
                       if(/*LD.getState()== false &&*/ Check_State_Big(LD))
                       {
                           StackSub.push(
                               new Sub
      (lst_Subject.get(i).getName(),LD.getDayOfWeek1(),LD.getBegin1(),LD.getEnd1(),LD.getDayOfWeek2(),LD.getBegin2(),LD.getEnd2())
                           );
                           lst_Subject.get(i).setState(true);
                           ChangeState(LD,true);
                           //LD.setState(true);
                           Try();
                           //LD.setState(false);
                           ChangeState(LD,false);
                           lst_Subject.get(i).setState(false);
                           StackSub.pop();
                       }
                   }
                }
                 //  lst_Subject.get(i).setState(false);
          }
          return lstSub;
      }

    public static void main(String[] args)
    {
        new nCorV_19().setVisible(true);
    }
}

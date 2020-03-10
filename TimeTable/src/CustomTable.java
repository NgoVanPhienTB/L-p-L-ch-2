import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CustomTable extends JFrame {
    private  JTable Cus;
    private  JScrollPane sp;
    public CustomTable()
    {
        Cus = new JTable();
        Cus.setModel(new javax.swing.table.DefaultTableModel(
                new Objects[][] {
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null},
                        {null, null, null, null,null}
                },
                new String [] {
                        "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thư Năm","Thứ Sáu"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        // Cus = new JTable(Row , Col);

        //Cus.setFont(new Font("Arial",Font.BOLD,12));
        sp = new JScrollPane(Cus);
        sp.setBounds(50, 100, 900 , 300);
        add(sp);
        this.setSize(1000,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    public static void main(String[] args)
    {
        new CustomTable().setVisible(true);
    }
}

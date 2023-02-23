import org.json.JSONObject;
import org.json.JSONArray;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainForm {
    private JButton btn;
    private JPanel panel1;

    public MainForm() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JSONObject obj = new JSONObject(
                        "{" +
                                "Employee ID: 092789," +
                                "Employee Name: Helen Mirren," +
                                "Age: 27, " +
                                "Designation: Assistant Manager," +
                                "City: Florida," +
                                "Salary: 67000.00, " +
                                "Experience: 26 " +
                                "}"
                );

                JSONArray obj1 = new JSONArray(
                        "{" +
                                "Employee ID: 092789," +
                                "Employee Name: Helen Mirren," +
                                "Age: 27, " +
                                "Designation: Assistant Manager," +
                                "City: Florida," +
                                "Salary: 67000.00, " +
                                "Experience: 26 " +
                                "}"
                );

                System.out.println("Employee ID: "+obj.getInt("Employee ID"));
                System.out.println("Employee Name: "+obj.getString("Employee Name"));
                System.out.println("Age: "+obj.getInt("Age"));
                System.out.println("Designation: "+obj.getString("Designation"));
                System.out.println("City: "+obj.getString("City"));
                System.out.println("Salary: "+obj.getDouble("Salary"));
                System.out.println("Experience: "+obj.getInt("Experience") +" Months");

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().panel1 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

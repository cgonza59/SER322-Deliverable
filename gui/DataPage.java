package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DataPage {

    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DataPage window = new DataPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public DataPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblWhichDataWould = new JLabel("Which Data Would You Like to View?");
        lblWhichDataWould.setBounds(328, 17, 236, 16);
        frame.getContentPane().add(lblWhichDataWould);
        
        JRadioButton rdbtnStudents = new JRadioButton("Students");
        rdbtnStudents.setBounds(49, 45, 141, 23);
        frame.getContentPane().add(rdbtnStudents);
        
        JRadioButton rdbtnCourses = new JRadioButton("Courses");
        rdbtnCourses.setBounds(176, 45, 98, 23);
        frame.getContentPane().add(rdbtnCourses);
        
        JRadioButton rdbtnInstructors = new JRadioButton("Instructors");
        rdbtnInstructors.setBounds(299, 45, 141, 23);
        frame.getContentPane().add(rdbtnInstructors);
        
        JRadioButton rdbtnDepartments = new JRadioButton("Departments");
        rdbtnDepartments.setBounds(437, 45, 141, 23);
        frame.getContentPane().add(rdbtnDepartments);
        
        JRadioButton rdbtnMajors = new JRadioButton("Majors");
        rdbtnMajors.setBounds(590, 45, 98, 23);
        frame.getContentPane().add(rdbtnMajors);
        
        JRadioButton rdbtnAdministrators = new JRadioButton("Administrators");
        rdbtnAdministrators.setBounds(692, 45, 141, 23);
        frame.getContentPane().add(rdbtnAdministrators);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(380, 80, 117, 29);
        frame.getContentPane().add(btnSubmit);
        
        JButton btnGoBack = new JButton("Go Back");
        btnGoBack.setBounds(6, 6, 117, 29);
        frame.getContentPane().add(btnGoBack);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(49, 81, 152, 27);
        comboBox.addItem("Ascending");
        comboBox.addItem("Descending");
        frame.getContentPane().add(comboBox);
        
        table = new JTable();
        table.setBounds(49, 155, 784, 568);
        frame.getContentPane().add(table);
    }
}

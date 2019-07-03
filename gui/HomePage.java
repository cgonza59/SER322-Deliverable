package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.TextField;
import java.awt.SystemColor;
import javax.swing.JList;

public class HomePage {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomePage window = new HomePage();
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
    public HomePage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("What do you want to do?");
        lblNewLabel.setBounds(372, 33, 154, 16);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblViewDatabase = new JLabel("View Database");
        lblViewDatabase.setBounds(6, 74, 103, 16);
        frame.getContentPane().add(lblViewDatabase);
        
        JLabel lblSelectData = new JLabel("Select Data");
        lblSelectData.setBounds(6, 120, 89, 16);
        frame.getContentPane().add(lblSelectData);
        
        JLabel lblInsert = new JLabel("Insert");
        lblInsert.setBounds(6, 174, 61, 16);
        frame.getContentPane().add(lblInsert);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(393, 229, 117, 29);
        frame.getContentPane().add(btnSubmit);
        
        JRadioButton rdbtnAllData = new JRadioButton("All Data");
        rdbtnAllData.setBounds(16, 96, 141, 23);
        frame.getContentPane().add(rdbtnAllData);
        
        JRadioButton rdbtnStudent = new JRadioButton("Student");
        rdbtnStudent.setBounds(113, 96, 141, 23);
        frame.getContentPane().add(rdbtnStudent);
        
        JRadioButton rdbtnCourses = new JRadioButton("Courses");
        rdbtnCourses.setBounds(208, 96, 141, 23);
        frame.getContentPane().add(rdbtnCourses);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Prerequisites");
        rdbtnNewRadioButton.setBounds(16, 148, 117, 23);
        frame.getContentPane().add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnCourseEnrollmentList = new JRadioButton("Course Enrollment List");
        rdbtnCourseEnrollmentList.setBounds(135, 148, 192, 23);
        frame.getContentPane().add(rdbtnCourseEnrollmentList);
        
        JRadioButton rdbtnFindStudentGrades = new JRadioButton("Find Student Grades");
        rdbtnFindStudentGrades.setBounds(333, 148, 158, 23);
        frame.getContentPane().add(rdbtnFindStudentGrades);
        
        JRadioButton rdbtnGrades = new JRadioButton("Grades");
        rdbtnGrades.setBounds(16, 202, 141, 23);
        frame.getContentPane().add(rdbtnGrades);
        
        JRadioButton rdbtnFindStudentGpas = new JRadioButton("Find Student GPAs");
        rdbtnFindStudentGpas.setBounds(515, 148, 158, 23);
        frame.getContentPane().add(rdbtnFindStudentGpas);
        
        JRadioButton rdbtnFindCourseGrades = new JRadioButton("Find Course Grades");
        rdbtnFindCourseGrades.setBounds(695, 148, 164, 23);
        frame.getContentPane().add(rdbtnFindCourseGrades);
    }
}

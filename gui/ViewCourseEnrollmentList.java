package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;

public class ViewCourseEnrollmentList {

    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewCourseEnrollmentList window = new ViewCourseEnrollmentList();
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
    public ViewCourseEnrollmentList() {
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
        
        JLabel lblNewLabel = new JLabel("View Course Enrollment Lists");
        lblNewLabel.setBounds(351, 6, 202, 16);
        frame.getContentPane().add(lblNewLabel);
        
        JButton btnGoBack = new JButton("Go Back");
        btnGoBack.setBounds(6, 1, 117, 29);
        frame.getContentPane().add(btnGoBack);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(384, 59, 117, 29);
        frame.getContentPane().add(btnSubmit);
        
        table = new JTable();
        table.setBounds(49, 155, 784, 568);
        frame.getContentPane().add(table);
        
    }
}

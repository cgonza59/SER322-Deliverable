package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;

public class ViewFindStudentGrades {

    private JFrame frame;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewFindStudentGrades window = new ViewFindStudentGrades();
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
    public ViewFindStudentGrades() {
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
        
        JLabel lblViewFindStudent = new JLabel("View Find Student Grades");
        lblViewFindStudent.setBounds(367, 6, 181, 16);
        frame.getContentPane().add(lblViewFindStudent);
        
        JButton btnGoBack = new JButton("Go Back");
        btnGoBack.setBounds(6, 6, 117, 29);
        frame.getContentPane().add(btnGoBack);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(382, 58, 117, 29);
        frame.getContentPane().add(btnSubmit);
        
        table = new JTable();
        table.setBounds(49, 155, 784, 568);
        frame.getContentPane().add(table);
    }

}

package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class SubmitNewGrade {

    public JFrame frame;
    
    private Connection conn;

    /**
     * Create the application.
     */
    public SubmitNewGrade(Connection connec) {
        conn = connec;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Submit New Grade");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        lblNewLabel.setBounds(351, 18, 215, 16);
        frame.getContentPane().add(lblNewLabel);
        
        JLabel lblAsuId = new JLabel("ASU ID:");
        lblAsuId.setBounds(69, 75, 61, 16);
        frame.getContentPane().add(lblAsuId);
        
        JLabel lblCourse = new JLabel("Course:");
        lblCourse.setBounds(69, 141, 61, 16);
        frame.getContentPane().add(lblCourse);
        
        JLabel lblGrade = new JLabel("Grade (0.00-4.00)");
        lblGrade.setBounds(69, 213, 125, 16);
        frame.getContentPane().add(lblGrade);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(242, 71, 125, 27);
        frame.getContentPane().add(comboBox);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(242, 137, 171, 27);
        frame.getContentPane().add(comboBox_1);
        
        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setBounds(242, 209, 85, 27);
        frame.getContentPane().add(comboBox_2);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(378, 283, 117, 29);
        frame.getContentPane().add(btnSubmit);
        
        JButton btnGoBack = new JButton("Go Back");
        btnGoBack.setBounds(6, 6, 117, 29);
        frame.getContentPane().add(btnGoBack);
        
        btnGoBack.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
             frame.setVisible(false);
             frame.dispose();
            } 
          } );
        
    }

}

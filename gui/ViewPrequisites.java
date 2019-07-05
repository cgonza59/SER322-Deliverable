package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class ViewPrequisites {

    public JFrame frame;
    
    private Connection conn;

    /**
     * Create the application.
     */
    public ViewPrequisites(Connection connec) {
        conn = connec;
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
        
        JLabel lblViewPrerequisites = new JLabel("View Prerequisites");
        lblViewPrerequisites.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        lblViewPrerequisites.setBounds(383, 30, 156, 16);
        frame.getContentPane().add(lblViewPrerequisites);
        
        JButton btnGoBack = new JButton("Go Back");
        btnGoBack.setBounds(6, 6, 117, 29);
        frame.getContentPane().add(btnGoBack);
        
        btnGoBack.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
             frame.setVisible(false);
             frame.dispose();
            } 
          } );
        
        
        JLabel lblCourseId = new JLabel("Course ID:");
        lblCourseId.setBounds(62, 71, 79, 16);
        frame.getContentPane().add(lblCourseId);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(153, 67, 117, 27);
        frame.getContentPane().add(comboBox);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(392, 100, 117, 29);
        frame.getContentPane().add(btnSubmit);
    }

}

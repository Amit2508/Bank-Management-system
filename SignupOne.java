package bank.management.system;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.awt.Font;


public class SignupOne extends JFrame {
    
    SignupOne() {
        setLayout(null);
        Random ran = new Random();
        int randomNum = ran.nextInt(1000); // Generate a random number between 0 and 999
        
        JLabel formno = new JLabel("APPLICATION FORM NO. " + randomNum);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20, 600, 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details " );
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,90, 400, 30);
        add(personalDetails);
        
        
        JLabel name = new JLabel("Name: " );
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140, 100, 30);
        add(name);
        
         JLabel fname = new JLabel("Father's Name: " );
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190, 200, 30);
        add(fname );
        
         JLabel dob= new JLabel("Date of Birth: " );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240, 200, 30);
        add(dob );
        
        JLabel gender= new JLabel("Gender: " );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290, 200, 30);
        add(gender);
        
        
        JLabel email= new JLabel("Email Address: " );
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200, 30);
        add(email);
        
       JLabel martial= new JLabel("Martial Status: " );
       martial.setFont(new Font("Raleway",Font.BOLD,20));
       martial.setBounds(100,390,200, 30);
       add(martial);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        setLayout(null); // Set layout to null since no layout manager is used
        
        // Add the label to the frame
        formno.setBounds(140,20, 600, 40);
        add(formno);
    }
    
    public static void main(String args[]) {
        new SignupOne();
    }
}

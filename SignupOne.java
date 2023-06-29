package bank.management.system;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
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
        
        JTextField nameTextField=new JTextField();
        nameTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        
         JLabel fname = new JLabel("Father's Name: " );
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190, 200, 30);
        add(fname );
        
        JTextField fnameTextField=new JTextField();
        fnameTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        
         JLabel dob= new JLabel("Date of Birth: " );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240, 200, 30);
        add(dob );
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        add(dateChooser);
        
        JLabel gender= new JLabel("Gender: " );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290, 200, 30);
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,120,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        
        
        
        JLabel email= new JLabel("Email Address: " );
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200, 30);
        add(email);
        
         JTextField emailTextField=new JTextField();
        emailTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
       JLabel martial= new JLabel("Martial Status: " );
       martial.setFont(new Font("Raleway",Font.BOLD,20));
       martial.setBounds(100,390,200, 30);
       add(martial);
       
       
       
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        JRadioButton others = new JRadioButton("Other");
        others.setBounds(630,390,120,30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup martialgroup = new ButtonGroup();
        martialgroup.add(unmarried);
        martialgroup.add(married);
        martialgroup.add(others);
        
       
         JLabel address= new JLabel("Address: " );
       address.setFont(new Font("Raleway",Font.BOLD,20));
       address.setBounds(100,440,200, 30);
       add(address);
       
        JTextField addressTextField=new JTextField();
        addressTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
       
         JLabel city= new JLabel("City: " );
       city.setFont(new Font("Raleway",Font.BOLD,20));
       city.setBounds(100,490,200, 30);
       add(city);
       
       JTextField cityTextField=new JTextField();
        cityTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
           JLabel state= new JLabel("State: " );
       state.setFont(new Font("Raleway",Font.BOLD,20));
       state.setBounds(100,540,200, 30);
       add(state);
       
       JTextField stateTextField=new JTextField();
        stateTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
       
      JLabel pincode= new JLabel("Pincode: " );
       pincode.setFont(new Font("Raleway",Font.BOLD,20));
       pincode.setBounds(100,590,200, 30);
       add(pincode);
        
       JTextField pinTextField=new JTextField();
        pinTextField.setFont(new Font("Raleway" , Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        
        
        
        JButton next = new JButton("Next");
//        next.setBackground(Color.BLACK);
//        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        add(next);
        
                
                
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

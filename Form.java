import javax.swing.*;
import java.awt.*;
public class Form
{   
    public static void main(String [] args)
    {   
        //Defining JFrame
        JFrame jf = new JFrame("Registration Form");
        /*JPanel jp = new JPanel();
        jp.setBackground(Color.black);
        jp.setSize(700,450);
        jf.add(jp);
        */
        
        JLabel jlbl = new JLabel("Student's Registration Form");
        jlbl.setBounds(295,3,300,30);
        Font ff = new Font("Arieal",Font.BOLD,18);
        jlbl.setFont(ff);
        jf.add(jlbl);
        
        JLabel jlbl_1 = new JLabel("Student ID :");
        jlbl_1.setBounds(20,50,80,20);
        Font ff_1 = new Font("Arieal",Font.PLAIN,14);
        jlbl_1.setFont(ff_1);
        jf.add(jlbl_1);
        
        JTextField txf = new JTextField(" Enter Your Student ID ");
        txf.setBounds(101,50,130,25);
        txf.setBorder(null);
        jf.add(txf);
        
        JLabel jlbl_2 = new JLabel("First Name :");
        jlbl_2.setBounds(20,90,80,20);
        Font ff_2 = new Font("Arieal",Font.PLAIN,14);
        jlbl_2.setFont(ff_2);
        jf.add(jlbl_2);
        
        JTextField txf_1 = new JTextField(" Enter Your First Name ");
        txf_1.setBounds(101,90,150,25);
        txf_1.setBorder(null);
        jf.add(txf_1);
        
        JLabel jlbl_3 = new JLabel("Address :");
        jlbl_3.setBounds(35,130,80,20);
        Font ff_3 = new Font("Arieal",Font.PLAIN,14);
        jlbl_3.setFont(ff_3);
        jf.add(jlbl_3);
        
        JTextArea txa = new JTextArea(" Enter your Address ");
        txa.setBounds(101,130,150,40);
        txa.setBorder(null);
        jf.add(txa);
        
        JLabel jlbl_4 = new JLabel("Age:");
        jlbl_4.setBounds(60,185,80,20);
        Font ff_4 = new Font("Arieal",Font.PLAIN,14);
        jlbl_4.setFont(ff_4);
        jf.add(jlbl_4);
        
        JTextField txf_2 = new JTextField(" Enter your Age ");
        txf_2.setBounds(100,185,80,25);
        txf_2.setBorder(null);
        jf.add(txf_2);
        
        JLabel jlbl_5 = new JLabel("Year :");
        jlbl_5.setBounds(55,220,80,20);
        Font ff_5 = new Font("Arieal",Font.PLAIN,14);
        jlbl_5.setFont(ff_5);
        jf.add(jlbl_5);
        
        String year[]={"1st","2nd","3rd",};    
        JComboBox jcbx = new JComboBox(year);
        jcbx.setBounds(100,220,80,20);
        Font ff_12 = new Font("Arieal",Font.PLAIN,12);
        jcbx.setFont(ff_12);
        jf.add(jcbx);
        
        JLabel jlbl_6 = new JLabel("Address :");
        jlbl_6.setBounds(35,255,80,20);
        Font ff_6 = new Font("Arieal",Font.PLAIN,14);
        jlbl_6.setFont(ff_6);
        jf.add(jlbl_6);
        
        JTextArea txa_1 = new JTextArea(" Enter your Address ");
        txa_1.setBounds(101,255,265,40);
        txa_1.setBorder(null);
        jf.add(txa_1);
        
        JButton jbtn = new JButton(" |<");
        jbtn.setBounds(20,320,56,20);
        jf.add(jbtn);
        
        JButton jbtn_1 = new JButton(" <<");
        jbtn_1.setBounds(80,320,56,20);
        jf.add(jbtn_1);
        
        JButton jbtn_2 = new JButton(" >>");
        jbtn_2.setBounds(150,320,56,20);
        jf.add(jbtn_2);
        
        JButton jbtn_3 = new JButton(" >|");
        jbtn_3.setBounds(210,320,56,20);
        jf.add(jbtn_3);
        
        JLabel jlbl_7 = new JLabel(" 0 of 0");
        jlbl_7.setBounds(270,320,56,20);
        Font ff_7 = new Font("Arieal",Font.PLAIN,14);
        jlbl_7.setFont(ff_7);
        jf.add(jlbl_7);
        
        JLabel jlbl_8 = new JLabel("School Year  :");
        jlbl_8.setBounds(520,50,90,20);
       Font ff_8 = new Font("Arieal",Font.PLAIN,14);
        jlbl_8.setFont(ff_8);
        jf.add(jlbl_8);
        
        String school_Year[]={"2020-2021","2021-2021","2021-2022",};    
        JComboBox jcbx_1 = new JComboBox(school_Year);
        jcbx_1.setBounds(615,50,155,20);
        Font ff_13 = new Font("Arieal",Font.PLAIN,12);
        jcbx_1.setFont(ff_13);
        jf.add(jcbx_1);
        
        JLabel jlbl_9 = new JLabel("Last Name :");
        jlbl_9.setBounds(272,90,80,20);
        Font ff_9 = new Font("Arieal",Font.PLAIN,14);
        jlbl_9.setFont(ff_9);
        jf.add(jlbl_9);
        
        JTextField txf_3 = new JTextField(" Enter Your Last Name");
        txf_3.setBounds(352,90,150,25);
        txf_3.setBorder(null);
        jf.add(txf_3);
        
        JLabel jlbl_10 = new JLabel("Middle Name:");
        jlbl_10.setBounds(510,90,90,20);
        Font ff_10 = new Font("Arieal",Font.PLAIN,14);
        jlbl_10.setFont(ff_10);
        jf.add(jlbl_10);
        
        JTextField txf_4 = new JTextField(" Enter Your Middle Name");
        txf_4.setBounds(600,90,155,25);
        txf_4.setBorder(null);
        jf.add(txf_4);
        
        JLabel jlbl_11 = new JLabel("Date of Birth :");
        jlbl_11.setBounds(260,130,100,20);
        Font ff_11 = new Font("Arieal",Font.PLAIN,14);
        jlbl_11.setFont(ff_11);
        jf.add(jlbl_11);
        
        String dob[]={"2000-12-27","2001-02-15","2002-02-02","2003-11-07"};    
        JComboBox jcbx_3 = new JComboBox(dob);
        jcbx_3.setBounds(352,130,100,20);
        Font ff_14 = new Font("Arieal",Font.PLAIN,12);
        jcbx_3.setFont(ff_14);
       jf.add(jcbx_3);
        
        JLabel jlbl_12 = new JLabel("Place of Birth :");
        jlbl_12.setBounds(490,130,100,20);
        Font ff_15 = new Font("Arieal",Font.PLAIN,14);
        jlbl_12.setFont(ff_15);
        jf.add(jlbl_12);
        
        JTextArea txa_2 = new JTextArea(" Enter your birth place ");
        txa_2.setBounds(590,130,180,40);
        txa_2.setBorder(null);
        jf.add(txa_2);
        
        JLabel jlbl_13 = new JLabel("Gender :");
        jlbl_13.setBounds(290,185,80,20);
        Font ff_16 = new Font("Arieal",Font.PLAIN,14);
        jlbl_13.setFont(ff_16);
        jf.add(jlbl_13);
        
        JRadioButton jrb_1 = new JRadioButton("Male");
        JRadioButton jrb_2 = new JRadioButton("Female");
        jrb_1.setBounds(347,185,70,20);
        jrb_2.setBounds(413,185,80,20);
        Font ff_17 = new Font("Arieal",Font.PLAIN,14);
        Font ff_18 = new Font("Arieal",Font.PLAIN,14);
        jrb_1.setFont(ff_17);
        jrb_2.setFont(ff_18);
        ButtonGroup bg = new ButtonGroup();    
        bg.add(jrb_1);bg.add(jrb_2);
        jf.add(jrb_1); jf.add(jrb_2);
        
         JLabel jlbl_14 = new JLabel("Status :");
        jlbl_14.setBounds(535,185,80,20);
        Font ff_19 = new Font("Arieal",Font.PLAIN,14);
        jlbl_14.setFont(ff_19);
        jf.add(jlbl_14);
        
        String status[]={"Single","Married","Divorce"};    
        JComboBox jcbx_4 = new JComboBox(status);
        jcbx_4.setBounds(590,185,100,20);
        Font ff_20 = new Font("Arieal",Font.PLAIN,12);
        jcbx_4.setFont(ff_20);
        jf.add(jcbx_4);
        
        JLabel jlbl_15 = new JLabel("Guardian :");
        jlbl_15.setBounds(280,220,80,20);
        Font ff_21 = new Font("Arieal",Font.PLAIN,14);
        jlbl_15.setFont(ff_21);
        jf.add(jlbl_15);
        
        JTextField txf_5 = new JTextField(" Enter Your Guardian Name");
        txf_5.setBounds(352,220,155,25);
        txf_5.setBorder(null);
        jf.add(txf_5);
        
        JLabel jlbl_16 = new JLabel("Relation  :");
        jlbl_16.setBounds(520,220,80,20);
        Font ff_22 = new Font("Arieal",Font.PLAIN,14);
        jlbl_16.setFont(ff_22);
        jf.add(jlbl_16);
        
        JTextField txf_6 = new JTextField(" Your Relationship with Guardian");
        txf_6.setBounds(592,220,180,25);
       txf_6.setBorder(null);
        jf.add(txf_6);
        
        JLabel jlbl_17 = new JLabel("Contact :");
        jlbl_17.setBounds(410,255,80,20);
        Font ff_23 = new Font("Arieal",Font.PLAIN,14);
        jlbl_17.setFont(ff_23);
        jf.add(jlbl_17);
        
        JTextField txf_7 = new JTextField(" Enter your Contact number");
        txf_7.setBounds(473,255,300,25);
        txf_7.setBorder(null);
        jf.add(txf_7);
        
        JButton jbtn_5 = new JButton("Next");
        jbtn_5.setBounds(595,320,70,25);
        Font ff_24 = new Font("Arieal",Font.PLAIN,14);
        jbtn_5.setFont(ff_24);
        jf.add(jbtn_5);
        
        JButton jbtn_6 = new JButton("Save");
        jbtn_6.setBounds(670,320,105,25);
        Font ff_25 = new Font("Arieal",Font.PLAIN,14);
        jbtn_6.setFont(ff_25);
        jf.add(jbtn_6);
        
        jf.setBounds(375,155,810,400);
        jf.setLayout(null);
        //jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }    
}

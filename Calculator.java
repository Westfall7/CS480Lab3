import java.util.*;
import java.io.*;
import java.util.Scanner;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

//class catButton
public class Calculator extends JFrame
{
   //size of window
   private final int WINDOW_WIDTH = 300;
   private final int WINDOW_HEIGHT = 400;
   
   //declare the different buttons
   private JButton button1;
   private JButton button2;
   private JButton button3;
   private JButton button4;
   private JButton button5;
   private JButton button6;
   private JButton button7;
   private JButton button8;
   private JButton button9;
   private JButton button0;
   private JButton buttonP;
   private JButton buttonM;
   private JButton buttonMult;
   private JButton buttonDiv;
   private JButton buttonSqur;
   private JButton buttonPar;
   private JButton buttonEqu;
   private JButton buttonback;
   private JButton buttonc;
   private JButton buttonPM;
   private JButton buttonDot;
   private JTextField txtDis;
   
   private JPanel motherPanel;
   private JPanel textPanel;
   private JPanel buttons;

   String equationString;
   
   //Calculator constructor
   public Calculator()
   {
      createButtons();
      editFont();
           
      setTitle("Calculator");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setLocationByPlatform(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      addItems();
      
      button1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
               equationString = (equationString+"1");
         }
      });
      
            button2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
               equationString = (equationString+"2");
         }
      });
      
      /*
      button2
      button3
      button4
      button5
      button6
      button7
      button8
      button9
      button0
      buttonP
      buttonM
      buttonMult
      buttonDiv
      buttonSqur
      buttonPar
      buttonEqu
      buttonback
      buttonc
      buttonPM
      buttonDot
      */       
   
   }
   
   
   
   
/*   
   //action listener for newfact button. This will change the facts
   private class FactSwitch implements ActionListener 
    {

        public void actionPerformed(ActionEvent e) 
        {
            //make the new icons facts for the 8 cat buttons
            Icon fact1r = new ImageIcon(getClass().getResource("fact1r.jpg"));
            Icon fact2r = new ImageIcon(getClass().getResource("fact2r.jpg"));
            Icon fact3r = new ImageIcon(getClass().getResource("fact3r.jpg"));
            Icon fact4r = new ImageIcon(getClass().getResource("fact4r.jpg"));
            Icon fact5r = new ImageIcon(getClass().getResource("fact5r.jpg"));
            Icon fact6r = new ImageIcon(getClass().getResource("fact6r.jpg"));
            Icon fact7r = new ImageIcon(getClass().getResource("fact7r.jpg"));
            Icon fact8r = new ImageIcon(getClass().getResource("fact8r.jpg"));
            
            //set the new image icons for the 8 cat facts and chage the 
            //text on the newFact button
            catOne.setRolloverIcon(fact1r);
            catTwo.setRolloverIcon(fact2r);
            catThree.setRolloverIcon(fact3r);
            catFour.setRolloverIcon(fact4r);
            catFive.setRolloverIcon(fact5r);
            catSix.setRolloverIcon(fact6r);
            catSeven.setRolloverIcon(fact7r);
            catEight.setRolloverIcon(fact8r);
            newFact.setText("Thats all the facts we have");

            
            
        }
    }
*/

   public static void main(String args[]) throws Exception
   {
      Calculator play = new Calculator();
      String res = (" ");
      Calc(res);
   }
   
   
   public static void Calc(String res) throws Exception
   {
      javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
      javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
      res = "((2+3/1)*(4/-)";
      
      try{
         System.out.println(engine.eval(res));
      }catch(ScriptException e){
         System.out.println("There was an error in your formula.");
      }
   }
   
   public void createButtons(){
           
      motherPanel = new JPanel();
      motherPanel.setLayout(new BoxLayout(motherPanel, BoxLayout.Y_AXIS));
      textPanel = new JPanel();
      buttons = new JPanel(new GridLayout(5, 4));
     
      //the method that instantites the components
      txtDis = new JTextField();
      
      button1 = new JButton("1");
      button2 = new JButton("2");
      button3 = new JButton("3");
      button4 = new JButton("4");
      button5 = new JButton("5");
      button6 = new JButton("6");
      button7 = new JButton("7");
      button8 = new JButton("8");
      button9 = new JButton("9");
      button0 = new JButton("0");
      buttonP = new JButton("+");
      buttonM = new JButton("-");
      buttonMult = new JButton("*");
      buttonDiv = new JButton("/");
      buttonSqur = new JButton("^");
      buttonPar = new JButton("()");
      buttonEqu = new JButton("=");
      buttonback = new JButton("<----");
      buttonc = new JButton("C");
      buttonPM = new JButton("+-");
      buttonDot = new JButton(".");
   }
   
   public void editFont(){
   //set font for all the buttons and text box
      txtDis.setFont(new Font("Calibri", Font.BOLD, 20));
      txtDis.setPreferredSize(new Dimension(270, 50));
      txtDis.setBackground(Color.WHITE);
      txtDis.setEnabled(false);
      txtDis.setHorizontalAlignment(4); 
   
      button1.setFont(new Font("Calibri", Font.BOLD, 20));
      button2.setFont(new Font("Calibri", Font.BOLD, 20));
      button3.setFont(new Font("Calibri", Font.BOLD, 20));
      button4.setFont(new Font("Calibri", Font.BOLD, 20));
      button5.setFont(new Font("Calibri", Font.BOLD, 20));
      button6.setFont(new Font("Calibri", Font.BOLD, 20));
      button7.setFont(new Font("Calibri", Font.BOLD, 20));
      button8.setFont(new Font("Calibri", Font.BOLD, 20));
      button9.setFont(new Font("Calibri", Font.BOLD, 20));
      button0.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonP.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonM.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonMult.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonDiv.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonSqur.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonPar.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonEqu.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonback.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonc.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonPM.setFont(new Font("Calibri", Font.BOLD, 20));
      buttonDot.setFont(new Font("Calibri", Font.BOLD, 20));
   }
   
   public void addItems(){
      //add text box to textPanel
      textPanel.add(txtDis);
      //add all the buttons to the grid layout        
      buttons.add(buttonSqur);
      buttons.add(buttonc);
      buttons.add(buttonback);
      buttons.add(buttonDiv);
      buttons.add(button7);
      buttons.add(button8);
      buttons.add(button9);
      buttons.add(buttonMult);
      buttons.add(button4);
      buttons.add(button5);
      buttons.add(button6);
      buttons.add(buttonM);
      buttons.add(button1);
      buttons.add(button2);
      buttons.add(button3);
      buttons.add(buttonP);      
      buttons.add(buttonPar);
      buttons.add(button0);
      buttons.add(buttonDot);
      buttons.add(buttonEqu);
      
      
      motherPanel.add(textPanel);
      motherPanel.add(buttons);
      add(motherPanel);
   }
   
}
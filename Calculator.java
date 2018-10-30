import java.util.*;
import java.io.*;
import java.util.Scanner;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//class catButton
public class Calculator extends JFrame
{
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

   
   private ImageIcon image;
   private JLabel imageLabel;   
   
   //size of window
   private final int WINDOW_WIDTH = 800;
   private final int WINDOW_HEIGHT = 700;
   
   //Calculator constructor
   public Calculator()
   {
      //set title, size, close operation, type of layout
      //build the panel and then set visible
      setTitle("Calculator");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new GridLayout(5, 4));
      buildPanel();
      setVisible(true);

   }
   
   //the method that instantites the components
   private void buildPanel()
   {
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
      
      
      //set newfact button and its actionlistener
      //newFact = new JButton("Click for new facts");
      //newFact.addActionListener(new FactSwitch());      

      //add all the buttons to the grid layout       
      add(buttonSqur);
      add(buttonc);
      add(buttonback);
      add(buttonDiv);
      add(button7);
      add(button8);
      add(button9);
      add(buttonMult);
      add(button4);
      add(button5);
      add(button6);
      add(buttonM);
      add(button1);
      add(button2);
      add(button3);
      add(buttonP);      
      add(buttonPar);
      add(button0);
      add(buttonDot);
      add(buttonEqu);

   
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
}
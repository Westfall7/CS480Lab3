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
   private JButton buttonPar2;
   private JButton buttonEqu;
   private JButton buttonback;
   private JButton buttonc;
   private JButton buttonPM;
   private JButton buttonDot;
   private JTextField txtDis;
   //Declare the 3 JPanels motherPanel will contain the other two
   private JPanel motherPanel;
   private JPanel textPanel;
   private JPanel buttons;
   
   //Set the string that will contain the equation to be empty
   String equationString = "";
   
   //Calculator constructor
   public Calculator()
   {
      //creates buttons and then sets their fonts
      createButtons();
      editFont();
      //makes an action listener for all of the buttons that update the string
      //and print to the textbox
      creatActionListeners();
      //adds all of the buttons to their JPanel and then adds all of the panels 
      //into eachother and sets the mother panel as the main gui
      addItems();
      
      //sets the general information for the gui title, size, exit, and visibility
      setTitle("Calculator");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setLocationByPlatform(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);     
   }
   
  /*
      This is the main method. This method will call the Calculator class to
      create an object of type calculator 
  */
   public static void main(String args[])
   {
      Calculator play = new Calculator();
   }
   
   
   public String Calc(String res)
   {
      javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
      javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
      String outPut;
      try{
         outPut = String.valueOf(engine.eval(res));
         return outPut;
      }catch(ScriptException e){
         outPut = "Error in formula";
         return outPut;
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
      buttonPar = new JButton("(");
      buttonPar2 = new JButton(")");
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
      buttonPar2.setFont(new Font("Calibri", Font.BOLD, 20));
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
      //buttons.add(buttonback);
      buttons.add(buttonDot);
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
      buttons.add(buttonPar2);
      buttons.add(buttonEqu);
      
      
      motherPanel.add(textPanel);
      motherPanel.add(buttons);
      add(motherPanel);
   }
   
   public void creatActionListeners(){
         //create all of the action listeners for all of the buttons
         button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"1");
               txtDis.setText(equationString);
               System.out.println(equationString);
            }
         });
      
         button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"2");
               txtDis.setText(equationString);
            }
         });
         
         button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"3");
               txtDis.setText(equationString);
            }
         });
      
         button4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"4");
               txtDis.setText(equationString);
            }
         });

         button5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"5");
               txtDis.setText(equationString);
            }
         });
      
         button6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"6");
               txtDis.setText(equationString);
            }
         });
         
         button7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"7");
               txtDis.setText(equationString);
            }
         });
      
         button8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"8");
               txtDis.setText(equationString);
            }
         });      
         
         button9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"9");
               txtDis.setText(equationString);
            }
         });
      
         button0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"0");
               txtDis.setText(equationString);
            }
         });
         
         buttonP.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"+");
               txtDis.setText(equationString);
            }
         });
      
         buttonM.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"-");
               txtDis.setText(equationString);
            }
         });         

         buttonMult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"*");
               txtDis.setText(equationString);
            }
         });
      
         buttonDiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"/");
               txtDis.setText(equationString);
            }
         });
         
         buttonSqur.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               //txtDis.setTxt(equationString+"^");
               if(equationString.length() == 0){
                  txtDis.setText("Come on stupid enter a value");
               }else{
               String last = (equationString.substring(equationString.length() - 1));
               equationString = equationString.substring(0, equationString.length() - 1);
               equationString = (equationString+"Math.pow("+last+",");
               txtDis.setText(equationString);
               }
            }
         });
         
         //PARENTHASES
         buttonPar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"(");
               txtDis.setText(equationString);
            }
         });
         
         buttonPar2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+")");
               txtDis.setText(equationString);
            }
         });
         
         //EQUAL 
         buttonEqu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){      
               equationString = Calc(equationString);
               txtDis.setText(equationString);
               if(equationString.equals("Error in formula"))
               {
                  equationString = "";
               }
            }
         });
      
  
         /*//BACK BUTTON
         buttonback.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"");
            }
         });*/
         
         //CLEAR
         buttonc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = ("");
               txtDis.setText(equationString);
            }
         });
      
         buttonPM.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+"-");
               txtDis.setText(equationString);
            }
         });
         
         buttonDot.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               equationString = (equationString+".");
               txtDis.setText(equationString);
            }
         });
   
   }   
}
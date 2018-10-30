import java.util.*;
import java.io.*;
import java.util.Scanner;
import javax.script.ScriptException;

public class Calculator
{
   public static void main(String args[]) throws Exception{
      javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
      javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
      String res = "((2+3/)(4/- = ";
      
      try{
         System.out.println(engine.eval(res));
      }catch(ScriptException e){
         System.out.println("There was an error in your entered formula.");
      }
   
   }
}
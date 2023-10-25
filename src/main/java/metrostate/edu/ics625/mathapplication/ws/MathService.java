/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metrostate.edu.ics625.mathapplication.ws;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tom Coffee
 */
@Service
public class MathService {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiple(int a, int b) {
        return a * b;
    }
    
    /*
    * public String absolute(String s) determines 
    * if s is a int, long, float, or double value.
    * If it is one of those types, it returns it
    * as the absolute value, if not, it returns
    * an error message. 
    */
    public String absolute(String s) {
            //returns "java.lang.String"
            String className = s.getClass().getName();
            
            //strip leading and trailing spaces, strip commas:
            s = s.strip();
            if (s.indexOf(",") > -1)
                s = s.replace(",", "");
            
            int i;
            double d;
            float f;
            long l;
            
            try {
                i = Integer.parseInt(s);
                className = "int";
            } 
            catch (NumberFormatException e) {
                //do nothing continue trying other 
                //methods to parse s into a number.
            }
            
            if (className.equals(("java.lang.String"))) {
                try {
                    d = Double.parseDouble(s);
                    className = "double";
                }
                catch (NumberFormatException e) {
                    //do nothing continue trying other 
                    //methods to parse s into a number.
                }
            }
            
            if (className.equals(("java.lang.String"))) {
                try {
                    f = Float.parseFloat(s);
                    className = "float";
                }
                catch (NumberFormatException e) {
                    //do nothing continue trying other 
                    //methods to parse s into a number.
                }
            }
            
            if (className.equals(("java.lang.String"))) {
               try {
                   l = Long.parseLong(s);
                   className = "long";
               }
               catch (NumberFormatException e) {
                    //do nothing continue trying other 
                    //methods to parse s into a number.
                }
            }

            
            try {
                switch(className) { 
                    case "int":
                        return String.valueOf(Math.abs(Integer.parseInt(s)));
                    case "double" :
                        return String.valueOf(Math.abs(Double.parseDouble(s)));
                    case "float" :
                        return String.valueOf(Math.abs(Float.parseFloat(s)));
                    case "long" :
                        return String.valueOf(Math.abs(Long.parseLong(s)));
                    case "java.lang.String" :
                        throw new Exception("Error: cannot determine absolute value " 
                                + "of string submitted in request. Request did not " +
                                "parse into an int, double, float, or long.");
                    default:
                        throw new Exception("Error: undeterminsed error. ");
                }

            }
            catch (Exception e) {
                //TODO:  add error logging
                return e.getMessage();
            }
    }
    
    /**
     *
     * @param il
     * @return
     */
    public String max(List<Integer> li) {
        String result;
        if (li.size() < 1)
            result = "Error: no intergers submitted. Please include at least one integer in the request.";
        
        int firstInt = li.get(0);
        result = String.valueOf(firstInt);
        
        for (Integer number: li) {
            if (number > firstInt)
                result = String.valueOf(number);
        }
        
        return result;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textchat;

/**
 *
 * @author dibyendu
 */
import java.rmi.*;
import java.io.*;
public class Client {
    public static void main(String args[])
   {
       try
       {
           MyInterface mi=(MyInterface)Naming.lookup("rmi://localhost:1099/bot");
           System.out.println(" ... Do you know I am a bot.Please tell me your name");
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String name=br.readLine();
           
           mi.sum(name);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textchat;
import java.rmi.*;
import java.io.*;
import java.rmi.server.*;

public class MyServer extends UnicastRemoteObject implements MyInterface 
{
  public MyServer()throws RemoteException
  {
        super();
  }
  
  public void sum(String s)
  {
                try
                {
                    System.out.println("Hello Nice to meet you"+s);
                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    
                   
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
  }
}

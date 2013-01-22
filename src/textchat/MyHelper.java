/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textchat;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author dibyendu
 */
public class MyHelper {
    public static void main(String args[])
    {
        try
        {
            LocateRegistry.createRegistry(1099);
            MyServer ms=new MyServer();
            Naming.rebind("bot",ms);
            System.out.println("Linked...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

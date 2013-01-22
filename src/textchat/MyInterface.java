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
public interface  MyInterface extends Remote
{
    public void sum(String s)throws RemoteException; 
}


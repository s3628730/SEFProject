import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObject extends UnicastRemoteObject implements RemoteObjectIntf{
	
	public RemoteObject() throws RemoteException{
		//Constructor Work
	}
	
	public double sendString(String description) throws RemoteException{
		System.out.println("String recieved: " + description);
		return 0;
	}
}

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Server {

	public static void main(String[] args) throws RemoteException, NamingException, UnknownHostException{
		System.out.println("Constructing server implementation...");
		RemoteObject remoteObj = new RemoteObject();
		
		System.out.println("Binding server implementation to registry...");
		Context namingContext = new InitialContext();
		
		LocateRegistry.createRegistry(1099);
		
		namingContext.bind("rmi:remote_obj",remoteObj);
		
		System.out.println("Waiting for invocations from clients...");
		System.out.println("Localhost Address: " + InetAddress.getLocalHost().getHostAddress());
	}

}

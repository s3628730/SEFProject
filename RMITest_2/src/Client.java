import java.rmi.RemoteException;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

	public static void main(String[] args) throws NamingException, RemoteException {
		Context namingContext = new InitialContext();
		System.out.println("RMI register NameClassPair");
		
		
		String hostAddress;
		System.out.println("Please enter the local address of server...");
		Scanner in = new Scanner(System.in);
		hostAddress = in.nextLine();
		in.close();
		
		
		String url = "rmi://" + hostAddress + "/remote_obj";
		RemoteObjectIntf remoteObjectStub = (RemoteObjectIntf) namingContext.lookup(url);
		
		double time = System.currentTimeMillis();
		System.out.println(remoteObjectStub.sendString("Local client"));
		System.out.println("Remote call took: " + (System.currentTimeMillis() - time) + "ms");
		
	}

}

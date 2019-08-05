import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteObjectIntf extends Remote{
	double sendString(String description) throws RemoteException;
	
}

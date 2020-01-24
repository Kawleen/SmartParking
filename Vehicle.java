public interface Vehicle{

	public Context vehicleType(Context context) throws RemoteException, ContextException;
	
	public Context parkIN(Context context) throws RemoteException, ContextException;

	public Context backOut(Context context) throws RemoteException, ContextException;

 }

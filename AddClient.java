import java.rmi.*;
public class AddClient{
	public static void main(String args[]){
		try{
			String addServerURL = "rmi://127.0.0.1/AddServer";
			AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
			System.out.println("The First Number is : " + args[0]);
			double d1 = Double.valueOf(args[0]).doubleValue();
			System.out.println("The Second Number is : " + args[1]);
			double d2 = Double.valueOf(args[1]).doubleValue();
			System.out.println("The Sum is : " + addServerIntf.add(d1,d2));
		}catch(Exception e){
			System.out.println("Exception : " + e);
		}
	}
}

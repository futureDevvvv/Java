package inheritanceNinterface;

public class InterfaceEx {
	public static void main(String[] args) {
		SamsumPhone phone = new SamsumPhone();
		
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}

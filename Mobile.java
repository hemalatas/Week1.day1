package weeek1.day1;

public class Mobile {
	
	String mobileModel = "RedmiNote4";
	int mobileWeight = 10;
	int FullCharge =100;		
	
public void makeCall() {
	System.out.println("callConnected"); 
}
public void sendMsg() {
	System.out.println("sendMessage");
	
}	

public static void main(String[] args) {
	
	Mobile mob = new Mobile();
	mob.makeCall();
	mob.sendMsg();
	
	System.out.println(mob.mobileModel);
	System.out.println(mob.mobileWeight);
	System.out.println(mob.FullCharge);
	
	}

}

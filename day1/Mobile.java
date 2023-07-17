package week1.day1;

public class Mobile {
	public void makecall() {
		String MobileModel="redmi";
		float MobileWeight=16.5f;
		System.out.println(MobileModel+"\n"+MobileWeight);
	}
	public void sendmsg() {
		boolean FullCharged=true;
		int MobileCost=12500;
		System.out.println(FullCharged);
		System.out.println(MobileCost);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile(); 
		m.makecall();
		m.sendmsg();
		System.out.println("This is my mobile");

	}

}

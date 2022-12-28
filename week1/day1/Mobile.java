package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		Mobile var = new Mobile();
		var.sendSMS();
		var.takeSnap();
		var.makeCall();
		var.sendMsg();

	}

	public void sendSMS() {
		System.out.println("Send Message to Friend");
	}

	public void takeSnap() {
		System.out.println("Click Some Pictures");
	}

	public void makeCall() {
		String mobileModel = "OnePlus";

		System.out.println(mobileModel);

	}

	public void sendMsg() {
		boolean isFullyCharged = true;
		int mobileCost = 20000;	   

		System.out.println(isFullyCharged);
		System.out.println(mobileCost);
	}

}

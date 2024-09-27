package overriding;

public class WhatsappLatestVersion extends Whatsapp {
	

	public void send() {
		
		System.out.println(" text messages, photos , videos , memes  users can send");

	}
	
	
	public void call() {
		
		System.out.println("Voice call with video and multiple call together  feature available");

		
	}
	
	
	public void status() {
		System.out.println("U can add status for 10 seconds");
		
	}

	
	

	public static void main(String[] args) {
		
		WhatsappLatestVersion w = new WhatsappLatestVersion();
		
		w.call();
		w.status();
		w.send();
	

		
		
		
	}

}

package thread;

public class runnable implements Runnable{
	int val,i;
	public runnable(int val){
		val=val;
	}
	public void run() {
		
		try {
	
			val=1000;
			for(i=1;i<=val;i++) {System.out.println(i);
				Thread.sleep(100);	
			}}catch(InterruptedException e) {
			return;
		}
	}
	public static void main(String[] args) {
		Runnable exemple11= new runnable(0);
new Thread(exemple11).start();

	}
}



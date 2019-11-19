package thread;

public class ex1 implements Runnable{
	int val,i;
	public ex1(int val){
		val=val;
	}
	public void run() {
		
		try {
	
			val=1;
			for(i=1000;i>=val;i--) {System.out.println(i);
				Thread.sleep(10);	
			}}catch(InterruptedException e) {
			return;
		}
	}
	public static void main(String[] args) {
		Runnable exemple11= new ex1(0);
new Thread(exemple11).start();

	}
}

package thread;

public class ex1_3 extends Thread{
	int val,i;
	ex1_3(int val){
		val=val;
	}
	public void run() {
		
		try {
			val=1;
			for(i=1000;i>=val;i--) {
				System.out.println(i);
				sleep(100);	}
		}catch(InterruptedException e) {
			return;
		}
	}
	public static void main(String[] args) {
new ex1_3(1).start();

	}


}




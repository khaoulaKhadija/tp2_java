package thread;

public class ex1_2 extends Thread{
	int val,i;
	ex1_2(int val){
		val=val;
	}
	public void run() {
		
		try {
			val=1000;
			for(i=1;i<=val;i++) {
				System.out.println(i);
				sleep(100);	}
		}catch(InterruptedException e) {
			return;
		}
	}
	public static void main(String[] args) {
new ex1_2(1).start();

	}

}



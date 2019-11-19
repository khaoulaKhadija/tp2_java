package ex2;

public class TestOrder extends Compteur{
public TestOrder(String nom, int maxValue) {
	super(nom,maxValue);
	
}
public void run() {
	
	try {
	
		for(i=1;i<=maxValue;i++) {
		
			System.out.println(nom+":"+i);
			sleep(100);	}
	}catch(InterruptedException e) {
		return;
	}
	

}

public static void main(String[] args) {
	new Compteur("kha",10).start();

}

}

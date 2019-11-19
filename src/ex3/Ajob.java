package ex3;

import ex2.Compteur;

public class Ajob implements Runnable{
int i;
Valeur myval;
 public Ajob(int i, Valeur myval) {
	 this.i=i;
	 this.myval=myval;
 }

public void run() {
	for(i=1;i<Math.sqrt(10.6);i++) {
		myval.add(i);
	
	}
	System.out.println(i+":"+myval);	
}
public static void main(String[] args) {
	
	Valeur c = new Valeur(); 
	Ajob job1= new Ajob(1, c);
	Thread tache1 = new Thread(job1);

	tache1.start();
	
}
}

package ex2;

import thread.ex1_3;

public class Compteur extends Thread{
String nom;
int maxValue;
int i;
public Compteur(String nom, int maxValue) {
	this.nom=nom;
	this.maxValue=maxValue;
}
public Compteur(String nom) {
	this(nom,10);
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

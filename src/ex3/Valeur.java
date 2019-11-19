package ex3;

public class Valeur {
int val;
public int getVal(int val) {
	return val;
}
public void add(int i) {
	val=val+i;
}
public String toString() {
	return Integer.toString(val);
}
}

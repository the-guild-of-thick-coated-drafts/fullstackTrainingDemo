package hw.model;

public class Status {
	private String st;
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	@Override
	public String toString() {
		return "[st=" + st + "]";
	}
	public Status(){
		
	}
}

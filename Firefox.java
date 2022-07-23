package week1.day2;

public class Firefox {
	

	private void edge() {
		float version = 100.2f;
		String name = "firefox";
		
		System.out.println("Version is" +version);
		System.out.println("Name is" +name);
	}
	private void chrome() {
		int year = 199;
		System.out.println("Speed is" +year);
	}
	public static void main(String[] args) {
		Firefox bw = new Firefox();
		bw.edge();
		bw.chrome();
		
	}
}

package in.ashokit;

public class Car extends Engine {

	public void drive() {
		int status = super.start();
		if (status>=1) {
			System.out.println("Journey started...");
		}else
		{
			System.out.println("Engine Having some problem...");
		}
	}
}
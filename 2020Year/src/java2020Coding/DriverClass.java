package java2020Coding;

public class DriverClass implements WebDrvier1 {

	public static void main(String[] args) {
		
		DriverClass obj= new DriverClass();
		obj.Dr();
		obj.Cr();
		obj.ATM();
	}

	
	public void Dr() 
	{
	System.out.println("Driver 1 as DR");
		
	}


	public void Cr() {
		System.out.println("Driver 1 as CR");
		
	}


	public void ATM() {
		System.out.println("Driver 1 as ATM");
		
	}

	@Override
	public void inter() {
		// TODO Auto-generated method stub
		
	}

}

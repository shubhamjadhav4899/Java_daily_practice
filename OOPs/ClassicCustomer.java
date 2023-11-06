public class ClassicCustomer extends Customer{
	private static double intrest=5.5;


	public ClassicCustomer(int cid,String name){
		super(cid,name);
		super.setBalence(10000.0);

	}

	@Override
	public void display(){
	super.display();
	System.out.println("Annual Intrest is : "+intrest);

	}

	@Override
	public void calculateIntrest(){
	int year=5;
	double balence=getBalence();
	double intrestPerYear=balence*intrest/100;
	double totalBalence=balence+year*intrestPerYear;
	System.out.println("Intrest earned in "+year+" is "+intrestPerYear);
	System.out.println("Total Balence is :"+totalBalence);

	}
}
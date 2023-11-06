public class Customer{
	private int cid;
	private String name;
	private double balence;
	private static String bank="HDFC";



public Customer(int cid,String name){
	this.cid=cid;
	this.name=name;
	balence=10000.00;
}
public void display(){
	System.out.println("Customer Id : "+cid);
	System.out.println("Name : "+name);
	System.out.println("Balence : "+balence);
	System.out.println("Bank Name : "+bank);

}

public double getBalence(){
	return balence;
}


public void setBalence(double balence){
	this.balence=balence;
}

public void calculateIntrest(){
	int year=5;
	double intrest=4.5;
	double intrestPerYear=balence*intrest/100;
	double totalBalence=balence+year*intrestPerYear;
	System.out.println("Annual Intrest : "+intrest);
	System.out.println("Intrest earned in "+year+" Year is "+intrestPerYear);
	System.out.println("Total Balence is :"+totalBalence);

}


}
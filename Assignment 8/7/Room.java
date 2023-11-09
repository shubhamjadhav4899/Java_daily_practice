public class Room{
	protected int roomno;
	protected String roomtype;
	protected double roomarea;
	protected int acMachine;

	public void setData(int roomno,String roomtype,double roomarea,int acMachine){
		this.roomno=roomno;
		this.roomtype=roomtype;
		this.roomarea=roomarea;
		this.acMachine=acMachine;
	}


	public void displayData(){
		System.out.println("Room Number : "+roomno);
		System.out.println("Room Type : "+roomtype);
		System.out.println("Room Area : "+roomarea+"Sq.m");
		System.out.println("AC Machine Number : "+acMachine);

	}
}
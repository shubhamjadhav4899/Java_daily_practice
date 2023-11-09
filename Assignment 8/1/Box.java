public class Box{
	private int length;
	private int breadth;


	public Box(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}

	public int findArea(){
		int area=length*breadth;
		return area;
	}

	

	
}
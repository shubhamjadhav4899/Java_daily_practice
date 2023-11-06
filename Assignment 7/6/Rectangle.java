class Rectangle{
	int length;
	int width;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	void calculateArea(){
		int area=length*width;
		System.out.println("Area is : "+area);
	}

	void calculatePerimeter(){
		int perimiter=2*(length+width);
		System.out.println("Perimeter : "+perimiter);
	}
}
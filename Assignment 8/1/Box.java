class Box{
	int length;
	int breadth;
	int height;


	Box(int length,int breadth,int height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}

	void findArea(){
		int area=length*breadth;
		System.out.println("Area : "+area);
	}

	void findVolume(){
		int volume=height*length*breadth;
		System.out.println("Volume : "+volume);
	}

	
}
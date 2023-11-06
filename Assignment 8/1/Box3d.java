class Box3d extends Box {

	int height;

	Box3d(int height,int length,int breadth){
		super(length,breadth);
		this.height=height;
	}

	

	void findVolume(){
		int volume=height*length*breadth;
		System.out.println("Volume : "+volume);
	}
}
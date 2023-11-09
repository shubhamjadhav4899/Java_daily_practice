class Box3d extends Box {

	private int height;
	public Box3d(int length,int breadth,int height){
		super(length,breadth);
		this.height=height;
	}
	public int findVolume(){
		int volume=super.findArea()*height;
		return volume;
	}
}
class Driver{
	public static void main(String[] args) {
		Box box=new Box(2,4);
		Box3d box3d=new Box3d(2,2,3);
		//printing the Area and volume
		System.out.println("Area : "+box3d.findArea());
		System.out.println("Volume : "+box3d.findVolume());
	}
}
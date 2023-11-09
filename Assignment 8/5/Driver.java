class Driver{
	public static void main(String[] args) {
		ParentClass parent=new ParentClass();
		SubClass sub=new SubClass();
		parent.printClass();
		sub.printClass();
		//upcasting 
		parent=sub;
		parent.printClass();
	}

}
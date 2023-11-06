class ReferenceDemo{
	int a;
	int b;
	ReferenceDemo(int a,int b){
		this.a=a;
		this.b=b;
	}
	int add(){
		return a+b;
	}
	public static void main(String[] args){
		ReferenceDemo ref=new ReferenceDemo(10,20);
		ref1=new ReferenceDemo();
		int sum=ref.add();
		System.out.println(sum);
	}
}
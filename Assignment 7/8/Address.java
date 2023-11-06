class Address{
	int buildingNo;
	String area;
	String city;
	int pincode;
	Address(int buildingNo,String area,String city,int pincode){
		this.buildingNo=buildingNo;
		this.area=area;
		this.city=city;
		this.pincode=pincode;
	}

	void getAddress(){
		System.out.println("Address : "+buildingNo+" "+area+" "+city+" "+pincode);
	}
}
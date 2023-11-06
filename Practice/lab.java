class lab{
	public static void main(String[] args){
		int a=10;
		a=++(++a);
		boolean b=true;
		b=++b;
		System.out.println(a+b);
	}
}

f/*rom CDAC Hyderabad to everyone:    1:06 PM
OOP With Java Lab - 23/10/2023
1) x = 10;
   y = ++x; //11
2) y = x++; //10
3) y = --x;//9
4) y = x--;//10
5) byte b = 128; byte range 0 to 127;
6) char size in java = 2 bytes (16bits)
7)     int x = 10;
    int y = ++(++x);y = ++(11)
    SOP(y);//
    
8)    char ch = 'a';    
    ch++;
    SOP(ch); //b
9)    boolean b = true;
    b++;
    SOP(b);
10)     in C==> true = 1
    in C==> false = 0
11) In java boolean output depends on machine
12) SOP('a'+ 0.89) // 97 + 0.89 = 97.89
13) string "CDAC"+"HYD"==> CDACHYD
14) int 1 + 2 = 3;
15)     String a = "CDAC";
    int b = 10, c = 20, d = 30;
    1) a = b+c+d; //invalid
    2) a = a+b+c; // invalid;
    3) b = a+c+d; // invalid
    4) b = b+c+d; // b = 60;
16)     SOP(10<20);//true
    SOP('a'<10);//false
    SOP(true>false);// cannot be applied
17)     SOP(10==20);//false
    SOP('a'=='b');//false
    SOP('a'==97.0);//true
18)    SOP(4&5); 
19)    int x= 10,y=15;
    if(++x<10 & ++y>15)//11<10 & 16>15
    {
        x++;
    }
    else{
        y++;
    }
    SOP(x+"...."+y*/
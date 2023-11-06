/*
class First{
    public static void main(String[] args) {
    int a = 1+ (int) (Math.random()*100); // 1-100
    int b = 1+ (int) (Math.random()*100); // 1-100
    int c = 1+ (int) (Math.random()*100); // 1-100
    System.out.println(a+" "+b+" "+c);
    if(a>b){
        if(a>c)
            System.out.println(a+ " is big");
        else
            System.out.println(c +" is big");
    }
    else{
        if(b>c)
            System.out.println(b+" is big");
        else
            System.out.println(c+" is big");
    }
    }
}*/


class First{
    public static void main(String[] args) {
    int a = 1+ (int) (Math.random()*100); // 1-100
    int b = 1+ (int) (Math.random()*100); // 1-100
    int c = 1+ (int) (Math.random()*100); // 1-100
    System.out.println(a+" "+b+" "+c);
   
    System.out.println((a>b && a>c) ? a: (b>c ? b:c));
    }
}
//ASCII / UNICODE
class Demo{
    
    public static void main(String[] args) {
    
    int count = 0;
    for(int i=33; i<=126;i++){
    System.out.print((char)i+"  ");    
    count++;
    if(count%10 == 0)
        System.out.println();
    }
}
}


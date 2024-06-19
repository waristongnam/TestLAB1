public class MyClass { 
    public static void main(String[] args) {
        float x = 1;
        float y = 2;
        float z;
        for(int i = 0;i<6;i++){
            z = (x+(y/x))/2;
            System.out.println(z);
            x = z;
        }
    }
}
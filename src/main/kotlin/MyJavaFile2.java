public class MyJavaFile2 {
    public static void main(String[] args) {
        int area = MyCustomKotlinFile.getArea(3,4);
        System.out.println("Area of the given value : "+ area);

        //To use default function in java use @JvmOverloads in kotlin file
        int volume = MyCustomKotlinFile.getVolume(5,6);
        System.out.println("Volume is = " + volume);
    }

    public static int add(int a, int b){
        return (a+b);
    }
}

public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        //To avoid exception you can check before accessing the element
        if(arr.length > 5 && 5 < arr.length)
            System.out.println(arr[5]);
        else
            System.out.println("Array index out of bound");
    }
}
public class Excercise24 {
    public static void main(String[] args){
        // Create a program that prints all the even numbers between 0 and 500


        int a = 1;
        while (a <= 500) {
            if (a % 2 == 0)
                System.out.println(a);
            a = a + 1;
        }
    }

}

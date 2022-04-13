public class App {
    
    // This method takes in two int parameters to add.
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    // This method takes in 3 int parameters to add.
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    // Overload method that computes the sum of 2 numbers
    private static int computeSum(int num1, int num2) {
        return num1 + num2;
    }
    //Overload method that computes the sum of 3 numbers
    private static int computeSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that returns the greater integer value
    private static int greaterValue(int a, int b) {
        return Math.max(a, b);
    }
     
    // method that returns the greater double value
    private static double greaterValue(double a, double b) {
        return Math.max(a, b);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("The sum of 15 and 3 is " + sum2(15, 3));
        System.out.println("The sum of 1, 2, and 3 is " + sum3(1, 2, 3));
        
        // method calls that takes in 2 parameters, and 3 parameters respectively and computes their sum.
        System.out.println("The sum of 10 and 25 using the overload method is" + computeSum(10, 25));
        System.out.println("The sum of 5, 9, and 31 using the overload method is is " + computeSum(5, 9, 31));

        // Call the greaterValue method with integer parameters
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));

        // Call the greaterValue method with double parameters
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));

    }
}

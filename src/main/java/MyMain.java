import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        // REPLACE WITH YOUR CODE HERE
        double n = 0;
        boolean finish = true;
        double m = 1;
        while (finish){
            n = (m + (x / m) )/2;
            if (Math.abs(n - m) < 0.00001){
                finish = false;
            }
            m = n;
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int r = 1;
        for (int y = 1; y <= x; y++){
            r = r * y;
        }
        return r;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        // REPLACE WITH YOUR CODE HERE
        int i = 0;
        double b = 0;
        while (Math.abs(b - Math.E) >= 0.00001){
            b += (1 / (factorial(i)));
            i++;
        }
        return b;
    }
    
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ENTER A POSITIVE NUMBER");

        double k = scan.nextDouble();

        System.out.println("THE SQUARE ROOT OF THAT NUMBER IS APPROXIMATELY " + babylonian(k));

        System.out.println("THE VALUE OF E IS APPROXIMATELY " + calculateE());
        

        scan.close();
    }
}
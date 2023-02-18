import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            sc.close();
            Calculator c1 = new Calculator(num1, num2);
            System.out.printf("addition:%s\nSubstaction:%s\nMultiplication:%s\nDivision:%s", c1.Add(), c1.Substract(),
                    c1.Multiplication(), c1.Division());
            throw new InputMismatchException();
        } catch (InputMismatchException IME) {
            System.out.println("Enter only intiger numbers");
        }

    }
}
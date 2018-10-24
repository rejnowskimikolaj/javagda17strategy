package formulas;

public class Multiply implements Operation{

    public int multiply(int a, int b){
        return a*b;
    }

    public int executeOperation(int a, int b) {
        return multiply(a,b);
    }
}

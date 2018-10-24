package formulas;

public class Substract implements Operation{

    public int substract(int a, int b){
        return a-b;
    }

    public int executeOperation(int a, int b) {
        return substract(a,b);
    }
}

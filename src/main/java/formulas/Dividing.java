package formulas;

public class Dividing  implements Operation{
    public int divide(int a,int b){
        return a/b;
    }

    public int executeOperation(int a, int b) {
        return divide(a,b);
    }
}

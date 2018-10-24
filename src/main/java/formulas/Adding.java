package formulas;

public class Adding implements Operation {

    int add(int a,int b){
        return a+b;
    }

    public int executeOperation(int a, int b) {
        return add(a,b);
    }
}

package formulas;

public class FormulaExecutor {

    private Operation operation;

    public FormulaExecutor(Operation operation) {
        this.operation = operation;
    }

    public int execute(int a, int b){
       return operation.executeOperation(a,b);
    }
}

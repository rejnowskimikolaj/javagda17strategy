package formulas;

public class Main {
    public static void main(String[] args) {
        FormulaExecutor formulaExecutor = new FormulaExecutor(new Adding());
        System.out.println(formulaExecutor.execute(1,3));
        FormulaExecutor formulaExecutor1 = new FormulaExecutor(new Operation() {
            public int executeOperation(int a, int b) {
                return 0;
            }
        });
        Operation operation = (x,y)->x+y;

}
}

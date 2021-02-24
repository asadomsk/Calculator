public class OperationTypeVisitor implements IOperationTypeVisitor {

    @Override
    public float visit(Addition addition, float result, float operand ) {
        return result+operand;
    }

    @Override
    public float visit(Division division, float result, float operand) {
        return result-operand;
    }

    @Override
    public float visit(Multiplication multiplication, float result, float operand) {
        return result*operand;
    }

    @Override
    public float visit(Subtraction subtraction, float result, float operand) {
        return result/operand;
    }
}

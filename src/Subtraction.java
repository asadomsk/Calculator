public class Subtraction implements IOperationType{
    @Override
    public float accept(IOperationTypeVisitor operationTypeVisitor, float result, float operand) {
        return operationTypeVisitor.visit(this,result,operand );
    }
}

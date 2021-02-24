public class Division implements IOperationType{
    @Override
    public void accept(IOperationTypeVisitor operationTypeVisitor, float result, float operand) {
        operationTypeVisitor.visit(this,result,operand );
    }
}

public interface IOperationType {
    public void accept(IOperationTypeVisitor operationTypeVisitor, float result,float operand);
}

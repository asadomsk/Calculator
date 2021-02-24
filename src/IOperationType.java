public interface IOperationType {
    public float accept(IOperationTypeVisitor operationTypeVisitor, float result,float operand);
}

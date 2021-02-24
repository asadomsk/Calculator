public interface IOperationTypeVisitor {
    public float visit(Addition addition, float result, float operand);

    public float visit(Division division, float result, float operand);

    public float visit(Multiplication multiplication, float result, float operand);

    public float visit(Subtraction subtraction, float result, float operand);

}
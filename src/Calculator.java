import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Calculator{

    Stack<Operation> operations;

    IOperationTypeVisitor operationTypeVisitor= new OperationTypeVisitor();

    IOperationType[] operators= new IOperationType[]{new Multiplication(),new Addition(),null,new Subtraction(),null,new Division()};


    public float doOperation(Operation operation){
        float result=0;
        if(operations==null){
            operations=new Stack();
        }else {
            result=operations.peek().getResult();
        }
        IOperationType operationType=operators[operation.getOperator()-'*'];
         //  result=operationTypeVisitor.visit(test,result,operation.getOperand());
            result=operationType.accept(operationTypeVisitor,result,operation.getOperand());
            operation.setResult(result);
            operations.push(operation);
            return result;
    }

    public void Undo() {

        Operation op=operations.pop();

    }

    public void Redo() {
        doOperation(new Operation(operations.peek()));
    }

}

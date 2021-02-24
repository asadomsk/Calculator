import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Operation {
    private char operator;
    private float operand;
    private float result;

    public Operation(Operation operation){
        this.operator=operation.operator;
        this.operand=operation.operand;
        this.result=operation.result;
    }

    public Operation(char operator, float operand){
        this.operator=operator;
        this.operand=operand;
    }


}

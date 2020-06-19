package result;

import Entity.OperationInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class OperationResult extends Result{

    private OperationInfo operationInfo;

    public OperationResult(String code, OperationInfo operationInfo) {
        super(code);
        this.operationInfo = operationInfo;
    }
}

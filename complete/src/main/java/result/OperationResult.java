package result;

import Entity.OperationInfo;

public class OperationResult extends Result{

    private OperationInfo operationInfo;

    public OperationResult(String code, OperationInfo operationInfo) {
        super(code);
        this.operationInfo = operationInfo;
    }

    public OperationResult() {
    }

    public OperationInfo getOperationInfo() {
        return operationInfo;
    }

    public void setOperationInfo(OperationInfo operationInfo) {
        this.operationInfo = operationInfo;
    }
}

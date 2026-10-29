class Exercise8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("Unsupported function.", 100);
    }
}
class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFunctionException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "] " + super.getMessage();
    }
}


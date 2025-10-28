package Laba4;
public class CustomNumberFormatException extends Exception {
    private String problemValue;
    
    public CustomNumberFormatException(String message, String problemValue) {
        super(message);
        this.problemValue = problemValue;
    }
    
    public String getProblemValue() {
        return problemValue;
    }
}

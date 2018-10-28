package main.com.company.model;

public enum CalculType {
    ADDITION("1", "Addition", "+"),
    SOUSTRACTION("2", "Soustraction", "-"),
    MULTIPLICATION("3", "Multiplication", "*"),
    DIVISION("4", "Division", "/");

    private String calculType;

    private String calculName;

    private String calculForm;

    CalculType() {
    }

    CalculType(String calculNumber, String calculTypeName, String calculForm) {
        this.calculType = calculNumber;
        this.calculName = calculTypeName;
        this.calculForm = calculForm;
    }
}

package main.com.company.model;

public enum CalculType {
    ADDITION("1", "Additionner", "+"),
    SOUSTRACTION("2", "Soustraire", "-"),
    MULTIPLICATION("3", "Multiplier", "*"),
    DIVISION("4", "Divisais", "/");

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

    public String getCalculType() {
        return calculType;
    }

    public void setCalculType(String calculNumber) {
        this.calculType = calculNumber;
    }

    public String getCalculTypeName() {
        return calculName;
    }

    public String getCalculForm() {
        return calculForm;
    }
}

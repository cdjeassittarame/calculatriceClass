package main.com.company.model;

public class CalculCase {

    public String CalculCase(int choix) {

        String calculType=null;
        switch (choix) {
            case 1:
                calculType = CalculType.ADDITION.getCalculTypeName();

                break;
            case 2:
                calculType = CalculType.SOUSTRACTION.getCalculTypeName();

                break;
            case 3:
                calculType = CalculType.MULTIPLICATION.getCalculTypeName();

                break;
            case 4:
                calculType = CalculType.DIVISION.getCalculTypeName();

                break;
        }
        return calculType;
    }
}

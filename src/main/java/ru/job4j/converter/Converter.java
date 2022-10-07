package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);

        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;

        float inDollars = 140;
        float expectedDollars = 2.3333333f;
        float outDollars = Converter.rubleToDollar(inDollars);
        boolean passedDollars = expectedDollars == outDollars;

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are " + dollar + " dollars.");
        System.out.println("140 rubles are 2. Test result : " + passedDollars);
    }
}
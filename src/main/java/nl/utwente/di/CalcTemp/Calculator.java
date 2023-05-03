package nl.utwente.di.CalcTemp;


public class Calculator {

    public Calculator() {
    }

    public double getResult(String celsius){
        return (Integer.parseInt(celsius)*1.8)+32;
    }

}

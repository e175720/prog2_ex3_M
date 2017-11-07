package jp.ac.uryukyu.ie.ex3.pair20;

public class ExDice extends Dice{
    private int minValue;
    private int maxValue;

    public ExDice (int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getmaxValue(){
        return maxValue;
    }

    public int getminValue(){
        return minValue;
    }

    @Override
    public void play(){
        int value = (int)(Math.random()*(this.getmaxValue()-this.getminValue()+1)+this.getminValue());

        super.setValue(value);
    }
}

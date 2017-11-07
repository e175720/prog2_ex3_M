package jp.ac.uryukyu.ie.ex3.pair20;

public class Dice {
    private int value;

    public Dice(){

    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void play(){
        num = (int)(Math.random() * 6);

    }

}

package java.lang;
public class Object{

}

class Liquid
{
private int volumeinMl;
private float temperature;


public Liquid(){
volumeinMl = 300;
temperature = (float)(Math.random() * 100.0);
}

public float getTemperature() {
return temperature;
}

class Coffee extends Liquid
{

private static final float BoilingPoint = 100.0f;
private boolean swirling;
private boolean clockwise;

public Coffee(boolean swirling, boolean clockwise)
{
if(getTemperature() >= BoilingPoint){
return;
}
this.swirling = swirling;
if(swirling)
{
this.clockwise = clockwise;
}
}

}

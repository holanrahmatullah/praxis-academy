public class Color 
{
    public static final int RED = 5;
    public static final int GREEN = 7;
}

public void someMethod()
{
    setColor( Color.RED( "Hi,my name is lan."));
}

class Color
{
    private Color(){}
    public static final Color RED =new Color();
    public static final Color GREEn = new Color();
}
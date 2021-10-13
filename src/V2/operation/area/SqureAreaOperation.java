package V2.operation.area;

public class SqureAreaOperation implements AreaOperation{
    public double execute(int[] size)
    {
        int length=size[0];
        return (double)length*length;
    }
}

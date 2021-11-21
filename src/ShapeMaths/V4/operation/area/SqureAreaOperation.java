package V4.operation.area;

public class SqureAreaOperation implements AreaOperation {
    public double execute(int[] size)
    {
        final int length=size[0];
        return (double)length*length;
    }
}

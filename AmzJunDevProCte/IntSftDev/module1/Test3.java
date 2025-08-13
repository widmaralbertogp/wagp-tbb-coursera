class GenericOuter
{
    	public class Inner<S extends Comparable<S>> 
	{
        	T getT() { return null;}
        	S getS() { return null;}
    	}
}
class Test {
    public static void main(String[] args) 
	{
        GenericOuter<Integer>.Inner<Double> x1 = null;
        Integer i = x1.getT();
        Double d = x1.getS();
    }
}

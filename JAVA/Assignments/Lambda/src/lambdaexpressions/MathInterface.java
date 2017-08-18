package lambdaexpressions;

@FunctionalInterface
public interface MathInterface<T> {
	public T calculate(int a, int b);
}

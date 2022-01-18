package MathUtils.Generic;

public interface GenericBasicMath<T> {
    T add(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);

    T divide(T a, T b);

    T EuclidGCD(T a, T b);
}

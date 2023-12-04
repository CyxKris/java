package interfacecode;

public interface ICalculator {
    void add();

    void subtract();

    void multiply();

    void divide();

    default void average() {

    }
}

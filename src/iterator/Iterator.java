package iterator;

public interface Iterator extends java.util.Iterator {
    boolean hasNext();

    Object next();

    @Override
    default void remove() {

    }
}

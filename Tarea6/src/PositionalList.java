
public interface PositionalList <E> {
    
    int size( );
    boolean isEmpty( );
    Position<E> first( );
    Position<E> last( );
    Position<E> addFirst(E e);
    Position<E> addLast(E e);
    Position<E> before(Position<E> p) throws IllegalArgumentException;
    Position<E> after(Position<E> p) throws IllegalArgumentException;
    Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException;
    Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException;
    Position<E> search(E value);
    Position<E> addBefore(Position<E> p, PositionalList<E> sublist);
    Position<E> addAfter(Position<E> p, PositionalList<E> sublist);
    Position<E> addFirst(Position<E> p, PositionalList<E> sublist);
    Position<E> addLast(Position<E> p, PositionalList<E> sublist);
    E set(Position<E> p, E e) throws IllegalArgumentException;
    E remove(Position<E> p) throws IllegalArgumentException;
    int distance(Position<E> a, Position<E> b);
    
}

import LinkedPositionalList.Node;

public class EnhancedPositionalLinkedList<E> implements PositionalList<E>{
	private E element;
	private Node<E> prev;// Anterior
	private Node<E> next;// Siguiente
	
	public Position<E> addBefore(Position<E> p, E element) 
			throws IllegalArgumentException {
		    DNode<E> v = checkPosition(p);
		    numElts++;
		    DNode<E> newNode = new DNode<E>(v.getPrev(), v, element);
		    v.getPrev().setNext(newNode);
		    v.setPrev(newNode);
		  }
		  private DNode<E> checkPosition(Position<E> p) {
		// TODO Auto-generated method stub
		return null;
	}
		  public Position<E> addAfter(Position<E> p, E element) 
		      throws InvalidPositionException {
		    DNode<E> v = checkPosition(p);
		    numElts++;
		    DNode<E> newNode = new DNode<E>(v, v.getNext(), element);
		    v.getNext().setPrev(newNode);
		    v.setNext(newNode);
		  }
		  public Position<E> addFirst(E element) {
		    numElts++;
		    DNode<E> newNode = new DNode<E>(header, header.getNext(), element);
		    header.getNext().setPrev(newNode);
		    header.setNext(newNode);
		  }
		  public Position<E> addLast(E element) {
		    numElts++;
		    DNode<E> oldLast = trailer.getPrev();
		    DNode<E> newNode = new DNode<E>(oldLast, trailer, element);
		    oldLast.setNext(newNode);
		    trailer.setPrev(newNode);
		  }
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public Position<E> first() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Position<E> last() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
	
		public Position<E> before(Position<E> p) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Position<E> after(Position<E> p) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Position<E> search(E value) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Position<E> addBefore(Position<E> p, PositionalList<E> sublist) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Position<E> addAfter(Position<E> p, PositionalList<E> sublist) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Position<E> addFirst(Position<E> p, PositionalList<E> sublist) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Position<E> addLast(Position<E> p, PositionalList<E> sublist) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public E set(Position<E> p, E e) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public E remove(Position<E> p) throws IllegalArgumentException {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public int distance(Position<E> a, Position<E> b) {
			// TODO Auto-generated method stub
			return 0;
		}

}

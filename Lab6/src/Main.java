
public class Main {

	 public static void main(String[] args) {
	        PositionalList<String> LinkList=new LinkedPositionalList<>();
	        Position<String> p0,p1,p2,p3,p4;
	        p0=LinkList.addFirst("g");
	        p1=LinkList.addAfter(p0, "f");
	        p2=LinkList.addAfter(p1, "b");
	        p2=LinkList.addAfter(p2, "c");
	        p2=LinkList.addAfter(p2, "d");
	        p3=p2;
	        LinkList.addAfter(p3, "e");
	        
	        System.out.println("----punteros----");
	        System.out.println(p1.getElement());
	        System.out.println(p2.getElement());
	        System.out.println(p3.getElement());
	    }
	
}

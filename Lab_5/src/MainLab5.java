
public class MainLab5 {
	public static void main(String[] args) {
		String a = "Che";
		System.out.println("Hola mundo" + a + " !");
		Node a1 = new Node();
		a1.setPropiedad("GUA");
	}
	
	private static class Node{
		private String propiedad;
		private Node next;
		public Node(String e, Node n) {
			this.propiedad = e;
			this.next = n;
		}
		
		private String getPropiedad(){
			return this.propiedad;
		}
		private void setPropiedad(String propiedad) {
			this.propiedad = propiedad;
		}
		private Node getNext() {
			return this.next;
		}
		private void setNext() {
			this.next = next;
		}
	}
} 

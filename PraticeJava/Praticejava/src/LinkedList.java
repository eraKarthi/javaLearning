class Link{
	public String bookName;
	public int bookSold;
	public Link next;
		
	Link(String bookName, int bookSold){
		this.bookName = bookName;
		this.bookSold = bookSold;
	}
	public void display(){
		System.out.println(bookName + ":" + bookSold);
	}
	@Override
	public String toString() {
		return bookName;
	}
}

public class LinkedList {
	Link firstLink; 
	LinkedList(){
		firstLink = null;
		}
	public boolean isEmpty(){
		return (firstLink == null);
	}
	public void insertFirstLink(String bookName, int bookSold){
		Link newLink = new Link(bookName, bookSold);
		newLink.next = firstLink;
		firstLink = newLink;
	}
}



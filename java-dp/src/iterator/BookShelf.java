package iterator;

public class BookShelf implements BookShelfService{
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int size) {
		this.books = new Book[size];
	}
	/**
	 * 추가(CREATE)
	 */
	public void add(Book book){
		this.books[last] = book;
		last++;
	}
	/**
	 * 조회(READ)
	 */
	public Book getBookAt(int index) {
		return books[index];
	}
	public int getCount(){  // 배열의 사이즈가 아닌 실제 요소들의 갯수
		return last;
	}
	/**
	 * 수정(Update)
	 */
	/**
	 * 삭제(Delete)
	 */
	@Override
	public MyIterator iterator() {
		return new BookShelfIterator(this); // 본 클래스 를 검색하는 객체
	}
}

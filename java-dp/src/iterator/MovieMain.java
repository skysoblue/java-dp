package iterator;

public class MovieMain {
	public static void main(String[] args) {
		Multiplex multiplex = new Multiplex(10);
		multiplex.add(new Movie("아이언맨3"));
		multiplex.add(new Movie("메이즈러너2"));
		multiplex.add(new Movie("사도"));
		multiplex.add(new Movie("인턴"));
		MyIterator it = multiplex.iterator();
		while (it.hasNext()) {
			Movie movie = (Movie) it.next();
			if (movie.getName().equals("인턴")) {
				System.out.print(movie.getName());
			}
		}
	}
}

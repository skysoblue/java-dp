package iterator;

public class Multiplex implements MultiplexService{
	private Movie[] movies;
	private int last; // 실제로 운영되는 상영관
	
	public Multiplex(int foo) {
		this.movies = new Movie[foo];
	}
	public void add(Movie movie) {
		this.movies[last] = movie;
		last++;
	}
	public int getCount(){
		return last;
	}
	
	public Movie getMovie(int index){
		return movies[index];
	}
	
	@Override
	public MyIterator iterator() {
		return new MultiplexIterator(this);
	}
	
}

package iterator;

public class MultiplexIterator implements MyIterator{

	private Multiplex multiplex;
	private int index;
	
	public MultiplexIterator(Multiplex multiplex) {
		this.multiplex = multiplex;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if (index < multiplex.getCount()) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public Object next() {
		
		return multiplex.getMovie(index++);
		
	}

}

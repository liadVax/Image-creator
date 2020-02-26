package images;

public class Filter extends ImageDecorator {
	private RGB filter;
	
	public Filter(Image base, RGB filter) {
		super(base,0);// Constructor gets the base image and a flag
		this.filter=filter;
	}

	@Override
	public RGB get(int x, int y) {
		return super.get(x, y).filter(filter); //gets the rgb from the father class and use filter on that
	}
}

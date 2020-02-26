package images;

public class Invert extends ImageDecorator{ //same as Filter but uses invert() in get()
	
	public Invert(Image base) { super(base,0);}
	
	@Override
	public RGB get(int x, int y) {
		return super.get(x, y).invert();
	}
	

}

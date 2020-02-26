package images;

public class Transpose extends ImageDecorator{
	
	public Transpose(Image base) { //flag get 1 because the use of Transpose 
		super(base, 1);
	}
	
	@Override
	public RGB get(int x, int y) {
		return super.get(y, x); //switching the x and y
	}

}

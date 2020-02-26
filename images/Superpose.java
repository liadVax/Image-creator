package images;


public class Superpose extends BinaryImageDecorator {
	
	public Superpose(Image base1,Image base2) {
		super(base1,base2);
	}

	@Override
	public RGB get(int x, int y) {
		if((x<=getImage1().getWidth()&&y<=getImage1().getHeight())&&(x<=getImage2().getWidth()&&y<=getImage2().getHeight()))
			return RGB.superpose(getImage1().get(x, y),getImage2().get(x, y));
		else
			return super.get(x, y);
	}
	
}

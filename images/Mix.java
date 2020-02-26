package images;

public class Mix extends BinaryImageDecorator {
	private double alpha;
	
	public Mix(Image base1,Image base2,double alpha) {
		super(base1, base2);
		this.alpha=alpha;
	}

	@Override
	public RGB get(int x, int y) {
		if((x<=getImage1().getWidth()&&y<=getImage1().getHeight())&&(x<=getImage2().getWidth()&&y<=getImage2().getHeight()))
			return RGB.mix(getImage1().get(x, y),getImage2().get(x, y),alpha);
		else
			return super.get(x, y);
	}
}


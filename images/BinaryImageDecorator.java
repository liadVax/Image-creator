package images;

public abstract class BinaryImageDecorator implements Image {
	private Image im1,im2;
	
	public BinaryImageDecorator(Image base1,Image base2) {
		im1=base1;
		im2=base2;
	}
	
	protected Image getImage1() {return im1;}
	protected Image getImage2() {return im2;}
	
	@Override
	public int getHeight() {return Math.max(im1.getHeight(), im2.getHeight());}
	
	@Override
	public int getWidth() {return Math.max(im1.getWidth(), im2.getWidth());}
	
	@Override
	public RGB get(int x, int y) {
		if((x<=im1.getWidth())&&(y<=im1.getHeight()))
			return im1.get(x, y);
		if(x<=im2.getWidth()&&y<=im2.getHeight())
			return im2.get(x, y);
		return RGB.BLACK;
	}

	
}

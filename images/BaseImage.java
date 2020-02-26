package images;

public abstract class BaseImage implements Image  { //every base image have the size of the image width,height 
	private int width,height;						//and two RGB colors
	private RGB first,second;
	
	public BaseImage(int width,int height,RGB first,RGB second) {
		this.width=width;
		this.height=height;
		this.first=first;
		this.second=second;
	}
	
	protected RGB getFirstColor() {return first;}; //returning the RGB color
	protected RGB getSecondColor() {return second;};
	
	@Override
	public int getWidth() {return width;};
	
	@Override
	public int getHeight() {return height;};
	
	@Override
	public abstract RGB get(int x, int y);
	
}

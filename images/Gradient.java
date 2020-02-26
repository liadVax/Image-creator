package images;

public class Gradient extends BaseImage{
	
	public Gradient(int width, int height, RGB start, RGB end) {
		super(width,height,start,end);
	}
	
	@Override
	public RGB get(int x, int y) { //using the RGB mix method for returning a new RGB color in every point 
		return RGB.mix(getSecondColor(),getFirstColor(),(double)x/getWidth());
	}

}

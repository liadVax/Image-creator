package images;

public class TwoColorImage extends BaseImage{
	private TwoDFunc func;
	
	public TwoColorImage(int width,int height,RGB zero,RGB one,TwoDFunc func) {
		super(width, height, zero, one);
		this.func=func;
	}

	@Override
	public RGB get(int x, int y) {
		double alpha=func.f((double)x/getWidth(), (double)y/getHeight());
		if(alpha<0)
			return getFirstColor();
		if(alpha>1)
			return getSecondColor();
		return RGB.mix(getSecondColor(),getFirstColor(), alpha);
	}

	
	


}

package images;

public abstract class ImageDecorator implements Image { 
	private Image i; //base image
	private int transFlag; //flag that we can use to indicate when Transpose is in used
	
	public ImageDecorator(Image i,int flag) {
		this.i=i;
		transFlag=flag;
	}


	@Override
	public int getWidth() { //if transflag==1 return the height 
		if(transFlag==0)
			return i.getWidth();
		else
			return i.getHeight();
	}

	@Override
	public int getHeight() { //if transflag==1 return the width 
		if(transFlag==0)
			return i.getHeight();
		else
			return i.getWidth();
		}
	
	
	public RGB get(int x, int y) {
		return i.get(x, y); //returns the RGB in the image at x,y
	}

}

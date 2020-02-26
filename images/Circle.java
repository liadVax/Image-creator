package images;

public class Circle extends BaseImage{
	private int centerX,centerY,radius;
	
	public Circle(int width,int hight,int centerX,int centerY,int radius,RGB center,RGB outside) {
		super(width,hight,center,outside);
		this.centerX=centerX;
		this.centerY=centerY;
		this.radius=radius;
		}
	
	public Circle(int size,int radius,RGB center,RGB outside) {
		super(size, size,center,outside);
		this.radius=radius;
		this.centerX=(int)size/2; //the center point of a circle blocked in a square is the half of his side  
		this.centerY=(int)size/2;
	}
	

	@Override
	public RGB get(int x, int y) {
		double d=Math.sqrt(Math.pow(x-centerX, 2)+Math.pow(y-centerY, 2)); //calculate the distance of the point from the center
		if(d>radius) { //if the point distance passed the length of the radius returns only the outside color 
			return getSecondColor();
		}
		return RGB.mix(getSecondColor(),getFirstColor(),d/radius);	//alpha gets the relation between the distance and the radius 
	}
	
}

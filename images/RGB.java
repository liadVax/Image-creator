package images;

public class RGB {
	double red,green,blue;
	
	public RGB(double red, double green, double blue){ //all the inputs needs to be bigger the zero and smaller to one
		if(red>=0&&red<=1) //if one of the value do not meet the requirement it will be initialize as 0
			this.red=red;
		if(green>=0&&green<=1)
			this.green=green;
		if(blue>=0&&blue<=1)
			this.blue=blue;
		}	
	
	public RGB(double grey) { //like the first constructor but all the values get grey 
		if(grey>=0&&grey<=1) {
			red=grey;
			green=grey;
			blue=grey;
		}	
	}
	
	public double getRed() {return red;}
	public double getGreen() {return green;}
	public double getBlue() {return blue;}
	
//////methods that returns a new RGB relying on the formulas mentioned in the instruction 
	public RGB invert(){
		RGB inv= new RGB(1-this.red,1-this.green,1-this.blue);
		return inv;
	}
	
	public RGB filter(RGB filter) {
		RGB filRgb=new RGB(this.red*filter.red,this.green*filter.green,this.blue*filter.blue);
		return filRgb;
	}
	
	public static RGB superpose(RGB rgb1, RGB rgb2) {
		double red=rgb1.red+rgb2.red;
		if(red>1)
			red=1;
		double green=rgb1.green+rgb2.green;
		if(green>1)
			green=1;
		double blue=rgb1.blue+rgb2.blue;
		if(blue>1)
			blue=1;
		return new RGB(red,green,blue); 
	}	

		public static RGB mix(RGB rgb1, RGB rgb2,double alpha)
		{
			double mixRed=alpha*rgb1.red+(1-alpha)*rgb2.red;
			double mixGreen=alpha*rgb1.green+(1-alpha)*rgb2.green;
			double mixBlue=alpha*rgb1.blue+(1-alpha)*rgb2.blue;
			return new RGB(mixRed, mixGreen, mixBlue);
		}
//////////////////////////////////////////////////////////////////////////////////	
	
		public String toString() {
			return String.format("<%.4f, %.4f, %.4f>",red,green,blue); //returning a string with all the RGB values with four numbers after the point
		}
		
		public static final RGB BLACK = new RGB(0); //static methods with constant values 
		public static final RGB WHITE = new RGB(1);
		public static final RGB RED = new RGB(1,0,0);
		public static final RGB GREEN = new RGB(0,1,0);
		public static final RGB BLUE = new RGB(0,0,1);


		
}
 
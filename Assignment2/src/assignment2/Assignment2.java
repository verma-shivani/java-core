
package assignment2;


class Shape{

	double length;
}

abstract class TwoDShape extends Shape{

	abstract double getArea();
	abstract double getPerimeter();
}
class Rectangle extends TwoDShape{
	double width;

	Rectangle(double length,double width)
	{
		this.length=length;	
		this.width=width;
	}
	double getArea()
	{
		return length*width;
	}
	double getPerimeter()
	{
		return 2*(length+width);
	}
}
class Circle extends TwoDShape{
	Circle(double radius){
		this.length=radius;
	}
	double getArea()
	{
		return Math.PI*length*length;
	}
	double getPerimeter()
	{
		return 2*Math.PI*length;
	}
}
class Square extends Rectangle{
	Square(double dimension)
	{
		super(dimension,dimension);
	}
}



abstract class ThreeDShape extends Shape{

	abstract double getTotSurfaceArea();
	abstract double getVolume();
}
 class Cuboid extends ThreeDShape
{
    double width;
    double height;
    Cuboid(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;

    }

    double getTotSurfaceArea()
    {
        return 2*(length*width+width*height+height*length);
    }
    double getVolume()
    {
        return length*width*height;
    }
}

 class Sphere extends ThreeDShape
{
    Sphere(double radius)
    {
        this.length=radius;
    }

    double getTotSurfaceArea()
    {
        return 4*Math.PI*Math.pow(length, 2);
    }
    double getVolume()
    {
        return 4/3*Math.PI*Math.pow(length, 2);
    }
}
 class Cube extends Cuboid
{
    Cube(double length,double width,double height)
    {
        super(length,width,height);
    }
}






class Assignment2{
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter choice 1. TwoD  2.ThreeD");
		int choice=sc.nextInt();

		if(choice==1)
		{
		TwoDShape td=null;
		System.out.println("Enter choice 1.Rectangle 2.Circle 3.Square");
		choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter length");
                double len=sc.nextDouble();
                System.out.println("Enter width");
                double wid=sc.nextDouble();
                td=new Rectangle(len,wid);
            }
            else if(choice ==2)
            {
                System.out.println("Enter radius");
                double radius=sc.nextDouble();
                td=new Circle(radius);
            }
            else{
                System.out.println("Enter dimension");
                double dimension=sc.nextDouble();
                td=new Square(dimension);
            }

		System.out.println("Area : "+td.getArea());
		System.out.println("Perimeter : "+td.getPerimeter());
        }
        
        if(choice==2)
        {
            ThreeDShape threed=null;
            System.out.println("Enter choice 1.cuboid 2.sphere 3.cube");
            choice=sc.nextInt();
                if(choice==1)
                {
                    System.out.println("Enter length");
                    double l=sc.nextDouble();
                    System.out.println("Enter width");
                    double b=sc.nextDouble();
                    System.out.println("Enter height");
                    double h=sc.nextDouble();
                    threed=new Cuboid(l,b,h);
                }
                if(choice==2)
                {
                    System.out.println("Enter length");
                    double l=sc.nextDouble();
                    threed=new Sphere(l);
                }
                if(choice==3)
                {
                    System.out.println("Enter dimension");
                    double dimension=sc.nextDouble();
                    threed=new Cube(dimension,dimension,dimension);
                }

                System.out.println("Area : "+threed.getTotSurfaceArea());
		        System.out.println("Perimeter : "+threed.getVolume());

        }
	}
}

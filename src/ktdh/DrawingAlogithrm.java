/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktdh;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
class Coordinate
{
 protected double x;
    protected double y;
    protected double z;
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
   
}
public class DrawingAlogithrm {
    int count=0;  
      int check =0;
int i=1;
     public void TimerWait5()
  {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
  }
     

public void Point(Coordinate p,int x, int y, int z){
	p.x = x;
	p.y = y;
	p.z = z;
}
void TransProjection(Coordinate p){
	p.x = p.x - p.y * (Math.sqrt(2)/2) ;
	p.y = -1 *(p.z - p.y * (Math.sqrt(2)/2) ) ;
	
}
void RectangularPrism3D(int x,int y,int z, int a,int b,int h,int color,Graphics g){
	
        System.out.println(" ");
	y = y;
	b/=2;
	a*=5;
	b*=5;
	h*=5;

	Coordinate[] coordinates=new Coordinate [24];
	//Vertex vertexer[12];
	//ve he truc toa do Oxyz
	// Oz
	//1 x,y,z
	//2 x+a,y+,z
	//3 x+a,y+b,z
	//4 x,y+b,z
	//5 x,y,z + h
	//6 x+a,y+,z + h
	//7 x+a,y+b,z +h 
	//8 x,y+b,z +h
	
	Coordinate p1,p2,p3,p4,p5,p6,p7,p8;
        p1=new Coordinate();
	Point(p1,x,y,z);
        p2=new Coordinate();
	Point(p2,x+a,y,z);
        p3=new Coordinate();
	Point(p3,x+a,y+b,z);
        p4=new Coordinate();
	Point(p4,x,y+b,z);
        p5=new Coordinate();
	Point(p5,x,y,z+h);
        p6=new Coordinate();
	Point(p6,x+a,y,z+h);
        p7=new Coordinate();
	Point(p7,x+a,y+b,z+h);
        p8=new Coordinate();
	Point(p8,x,y+b,z+h);
	
	// phep chieu 

	TransProjection(p1);
	TransProjection(p2);
	TransProjection(p3);
	TransProjection(p4);
	TransProjection(p5);
	TransProjection(p6);
	TransProjection(p7);
	TransProjection(p8);
	
	// mat tren
	drawDash((int)p1.x,(int)p1.y,(int)p2.x,(int)p2.y,15,color,g);
	drawDash((int)p1.x,(int)p1.y,(int)p4.x,(int)p4.y,15,color,g);
	drawLineBre((int)p2.x,(int)p2.y,(int)p3.x,(int)p3.y,color,g);
	drawLineBre((int)p3.x,(int)p3.y,(int)p4.x,(int)p4.y,color,g);
	
	//mat day
	drawLineBre((int)p5.x,(int)p5.y,(int)p6.x,(int)p6.y,color,g);
	drawLineBre((int)p5.x,(int)p5.y,(int)p8.x,(int)p8.y,color,g);
	drawLineBre((int)p6.x,(int)p6.y,(int)p7.x,(int)p7.y,color,g);
	drawLineBre((int)p7.x,(int)p7.y,(int)p8.x,(int)p8.y,color,g);
	
	// chieu cao
	drawDash((int)p5.x,(int)p5.y,(int)p1.x,(int)p1.y,15,color,g);
	drawLineBre((int)p2.x,(int)p2.y,(int)p6.x,(int)p6.y,color,g);
	drawLineBre((int)p3.x,(int)p3.y,(int)p7.x,(int)p7.y,color,g);
	drawLineBre((int)p4.x,(int)p4.y,(int)p8.x,(int)p8.y,color,g);	
}
public int convertPersonXAxis(int x)
{
	return (x-450)/5;
}  
public int convertPersonYAxis(int y)
{
	return ((y-300)/5*(-1));
}  
public double convertPersonXAxisWithDouble(double x)
{
	return (x-450)/5;
}  
public double convertPersonYAxisWithDouble(double y)
{
	return ((y-300)/5*(-1));
}  
public double convertPersonWidth(double w)
{
	return (w/5);
}  
   
public int convertAxis(int x)
{
	return (x*5)+450;
}
public int convertAyis(int y)
{
	return 300-(y*5);
}
  // TÔ MÀU NÈ
    public void ChooseColor(int color,Graphics2D g2)
    {
        if(color==0)
    {
        g2.setPaint(new Color(71, 71, 107));
    }
    else if (color==1)
    {
        g2.setPaint(Color.blue);
    }
    else if (color==2)
    {
        g2.setPaint(Color.green);
    }
        else if (color==3)
    {
        g2.setPaint(Color.cyan);
    }
        else if (color==4)
    {
        g2.setPaint(Color.red);
    }
        else if (color==5)
    {
        g2.setPaint(Color.MAGENTA);
    }
        else if (color==6)
    {
        g2.setPaint(Color.lightGray);
    }
        else if (color==7)
    {
        g2.setPaint(Color.darkGray);
    }
           else if (color==8)
    {
        g2.setPaint(Color.yellow);
    }
           else if (color==9)
    {
        g2.setPaint(Color.white);
    }
           else if (color==10)
    {
        g2.setPaint(Color.orange);
    }
         else if (color==11)
    {
    g2.setPaint(Color.pink);
    }
     else if (color==12)
    {
        g2.setPaint(new Color(102,102,102));
    }
     else if (color==13)
    {
        g2.setPaint(new Color(204, 68, 0));
    }
     else if (color==14)
    {
        g2.setPaint(new Color(102, 163, 255));
    }
    else if (color==15)
    {
        g2.setPaint(new Color(179, 255, 255));
    }
     else if (color==16)
    {
        g2.setPaint(new Color(0, 107, 179));
    }    
     else if (color==17)
    {
        g2.setPaint(new Color(224, 224, 209) );
    }  
     else if (color==18)
    {
        g2.setPaint(new Color(203, 203, 179) );
    }  
     else if (color==19)
    {
        g2.setPaint(new Color(183, 183, 149) );
    }  
       else if (color==20)
    {
        g2.setPaint(new Color(255, 255, 128) );
    }  
          else if (color==22)
    {
        g2.setPaint(new Color(230, 230, 0) );
    }  
              else if (color==23)
    {
        g2.setPaint(new Color(0, 0, 179));
    }  
                   else if (color==24)
    {
        g2.setPaint(new Color (122, 122, 82));
    }  
                           else if (color==25)
    {
        g2.setPaint(new Color (179, 224, 255));
    }  
                                  else if (color==26)
    {
        g2.setPaint(new Color (0, 128, 0));
    }      
        
      else if (color==30)
    {
        g2.setPaint(new Color (255, 255, 204));
    }      
         else if (color==31)
    {
        g2.setPaint(new Color (255, 255, 153));
    }    
              else if (color==32)
    {
        g2.setPaint(new Color (255, 255, 179));
    }  
                   else if (color==33)
    {
        g2.setPaint(new Color (255, 204, 153));
    }  
                      else if (color==34)
    {
        g2.setPaint(new Color (255, 179, 102));
    }  
                    
                 
    }  
   
           
            
      
    public void fillColorRect(int x,int y,int width,int height,int color,Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        ChooseColor(color, g2);
        g2.fillRect(x, y, width, height);
        
    }
        public void fillColorTriangle(int x[],int y[],int numberPoint,int color,Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        ChooseColor(color, g2);
        g2.fillPolygon(x, y, numberPoint);
        
    }
        public void fillColorEclips(int x,int y,double width,double height,int color,Graphics g)
    {
        Graphics2D g2= (Graphics2D)g;
        ChooseColor(color, g2);
        g2.fillOval(x, y, (int)width,(int) height);        
    }
        
     // VẼ ECLIPSE NÈ
      void plot(int xc,int yc, int x, int y, int color,Graphics g){
      Graphics2D g2=(Graphics2D)g;
      ChooseColor(color, g2);
      g.drawLine(xc + x , yc +y,xc + x , yc +y);
	//putpixel (xc + x , yc +y) ;
      g.drawLine(xc - x , yc + y,xc - x , yc + y);
	//putpixel (xc - x , yc + y) ;
	count++;
            
            g2.drawLine(xc + x , yc - y,xc + x , yc - y);
			//putpixel (xc + x , yc - y) ;
                        g2.drawLine(xc - x , yc- y,xc - x , yc- y);
			//putpixel (xc - x , yc- y) ;

	
}
      //3D AXIS
      
      public void DrawAxis3D(int x1,int y1,Graphics g)
        {
            //TÂM 450,300
                int x=x1/2-5;
                int y=y1/2;
                //outext  
//          	outtextxy(x+10,y-255,"Oz");
//          	outtextxy(x+350,y+5,"Ox");
//          	outtextxy(x-223,y+225,"Oy");
                 //Oz
                drawLineBre(448,0,448,300,4,g);
                drawLineBre(449,0,449,300,4,g);
        	drawLineBre(450,0,450,300,4,g);
                drawLineBre(451,0,451,300,4,g);
                drawLineBre(452,0,452,300,4,g);
//        	//Ox
                drawLineBre(448,298,0,748,4,g);
                drawLineBre(449,299,0,749,4,g);
        	drawLineBre(450,300,0,750,4,g);
                drawLineBre(451,301,0,751,4,g);
                drawLineBre(452,302,0,752,4,g);
//        	//Oy
                drawLineBre(448,298,900,298,4,g);
                drawLineBre(449,299,900,299,4,g);
        	drawLineBre(450,300,900,300,4,g);
                drawLineBre(451,301,900,301,4,g);
                drawLineBre(452,302,900,302,4,g);
        }
       public void DrawAxis2D(int x1,int y1,Graphics g)
        {
            //TÂM 450,300
                int x=x1/2-5;
                int y=y1/2;
      
//        	//Ox
                drawLineBre(445,0,445,600,4,g);
                drawLineBre(446,0,446,600,4,g);
                drawLineBre(447,0,447,600,4,g);
                drawLineBre(448,0,448,600,4,g);
                drawLineBre(449,0,449,600,4,g);
        	drawLineBre(450,0,450,600,4,g);
                drawLineBre(451,0,451,600,4,g);
                drawLineBre(452,0,452,600,4,g);
                drawLineBre(453,0,453,600,4,g);
                drawLineBre(454,0,454,600,4,g);
                drawLineBre(455,0,455,600,4,g);
//        	//Oy
                
                drawLineBre(0,295,898,295,4,g);
                drawLineBre(0,296,898,296,4,g);
                drawLineBre(0,297,898,297,4,g);
                drawLineBre(0,298,898,298,4,g);
                drawLineBre(0,299,899,299,4,g);
        	drawLineBre(0,300,900,300,4,g);
                drawLineBre(0,301,901,301,4,g);
                drawLineBre(0,302,902,302,4,g);
                drawLineBre(0,303,902,303,4,g);
                drawLineBre(0,304,902,304,4,g);
                drawLineBre(0,305,902,305,4,g);
        }
      public void RectangularPrism(int xAxis,int yAxis,int zAxis, int a,int b,int h,int color,Graphics g){
          
         xAxis=xAxis-(yAxis*((int)Math.sqrt(2)/2));
         yAxis=zAxis-(yAxis*((int)Math.sqrt(2)/2));
         
         
        int x=450+(xAxis*5);
	int y=300-(yAxis*5);
	b/=2;
	a*=5;
	b*=5;
	h*=5;
	int a2=a*a;
	int b2=b*b;
	int h2=h*h;
	int d=(int)Math.sqrt(a2+b2+h2);
	
	// ĐỨNG SAU PHẢI
        
        drawDash(x+2,y-1,x+2,y-h,5,color,g);
        drawDash(x+1,y-1,x+1,y-h,5,color,g);
	drawDash(x,y-1,x,y-h,5,color,g);
        drawDash(x-1,y-1,x-1,y-h,5,color,g);
        drawDash(x-2,y-1,x-2,y-h,5,color,g);
        
	

        //NGANG SAU DƯỚI
         drawDash(x,y+2,x+a,y+2,5,color,g);
         drawDash(x,y+1,x+a,y+1,5,color,g);
         drawDash(x,y,x+a,y,5,color,g);
         drawDash(x,y-1,x+a,y-1,5,color,g);
         drawDash(x,y-2,x+a,y-2,5,color,g);

         //CHÉO DƯỚI TRÁI
         drawDash(x+2,y,x-b+2,y+b,5,color,g);
         drawDash(x+1,y,x-b+1,y+b,5,color,g);
         drawDash(x,y,x-b,y+b,5,color,g);
         drawDash(x-1,y,x-b-1,y+b,5,color,g);    
         drawDash(x-2,y,x-b-2,y+b,5,color,g);
	
        //ĐỨNG TRƯỚC TRÁI
         drawLineBre(x-b+2,y+b,x-b+2,y+b-h,color,g);
         drawLineBre(x-b+1,y+b,x-b+1,y+b-h,color,g);
         drawLineBre(x-b,y+b,x-b,y+b-h,color,g);
         drawLineBre(x-b-1,y+b,x-b-1,y+b-h,color,g);
         drawLineBre(x-b-2,y+b,x-b-2,y+b-h,color,g);
        
        
        // ĐỨNG TRƯỚC PHẢI
        drawLineBre(x-b+a+2,y+b,x-b+a+2,y+b-h,color,g);
        drawLineBre(x-b+a+1,y+b,x-b+a+1,y+b-h,color,g);
        drawLineBre(x-b+a,y+b,x-b+a,y+b-h,color,g);
        drawLineBre(x-b+a-1,y+b,x-b+a-1,y+b-h,color,g);
        drawLineBre(x-b+a-2,y+b,x-b+a-2,y+b-h,color,g);
        
        
        
        
        
         drawLineBre(x+a+1,y,x+a+1,y-h,color,g);
         drawLineBre(x+a+2,y,x+a+2,y-h,color,g);
         drawLineBre(x+a,y,x+a,y-h,color,g);
         drawLineBre(x+a-1,y,x+a-1,y-h,color,g);
         drawLineBre(x+a-2,y,x+a-2,y-h,color,g);
        
        
        
	// NGANG DƯỚI TRƯỚC
        drawLineBre(x-b,y+b+2,x-b+a,y+b+2,color,g);
        drawLineBre(x-b,y+b+1,x-b+a,y+b+1,color,g);
        drawLineBre(x-b,y+b,x-b+a,y+b,color,g);
        drawLineBre(x-b,y+b-1,x-b+a,y+b-1,color,g);
        drawLineBre(x-b,y+b-2,x-b+a,y+b-2,color,g);
        
        
        //ĐƯỜNG CHÉO DƯỚI PHẢI
        drawLineBre(x-b+a+2,y+b,x+a+2,y,color,g);
        drawLineBre(x-b+a+1,y+b,x+a+1,y,color,g);
        drawLineBre(x-b+a,y+b,x+a,y,color,g);
        drawLineBre(x-b+a-1,y+b,x+a-1,y,color,g);
        drawLineBre(x-b+a-2,y+b,x+a-2,y,color,g);
          
        //ĐƯỜNG NGANG TRÊN TRƯỚC
        drawLineBre(x-b,y+b-h+2, x-b+a,y+b-h+2,color,g);
        drawLineBre(x-b,y+b-h+1, x-b+a,y+b-h+1,color,g);
        drawLineBre(x-b,y+b-h, x-b+a,y+b-h,color,g);
        drawLineBre(x-b,y+b-h-1, x-b+a,y+b-h-1,color,g);  
        drawLineBre(x-b,y+b-h-2, x-b+a,y+b-h-2,color,g);
        
        
        // ĐƯỜNG CHÉO TRÊN PHẢI 
        drawLineBre(x-b+2,y+b-h,x+2,y-h,color,g);
        drawLineBre(x-b+1,y+b-h,x+1,y-h,color,g);
        drawLineBre(x-b,y+b-h,x,y-h,color,g);
        drawLineBre(x-b-1,y+b-h,x-1,y-h,color,g);
        drawLineBre(x-b-2,y+b-h,x-2,y-h,color,g);
        
        
        //NGANG TRÊN SAU
        drawLineBre(x,y-h+2,x+a,y-h+2,color,g);
        drawLineBre(x,y-h+1,x+a,y-h+1,color,g);
        drawLineBre(x,y-h,x+a,y-h,color,g);
        drawLineBre(x,y-h-1,x+a,y-h-1,color,g);
        drawLineBre(x,y-h-2,x+a,y-h-2,color,g);
        
        
        //CHÉO TRÊN TRÁI
        drawLineBre(x+a+2,y-h,x-b+a+2,y+b-h,color,g);
        drawLineBre(x+a+1,y-h,x-b+a+1,y+b-h,color,g);
        drawLineBre(x+a,y-h,x-b+a,y+b-h,color,g);
        drawLineBre(x+a-1,y-h,x-b+a-1,y+b-h,color,g);
        drawLineBre(x+a-2,y-h,x-b+a-2,y+b-h,color,g);

}

void PlotShpere(int xc, int yc, int x, int y, int color,Graphics g)
{
    Graphics2D g2=(Graphics2D)g;
    ChooseColor(color, g2);
    g2.drawLine(xc+x, yc+y, xc+x, yc+y);
    g2.drawLine(xc-x, yc+y, xc-x, yc+y);
	if(i%5==0) {
		check++;
	}
	if(check%5==0) {
            g2.drawLine(xc+x, yc-y, xc+x, yc-y);
            g2.drawLine(xc-x, yc-y, xc-x, yc-y);
	}
	i++;
	
}
void Elip(int xc,int yc, int a, int b, int color,Graphics g)
{
    int x, y, fx, fy, a2, b2;
    float p;
    x = 0;
    y = b;
    a2 = a*a;
    b2 = b*b;
    fx = 0;
    fy = 2 * a2 * y;
    PlotShpere(xc, yc, x, y, color,g);
    p =Math.round(b2 -(a2*b) + (0.25*a2));//p=b2 - a2*b +a2/4
    while(fx<fy)
    {
        x++;
        fx += 2*b2;
        if(p<0)
        {
            p += b2*(2*x + 3);//p=p + b2*(2x +3)
        }
        else
        {
            y--;
            p += b2*(2*x +3) + a2*(2- 2*y);//p=p +b2(2x +3) +a2(2-2y)
            fy -= 2*a2;
        }
        PlotShpere(xc, yc, x, y, color,g);
    }
    p = Math.round(b2*(x +0.5)*(x +0.5) + a2*(y-1)*(y-1) - a2*b2);
    //
    while(y>0)
    {
        y--;
        fy -= 2*a2;
        if(p >=0)
        {
            p += a2*(3-2*y); //p=p +a2(3-2y)
        }
        else
        {
            x++;
            fx += 2*b2;
            p += b2*(2*x +2) +a2*(3- 2*y);//p=p+ b2(2x +2) + a2(3-2y)
        }
        PlotShpere(xc, yc, x, y, color,g);
    }
}
void HinhCau(int xAxis, int yAxis, int zAxis,double R,int color,Graphics g){
        Graphics2D g2=(Graphics2D)g;
	xAxis=xAxis-(yAxis*((int)Math.sqrt(2)/2));
        yAxis=zAxis-(yAxis*((int)Math.sqrt(2)/2));
        int x=450+(xAxis*5);
	int y=300-(yAxis*5);
	R*=5;
	//DrawCircleOther(x,y,R,color,g);
         midpointEclipse(x, y, (int)R+4, (int)R+4, color, g);
         midpointEclipse(x, y, (int)R+3, (int)R+3, color, g);
         midpointEclipse(x, y, (int)R+2, (int)R+2, color, g);
        midpointEclipse(x, y, (int)R+1, (int)R+1, color, g);
         midpointEclipse(x, y, (int)R, (int)R, color, g);


          Elip(x,y, (int)R+2,(int) R/2+2, color, g);
         Elip(x,y, (int)R+1,(int) R/2+1, color, g);
        Elip(x,y, (int)R,(int) R/2, color, g);
        
	
}

  public void midpointEclipse(int xc,int yc, int a, int b,int color,Graphics g){
  int x, y, fx, fy, a2, b2, p;
    x = 0;
    y = b;
    a2 = a*a;
    b2 = b*b;
    fx = 0;
    fy = 2 * a2 * y;
    plot(xc, yc, x, y, color,g);
    p = (int)Math.round(b2 -(a2*b) + (0.25*a2));//p=b2 - a2*b +a2/4
    // phan 1
    while(fx<fy)
    {
        x++;
        fx += 2*b2;
        if(p<0)
        {
            p += b2*(2*x + 3);//p=p + b2*(2x +3)
        }
        else
        {
            y--;
            p += b2*(2*x +3) + a2*(2- 2*y);//p=p +b2(2x +3) +a2(2-2y)
            fy -= 2*a2;
        }
        plot(xc, yc, x, y,color, g);
    }
    p =(int) Math.round(b2*(x +0.5)*(x +0.5) + a2*(y-1)*(y-1) - a2*b2);
    // phan 2
    while(y>0)
    {
        y--;
        fy -= 2*a2;
      
        if(p >=0)
        {
            p += a2*(3-2*y); //p=p +a2(3-2y)
        }
        else
        {
            x++;
            fx += 2*b2;
            p += b2*(2*x +2) +a2*(3- 2*y);//p=p+ b2(2x +2) + a2(3-2y)
        }
        plot(xc, yc, x, y,color, g);
    }
	
} 
  
  
  //VẼ NÉT ĐƯỜNG THẲNG NÈ
  void drawDash(int x1,int y1,int x2,int y2,int density,int color,Graphics g)
{
    Graphics2D g2=(Graphics2D)g;
    ChooseColor(color, g2);
    int count=0;
    int excute=0;
	int dy = y2 - y1;
    int dx = x2 - x1;
    float m=(float)dy/(float)dx; 
    
	if (m<=0 && m>=-1)
	{		
	if (x1>x2)
	{
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
	}
     dy = y2 - y1;
     dx = x2 - x1;
	  int p=2*dy-dx;
	  int y = y1;
	  for (int x=x1;x<=x2;x++)
		{
			if(p>=0)	
			{
				p=p+2*dy;
			}
			else
			{
				p=p+2*dy+2*dx;
				y--;
			}
			
			
			if(excute%2==0)
			{
			//putpixel(x,y,color);
                            g2.drawLine(x, y, x, y);
			count++;
		    }
		    else
		    {
		    	count++;
                     }
		    if(count==density)
		    {
		    	excute++;
		    	count=0;
                     }
			
			
		}	

	}
		else if (m<-1)
	{
		
		if (y1>y2)
		{
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
		}
                dy = y2 - y1;
                dx = x2 - x1;
		int const1=2*dx;
		int const2=2*dx+2*dy;
		int x=x1;
		int p=2*dx+dy;
		for (int y=y1;y<=y2;y++)
		{
			if (p>=0)
			{
				p=p+const1;
			}
			else
			{
				p=p+const2;
				x--;
			}
			
			
			if(excute%2==0)
			{
			//putpixel(x,y,color);
                            g2.drawLine(x, y, x, y);
			count++;
		    }
		    else
		    {
		    	count++;
			}
		    if(count==density)
		    {
		    	excute++;
		    	count=0;
			}
			
			
		}
		
	}
	else if (m>1)
	{
		
		if (y1>y2)
		{
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
		}
	 dy = y2 - y1;
         dx = x2 - x1;
		int const1=2*dx;
		int const2=2*dx-2*dy;
		int x=x1;
		int p=2*dx-dy;
		for (int y=y1;y<=y2;y++)
		{
			if (p>=0)
			{
				p=p+const2;
				x++;
			}
			else
			{
				p=p+const1;
			
			}
			
			
			if(excute%2==0)
			{
			//putpixel(x,y,color);
                            g2.drawLine(x, y, x, y);
			count++;
		    }
		    else
		    {
		    	count++;
			}
		    if(count==density)
		    {
		    	excute++;
		    	count=0;
			}
			
			
		}
		
	}
	else if (m<=1 && m>0)
	{
	    if (x1>x2)
            {
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
	    }
	  dy = y2 - y1;
          dx = x2 - x1;
		int p=2*dy-dx;
		int y = y1;
		for (int x=x1;x<=x2;x++)
		{
			if (p<0)
			{
				y=y;
				p=p+2*dy;
			}
			else if (p>=0)
			{
				y=y+1;
				p=p+2*dy-2*dx;
			}
			
			
			if(excute%2==0)
			{
			g2.drawLine(x, y, x, y);
			count++;
		    }
		    else
		    {
		    	count++;
			}
		    if(count==density)
		    {
		    	excute++;
		    	count=0;
			}
			
			
		}		
    }
}
  
  void drawLineBre(int x1,int y1,int x2,int y2, int color,Graphics g)
{
    Graphics2D g2=(Graphics2D)g;
    ChooseColor(color, g2);
    int dy = y2 - y1;
    int dx = x2 - x1;
    float m=(float)dy/(float)dx; 
    
	if (m<=0 && m>=-1)
	{		
	if (x1>x2)
	{
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
		
	}
    dy = y2 - y1;
    dx = x2 - x1;
	  int p=2*dy-dx;
	  int y = y1;
	  for (int x=x1;x<=x2;x++)
		{
			if(p>=0)	
			{
				p=p+2*dy;
			}
			else
			{
				p=p+2*dy+2*dx;
				y--;
			}
			g2.drawLine(x,y,x,y);
		}	

	}
		else if (m<-1)
	{
		
		if (y1>y2)
		{
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
		}
	dy = y2 - y1;
       dx = x2 - x1;
		int const1=2*dx;
		int const2=2*dx+2*dy;
		int x=x1;
		int p=2*dx+dy;
		for (int y=y1;y<=y2;y++)
		{
			if (p>=0)
			{
				p=p+const1;
			}
			else
			{
				p=p+const2;
				x--;
			}
			g2.drawLine(x,y,x,y);
		}
		
	}
	else if (m>1)
	{
		
		if (y1>y2)
		{
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
		}
	     dy = y2 - y1;
            dx = x2 - x1;
		int const1=2*dx;
		int const2=2*dx-2*dy;
		int x=x1;
		int p=2*dx-dy;
		for (int y=y1;y<=y2;y++)
		{
			if (p>=0)
			{
				p=p+const2;
				x++;
			}
			else
			{
				p=p+const1;
			
			}
			g2.drawLine(x,y,x,y);
		}
		
	}
	else if (m<=1 && m>0)
	{
		if (x1>x2)
     	{
		int temp=x1;
                x1=x2;
                x2=temp;
                
                temp=y1;
                y1=y2;
		y2=temp;
	    }
	    dy = y2 - y1;
            dx = x2 - x1;
		int p=2*dy-dx;
		int y = y1;
		for (int x=x1;x<=x2;x++)
		{
			if (p<0)
			{
				y=y;
				p=p+2*dy;
			}
			else if (p>=0)
			{
				y=y+1;
				p=p+2*dy-2*dx;
			}
			g2.drawLine(x,y,x,y);

		}		
    }
}
   void drawLineBreWithDouble(double x1,double y1,double x2,double y2, int color,Graphics g)
{
    Graphics2D g2=(Graphics2D)g;
    ChooseColor(color, g2);
    double dy = y2 - y1;
    double dx = x2 - x1;
    float m=(float)dy/(float)dx; 
    
	if (m<=0 && m>=-1)
	{		
	if (x1>x2)
	{
		double temp=x1;
                x1=(int)x2;
                x2=temp;
                
                temp=y1;
                y1=(int)y2;
		y2=temp;
		
	}
    dy = y2 - y1;
    dx = x2 - x1;
	  double p=2*dy-dx;
	  double y = y1;
	  for (double x=x1;x<=x2;x++)
		{
			if(p>=0)	
			{
				p=p+2*dy;
			}
			else
			{
				p=p+2*dy+2*dx;
				y--;
			}
			g2.drawLine((int)x,(int)y,(int)x,(int)y);
		}	

	}
		else if (m<-1)
	{
		
		if (y1>y2)
		{
		double temp=x1;
                x1=(int)x2;
                x2=temp;
                
                temp=y1;
                y1=(int)y2;
		y2=temp;
		}
	dy = y2 - y1;
       dx = x2 - x1;
		double const1=2*dx;
		double const2=2*dx+2*dy;
		double x=x1;
		double p=2*dx+dy;
		for (double y=y1;y<=y2;y++)
		{
			if (p>=0)
			{
				p=p+const1;
			}
			else
			{
				p=p+const2;
				x--;
			}
			g2.drawLine((int)x,(int)y,(int)x,(int)y);
		}
		
	}
	else if (m>1)
	{
		
		if (y1>y2)
		{
		double temp=x1;
                x1=(int)x2;
                x2=temp;
                
                temp=y1;
                y1=(int)y2;
		y2=temp;
		}
	     dy = y2 - y1;
            dx = x2 - x1;
		double const1=2*dx;
		double const2=2*dx-2*dy;
		double x=x1;
		double p=2*dx-dy;
		for (double y=y1;y<=y2;y++)
		{
			if (p>=0)
			{
				p=p+const2;
				x++;
			}
			else
			{
				p=p+const1;
			
			}
			g2.drawLine((int)x,(int)y,(int)x,(int)y);
		}
		
	}
	else if (m<=1 && m>0)
	{
		if (x1>x2)
     	{
		double temp=x1;
                x1=(int)x2;
                x2=temp;
                
                temp=y1;
                y1=(int)y2;
		y2=temp;
	    }
	    dy = y2 - y1;
            dx = x2 - x1;
		double p=2*dy-dx;
		double y = y1;
		for (double x=x1;x<=x2;x++)
		{
			if (p<0)
			{
				y=y;
				p=p+2*dy;
			}
			else if (p>=0)
			{
				y=y+1;
				p=p+2*dy-2*dx;
			}
			g2.drawLine((int)x,(int)y,(int)x,(int)y);

		}		
    }
}
    //VẼ HÌNH CHỮ NHẬT NÈ
      public void drawRetangular(int x1,int y1,int x2,int y2,int color,Graphics g)
{
	drawLineBre(x1,y1,x1,y2,color,g);
	drawLineBre(x1,y1,x2,y1,color,g);
	drawLineBre(x1,y2,x2,y2,color,g);
	drawLineBre(x2,y1,x2,y2,color,g);
}
       // VẼ ĐƯỜNG TRÒN NÈ
      
      void  put8D(int x, double y,int v, int z, int mauve, Graphics g){
	
            Graphics2D g2=(Graphics2D)g;
          ChooseColor(mauve, g2);         
        // putpixel(x+v,y+z,mauve);
         g2.drawLine(x+v,(int)y+z,x+v,(int)y+z);
	 //putpixel(y+v,x+z,mauve);
         g2.drawLine((int)y+v,x+z,(int)y+v,x+z);
	 //putpixel(y+v,-x+z,mauve);
          g2.drawLine((int)y+v,-x+z,(int)y+v,-x+z);
	 //putpixel(x+v,-y+z,mauve);
          g2.drawLine(x+v,(int)-y+z,x+v,(int)-y+z);
	 //putpixel(-x+v,-y+z,mauve);
           g2.drawLine(-x+v,(int)-y+z,-x+v,(int)-y+z);
	// putpixel(-y+v,-x+z,mauve);
          g2.drawLine((int)-y+v,-x+z,(int)-y+v,-x+z);
	 //putpixel(-y+v,x+z,mauve);
          g2.drawLine((int)-y+v,x+z,(int)-y+v,x+z);
	// putpixel(-x+v,y+z,mauve);
         g2.drawLine(-x+v,(int)y+z,-x+v,(int)y+z);
         
	 }
void DrawCircle(int x0, int y0, double r,int color,Graphics g){
	double p =3-2*r;
	int x=0;
	double y=r;
	int d = 0;
	int n = 0;
	while(x<=y)
	{   
		x++;
		if(p<0){
			p=p+4*x+6;
		}
		else{
			y=y-1;
			p=p+4*(x-y)+10;
			}
			if(d%2==0){
				put8D(x,y,x0,-y0,color,g);
				n++;
			}else{
				n++;
			}
			if(n==5){
				n=0;
				d++;
			}
			
 } 
}	
void DrawCircleOther(int x0, int y0, double r,int color,Graphics g){
	double p =3-2*r;
	int x=0;
	double y=r*5;
	int d = 0;
	int n = 0;
	while(x<=y)
	{   
		x++;
		if(p<0){
			p=p+4*x+6;
		}
		else{
			y=y-1;
			p=p+4*(x-y)+10;
			}
			if(d%2==0){
				put8D(x,y,x0,-y0,color,g);
				n++;
			}else{
				n++;
			}
			if(n==5){
				n=0;
				d++;
			}
			
 } 
}	

}

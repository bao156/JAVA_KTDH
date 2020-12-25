/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktdh;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class MyLib {
    int count=0;
     public void TimerWait5()
  {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
  }
     
     
  // TÔ MÀU NÈ
    public void ChooseColor(int color,Graphics2D g2)
    {
        if(color==0)
    {
        g2.setPaint(new Color(0, 0, 0));
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
        g2.setPaint(new Color(77, 38, 0));
    }
     else if (color==14)
    {
        g2.setPaint(new Color(102, 163, 255));
    }
    else if (color==15)
    {
        g2.setPaint(new Color(214, 245, 245));
    }
     else if (color==16)
    {
        g2.setPaint(new Color(0, 0, 0));
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
            else if (color==21)
    {
        g2.setPaint(new Color(230, 138, 0)  );
    }  
                  
           else if (color==22)
    {
        g2.setPaint(new Color(230, 230, 0) );
    }  
                 else if (color==23)
    {
        g2.setPaint(new Color (13, 13, 13));
    }  
           else if (color==24)
    {
        g2.setPaint(new Color  (179, 89, 0));
    }  
             else if (color==30)
    {
        g2.setPaint(new Color (0, 96, 128));
    }  
       
            //(255, 255, 230)
           
           
            
           
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
      
      void  put8D(int xc, int yc, int x, int y, int mauve, Graphics g){
	Graphics2D g2=(Graphics2D)g;
          ChooseColor(mauve, g2);         
        g2.drawLine(x + xc, y + yc, x + xc, y + yc);
        g2.drawLine(-x + xc, y + yc, -x + xc, y + yc);
        g2.drawLine(x + xc, -y + yc, x + xc, -y + yc);
        g2.drawLine(-x + xc, -y + yc, -x + xc, -y + yc);
        g2.drawLine( y + xc, x + yc, y + xc, x + yc);
        g2.drawLine(-y + xc, x + yc, -y + xc, x + yc);
        g2.drawLine(y + xc, -x + yc, y + xc, -x + yc);
        g2.drawLine(-y + xc, -x + yc, -y + xc, -x + yc);
         
	 }
void DrawCircle(int x0, int y0, int r,int color,Graphics g){
	int x = 0; int y = r;
    int f = 1 - r;
    put8D(x0, y0, x, y, color,g);
    while (x < y)
    {
        if (f < 0) f += (x << 1) + 3;
        else
        {
            y--;
            f += ((x - y) << 1) + 5;
        }
        x++;
        put8D(x0, y0, x, y, color,g);
    } 
}	
void chuyenDongQuay(int x,int y,int x1,int y1,double goc,int color ,Graphics g)
      {
          int x2,y2;
       float PI = 3.14f;
       double c, b;
       c= PI / 180;
       b=  -goc*c;
        x2= (int) ((x-x1)*cos(b)-(y-y1)*sin(b) +x1);
        y2= (int) ((x-x1)*sin(b) +(y-y1)*cos(b) + y1);
          drawLineBre(x2, y2, x1, y1, color, g);
                            int[]xt = new int[3];
                             int[]yt = new int[3];
                             xt[0]=x2; xt[1]=x1; xt[2]=340 ;
                             yt[0]=y2; yt[1]=y1; yt[2]=270;
                              int npoints1 = 3;//or y.length
                              fillColorTriangle(xt, yt, npoints1, 24, g);
      }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktdh;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.random;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
 public class View2_1 {
     
      Thread t2;
      Color colorWord=new Color(0,0,0);
     Image img;
    JFrame frame;
    int rand=0;
    DrawPanel drawPanel;
    private int sunhead=0;
    private int sunturn=0;
    private int colorR=255;
    private int colorG=255;
    private int colorB=255;
    private int colorStar=0;
    private int moveShip=1;
    private int xWaterFlow = 20;
    private int xWater = 20;
    private int yCloud = 10;
    private double rateSun = 1.0;
    //private int yCloud = 10;
   // private int oneXWater = 7;
   //private int oneY = 7;

   

    boolean up = false;
    boolean down = true;
    boolean left = false;
    boolean right = true;
    
    boolean colorChange=true;
    boolean colorChange1=false;
    
    boolean flag1=false;
    boolean flag2=true;
    boolean flag3=true;
    


    public static void main(String[] args) {
        
        new View2_1().go();
    }
    
    public void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        drawPanel = new DrawPanel();
         DrawingAlogithrm da=new DrawingAlogithrm();
      
        drawPanel.setOpaque(true);
        drawPanel.setLayout(null);
         JLabel lb=new JLabel("SHOW DETAIL");
         lb.setBounds(10, -45, 200, 200);
         lb.setFont(new Font("Dialog",Font.BOLD,20));
         lb.setForeground(Color.BLACK);
         lb.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent t)
             {
                 frame.setSize(900, 700);
                 JPanel panelDetail=new JPanel();
                 panelDetail.setLayout(null);
                
                 panelDetail.setBounds(0,600, 900, 100);
                 panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "DETAIL STUFF", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(77, 51, 25))); // NOI18N
                 frame.add(panelDetail);
                 
                //Label SUN
                     JLabel lbSun=new JLabel("SUN");
                     lbSun.setBounds(100, 0, 100, 100);
                     lbSun.setFont(new Font("Dialog",Font.BOLD,15));
                     lbSun.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "SUN DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                             t2=new Thread(new Runnable() {
                                 @Override
                                 public void run() {
                               while(true)
                                     {
                                      dt.lbTopic1.setText("CIRCLE");
                                     dt.lbTopic1Content1.setText("RADIUS: "+da.convertPersonWidth((20*rateSun)));
                                      //a.DrawCircle(270, 350, 20*rateSun, 4, g);
                                     dt.lbTopic1Content3.setText("X: "+da.convertPersonXAxis((0+sunturn)));
                                     dt.lbTopic1Content2.setText("Y: "+da.convertPersonYAxis((300-sunhead)));
                            
                             try{
                                    Thread.sleep(150);
                                   } catch (Exception exc){}
                                                            }
                                                        }
                                                    });

                                                    t2.start();

                                   }
                     });

                     lbSun.setForeground(colorWord);
                     panelDetail.add(lbSun);
                           
                     
                // //Label MOUNTAIN
                     JLabel lbMoutainI=new JLabel("MOUNTAIN");
                     lbMoutainI.setBounds(200, 0, 100, 100);
                     lbMoutainI.setFont(new Font("Didalog",Font.BOLD,15));
                     lbMoutainI.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "MOUNTAIN DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);

                             dt.lbTopic1.setText("MOUTAIN I");
                             dt.lbTopic1Content1.setText("LINE I: X1:"+da.convertPersonXAxis(20)+"  Y1:"+da.convertPersonYAxis(450)+"  X2:"+da.convertPersonXAxis(180)+" Y2:"+da.convertPersonYAxis(300));
                             dt.lbTopic1Content3.setText("LINE II: X1:"+da.convertPersonXAxis(180)+"  Y1:"+300+"  X2:"+da.convertPersonYAxis(198)+"  Y2:"+352);
                             
                             
                             dt.lbTopic3.setText("MOUTAIN II");
                             dt.lbTopic3Content1.setText("LINE I: X1:"+da.convertPersonXAxis(126)+"  Y1:"+da.convertPersonYAxis(450)+"  X2:"+da.convertPersonXAxis(250)+"  Y2:"+da.convertPersonYAxis(280));
                              //a.DrawCircle(270, 350, 20*rateSun, 4, g);
                             dt.lbTopic3Content3.setText("LINE II: X1:"+da.convertPersonXAxis(250)+"  Y1:"+da.convertPersonYAxis(280)+"  X2:"+da.convertPersonXAxis(400)+"  Y2:"+da.convertPersonYAxis(450));
                             
                             
                             dt.lbTopic2.setText("MOUTAIN III");
                             dt.lbTopic2Content1.setText("LINE I: X1:"+da.convertPersonXAxis(300)+"  Y1:"+da.convertPersonYAxis(335)+"  X2:"+da.convertPersonXAxis(350)+"  Y2:"+da.convertPersonYAxis(250));
                              //a.DrawCircle(270, 350, 20*rateSun, 4, g);
                             dt.lbTopic2Content3.setText("LINE II: X1:"+da.convertPersonXAxis(350)+"  Y1:"+da.convertPersonYAxis(250)+"  X2:"+da.convertPersonXAxis(550)+"  Y2:"+da.convertPersonYAxis(450));
                             //dt.lbTopic1Content2.setText("Y: "+350);
                             
                             
                             

                         }
                     });
                     lbMoutainI.setForeground(colorWord);
                     panelDetail.add(lbMoutainI);     
                     
                     
                         // //Label CLOUD
                     JLabel lbCloud=new JLabel("CLOUD");
                     lbCloud.setBounds(350, 0, 100, 100);
                     lbCloud.setFont(new Font("Dialog",Font.BOLD,15));
                       lbCloud.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                              DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "CLOUD DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                                 t2=new Thread(new Runnable() {
                                 @Override
                                 public void run() 
                                 {
                                     while(true)
                                     {
                                             dt.lbTopic1.setText("CLOUD I");
                                             dt.lbTopic1Content1.setText("X1:"+da.convertPersonXAxis(0+rand)+"  Y1:"+da.convertPersonYAxis(70-yCloud)  +"  X2:"+da.convertPersonXAxis(300)+"  Y2:"+da.convertPersonYAxis(60));
                                             dt.lbTopic1Content2.setText("BELOW RADIUS:"+da.convertPersonWidth(30));
                                             dt.lbTopic1Content3.setText("ABOVE RADIUS:"+da.convertPersonWidth(150));
                                             dt.lbTopic2.setText("CLOUD II");
                                             dt.lbTopic2Content1.setText("X1:"+da.convertPersonXAxis(350+rand)+"  Y1:"+da.convertPersonYAxis((40-yCloud))  +"  X2:"+da.convertPersonXAxis(300)+"  Y2:"+da.convertPersonYAxis(60));
                                             dt.lbTopic2Content2.setText("BELOW RADIUS:"+da.convertPersonWidth(30));
                                             dt.lbTopic2Content3.setText("ABOVE RADIUS:"+da.convertPersonWidth(150));

                                             dt.lbTopic3.setText("CLOUD III");
                                             dt.lbTopic3Content1.setText("X1:"+da.convertPersonXAxis(280+rand)+"  Y1:"+da.convertPersonYAxis(120-yCloud)  +"  X2:"+da.convertPersonXAxis(270)+"  Y2:"+da.convertPersonYAxis(60));
                                             dt.lbTopic3Content2.setText("BELOW RADIUS:"+da.convertPersonWidth(30));
                                             dt.lbTopic3Content3.setText("ABOVE RADIUS:"+da.convertPersonWidth(120));
                                                                            try{
                                            Thread.sleep(10);
                                           } catch (Exception exc){}

                                     }
                                 }
                                                    });

                                                    t2.start();
                         }
                     });
                     lbCloud.setForeground(colorWord);
                     panelDetail.add(lbCloud);      
                     
                     // //Label LANDSCAPE
                     JLabel lbLand=new JLabel("LAND");
                     lbLand.setBounds(450, 0, 100, 100);
                     lbLand.setFont(new Font("Dialog",Font.BOLD,15));
                     lbLand.setForeground(colorWord);
                         lbLand.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "LAND DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
     
                             dt.lbTopic1Content1.setText(" X1:"+da.convertPersonXAxis(0)+"  Y1:"+da.convertPersonYAxis(452));
                             dt.lbTopic1Content3.setText("  X2:"+da.convertPersonXAxis(560)+"  Y2:"+da.convertPersonYAxis(452));      
                        }
                     });
                     panelDetail.add(lbLand);   

                     JLabel lbSunShine=new JLabel("SHIP");
                     lbSunShine.setBounds(550, 0, 100, 100);
                     lbSunShine.setFont(new Font("Dialog",Font.BOLD,15));
                         lbSunShine.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "SHIP'S DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                                                                                                 t2=new Thread(new Runnable() {
                                 @Override
                                 public void run()    
                                 {
                                     while(true)
                                     {
                                         dt.lbTopic1.setText("BODY SHIP");
                                     dt.lbTopic1Content1.setText("LINE I: X1:"+da.convertPersonXAxis(50+moveShip)+"  Y1:"+da.convertPersonYAxis(530)+"  X2:"+da.convertPersonXAxis(400 +moveShip)+" Y2:"+da.convertPersonYAxis(530));
       dt.lbTopic1Content1.setText("LINE II: X1:"+da.convertPersonXAxis(50+moveShip)+"  Y1:"+da.convertPersonYAxis(530)+"  X2:"+da.convertPersonXAxis(150+moveShip)+" Y2:"+da.convertPersonYAxis(590));                                
         dt.lbTopic1Content2.setText("LINE II: X1:"+da.convertPersonXAxis(50+moveShip)+"  Y1:"+da.convertPersonYAxis(590)+"  X2:"+da.convertPersonXAxis(350+moveShip)+" Y2:"+da.convertPersonYAxis(590));                                
            
                dt.lbTopic2.setText("MAST");
                dt.lbTopic2Content1.setText("XC1:"+da.convertPersonXAxis(235+moveShip)+"  YC1:"+da.convertPersonYAxis(350));
                 dt.lbTopic2Content2.setText("XC2:"+da.convertPersonXAxis(240+moveShip)+"  YC2:"+da.convertPersonYAxis(530));
                
                dt.lbTopic3.setText("SAIL");
                dt.lbTopic3Content1.setText("LINE I: XB1:"+da.convertPersonXAxis(235+moveShip)+"  YB1:"+da.convertPersonYAxis(350)+" XB2:"+da.convertPersonXAxis(100+moveShip)+"  YB2:"+da.convertPersonYAxis(510));
                dt.lbTopic3Content1.setText("LINE II: XB1:"+da.convertPersonXAxis(100+moveShip)+"  YB1:"+da.convertPersonYAxis(500)+" XB2:"+da.convertPersonXAxis(235+moveShip)+"  YB2:"+da.convertPersonYAxis(515));   

                                try{
                                    Thread.sleep(150);
                                   } catch (Exception exc){}
                                     }
                                 }
                                                    });

                                                    t2.start(); 
                         }
                     });
                     lbSunShine.setForeground(colorWord);
                     panelDetail.add(lbSunShine); 

                     // //Label SUNSHINE
                        // //Label Water
                     JLabel lbWaterFlow=new JLabel("WATER FLOW");
                     lbWaterFlow.setBounds(650, 0, 150, 100);
                     lbWaterFlow.setFont(new Font("Dialog",Font.BOLD,15));
                         lbWaterFlow.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "FLOW WATER DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                                t2=new Thread(new Runnable() {
                                 @Override
                                 public void run()
                                 {
                                     while(true)
                                     {
                                dt.lbTopic1Content1.setText("FLOW I: X1:"+da.convertPersonXAxis(-220+xWater)+"  Y1:"+da.convertPersonYAxis(470)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(470));
                             dt.lbTopic1Content2.setText("FLOW II: X1:"+da.convertPersonXAxis(-250+xWaterFlow)+"  Y1:"+da.convertPersonYAxis(480)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(480));
                             dt.lbTopic1Content3.setText("FLOW III: X1:"+da.convertPersonXAxis(-300+xWaterFlow)+"  Y1:"+da.convertPersonYAxis(500)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(500));
                             dt.lbTopic2Content1.setText("FLOW IV: X1:"+da.convertPersonXAxis(-200+xWaterFlow)+"  Y1:"+da.convertPersonYAxis(520)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(520));
                             dt.lbTopic2Content2.setText("FLOW V: X1:"+da.convertPersonXAxis(-200+xWaterFlow)+"  Y1:"+da.convertPersonYAxis(525)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(525));
                             dt.lbTopic2Content3.setText("FLOW VI: X1:"+da.convertPersonXAxis(-180+xWaterFlow)+"  Y1:"+da.convertPersonYAxis(540)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(540));
                             dt.lbTopic3Content1.setText("FLOW VII: X1:"+da.convertPersonXAxis(-330+xWaterFlow)+"  Y1:"+da.convertPersonYAxis(530)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(530));
                             dt.lbTopic3Content2.setText("FLOW VII: X1:"+da.convertPersonXAxis(-200+xWaterFlow)+"  Y1:"+da.convertPersonYAxis(570)+"  X2:"+da.convertPersonXAxis(900+xWaterFlow)+" Y2:"+da.convertPersonYAxis(570));
                             try{
                                    Thread.sleep(150);
                                   } catch (Exception exc){}
                                     }
                              
                                  }
                                      });

                                         t2.start();
                         }
                     });
                     lbWaterFlow.setForeground(colorWord);
                     panelDetail.add(lbWaterFlow); 
                     
                     
                       // //Label Close
                     JLabel lbClose=new JLabel("-");
                     lbClose.setBounds(880, -30, 200, 100);
                     lbClose.setFont(new Font("Dialog",Font.BOLD,45));
                     lbClose.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                           frame.setSize(900, 600);
                         }
                     });
                     lbClose.setForeground(colorWord);
                     panelDetail.add(lbClose); 
                     
             }
         });

         drawPanel.add(lb);
        frame.setLayout(null);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setSize(900, 600);
        drawPanel.setBounds(0, 0, 900, 600);
        drawPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "VIEW", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 1, 30), new java.awt.Color(77, 51, 25))); // NOI18N
        frame.add(drawPanel);
        frame.setLocationRelativeTo(null);
       
        Thread t1=new Thread(new Runnable() {
        @Override
        public void run() {
                MoveSun();
            }
        });
        t1.start();    
        
         MoveFlow();
    }

    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2=(Graphics2D)g;
            DrawingAlogithrm a=new DrawingAlogithrm();
                       //String url=;
             img=new ImageIcon("Ocean1.jpg").getImage();    
             drawPanel.setBackground(new Color(colorR,colorG,colorB));
             

                    //VẼ MẶT TRỜI NÈ
              // ĐƯỜNG TRÒN NÈ
           
       
       //a.DrawCircle((270+sunhead), (350+sunturn), 20*rateSun, 4, g);
     
      a.fillColorEclips((0+sunturn), (300-sunhead),88*rateSun,88*rateSun, 4, g);
       g2.drawImage(img,0,455,this);              
//       a.fillColorEclips(725, 105,65*rateSun,65*rateSun, 4, g);             

//       
       
       
            //VẼ MÂY NÈ

             //BÊN PHẢI TRÁI NÈ
             a.midpointEclipse(150+rand, 100-yCloud,150, 30,15, g);
             a.fillColorEclips(0+rand, 70-yCloud, 300, 60, 15, g);
                 //BÊN PHẢI NÈ
             a.midpointEclipse(500+rand, 70-yCloud, 150, 30,15, g);
             a.fillColorEclips(350+rand, 40-yCloud, 300, 60, 15, g);
                //BÊN DƯỚI NÈ
             a.midpointEclipse(430+rand, 150-yCloud, 120, 30,15, g);
             a.fillColorEclips(280+rand, 120-yCloud, 270, 60, 15, g);
           
            
           //VẼ NƯỚC NÈ 
                        g2.setPaint(new Color(77, 31, 0));
           g2.drawLine(0, 450, 650, 450);
            g2.drawLine(0, 451, 650, 451);
           g2.drawLine(0, 452, 650, 452);
           g2.drawLine(0, 453, 650, 453);        
           

                //2 DÒNG TRÊN
           a.drawDash(-280+xWaterFlow, 470, 900+xWaterFlow, 470, 150, 0, g);
           a.drawDash(-220+xWaterFlow, 470, 900+xWaterFlow, 470, 50, 0, g);
                //2 Dòng Dưới
          a.drawDash(-250+xWaterFlow, 480, 900+xWaterFlow, 480, 350, 0, g);
          a.drawDash(-300+xWaterFlow, 500, 900+xWaterFlow, 500, 200, 0, g);
                //2 DÒNG DƯỚI NỮA
          a.drawDash(-200+xWaterFlow, 520, 900+xWaterFlow, 520, 800, 0, g);
          a.drawDash(-200+xWaterFlow, 525, 900+xWaterFlow, 525, 800, 0, g);
          a.drawDash(-180+xWaterFlow, 540, 900+xWaterFlow, 540, 600, 0, g);
                //2 dong nữa nè
          a.drawDash(-330+xWaterFlow, 530, 900+xWaterFlow, 530, 200, 0, g);
          a.drawDash(-200+xWaterFlow, 570, 900+xWaterFlow, 570, 450, 0, g);
           // a.drawDash((0+oneX),450, (200+oneX), 450, 4, g);
           
           
                    // VẼ THUYỀN NÈ
                
        //   a.drawLineBre(30, rand, rand, rand, ERROR, g);
           
           
           
          //VẼ NÚI NÈ 
                    //NÚI 1
                         int[]x = new int[3];
                         int[]y = new int[3];
                         x[0]=180; x[1]=230; x[2]=20;
                         y[0]=300; y[1]=450; y[2]=450;
                          int npoints = 3;//or y.length
                    a.fillColorTriangle(x, y, npoints, 17, g);
                    a.drawLineBre(20, 450, 180, 300,17, g);
                    a.drawLineBre(180, 300, 198, 352, 17, g);

                        //NÚI 3 NÈ
                         int[]x2 = new int[3];
                         int[]y2 = new int[3];
                         x2[0]=350; x2[1]=547; x2[2]=230 ;
                         y2[0]=250; y2[1]=450; y2[2]=450;
                          int npoints2 = 3;//or y.length
                          a.fillColorTriangle(x2, y2, npoints2, 18, g);
                    a.drawLineBre(300, 335, 350, 250, 18, g);
                    a.drawLineBre(350, 250, 550, 450, 18, g);
           

                        //NÚI 2 
                             int[]x1 = new int[3];
                             int[]y1 = new int[3];
                             x1[0]=250; x1[1]=400; x1[2]=126 ;
                             y1[0]=280; y1[1]=450; y1[2]=450;
                              int npoints1 = 3;//or y.length
                              a.fillColorTriangle(x1, y1, npoints, 19, g);
                        a.drawLineBre(126, 450, 250, 280, 19, g);
                        a.drawLineBre(250, 280, 400, 450, 19, g);
                        
                        
                        
                        
                               
             // VẼ THUYỀN NÈ
                
                    
                    
                    //THÂN THUYỀN
            int[]xb = new int[4];
            int[]yb = new int[4];
            int npointsb = 4;//or y.length

            xb[0]=50+moveShip; xb[1]=150+moveShip; xb[2]=350+moveShip ;xb[3]=400+moveShip;
            yb[0]=530; yb[1]=590; yb[2]=590; yb[3]=530 ; 

          
          
          
         a.drawLineBre((int)(50+moveShip), 530,400 +moveShip, 530, 0, g);
         a.drawLineBre(50+moveShip, 530, 150+moveShip, 590, 0, g);
          a.drawLineBre(150+moveShip, 590, 350+moveShip, 590, 0, g);
          a.drawLineBre(350+moveShip, 590, 400+moveShip, 530, 0, g);
          a.fillColorTriangle(xb, yb, npointsb, 7, g);
          
                    // CỘT THUYỀN
            int[]xc = new int[4];
            int[]yc = new int[4];
            int npointsc = 4;//or y.length 
            xc[0]=235+moveShip; xc[1]=240+moveShip; xc[2]=240+moveShip ;xc[3]=235+moveShip;
            yc[0]=350; yc[1]=350; yc[2]=530; yc[3]=530 ;
            a.fillColorTriangle(xc, yc, npointsc, 7, g);
            a.drawRetangular(235+moveShip, 350, 240+moveShip, 530, 7, g);
          
          
                    // BUỒM
                    
                          
            int[]xt = new int[3];
            int[]yt = new int[3];
            int npointst = 3;//or y.length
            xt[0]=100+moveShip; xt[1]=235+moveShip; xt[2]=235+moveShip ;
            yt[0]=510; yt[1]=350; yt[2]=515;  
           a.drawLineBre(235+moveShip, 350,100+moveShip , 510, 13, g);    
           a.drawLineBre(100+moveShip, 500,235 +moveShip, 515, 13, g);    
           a.fillColorTriangle(xt, yt, npointst, 18, g);
           
           
                     //LOGO
                    int[]xl1 = new int[4];
                    int[]yl1 = new int[4];
                    int npointsl = 4;//or y.length 
                    xl1[0]=200+moveShip; xl1[1]=205+moveShip; xl1[2]=205+moveShip ;xl1[3]=200+moveShip;
                    yl1[0]=450; yl1[1]=450; yl1[2]=480; yl1[3]=480 ;
                    a.fillColorTriangle(xl1, yl1, npointsl, 13, g);
                     
                    int[]xl2 = new int[3];
                    int[]yl2 = new int[3];
                    int npointsl2 = 3;//or y.length 
                    xl2[0]=203+moveShip; xl2[1]=225+moveShip; xl2[2]=180+moveShip ;
                    yl2[0]=410; yl2[1]=460; yl2[2]=460; 
                    a.fillColorTriangle(xl2, yl2, 3, 26, g);
                     
                     a.drawLineBre(203+moveShip, 410, 180+moveShip, 460, 13, g); 
                     a.drawLineBre(180+moveShip, 460, 225+moveShip, 460, 13, g); 
                     a.drawLineBre(225+moveShip, 460, 203+moveShip, 410, 13, g); 
                     a.drawRetangular(200+moveShip, 460, 205+moveShip, 480, 13, g); 

        }
    }
    private void MoveFlow() {
        while(true){
            if(xWater>= 200){
                right = false;
                left = true;
            }
            if(xWater <= 7){
                right = true;
                left = false;
            }
            if(yCloud >= 230){
                up = true;
                down = false;
            }
            if(yCloud <= 7){
                up = false;
                down = true;
            }
            if(up){
                yCloud=7;
                Random random=new Random();
                rand=random.nextInt(200);
            }
            if(down){
                yCloud++;
            }
            if(left){
                xWater=7;
                xWaterFlow=7;
            }
            if(right){
                xWater++;
                xWaterFlow+=1;
            }
    
            try{
             Thread.sleep(10);
            } catch (Exception exc){}
 
            
            
            frame.repaint();
        }
    }
        private void MoveSun() {
        while(true){
            if(rateSun>=1.3){
                right = false;
                left = true;
            }
            if(xWater <= 1){
                right = true;
                left = false;
            }
            if(moveShip>=600)
            {
                
                moveShip=1;
            }
             if(moveShip<600)
            {
                moveShip+=2;
                
            }
            if(left){
                rateSun=1;
            }
            if(right){
                rateSun+=0.1;
            }
            if(flag1==false)
            {
                sunhead+=5;
                sunturn++;
                if(sunhead==50)
                { 
                    colorR=255;
                    colorG=255;
                    colorB=230;
                }
                if(sunhead==100)
                { 
                    colorR=255;
                    colorG=255;
                    colorB=204;
                }
                 if(sunhead==150)
                { 
                    colorR=255;
                    colorG=255;
                    colorB=179;
                }
                if(sunhead==250)
                {
                    flag1=true;
                    flag2=false;
                    colorR=255;
                    colorG=255;
                    colorB=153;
                   
                }
            }
            else if(flag2==false)
            {
                if(sunturn==300)
                {
                    colorR=255;
                    colorG=221;
                    colorB=153;
                   
                }

                if(sunturn==400)
                {
                    colorR=255;
                    colorG=212;
                    colorB=128;  
                }
                  if(sunturn==500)
                {
                    colorR=255;
                    colorG=204;
                    colorB=102;
                }
                 if(sunturn==600)
                {
                    colorR=255;
                    colorG=195;
                    colorB=77;
                }
                sunturn+=5;
                if(sunturn>=700)
                {
                    flag2=true;
                    flag3=false;
                    
                }
            }
            else if(flag3==false)
            {

                if(sunhead==0)
                {
                      colorR=138;
                    colorG=177;
                    colorB=219;
                }
                if(sunhead==-50)
                {
                    
                    colorR=118;
                    colorG=164;
                    colorB=213;
                
                }
                
                if(sunhead==-100)
                {
                     colorR=99;
                    colorG=151 ;
                    colorB=207;
                }
                if(sunhead==-150)
                {
                     colorR=78;
                    colorG=138 ;
                    colorB=201;
                }
                   if(sunhead==-200)
                {
                     colorR=54;
                    colorG=113 ;
                    colorB=178;
                }
                if(sunhead==-250)
                {
                     colorR=42;
                    colorG=88 ;
                    colorB=137;
                }
                if(sunhead==-300)
                {
                     colorR=30;
                    colorG=63;
                    colorB=98;
                }
                if(sunhead==-500)
                {
                     flag1=false;
                    
                    sunhead=0;
                    sunturn=0;
                    colorR=255;
                    colorG=255;
                    colorB=255;
                }
                sunhead-=10;
            }
                
           
                
            
            
            //a.fillColorEclips((0+sunhead), (400-sunturn),65*rateSun,65*rateSun, 4, g);
            
            try{
             Thread.sleep(150);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
    
}
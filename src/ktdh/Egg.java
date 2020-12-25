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
import static java.lang.Math.cos;
import static java.lang.Math.random;
import static java.lang.Math.sin;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

final public class Egg {

    
    Thread t2;
    Image  img;
    JFrame frame;
    int rand=0;
    DrawPanel drawPanel;
 
     private int wing = 0;
    private double count = 1.0;
     private int countnest = 0;
    private double cd = 0.0;
    private double cd1 = 0.0;
    
    private int x1=0;
    private int y1=0;
    private int x2=0;
    private int y2=0;
    
    private int x3=0;
    private int y3=0;
    private int x4=0;
    private int y4=0;
    
    private int x5=0;
    private int y5=0;
    private int x6=0;
    private int y6=0;
    
    private int x7=0;
    private int y7=0;
    private int x8=0;
    private int y8=0;
    private int mau1=0;
    private int mau2=23;


    private int count1 = 500;
    
    private int dem=0;

    public static void main(String[] args) {
     
        new Egg().go();
        
    }

    public void go() {
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
       
//        JLabel lb=new JLabel();
//        lb.setIcon(new ImageIcon(img));
        drawPanel = new DrawPanel();
//        drawPanel.add(lb);
        drawPanel.setBackground(new Color(255, 255, 255));
        drawPanel.setOpaque(true);
       
         
         
       
       // img=new ImageIcon(url).getImage().getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
        frame.setLayout(null);
        drawPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "EGG & CHICK", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 1, 30), new java.awt.Color(255, 255, 0))); // NOI18N
        frame.setUndecorated(true);
        frame.setVisible(true);
        drawPanel.setLayout(null);
         JLabel lb=new JLabel("SHOW DETAIL");
         lb.setBounds(25, -45, 200, 200);
         DrawingAlogithrm da=new DrawingAlogithrm();
         lb.setFont(new Font("Dialog",Font.BOLD,20));
         lb.setForeground(new Color(204, 204, 0));
          
         DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "EGG DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                                
                              t2=new Thread(new Runnable() {
                                     @Override
                                     public void run() {
                             while(true)
                             {
                             dt.lbTopic1.setText("EGG SHAPE");
                             dt.lbTopic1Content1.setText(" X: "+da.convertPersonXAxis(450)+"  Y:"+da.convertPersonYAxis(count1+10));
                             dt.lbTopic1Content3.setText("ABOVE HALF RADIUS: "+da.convertPersonWidth((int)(60*count)));
                             dt.lbTopic1Content2.setText("BELOW HALF RADIUS: "+da.convertPersonWidth((int)(35*count)));
                              
                             dt.lbTopic2.setText("CRASH");
                             dt.lbTopic2Content1.setText(" LINE I: X1:"+da.convertPersonXAxis(x1-70)+"  Y1:"+da.convertPersonYAxis(y1+73)+"  X2:"+da.convertPersonXAxis(x2-80)+"  Y2:"+da.convertPersonYAxis(y2+15));
                             dt.lbTopic2Content2.setText(" LINE II: X1:"+da.convertPersonXAxis(x3-80)+"  Y1:"+da.convertPersonYAxis(y3+15)+"  X2:"+da.convertPersonXAxis(x4-50)+"  Y2:"+da.convertPersonYAxis(y4-65));
                             dt.lbTopic2Content3.setText(" LINE III: X1:"+da.convertPersonXAxis(x5-50)+"  Y1:"+da.convertPersonYAxis(y5-65)+"  X2:"+da.convertPersonXAxis(x6-75)+"  Y2:"+da.convertPersonYAxis(y6-130));
                             dt.lbTopic3Content1.setText(" LINE IV: X1:"+da.convertPersonXAxis(x7-75)+"  Y1:"+da.convertPersonYAxis(y7-130)+"  X2:"+da.convertPersonXAxis(x8-50)+"  Y2:"+da.convertPersonYAxis(y8-173));    
                                 try {
                                     Thread.sleep(80);
                                 } catch (InterruptedException ex) {
                                     Logger.getLogger(Egg.class.getName()).log(Level.SEVERE, null, ex);
                                 }
            
                                     }
                               
                  
                             }
                         });
                              t2.start();
         lb.addMouseListener(new MouseAdapter() {
             public void mouseClicked(MouseEvent t)
             {
                 frame.setSize(900, 700);
                 JPanel panelDetail=new JPanel();
                 panelDetail.setLayout(null);
                 panelDetail.setBounds(0,600, 900, 100);
                 panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "DETAIL STUFF", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 15), new java.awt.Color(77, 51, 25))); // NOI18N
                 frame.add(panelDetail);
                 
                 
                 //WATER FALL
                  JLabel lbWaterFall=new JLabel("WATER FALL");
                  lbWaterFall.setBounds(50, 0, 200, 100);
                  lbWaterFall.setFont(new Font("Dialog",Font.BOLD,15));
                  lbWaterFall.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "WATER FALL DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                                t2=new Thread(new Runnable() {
                                 @Override
                                 public void run() {
                                                    
                                     while(true)
                                     {
                              dt.lbTopic1Content1.setText("FLOW I: X1: "+da.convertPersonXAxis(426)+"  Y1:"+da.convertPersonYAxis(0+countnest-180)+"  X2:"+da.convertPersonXAxis(426)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic1Content2.setText("FLOW II: X1: "+da.convertPersonXAxis(417)+"  Y1:"+da.convertPersonYAxis(0+countnest-200)+"  X2:"+da.convertPersonXAxis(417)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic1Content3.setText("FLOW III: X1: "+da.convertPersonXAxis(262)+"  Y1:"+da.convertPersonYAxis(0+countnest-190)+"  X2:"+da.convertPersonXAxis(262)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic2Content1.setText("FLOW IV: X1: "+da.convertPersonXAxis(351)+"  Y1:"+da.convertPersonYAxis(0+countnest-210)+"  X2:"+da.convertPersonXAxis(351)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic2Content2.setText("FLOW V: X1: "+da.convertPersonXAxis(365)+"  Y1:"+da.convertPersonYAxis(0+countnest-160)+"  X2:"+da.convertPersonXAxis(365)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic2Content3.setText("FLOW VI: X1: "+da.convertPersonXAxis(351)+"  Y1:"+da.convertPersonYAxis(0+countnest-210)+"  X2:"+da.convertPersonXAxis(351)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic3Content1.setText("FLOW VII: X1: "+da.convertPersonXAxis(290)+"  Y1:"+da.convertPersonYAxis(0+countnest-200)+"  X2:"+da.convertPersonXAxis(290)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic3Content2.setText("FLOW VIII: X1: "+da.convertPersonXAxis(305)+"  Y1:"+da.convertPersonYAxis(0+countnest-190)+"  X2:"+da.convertPersonXAxis(305)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                             dt.lbTopic3Content3.setText("FLOW IX: X1: "+da.convertPersonXAxis(320)+"  Y1:"+da.convertPersonYAxis(0+countnest-170)+"  X2:"+da.convertPersonXAxis(320)+"  Y2:"+da.convertPersonYAxis(30+countnest));
                                         try {
                                             Thread.sleep(400);
                                         } catch (InterruptedException ex) {
                                             Logger.getLogger(Egg.class.getName()).log(Level.SEVERE, null, ex);
                                         }
                                      
                                     }
                                     
                                     
                                                    }
                                                    });

                                                    t2.start();

                         }
                     });
                   panelDetail.add(lbWaterFall);
                   




                   // EGG
                   JLabel lbEgg=new JLabel("CHICK'S EGG");
                   lbEgg.setBounds(200, 0, 200, 100);
                  lbEgg.setFont(new Font("Dialog",Font.BOLD,15));
                  lbEgg.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                              DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "EGG DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                                
                             dt.lbTopic1.setText("EGG SHAPE");
                             dt.lbTopic1Content1.setText(" X: "+da.convertPersonXAxis(450)+"  Y:"+da.convertPersonYAxis(count1+10));
                             dt.lbTopic1Content3.setText("ABOVE HALF RADIUS: "+da.convertPersonWidth((int)(60*count)));
                             dt.lbTopic1Content2.setText("BELOW HALF RADIUS: "+da.convertPersonWidth((int)(35*count)));
                             
                             dt.lbTopic2.setText("CRASH");
                             dt.lbTopic2Content1.setText(" LINE I: X1:"+da.convertPersonXAxis(x1-70)+"  Y1:"+da.convertPersonYAxis(y1+73)+"  X2:"+da.convertPersonXAxis(x2-80)+"  Y2:"+da.convertPersonYAxis(y2+15));
                             dt.lbTopic2Content2.setText(" LINE II: X1:"+da.convertPersonXAxis(x3-80)+"  Y1:"+da.convertPersonYAxis(y3+15)+"  X2:"+da.convertPersonXAxis(x4-50)+"  Y2:"+da.convertPersonYAxis(y4-65));
                             dt.lbTopic2Content3.setText(" LINE III: X1:"+da.convertPersonXAxis(x5-50)+"  Y1:"+da.convertPersonYAxis(y5-65)+"  X2:"+da.convertPersonXAxis(x6-75)+"  Y2:"+da.convertPersonYAxis(y6-130));
                             dt.lbTopic3Content1.setText(" LINE IV: X1:"+da.convertPersonXAxis(x7-75)+"  Y1:"+da.convertPersonYAxis(y7-130)+"  X2:"+da.convertPersonXAxis(x8-50)+"  Y2:"+da.convertPersonYAxis(y8-173));    


                         }
                     });
                   panelDetail.add(lbEgg);

                   
                     // CHICK
                  JLabel lbAboveChick=new JLabel("ABOVE CHICK");
                  lbAboveChick.setBounds(350, 0, 200, 100);
                  lbAboveChick.setFont(new Font("Dialog",Font.BOLD,15));
                  lbAboveChick.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                              DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "ABOVE DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                               
                             t2=new Thread(new Runnable() {
                                  @Override
                                  public void run() {
                                      while(true)
                                              {
                                        dt.lbTopic1.setText(" PEAK");
                             dt.lbTopic1Content1.setText("ABOVE PEAK: X1:"+da.convertPersonXAxis(300)+"  Y1:"+da.convertPersonYAxis(250)+" X2:"+da.convertPersonXAxis(230)+" Y2:"+da.convertPersonYAxis(230));
                             dt.lbTopic1Content2.setText("BELOW PEAK: X1:"+da.convertPersonXAxis(308)+"  Y1:"+da.convertPersonYAxis(251)+" X2:"+da.convertPersonXAxis(340)+" Y2:"+da.convertPersonYAxis(270));
                             dt.lbTopic1Content2.setText("CORNER I:"+cd+"  CORNER II:"+cd1);
                             
                              dt.lbTopic2.setText(" EYE");
                              dt.lbTopic2Content1.setText("X:"+da.convertPersonXAxis(400)+"  Y:"+da.convertPersonYAxis(400));
                              dt.lbTopic2Content2.setText("RADIUS:"+da.convertPersonWidth(30));
                              
                              dt.lbTopic3.setText(" HEAD");
                              dt.lbTopic3Content1.setText("X:"+da.convertPersonXAxis(400)+"  Y:"+da.convertPersonYAxis(400));
                              dt.lbTopic3Content2.setText("RADIUS:"+da.convertPersonWidth(65));
                                          try {
                                              Thread.sleep(150);
                                          } catch (InterruptedException ex) {
                                              Logger.getLogger(Egg.class.getName()).log(Level.SEVERE, null, ex);
                                          }
                                              }
                                  }
                             });
                           t2.start();
                             

                         }
                     });
                   panelDetail.add(lbAboveChick);

                   
                                //BODY CHICK
                    JLabel lbBodyChick=new JLabel("BODY CHICK");
                   lbBodyChick.setBounds(500, 0, 200, 100);
                  lbBodyChick.setFont(new Font("Dialog",Font.BOLD,15));
                   lbBodyChick.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "CHICK'S BODY DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                               
                             t2=new Thread(new Runnable() {
                                  @Override
                                  public void run() {
                                      while(true)
                                              {
                                        dt.lbTopic1.setText("WING");
                             dt.lbTopic1Content1.setText("LINE I: X1:"+da.convertPersonXAxis(490)+"  Y1:"+da.convertPersonYAxis(310)+" X2:"+da.convertPersonXAxis(550)+" Y2:"+da.convertPersonYAxis(340-wing));
                             dt.lbTopic1Content2.setText("LINE II: X1:"+da.convertPersonXAxis(550)+"  Y1:"+da.convertPersonYAxis(340-wing)+" X2:"+da.convertPersonXAxis(510)+" Y2:"+da.convertPersonYAxis(360));
                             
                              dt.lbTopic2.setText("BODY");
                             dt.lbTopic2Content1.setText(" X:"+da.convertPersonXAxis(500)+"  Y:"+da.convertPersonYAxis(350));
                             dt.lbTopic2Content2.setText("RADIUS: "+da.convertPersonWidth(100));
                            
                             
                             
                            
                                          try {
                                              Thread.sleep(150);
                                          } catch (InterruptedException ex) {
                                              Logger.getLogger(Egg.class.getName()).log(Level.SEVERE, null, ex);
                                          }
                                              }
                                  }
                             });
                           t2.start();
                         }
                     });
                   panelDetail.add(lbBodyChick);
                   
                   
                   
                   //BELOW CHICK
                     JLabel lbBelowChick=new JLabel("BELOW CHICK");
                   lbBelowChick.setBounds(650, 0, 200, 100);
                  lbBelowChick.setFont(new Font("Dialog",Font.BOLD,15));
                  lbBelowChick.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "BELOW CHICK DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                               
                             t2=new Thread(new Runnable() {
                                  @Override
                                  public void run() {
                                      while(true)
                                              {
                             dt.lbTopic1.setText("LEG");
                             dt.lbTopic1Content1.setText("RIGHT LEG: X1:"+da.convertPersonXAxis(515)+"  Y1:"+da.convertPersonYAxis(447)+" X2:"+da.convertPersonXAxis(490)+" Y2:"+da.convertPersonYAxis(490));
                             dt.lbTopic1Content2.setText("LEFT LEG: X1:"+da.convertPersonXAxis(460)+"  Y1:"+da.convertPersonYAxis(440)+" X2:"+da.convertPersonXAxis(410)+" Y2:"+470);
                             
                              dt.lbTopic2.setText("RIGHT TOENAIL");
                             dt.lbTopic2Content1.setText("TOENAIL I: X1:"+da.convertPersonXAxis(485)+"  Y1:"+da.convertPersonYAxis(500)+" X2:"+da.convertPersonXAxis(502)+" Y2:"+da.convertPersonYAxis(520));
                              dt.lbTopic2Content2.setText("TOENAIL II: X1:"+da.convertPersonXAxis(490)+"  Y1:"+da.convertPersonYAxis(490)+" X2:"+da.convertPersonXAxis(470)+" Y2:"+da.convertPersonYAxis(520));
                              dt.lbTopic2Content3.setText("TOENAIL III: X1:"+da.convertPersonXAxis(485)+"  Y1:"+da.convertPersonYAxis(500)+" X2:"+da.convertPersonXAxis(455)+" Y2:"+da.convertPersonYAxis(500));
                              
                                dt.lbTopic3.setText("LEFT TOENAIL");
                             dt.lbTopic3Content1.setText("TOENAIL I: X1:"+da.convertPersonXAxis(390)+"  Y1:"+da.convertPersonYAxis(470)+" X2:"+da.convertPersonXAxis(410)+" Y2:"+da.convertPersonYAxis(470));
                              dt.lbTopic3Content2.setText("TOENAIL II: X1:"+da.convertPersonXAxis(380)+"  Y1:"+da.convertPersonYAxis(490)+" X2:"+da.convertPersonXAxis(410)+" Y2:"+da.convertPersonYAxis(470));
                              dt.lbTopic3Content3.setText("TOENAIL III: X1:"+da.convertPersonXAxis(400)+"  Y1:"+da.convertPersonYAxis(500)+" X2:"+da.convertPersonXAxis(410)+" Y2:"+da.convertPersonYAxis(470));
                            
                             
                             
                            
                                          try {
                                              Thread.sleep(150);
                                          } catch (InterruptedException ex) {
                                              Logger.getLogger(Egg.class.getName()).log(Level.SEVERE, null, ex);
                                          }
                                              }
                                  }
                             });
                           t2.start();

                         }
                     });
                   panelDetail.add(lbBelowChick);           
             }
         });
         drawPanel.add(lb);
        frame.setSize(900, 600);
                lb.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt)
            {
                frame.setSize(900,800);
            }
        });
        drawPanel.setBounds(0, 0, 1000, 600);
        frame.add(drawPanel);
        frame.setLocationRelativeTo(null);

       
        Thread t1=new Thread(new Runnable() {
        @Override
        public void run() {
                
                phongToTrung();
                nayTrungLen();
                nayTrungXuong();
                nayTrungLen();
                nayTrungXuong();
                nayTrungLen();
                nayTrungXuong();
                veNetDut();
                xoaHinh();
                dem=1;
                miengGa();  
               
            }
        });
        t1.start();  
        WaterFlow();
        

    }

    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            super.paintComponent(g);
            String url="BackgroundEgg1.jpg";
             img=new ImageIcon(url).getImage();    
             g2d.drawImage(img, 0, 0,this);
            MyLib a= new MyLib();
            DrawingAlogithrm b=new DrawingAlogithrm();
         
            //VE THAC NUOC  
                //BEEN PHAI
         int mau3=30;
            a.drawDash(426, 0+countnest-180,426, 30+countnest, 90, mau3, g);
           a.drawDash(427, 0+countnest-180,427, 30+countnest, 90, mau3, g);
            
            a.drawDash(417, 0+countnest-200,417, 30+countnest, 70, mau3, g);
           a.drawDash(418, 0+countnest-200,418, 30+countnest, 70, mau3, g);
            
            a.drawDash(262, 0+countnest-190,262, 30+countnest, 100, mau3, g);
             a.drawDash(261, 0+countnest-190,261, 30+countnest, 100, mau3, g);

             
             a.drawDash(351, 0+countnest-210,351, 30+countnest, 60,mau3, g);
              a.drawDash(352, 0+countnest-210,352, 30+countnest, 60, mau3, g);

//      
             a.drawDash(365, 0+countnest-160,365, 30+countnest, 90, mau3, g);
             a.drawDash(366, 0+countnest-160,366, 30+countnest, 90, mau3, g);
  
             
             
              a.drawDash(290, 0+countnest-200,290, 30+countnest,100, mau3, g);
                a.drawDash(289, 0+countnest-200,289, 30+countnest, 100, mau3, g);
           
              a.drawDash(305, 0+countnest-190,305, 30+countnest, 70,mau3, g);
               a.drawDash(306, 0+countnest-190,306, 30+countnest, 70,mau3, g);
               
               a.drawDash(319, 0+countnest-170,319, 30+countnest, 80,mau3, g);
             a.drawDash(320, 0+countnest-170,320, 30+countnest, 80, mau3, g);

             
                    //VẼ GÀ CON
              // ĐƯỜNG ELIP
             

       a.midpointEclipse(450, count1+10, (int)(60*count),(int)(35*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.9*count),(int)(34.9*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.8*count),(int)(34.8*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.7*count),(int)(34.7*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.6*count),(int)(34.6*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.5*count),(int)(34.5*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.4*count),(int)(34.4*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.3*count),(int)(34.3*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.2*count),(int)(34.2*count) , mau2, g);
       a.midpointEclipse(450, count1+10, (int)(59.1*count),(int)(34.1*count) , mau2, g);
 
    
      //VẼ NÉT NỨT TRÊN TRỨNG
    
  
      a.drawLineBre(x1+3-70, y1+73, x2+3-80, y2+15, mau1, g); 
      a.drawLineBre(x1+2-70, y1+73, x2+2-80, y2+15, mau1, g); 
      a.drawLineBre(x1+1-70, y1+73, x2+1-80, y2+15, mau1, g); 
      a.drawLineBre(x1-70, y1+73, x2-80, y2+15, mau1, g); 
      a.drawLineBre(x1-1-70, y1+73, x2-1-80, y2+15, mau1, g); 
      a.drawLineBre(x1-2-70, y1+73, x2-2-80, y2+15, mau1, g); 
      a.drawLineBre(x1-3-70, y1+73, x2-3-80, y2+15, mau1, g);
      

         
        a.drawLineBre(x3+3-80, y3+15, x4+3-50, y4-65, mau1, g);
         a.drawLineBre(x3+2-80, y3+15, x4+2-50, y4-65, mau1, g);
      a.drawLineBre(x3+1-80, y3+15, x4+1-50, y4-65, mau1, g);
      a.drawLineBre(x3-80, y3+15, x4-50, y4-65, mau1, g);
       a.drawLineBre(x3-1-80, y3+15, x4-1-50, y4-65, mau1, g);
        a.drawLineBre(x3-2-80, y3+15, x4-2-50, y4-65, mau1, g);
         a.drawLineBre(x3-3-80, y3+15, x4-3-50, y4-65, mau1, g);
         


       
      a.drawLineBre(x5+3-50, y5-65, x6+3-75, y6-130, mau1, g);
      a.drawLineBre(x5+2-50, y5-65, x6+2-75, y6-130, mau1, g);
      a.drawLineBre(x5+1-50, y5-65, x6+1-75, y6-130, mau1, g);
      a.drawLineBre(x5-50, y5-65, x6-75, y6-130, mau1, g);
      a.drawLineBre(x5-1-50, y5-65, x6-1-75, y6-130, mau1, g);
      a.drawLineBre(x5-2-50, y5-65, x6-2-75, y6-130, mau1, g);
      a.drawLineBre(x5-3-50, y5-65, x6-3-75, y6-130, mau1, g);
   
          
       a.drawLineBre(x7+3-75, y7-130, x8+3-50, y8-173, mau1, g);
       a.drawLineBre(x7+2-75, y7-130, x8+2-50, y8-173, mau1, g);
       a.drawLineBre(x7+1-75, y7-130, x8+1-50, y8-173, mau1, g);
       a.drawLineBre(x7-75, y7-130, x8-50, y8-173, mau1, g);
       a.drawLineBre(x7-1-75, y7-130, x8-1-50, y8-173, mau1, g);
       a.drawLineBre(x7-2-75, y7-130, x8-2-50, y8-173, mau1, g);
       a.drawLineBre(x7-3-75, y7-130, x8-3-50, y8-173, mau1, g);
 
         
     if(dem==1)
     {
        
         
         
        a.DrawCircle(500, 350, 100, 21, g);//THÂN 
        a.fillColorEclips(400, 250, 200, 200, 8, g);
        
        //CANH GA
        a.drawLineBre(490, 310, 550, 340-wing, 13, g);
        a.drawLineBre(550, 340-wing, 510, 360, 13, g);
        
        a.DrawCircle(400, 250, 65, 21, g);//ĐẦU GÀ
        a.fillColorEclips(335, 185, 130, 130, 8, g);
        
        a.DrawCircle(400, 230, 15, 8, g);//MẮT GÀ
        a.fillColorEclips(386, 215, 30, 30, 0, g);
        
        a.drawLineBre(300,250 ,340,230, 22, g);//MIỆNG GÀ TRÊN
        a.drawLineBre(300,250, 335, 250, 22, g);
        
        int[]x1 = new int[3];
        int[]y1 = new int[3];
        x1[0]=300; x1[1]=340; x1[2]=335 ;
        y1[0]=250; y1[1]=230; y1[2]=250;
        int npoints1 = 3;//or y.length
        a.fillColorTriangle(x1, y1, npoints1, 24, g);

       
       a.chuyenDongQuay(303, 251,337 ,252,cd,22, g);//MIỆNG GÀ DƯỚI
       a.chuyenDongQuay(308, 251, 340, 270,cd1,22, g);
 
       
         a.drawLineBre(515+2, 447, 490+2, 490, 0, g);//CHÂN GÀ 1
         a.drawLineBre(515+1, 447, 490+1, 490, 0, g);//CHÂN GÀ 1
        a.drawLineBre(515, 447, 490, 490, 0, g);//CHÂN GÀ 1
         a.drawLineBre(515-1, 447, 490-1, 490, 0, g);//CHÂN GÀ 1
          a.drawLineBre(515-2, 447, 490-1, 490, 0, g);//CHÂN GÀ 1
          

        a.drawLineBre(485+2, 500, 502+2, 520,0, g);
        a.drawLineBre(485+1, 500, 502+1, 520,0, g);
        a.drawLineBre(485, 500, 502, 520,0, g);
        a.drawLineBre(485-1, 500, 502-1, 520,0, g);
        a.drawLineBre(485-2, 500, 502-2, 520,0, g);

        
        a.drawLineBre(490+2, 490, 470+2, 520,0, g);
        a.drawLineBre(490+1, 490, 470+1, 520,0, g);
        a.drawLineBre(490, 490, 470, 520,0, g);
        a.drawLineBre(490-1, 490, 470-1, 520,0, g);
        a.drawLineBre(490-2, 490, 470-2, 520,0, g);

        
         a.drawLineBre(485, 500+2, 455, 500+2,0, g);
         a.drawLineBre(485, 500+1, 455, 500+1,0, g);
        a.drawLineBre(485, 500, 455, 500,0, g);
         a.drawLineBre(485, 500-1, 455, 500-1,0, g);
          a.drawLineBre(485, 500-2, 455, 500-2,0, g);

        

        a.drawLineBre(460+2, 440, 410+2, 470, 0, g);//CHÂN GÀ 2
        a.drawLineBre(460+1, 440, 410+1, 470, 0, g);//CHÂN GÀ 2
        a.drawLineBre(460, 440, 410, 470, 0, g);//CHÂN GÀ 2
        a.drawLineBre(460-1, 440, 410-1, 470, 0, g);//CHÂN GÀ 2
        a.drawLineBre(460-2, 440, 410-2, 470, 0, g);//CHÂN GÀ 2

        
        a.drawLineBre(380, 470+2, 410, 470+2, 0, g);
        a.drawLineBre(380, 470+1, 410, 470+1, 0, g);
        a.drawLineBre(380, 470, 410, 470, 0, g);
        a.drawLineBre(380, 470-1, 410, 470-1, 0, g);
        a.drawLineBre(380, 470-1, 410, 470-2, 0, g);

        
         a.drawLineBre(380+2, 490, 410+2, 470, 0, g);
         a.drawLineBre(380+1, 490, 410+1, 470, 0, g);
        a.drawLineBre(380, 490, 410, 470, 0, g);
         a.drawLineBre(380-1, 490, 410-1, 470, 0, g);
          a.drawLineBre(380-2, 490, 410-2, 470, 0, g);

          
         a.drawLineBre(400+2,500, 410+2, 470, 0, g);
        a.drawLineBre(400+1,500, 410+1, 470, 0, g);
        a.drawLineBre(400,500, 410, 470, 0, g);
        a.drawLineBre(400-1,500, 410-1, 470, 0, g);
        a.drawLineBre(400-2,500, 410-2, 470, 0, g);

        
      
//      g2d.drawString("PHEP QUAY MIENG GA",400, 10);
//      g2d.drawString("X1= "+((int)((300-337)*cos(25*3.14/180)-(401-402)*sin(25*3.14/180) +337))+","+"Y1="+((int) ((300-337)*sin(25*3.14/180) +(401-402)*cos(25*3.14/180) + 402)), 400, 25);
//      g2d.drawString("X2= "+((int)((308-340)*cos(19*3.14/180)-(401-420)*sin(19*3.14/180) +337))+","+"Y1="+((int) ((308-340)*sin(19*3.14/180) +(401-420)*cos(19*3.14/180) + 420)), 400, 40);
         
     } 
      
      
    }
    }
        private void phongToTrung() {
          
        while(count != 3.0){
            count +=0.25;
            try{
             Thread.sleep(200);
            } catch (Exception exc){}
           
            frame.repaint();
        }
    }
        
        private void nayTrungLen()
        {
            int p =0;
            while(count1 !=400)
            {
               count1=count1 - p; 
               p=20;
                try{
             Thread.sleep(20);
            } catch (Exception exc){}
            frame.repaint();
            }
        }
        
           private void nayTrungXuong()
        {
            count1= 400;
            int p =0;
            while(count1 !=440)
            {
               count1=count1 + p; 
               p=20;
                try{
             Thread.sleep(80);
            } catch (Exception exc){}
            frame.repaint();
            }
        }
          private void miengGa ()
          {
              double p= 10.0;
              double q= 10.0;
             while (true)
             {
                 cd = cd + p;
                 cd1= cd1 + q;
                 p=5;
                 q=5;
                 if (cd==20.0)
                 {
                 cd = 0;
                 }
                 if (cd1 == 20.0)
                 {
                  cd1 = 0;   
                 }
                  if(wing==60)
                  {
                      wing=0;
                  }
                 wing+=15;
                
                 
              try{
             Thread.sleep(150);
            } catch (Exception exc){}   
                 
            frame.repaint();
             
             }
          }
          
         private void WaterFlow ()
          {
              int temp=0;
             while (true)
             {
             temp++;
            if(temp==8)
            {
                temp=0;
                countnest=0;
            }
             countnest+=10;
              try{
             Thread.sleep(400);
            } catch (Exception exc){}   
                 
            frame.repaint();
             
             }
          }
          private void veNetDut ()
          {
              
              int i = 1;
              while(i!=5)
              {
                  mau1=0;
                  if(i==1)
                  {x1=500; y1=275; x2=600; y2=388;}
                  else if(i==2)
                  {x3=600; y3=388; x4=500; y4=500;}
                  else if(i==3)
                  {x5=500; y5=500; x6=600; y6=613;}
                  else if(i==4)
                  {x7=600; y7=613; x8=500; y8=725;}
            i++;
            try{
             Thread.sleep(700);
            } catch (Exception exc){}
         frame.repaint();
          }
          }
          private void xoaHinh()
          {
              mau2=9;
              mau1=9;
              try{
             Thread.sleep(800);
            } catch (Exception exc){}
            frame.repaint();
          }
         
}
//      COLOR CODE
//0: Black
//1: Blue
//2: green
//3: cyan
//4: red
//5: Magenta
//6: Light Gray
//7: darkgray
//8: yellow
//9: white
//10:Organge
//11:pink
//12: Gray
//13: Browns
 //14: Nước biển
 //15: Màu mây
//16: Dòng chảy
//17: NÚI TÔNG NHẸ 2
//18: NÚI TÔNG NHẸ 1
//19: NÚI TÔNG NHẸ 0
//20: MÀU NẮNG  
    
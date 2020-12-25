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

 public class View {
     
      Thread t2;
      Color colorWord=new Color(0,0,0);
     Image img;
    JFrame frame;
    int rand=0;
    DrawPanel drawPanel;
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

    public static void main(String[] args) {
        
        new View().go();
    }

    public void go() {
        frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        drawPanel = new DrawPanel();
         DrawingAlogithrm da=new DrawingAlogithrm();
        drawPanel.setBackground(new Color(255, 243, 230));
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
                             dt.lbTopic1Content3.setText("X: "+da.convertPersonXAxis(725));
                             dt.lbTopic1Content2.setText("Y: "+da.convertPersonYAxis(105));
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
//                                              a.midpointEclipse(150+rand, 100-yCloud,150, 30,15, g);
//             a.fillColorEclips(0+rand, 70-yCloud, 300, 60, 15, g);
//                 //BÊN PHẢI NÈ
//             a.midpointEclipse(500+rand, 70-yCloud, 150, 30,15, g);
//             a.fillColorEclips(350+rand, 40-yCloud, 300, 60, 15, g);
//                //BÊN DƯỚI NÈ
//             a.midpointEclipse(430+rand, 150-yCloud, 120, 30,15, g);
//             a.fillColorEclips(280+rand, 120-yCloud, 270, 60, 15, g);
                                                    });

                                                    t2.start();

                                   
                            
                          
                             
                             

                         }
                     });
                     lbCloud.setForeground(colorWord);
                     panelDetail.add(lbCloud);      
                     
                     // //Label LANDSCAPE
                     JLabel lbLand=new JLabel("SHIP");
                     lbLand.setBounds(450, 0, 100, 100);
                     lbLand.setFont(new Font("Dialog",Font.BOLD,15));
                     lbLand.setForeground(colorWord);
                         lbLand.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "LAND DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
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
                dt.lbTopic3Content2.setText("LINE II: XB1:"+da.convertPersonXAxis(100+moveShip)+"  YB1:"+da.convertPersonYAxis(500)+" XB2:"+da.convertPersonXAxis(235+moveShip)+"  YB2:"+da.convertPersonYAxis(515));   
                            // a.drawLineBre(0, 452, 560, 452, 24, g);
                                try{
                                    Thread.sleep(150);
                                   } catch (Exception exc){}
                                     }
                                 }
                                                    });

                                                    t2.start();
                            
                         }
                     });
                     panelDetail.add(lbLand);   

                     JLabel lbSunShine=new JLabel("SUN SHINE");
                     lbSunShine.setBounds(550, 0, 100, 100);
                     lbSunShine.setFont(new Font("Dialog",Font.BOLD,15));
                         lbSunShine.addMouseListener(new MouseAdapter() {
                         public void mouseClicked(MouseEvent t)
                         {
                             DetailAxis dt=new DetailAxis();
                             dt.panelDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "SUN SHINE DETAIL", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(77, 51, 25))); // NOI18N
                             dt.setVisible(true);
                                                                                                 t2=new Thread(new Runnable() {
                                 @Override
                                 public void run()    
                                 {
                                     while(true)
                                     {
                              dt.lbTopic1Content1.setText("SOUTH: X1:"+da.convertPersonXAxis(762)+"  Y1:"+da.convertPersonYAxis(10)+"  X2:"+da.convertPersonXAxis(762)+" Y2:"+da.convertPersonYAxisWithDouble(80*(rateSun*0.75)));
                              dt.lbTopic1Content2.setText("NORTH: X1:"+da.convertPersonXAxis(762)+"  Y1:"+da.convertPersonYAxis(210)+"  X2:"+da.convertPersonXAxis(762)+" Y2:"+da.convertPersonYAxisWithDouble(270*(rateSun*0.75)));
                               dt.lbTopic1Content3.setText("WEST: X1:"+da.convertPersonXAxis(660)+"  Y1:"+da.convertPersonYAxis(150)+"  X2:"+da.convertPersonXAxisWithDouble(710*(1.0/(rateSun)+0.005))+" Y2:"+da.convertPersonYAxis(150));
                               dt.lbTopic2Content1.setText("EAST: X1:"+da.convertPersonXAxis(820)+"  Y1:"+da.convertPersonYAxis(150)+"  X2:"+ da.convertPersonXAxisWithDouble(870*(rateSun+0.00005))+" Y2:"+da.convertPersonYAxis(150));
                               dt.lbTopic2Content2.setText("EAST SOUTH: X1:"+da.convertPersonXAxis(650)+"  Y1:"+da.convertPersonYAxis(30)+"  X2:"+ da.convertPersonXAxis(730)+" Y2:"+da.convertPersonYAxis(100));
                               dt.lbTopic2Content3.setText("WEST NORTH: X1:"+da.convertPersonXAxis(810)+"  Y1:"+da.convertPersonYAxis(180)+"  X2:"+da.convertPersonXAxis( 890)+" Y2:"+da.convertPersonYAxis(250));
                               dt.lbTopic3Content1.setText("WEST SOUTH: X1:"+da.convertPersonXAxis(680)+"  Y1:"+da.convertPersonYAxis(240)+"  X2:"+ da.convertPersonXAxis(730)+" Y2:"+da.convertPersonYAxis(190));
                               dt.lbTopic3Content2.setText("EAST NORTH: X1:"+da.convertPersonXAxis(825)+"  Y1:"+da.convertPersonYAxis(105)+"  X2:"+ da.convertPersonXAxis(880)+" Y2:"+da.convertPersonYAxis(40));
                                try{
                                    Thread.sleep(150);
                                   } catch (Exception exc){}
                                     }
                                 }
                                                    });

                                                    t2.start();
 
// a.drawLineBre(0, 452, 560, 452, 24, g);                  
//            //2 ĐƯỜNG XÉO Tây nam ĐÔNG bắc
//       a.drawLineBre(680, 240, 730, 190, 8, g);
//       a.drawLineBre(825, 105, 880, 40, 8, g);
//        a.drawLineBre(681, 240, 731, 190, 8, g);
//       a.drawLineBre(826, 105, 881, 40, 8, g);
//         a.drawLineBre(679, 240, 729, 190, 8, g);
//       a.drawLineBre(824, 105, 879, 40, 8, g);
                             
                            
                            
                             
                                         
//             //2 ĐƯỜNG TÂy bắc, đông nam
//         a.drawLineBre(650, 30, 730, 100, 8, g);
//         a.drawLineBre(810, 180, 890, 250, 8, g);
//         
//          a.drawLineBre(651, 30, 731, 100, 8, g);
//         a.drawLineBre(811, 180, 891, 250, 8, g);
//         
//         a.drawLineBre(649, 30, 729, 100, 8, g);
//         a.drawLineBre(809, 180, 889, 250, 8, g);
//            //2 ĐƯƠNG NGANG
//       a.drawLineBreWithDouble(660, 150, 710*(1.0/(rateSun)+0.005), 150, 8, g);
//       a.drawLineBreWithDouble(820, 150, 870*(rateSun+0.00005), 150, 8, g);
//       a.drawLineBreWithDouble(660, 149, 710*(1.0/(rateSun)+0.005), 149, 8, g);
//       a.drawLineBreWithDouble(820, 149, 870*(rateSun+0.00005), 149, 8, g);
//       a.drawLineBreWithDouble(660, 151, 710*(1.0/(rateSun+0.005)+0.005), 151, 8, g);
//       a.drawLineBreWithDouble(820, 151, 870*(rateSun+0.00005), 151, 8, g);
//            //2 ĐƯỜNG XÉO Tây nam ĐÔNG bắc
//       a.drawLineBre(680, 240, 730, 190, 8, g);
//       a.drawLineBre(825, 105, 880, 40, 8, g);
//        a.drawLineBre(681, 240, 731, 190, 8, g);
//       a.drawLineBre(826, 105, 881, 40, 8, g);
//         a.drawLineBre(679, 240, 729, 190, 8, g);
//       a.drawLineBre(824, 105, 879, 40, 8, g);
//                   // 2 ĐƯỜNG DỌC
//        
//         a.drawLineBreWithDouble(762, 10, 762, 80*(rateSun*0.75), 8, g);
//         a.drawLineBreWithDouble(762, 210, 762, 270*(rateSun*0.75), 8, g);
//         a.drawLineBreWithDouble(761, 10, 761, 80*(rateSun*0.75), 8, g);
//         a.drawLineBreWithDouble(761, 210, 761, 270*(rateSun*0.75), 8, g);
//          a.drawLineBreWithDouble(763, 10, 763, 80*(rateSun*0.75), 8, g);
//         a.drawLineBreWithDouble(763, 210, 763, 270*(rateSun*0.75), 8, g);
                             
                             
                             
                         }
                     });
                     lbSunShine.setForeground(colorWord);
                     panelDetail.add(lbSunShine); 

                     // //Label SUNSHINE
                        // //Label Water
                     JLabel lbWaterFlow=new JLabel("WATER FLOW");
                     lbWaterFlow.setBounds(700, 0, 150, 100);
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
                     // //Label SUNSHINE
                      
//                //2 DÒNG DƯỚI NỮA

//                //2 dong nữa nè
 

//          a.drawDash(-200+xWaterFlow, 570, 900+xWaterFlow, 570, 450, 16, g);
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
         
         
         //Label
         
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
                       String url="OceanBackground.jpg";
             img=new ImageIcon(url).getImage();    
             g2.drawImage(img, 0, 0,this);
                    //VẼ MẶT TRỜI NÈ
              // ĐƯỜNG TRÒN NÈ
       a.fillColorEclips(725, 105,65*rateSun,65*rateSun, 4, g);
       a.DrawCircle(270, 350, 20*rateSun, 4, g);
      
                    
                    
             //2 ĐƯỜNG TÂy bắc, đông nam
         a.drawLineBre(650, 30, 730, 100, 8, g);
         a.drawLineBre(810, 180, 890, 250, 8, g);
         
          a.drawLineBre(651, 30, 731, 100, 8, g);
         a.drawLineBre(811, 180, 891, 250, 8, g);
         
         a.drawLineBre(649, 30, 729, 100, 8, g);
         a.drawLineBre(809, 180, 889, 250, 8, g);
            //2 ĐƯƠNG NGANG
       a.drawLineBreWithDouble(660, 150, 710*(1.0/(rateSun)+0.005), 150, 8, g);
       a.drawLineBreWithDouble(820, 150, 870*(rateSun+0.00005), 150, 8, g);
       a.drawLineBreWithDouble(660, 149, 710*(1.0/(rateSun)+0.005), 149, 8, g);
       a.drawLineBreWithDouble(820, 149, 870*(rateSun+0.00005), 149, 8, g);
       a.drawLineBreWithDouble(660, 151, 710*(1.0/(rateSun+0.005)+0.005), 151, 8, g);
       a.drawLineBreWithDouble(820, 151, 870*(rateSun+0.00005), 151, 8, g);
            //2 ĐƯỜNG XÉO Tây nam ĐÔNG bắc
       a.drawLineBre(680, 240, 730, 190, 8, g);
       a.drawLineBre(825, 105, 880, 40, 8, g);
        a.drawLineBre(681, 240, 731, 190, 8, g);
       a.drawLineBre(826, 105, 881, 40, 8, g);
         a.drawLineBre(679, 240, 729, 190, 8, g);
       a.drawLineBre(824, 105, 879, 40, 8, g);
                   // 2 ĐƯỜNG DỌC
        
         a.drawLineBreWithDouble(762, 10, 762, 80*(rateSun*0.75), 8, g);
         a.drawLineBreWithDouble(762, 210, 762, 270*(rateSun*0.75), 8, g);
         a.drawLineBreWithDouble(761, 10, 761, 80*(rateSun*0.75), 8, g);
         a.drawLineBreWithDouble(761, 210, 761, 270*(rateSun*0.75), 8, g);
          a.drawLineBreWithDouble(763, 10, 763, 80*(rateSun*0.75), 8, g);
         a.drawLineBreWithDouble(763, 210, 763, 270*(rateSun*0.75), 8, g);
       
       
       
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
           a.drawDash(-280+xWaterFlow, 470, 900+xWaterFlow, 470, 150, 16, g);
           a.drawDash(-220+xWaterFlow, 470, 900+xWaterFlow, 470, 50, 16, g);
                //2 Dòng Dưới
          a.drawDash(-250+xWaterFlow, 480, 900+xWaterFlow, 480, 350, 16, g);
          a.drawDash(-300+xWaterFlow, 500, 900+xWaterFlow, 500, 200, 16, g);
                //2 DÒNG DƯỚI NỮA
          a.drawDash(-200+xWaterFlow, 520, 900+xWaterFlow, 520, 800, 25, g);
          a.drawDash(-200+xWaterFlow, 525, 900+xWaterFlow, 525, 800, 25, g);
          a.drawDash(-180+xWaterFlow, 540, 900+xWaterFlow, 540, 600, 25, g);
                //2 dong nữa nè
          a.drawDash(-330+xWaterFlow, 530, 900+xWaterFlow, 530, 200, 16, g);
          a.drawDash(-200+xWaterFlow, 570, 900+xWaterFlow, 570, 450, 16, g);
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
//            xb[0]=50; xb[1]=250; xb[2]=100 ;xb[3]=200;
//            yb[0]=550; yb[1]=550; yb[2]=590; yb[3]=590 ;  
            xb[0]=50+moveShip; xb[1]=150+moveShip; xb[2]=350+moveShip ;xb[3]=400+moveShip;
            yb[0]=530; yb[1]=590; yb[2]=590; yb[3]=530 ; 
//         a.drawLineBre(50, 550,250 , 550, 19, g);
//         a.drawLineBre(50, 550, 100, 590, 19, g);
//          a.drawLineBre(100, 590, 200, 590, 19, g);
//          a.drawLineBre(200, 590, 250, 550, 19, g);
          
          
          
         a.drawLineBre((int)(50+moveShip), 530,400 +moveShip, 530, 0, g);
         a.drawLineBre(50+moveShip, 530, 150+moveShip, 590, 0, g);
          a.drawLineBre(150+moveShip, 590, 350+moveShip, 590, 0, g);
          a.drawLineBre(350+moveShip, 590, 400+moveShip, 530, 0, g);
          a.fillColorTriangle(xb, yb, npointsb, 0, g);
          
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
           a.drawLineBre(235+moveShip, 350,100+moveShip , 510, 18, g);    
           a.drawLineBre(100+moveShip, 500,235 +moveShip, 515, 18, g);    
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
            else if(moveShip<600)
            {
                moveShip+=2;
            }
//            if(yCloud >= 230){
//                up = true;
//                down = false;
//            }
//            if(yCloud <= 7){
//                up = false;
//                down = true;
//            }
////            if(up){
////                yCloud=7;
////                Random random=new Random();
////                rand=random.nextInt(200);
////            }
////            if(down){
////                yCloud++;
////            }
            if(left){
                rateSun=1;
            }
            if(right){
                rateSun+=0.1;
            }
            try{
             Thread.sleep(150);
            } catch (Exception exc){}
            frame.repaint();
        }
    }
    
}
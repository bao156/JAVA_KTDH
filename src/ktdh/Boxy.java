/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktdh;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author USER
 */
public class Boxy extends javax.swing.JFrame {
   int color=0;
   int x=0,y=0, z=0,w=0, h=0, wide=0;
// String color;

    /**
     * Creates new form NewJFrame
     */
    
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
    
    
    public Boxy() {
       DrawingAlogithrm a=new DrawingAlogithrm();
        initComponents();
        this.setSize(1150, 600);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(255, 240, 230));
        ArrayList<String> arrColor=new ArrayList<>();
        arrColor.add("BLACK");
        arrColor.add("BLUE");
        arrColor.add("GREEN");
        arrColor.add("RED");
        arrColor.add("CYAN"); arrColor.add("YELLOW");
        arrColor.add("ORGANGE"); arrColor.add("PINK");
        arrColor.add("GRAY");arrColor.add("BROWN");
        for(String i:arrColor)
        {
            cbColor.addItem(i);
        }
        AutoCompleteDecorator.decorate(cbColor);
        
        
    }
    public boolean checkBoxy(String xAxis,String yAxis,String zAxis,String width,String height,String wide)
    {
        boolean check=true;
        boolean checkXAxis=true;
        boolean checkYAxis=true;
        boolean checkZAxis=true;
        boolean checkWidth=true;
        boolean checkWide=true;
         boolean checkHeight=true;
        //CHECK X
        for (int i=0;i<xAxis.length();i++)
            {
                 if(i==0)
                   {
                        if(xAxis.charAt(i)==45 )
                        {
                            checkXAxis=true;

                        }
                    }
                    else if(xAxis.charAt(i)<48 || xAxis.charAt(i)>57)
                     {
                         checkXAxis=false;
                         break;
                     }
             }
       //CHECK Y
   
            for (int i=0;i<yAxis.length();i++)
            {
                 if(i==0)
                   {
                        if(yAxis.charAt(i)==45 )
                        {
                            checkYAxis=true;

                        }
                    }
                    else if(yAxis.charAt(i)<48 || yAxis.charAt(i)>57)
                     {
                         checkYAxis=false;
                         break;
                     }
             }
            
            
         // CHECK Z
            for (int i=0;i<zAxis.length();i++)
            {
                  if(i==0)
                  {
                     if(zAxis.charAt(i)==45 )
                     {
                         checkZAxis=true;

                     }
                   }
                   else if(zAxis.charAt(i)<48 || zAxis.charAt(i)>57)
                   {
                       checkZAxis=false;
                       break;
                   }
             }
            
           
        //CHECK WIDTH     
            for (int i=0;i<width.length();i++)
            {
           
                  if(width.charAt(i)<48 || width.charAt(i)>57)
               {
               checkWidth=false;
               break;
               }
            }
       
         //CHECK WIDE
            for (int i=0;i<wide.length();i++)
            {
                   
                    if(wide.charAt(i)<48 || wide.charAt(i)>57)
                  {
                       checkWide=false;
                       break;
                   }
            }
            for (int i=0;i<height.length();i++)
            {
           
              if(height.charAt(i)<48 || height.charAt(i)>57)
                {
                  checkHeight=false;
                  break;
                 }
            }
            
            
            if(checkXAxis==false)
            {
               
                JOptionPane.showMessageDialog(null, "X IS NOT VALID","ERROR",JOptionPane.ERROR_MESSAGE);
                 check=false;
            }
            else if(checkYAxis==false)
            {
                JOptionPane.showMessageDialog(null, "Y IS NOT VALID","ERROR",JOptionPane.ERROR_MESSAGE);
                 check=false;
            }
            else if(checkZAxis==false)
            {
                JOptionPane.showMessageDialog(null, "Z IS NOT VALID","ERROR",JOptionPane.ERROR_MESSAGE);
                 check=false;
            }
            else if(checkWidth==false)
            {
               JOptionPane.showMessageDialog(null, "WIDTH IS NOT VALID","ERROR",JOptionPane.ERROR_MESSAGE);
                 check=false;
            }
            else if(checkWide==false)
            {
               JOptionPane.showMessageDialog(null, "WIDE IS NOT VALID","ERROR",JOptionPane.ERROR_MESSAGE);
                 check=false;
            }
            else if(checkHeight==false)
            {
                JOptionPane.showMessageDialog(null, "HEIGHT IS NOT VALID","ERROR",JOptionPane.ERROR_MESSAGE);
                 check=false;
            }
       
            
        return check;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegister = new javax.swing.JPanel();
        txtXAxis = new javax.swing.JTextField();
        cbColor = new javax.swing.JComboBox<>();
        lbAdd = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        txtHeight = new javax.swing.JTextField();
        txtMinimize = new javax.swing.JLabel();
        txtExit = new javax.swing.JLabel();
        txtYAxis = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        txtWide = new javax.swing.JTextField();
        lbColor = new javax.swing.JLabel();
        txtZAxis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        panelRegister.setBackground(new java.awt.Color(255, 240, 230));
        panelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black), "INSERTING", javax.swing.border.TitledBorder.ABOVE_TOP, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Dialog", 1, 21), new java.awt.Color(128, 102, 0)));
        panelRegister.setPreferredSize(new java.awt.Dimension(250, 530));
        panelRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtXAxis.setBackground(new java.awt.Color(255, 255, 255));
        txtXAxis.setFont(new java.awt.Font("Segoe Print", 2, 16)); // NOI18N
        txtXAxis.setForeground(new java.awt.Color(153, 153, 255));
        txtXAxis.setText("XAXIS");
        txtXAxis.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtXAxis.setCaretColor(new java.awt.Color(102, 0, 102));
        txtXAxis.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtXAxis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtXAxisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtXAxisFocusLost(evt);
            }
        });
        txtXAxis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtXAxisKeyPressed(evt);
            }
        });
        panelRegister.add(txtXAxis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 40));

        cbColor.setBackground(new java.awt.Color(255, 255, 255));
        cbColor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbColor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        cbColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbColorItemStateChanged(evt);
            }
        });
        panelRegister.add(cbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 100, 50));

        lbAdd.setFont(new java.awt.Font("VNI-Cooper", 1, 20)); // NOI18N
        lbAdd.setForeground(new java.awt.Color(255, 255, 102));
        lbAdd.setText("DRAW");
        lbAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAddMouseClicked(evt);
            }
        });
        panelRegister.add(lbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 80, 30));

        btAdd.setBackground(new java.awt.Color(102, 102, 102));
        btAdd.setForeground(new java.awt.Color(255, 255, 0));
        btAdd.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\Môn Lớp\\Kĩ Thuật phần mềm\\button.png")); // NOI18N
        btAdd.setBorder(null);
        btAdd.setBorderPainted(false);
        btAdd.setContentAreaFilled(false);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        panelRegister.add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 180, 70));

        txtHeight.setBackground(new java.awt.Color(255, 255, 255));
        txtHeight.setFont(new java.awt.Font("Segoe Print", 2, 16)); // NOI18N
        txtHeight.setForeground(new java.awt.Color(153, 153, 255));
        txtHeight.setText("HEIGHT");
        txtHeight.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtHeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHeightFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHeightFocusLost(evt);
            }
        });
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHeightKeyPressed(evt);
            }
        });
        panelRegister.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 180, 40));

        txtMinimize.setBackground(new java.awt.Color(255, 240, 230));
        txtMinimize.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        txtMinimize.setForeground(new java.awt.Color(204, 204, 0));
        txtMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMinimize.setText("-");
        txtMinimize.setOpaque(true);
        txtMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMinimizeMouseExited(evt);
            }
        });
        panelRegister.add(txtMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 20, 20));

        txtExit.setBackground(new java.awt.Color(255, 240, 230));
        txtExit.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtExit.setForeground(new java.awt.Color(204, 204, 0));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("x");
        txtExit.setOpaque(true);
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });
        panelRegister.add(txtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 30, 20));

        txtYAxis.setBackground(new java.awt.Color(255, 255, 255));
        txtYAxis.setFont(new java.awt.Font("Segoe Print", 2, 16)); // NOI18N
        txtYAxis.setForeground(new java.awt.Color(153, 153, 255));
        txtYAxis.setText("YAXIS");
        txtYAxis.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtYAxis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtYAxisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtYAxisFocusLost(evt);
            }
        });
        txtYAxis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtYAxisKeyPressed(evt);
            }
        });
        panelRegister.add(txtYAxis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, 40));

        txtWidth.setBackground(new java.awt.Color(255, 255, 255));
        txtWidth.setFont(new java.awt.Font("Segoe Print", 2, 16)); // NOI18N
        txtWidth.setForeground(new java.awt.Color(153, 153, 255));
        txtWidth.setText("WIDTH");
        txtWidth.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtWidth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWidthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWidthFocusLost(evt);
            }
        });
        txtWidth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWidthKeyPressed(evt);
            }
        });
        panelRegister.add(txtWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 180, 40));

        txtWide.setBackground(new java.awt.Color(255, 255, 255));
        txtWide.setFont(new java.awt.Font("Segoe Print", 2, 16)); // NOI18N
        txtWide.setForeground(new java.awt.Color(153, 153, 255));
        txtWide.setText("WIDE");
        txtWide.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtWide.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWideFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWideFocusLost(evt);
            }
        });
        txtWide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtWideKeyPressed(evt);
            }
        });
        panelRegister.add(txtWide, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 180, 40));

        lbColor.setBackground(new java.awt.Color(0, 0, 0));
        lbColor.setOpaque(true);
        panelRegister.add(lbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 70, 50));

        txtZAxis.setBackground(new java.awt.Color(255, 255, 255));
        txtZAxis.setFont(new java.awt.Font("Segoe Print", 2, 16)); // NOI18N
        txtZAxis.setForeground(new java.awt.Color(153, 153, 255));
        txtZAxis.setText("ZAXIS");
        txtZAxis.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        txtZAxis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtZAxisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtZAxisFocusLost(evt);
            }
        });
        txtZAxis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZAxisKeyPressed(evt);
            }
        });
        panelRegister.add(txtZAxis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 854, Short.MAX_VALUE)
                .addComponent(panelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtXAxisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXAxisFocusGained
        // TODO add your handling code here:
        if(txtXAxis.getText().trim().toUpperCase().equals("XAXIS"))
        {
            txtXAxis.setFont(new Font("Dialog", Font.BOLD, 16));
            txtXAxis.setForeground(new Color(10, 15, 15));
            txtXAxis.setText("");
        }
    }//GEN-LAST:event_txtXAxisFocusGained

    private void txtXAxisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXAxisFocusLost
        // TODO add your handling code here:
        if(txtXAxis.getText().trim().toUpperCase().equals(""))
        {
            txtXAxis.setFont(new Font("Segoe Print", Font.ITALIC, 16));
            txtXAxis.setForeground(new Color(153,153,255));
            txtXAxis.setText("XAXIS");
        }
    }//GEN-LAST:event_txtXAxisFocusLost

    private void lbAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddMouseClicked
        // TODO add your handling code here:
        if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
        repaint();
        panelRegister.repaint();
        }
    }//GEN-LAST:event_lbAddMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
     if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
        repaint();
        panelRegister.repaint();
        }

    }//GEN-LAST:event_btAddActionPerformed

    private void txtHeightFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeightFocusGained
        // TODO add your handling code here:
        if(txtHeight.getText().trim().toUpperCase().equals("HEIGHT"))
        {
           txtHeight.setFont(new Font("Dialog", Font.BOLD, 16));
            txtHeight.setForeground(new Color(10, 15, 15));
            txtHeight.setText("");
        }
    }//GEN-LAST:event_txtHeightFocusGained

    private void txtHeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeightFocusLost
        // TODO add your handling code here:
        if(txtHeight.getText().trim().toUpperCase().equals(""))
        {
            txtHeight.setFont(new Font("Segoe Print", Font.ITALIC, 16));
            txtHeight.setForeground(new Color(153,153,255));
            txtHeight.setText("HEIGHT");
        }

    }//GEN-LAST:event_txtHeightFocusLost

    private void txtMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseClicked
        // TODO add your handling code here:
        setState(this.ICONIFIED);
    }//GEN-LAST:event_txtMinimizeMouseClicked

    private void txtMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseEntered
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(200, 0,0));
         txtMinimize.setForeground(Color.yellow);
    }//GEN-LAST:event_txtMinimizeMouseEntered

    private void txtMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinimizeMouseExited
        // TODO add your handling code here:
        txtMinimize.setBackground(new Color(255,240,230));
        txtMinimize.setForeground(new Color(204,204,0));
    }//GEN-LAST:event_txtMinimizeMouseExited

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        // TODO add your handling code here:
        txtExit.setBackground(new Color(200, 0,0));
        

    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        // TODO add your handling code here:
        txtExit.setBackground(new Color(255,240,230));
        txtExit.setForeground(new Color(204,204,0));
    }//GEN-LAST:event_txtExitMouseExited

    private void txtYAxisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYAxisFocusGained
        // TODO add your handling code here:
         if(txtYAxis.getText().trim().toUpperCase().equals("YAXIS"))
        {
            txtYAxis.setFont(new Font("Dialog", Font.BOLD, 16));
            txtYAxis.setForeground(new Color(10, 15, 15));
            txtYAxis.setText("");
        }
    }//GEN-LAST:event_txtYAxisFocusGained

    private void txtYAxisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYAxisFocusLost
        // TODO add your handling code here:
        if(txtYAxis.getText().trim().toUpperCase().equals(""))
        {
            txtYAxis.setFont(new Font("Segoe Print", Font.ITALIC, 16));
            txtYAxis.setForeground(new Color(153,153,255));
            txtYAxis.setText("YAXIS");
        }
    }//GEN-LAST:event_txtYAxisFocusLost

    private void txtWidthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWidthFocusGained
        // TODO add your handling code here:
        if(txtWidth.getText().trim().toUpperCase().equals("WIDTH"))
        {
            txtWidth.setFont(new Font("Dialog", Font.BOLD, 16));
            txtWidth.setForeground(new Color(10, 15, 15));
            txtWidth.setText("");
        }
    }//GEN-LAST:event_txtWidthFocusGained

    private void txtWidthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWidthFocusLost
        // TODO add your handling code here:
        if(txtWidth.getText().trim().toUpperCase().equals(""))
        {
            txtWidth.setFont(new Font("Segoe Print", Font.ITALIC, 16));
            txtWidth.setForeground(new Color(153,153,255));
            txtWidth.setText("WIDTH");
        }
    }//GEN-LAST:event_txtWidthFocusLost

    private void txtWideFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWideFocusGained
        // TODO add your handling code here:
            if(txtWide.getText().trim().toUpperCase().equals("WIDE"))
        {
            txtWide.setFont(new Font("Dialog", Font.BOLD, 16));
            txtWide.setForeground(new Color(10, 15, 15));
            txtWide.setText("");
        }

    }//GEN-LAST:event_txtWideFocusGained

    private void txtWideFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWideFocusLost
        // TODO add your handling code here:
           if(txtWide.getText().trim().toUpperCase().equals(""))
        {
            txtWide.setFont(new Font("Segoe Print", Font.ITALIC, 16));
            txtWide.setForeground(new Color(153,153,255));
            txtWide.setText("WIDE");
        }
    }//GEN-LAST:event_txtWideFocusLost

    private void cbColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbColorItemStateChanged
        // TODO add your handling code here:
        if(String.valueOf(cbColor.getEditor().getItem()).equals("BLACK"))
        {
           lbColor.setBackground(Color.black);
           color=0;
        }
        else if(String.valueOf(cbColor.getEditor().getItem()).equals("BLUE"))
        {
           lbColor.setBackground(Color.blue);
           color=1;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("GREEN"))
        {
           lbColor.setBackground(Color.GREEN);  
           color=2;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("RED"))
        {
           lbColor.setBackground(Color.red);
           color=4;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("CYAN"))
        {
           lbColor.setBackground(Color.cyan);
           color=3;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("YELLOW"))
        {
           lbColor.setBackground(Color.yellow);
           color=8;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("ORGANGE"))
        {
           lbColor.setBackground(Color.orange);
           color=10;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("PINK"))
        {
           lbColor.setBackground(Color.PINK);
           color=11;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("GRAY"))
        {
           lbColor.setBackground(Color.GRAY);
           color=7;
        }
         else if(String.valueOf(cbColor.getEditor().getItem()).equals("BROWN"))
        {
           lbColor.setBackground(new Color(77, 38, 0));
           color=13;
        }
    }//GEN-LAST:event_cbColorItemStateChanged

    private void txtHeightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
       if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
        repaint();
        panelRegister.repaint();
        }
        }
    }//GEN-LAST:event_txtHeightKeyPressed

    private void txtWideKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWideKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
        
        repaint();
        panelRegister.repaint();
        }
        }
    }//GEN-LAST:event_txtWideKeyPressed

    private void txtWidthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWidthKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
        
        repaint();
        panelRegister.repaint();
        }
        }
    }//GEN-LAST:event_txtWidthKeyPressed

    private void txtYAxisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYAxisKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
       if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
        
        repaint();
        panelRegister.repaint();
        }
        }
    }//GEN-LAST:event_txtYAxisKeyPressed

    private void txtXAxisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXAxisKeyPressed
        // TODO add your handling code here:
                 if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
       if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
    
        repaint();
        panelRegister.repaint();
        }
        }
    }//GEN-LAST:event_txtXAxisKeyPressed

    private void txtZAxisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtZAxisFocusGained
        // TODO add your handling code here:
      if(txtZAxis.getText().trim().toUpperCase().equals("ZAXIS"))
        {
            txtZAxis.setFont(new Font("Dialog", Font.BOLD, 16));
            txtZAxis.setForeground(new Color(10, 15, 15));
            txtZAxis.setText("");
        }
       
    }//GEN-LAST:event_txtZAxisFocusGained

    private void txtZAxisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtZAxisFocusLost
        // TODO add your handling code here:
        if(txtZAxis.getText().trim().toUpperCase().equals(""))
        {
            txtZAxis.setFont(new Font("Segoe Print", Font.ITALIC, 16));
            txtZAxis.setForeground(new Color(153,153,255));
            txtZAxis.setText("ZAXIS");
        }
    }//GEN-LAST:event_txtZAxisFocusLost

    private void txtZAxisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZAxisKeyPressed
        // TODO add your handling code here:
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
       if(checkBoxy(txtXAxis.getText(),txtYAxis.getText(),txtZAxis.getText(), txtWidth.getText(), txtHeight.getText(), txtWide.getText())==true)
        {
        x=Integer.parseInt(txtXAxis.getText());
        y=Integer.parseInt(txtYAxis.getText());
        z=Integer.parseInt(txtZAxis.getText());
        w=Integer.parseInt(txtWidth.getText());
        h=Integer.parseInt(txtHeight.getText());
        wide=Integer.parseInt(txtWide.getText());
        
        
        repaint();
        panelRegister.repaint();
        }
        }
    }//GEN-LAST:event_txtZAxisKeyPressed

    /**
     * @param args the command line arguments
     */
    
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
//10: Organge
//11: pink
//12: Gray
//13: Browns
//14: Nước biển
//15: Màu mây
//16: Dòng chảy
//17: NÚI TÔNG NHẸ 2
//18: NÚI TÔNG NHẸ 1
//19: NÚI TÔNG NHẸ 0
//20: MÀU NẮNG    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
         DrawingAlogithrm a=new DrawingAlogithrm();
         Graphics2D g2=(Graphics2D)g;
         a.DrawAxis3D(500, 300, g);
          a.RectangularPrism(x,y ,z, w, h,wide, color, g);
        
     }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Boxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boxy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btAdd;
    public javax.swing.JComboBox<String> cbColor;
    public javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbColor;
    public javax.swing.JPanel panelRegister;
    public javax.swing.JLabel txtExit;
    public javax.swing.JTextField txtHeight;
    private javax.swing.JLabel txtMinimize;
    public javax.swing.JTextField txtWide;
    public javax.swing.JTextField txtWidth;
    public javax.swing.JTextField txtXAxis;
    public javax.swing.JTextField txtYAxis;
    public javax.swing.JTextField txtZAxis;
    // End of variables declaration//GEN-END:variables
}

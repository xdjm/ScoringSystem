/*   1:    */
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Dimension;
/*   5:    */ import java.awt.Font;
/*   6:    */ import java.awt.Rectangle;
/*   9:    */ import java.awt.event.KeyEvent;
/*  10:    */ import java.awt.event.KeyListener;
/*  11:    */ import javax.swing.BorderFactory;
/*  12:    */ import javax.swing.ImageIcon;
/*  13:    */ import javax.swing.JButton;
/*  14:    */ import javax.swing.JFrame;
/*  15:    */ import javax.swing.JLabel;
/*  16:    */ import javax.swing.JOptionPane;
/*  17:    */ import javax.swing.JPanel;
/*  18:    */ import javax.swing.JTextField;
/*  19:    */ 
/*  20:    */ public class Main
/*  21:    */   extends JFrame
/*  22:    */ {
/*  23:    */   private static Main frame;
    /*  26:    */   private JTextField jTextField_input;
    /*  29:    */   private Counter counter;
/*  30:    */   private int i=0;
/*  31:    */   public Main()
/*  32:    */   {
/*  33: 39 */
    JPanel panel = new JPanel();
/*  34:    */     
/*  35: 41 */     setSize(1024, 768);
/*  36: 42 */     setResizable(false);
/*  37: 43 */     setTitle("");
/*  38: 44 */     ImageIcon img = new ImageIcon("cover.jpg");
/*  39: 45 */     JLabel background = new JLabel(img);
/*  40: 46 */     background.setSize(new Dimension(1024, 768));
/*  41: 47 */     background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
/*  42: 48 */     setContentPane(panel);
/*  43: 49 */     panel.setLayout(null);
/*  44:    */     
/*  45: 51 */     Font f = new Font("宋体", Font.BOLD, 50);
/*  46:    */     
/*  47: 53 */
    JLabel jLabel_input = new JLabel();
/*  48: 54 */     jLabel_input.setBounds(new Rectangle(200, 400, 800, 50));
/*  49: 55 */     jLabel_input.setFont(f);
/*  50: 56 */     jLabel_input.setText("请输入评委人数：");
/*  51: 57 */     jLabel_input.setForeground(Color.red);
/*  52: 58 */     panel.add(jLabel_input, null);
/*  53:    */     
/*  54: 60 */     this.jTextField_input = new JTextField();
/*  55: 61 */     this.jTextField_input.setBounds(new Rectangle(650, 400, 200, 50));
/*  56: 62 */     this.jTextField_input.setToolTipText("请输入大于4的整数");
/*  57: 63 */     this.jTextField_input.setFont(f);
/*  58: 64 */     this.jTextField_input.setForeground(Color.red);
/*  59: 65 */     this.jTextField_input.addKeyListener(new KeyListener()
/*  60:    */     {
/*  61:    */       public void keyPressed(KeyEvent e)
/*  62:    */       {
/*  63: 70 */         if (e.getKeyCode() == 10)
/*  64:    */         {
/*  65: 72 */           int n;
/*  66: 73 */           String number = Main.this.jTextField_input.getText();
/*  67: 75 */           for (; i < number.length(); i++) {
/*  68: 76 */             if ((number.charAt(i) < '0') || (number.charAt(i) > '9'))
/*  69:    */             {
/*  70: 79 */               JOptionPane.showMessageDialog(null, "输入不合法,,请输入大于4的整数");
/*  71: 80 */               break;
/*  72:    */             }
/*  73:    */           }
/*  74: 83 */           if (number.length() == 0)
/*  75:    */           {
/*  76: 84 */             JOptionPane.showMessageDialog(null, "输入不能为空");
/*  77:    */           }
/*  78: 85 */           else if ( number.length()>=1)
/*  79:    */           {
/*  80: 87 */             n = Integer.parseInt(number);
/*  81: 88 */             if (n <= 3)
/*  82:    */             {
/*  83: 89 */               JOptionPane.showMessageDialog(null, "输入不合法,请输入大于4的整数");
/*  84:    */             }
/*  85:    */             else
/*  86:    */             {
/*  87: 92 */               Main.this.counter = new Counter(n);
/*  88: 93 */               Main.this.counter.setSize(1024, 768);
/*  89: 94 */               Main.this.counter.setVisible(true);
/*  90:    */               
/*  91: 96 */               Main.frame.setVisible(false);
/*  92:    */             }
/*  93:    */           }
/*  94:    */         }
/*  95:    */       }
/*  96:    */       
/*  97:    */       public void keyReleased(KeyEvent e) {}
/*  98:    */       
/*  99:    */       public void keyTyped(KeyEvent e) {}
/* 100:116 */     });
/* 101:117 */     panel.add(this.jTextField_input);
/* 102:    */     
/* 103:119 */
    JButton jBtn_begin = new JButton();
/* 104:120 */     jBtn_begin.setBounds(new Rectangle(200, 600, 250, 50));
/* 105:121 */     jBtn_begin.setText("进入系统");
/* 106:122 */     jBtn_begin.setFont(f);
/* 107:123 */     jBtn_begin.setBackground(Color.white);
/* 108:124 */     jBtn_begin.setForeground(Color.blue);
/* 109:125 */     jBtn_begin.setContentAreaFilled(false);
/* 110:126 */     jBtn_begin.setBorder(BorderFactory.createRaisedBevelBorder());
/* 111:    */     
/* 112:128 */     /* 113:    *//* 114:    *//* 115:    *//* 146:164 */
    jBtn_begin.addActionListener(e -> {
    /* 116:134 */         int n;
    /* 117:135 */         String number = Main.this.jTextField_input.getText();
    /* 118:137 */         for (int i = 0; i < number.length(); i++) {
    /* 119:138 */           if ((number.charAt(i) < '0') || (number.charAt(i) > '9'))
    /* 120:    */           {
    /* 121:141 */             JOptionPane.showMessageDialog(null, "输入不合法,,请输入大于4的整数");
    /* 122:142 */             break;
    /* 123:    */           }
    /* 124:    */         }
    /* 125:145 */         if (number.length() == 0)
    /* 126:    */         {
    /* 127:146 */           JOptionPane.showMessageDialog(null, "输入不能为空");
    /* 128:    */         }
    /* 129:147 */         else if (number.length()>=1)
    /* 130:    */         {
    /* 131:148 */           n = Integer.parseInt(number);
    /* 132:149 */           if ((n > 15) || (n <= 3))
    /* 133:    */           {
    /* 134:150 */             JOptionPane.showMessageDialog(null, "输入不合法,请输入大于4同时小于20的整数");
    /* 135:    */           }
    /* 136:    */           else
    /* 137:    */           {
    /* 138:153 */             Main.this.counter = new Counter(n);
    /* 139:154 */             Main.this.counter.setSize(1024, 768);
    /* 140:155 */             Main.this.counter.setVisible(true);
    /* 141:    */
    /* 142:157 */             Main.frame.setVisible(false);
    /* 143:    */           }
    /* 144:    */         }
    /* 145:    */       });
/* 147:165 */     panel.add(jBtn_begin);
/* 148:    */     
/* 149:167 */
    JButton jBtn_exit = new JButton();
/* 150:168 */     jBtn_exit.setBounds(new Rectangle(600, 600, 250, 50));
/* 151:169 */     jBtn_exit.setText("退出系统");
/* 152:170 */     jBtn_exit.setFont(f);
/* 153:171 */     jBtn_exit.setBackground(Color.white);
/* 154:172 */     jBtn_exit.setForeground(Color.blue);
/* 155:173 */     jBtn_exit.setContentAreaFilled(false);
/* 156:174 */     jBtn_exit.setBorder(BorderFactory.createRaisedBevelBorder());
/* 157:175 */     /* 158:    *//* 159:    *//* 160:    *//* 163:179 */
    jBtn_exit.addActionListener(e -> {
    /* 161:177 */         System.exit(0);
    /* 162:    */       });
/* 164:180 */     panel.add(jBtn_exit);
/* 165:181 */     panel.add(background, new Integer(-2147483648));
/* 166:    */   }
/* 167:    */   
/* 168:    */   public static void main(String[] args)
/* 169:    */   {
/* 170:186 */     frame = new Main();
/* 171:187 */     Center.centerFrame(frame);
/* 172:188 */     frame.setVisible(true);
/* 173:189 */     frame.setDefaultCloseOperation(3);
/* 174:    */   }
/* 175:    */ }



/* Location:           C:\Users\Administrator\Desktop\计分系统\BiWu.jar

 * Qualified Name:     mtn.bfxy.biwu.Main

 * JD-Core Version:    0.7.0.1

 */
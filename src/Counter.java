/*   1:    */
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Dimension;
/*   5:    */ import java.awt.Font;
/*   6:    */ import java.awt.Rectangle;
/*   7:    */ import java.awt.event.KeyEvent;
/*   8:    */ import java.awt.event.KeyListener;
/*   9:    */ import javax.swing.ImageIcon;
/*  10:    */ import javax.swing.JFrame;
/*  11:    */ import javax.swing.JLabel;
/*  12:    */ import javax.swing.JOptionPane;
/*  13:    */ import javax.swing.JPanel;
/*  14:    */ import javax.swing.JTextField;
/*  15:    */ 
/*  16:    */ public class Counter
/*  17:    */   extends JFrame
/*  18:    */ {
/*  19:    */   private int num;
/*  20:    */   private JTextField[] str2;
/*  21:    */   private JPanel bg;
/*  22:    */   private double[] result;
/*  23:    */   private JTextField content;
/*  24:    */   private JLabel pub;
/*  25:    */   
/*  26:    */    Counter(int n)
/*  27:    */   {
/*  28: 26 */     this.num = n;
/*  29: 27 */     this.str2 = new JTextField[n];
/*  30:    */     
/*  31: 29 */     this.result = new double[n];
/*  32: 30 */     this.bg = new JPanel();
/*  33: 31 */     this.content = new JTextField();
/*  34: 32 */     this.pub = new JLabel();
/*  35: 33 */     initialize();
/*  36:    */   }
/*  37:    */   
/*  38:    */
private void initialize()
/*  39:    */   {
/*  40: 38 */     Font f = new Font("宋体", Font.BOLD, 50);
/*  41: 39 */     this.content.setBounds(250, 200, 500, 300);
/*  42: 40 */     this.content.setForeground(Color.black);
/*  43: 41 */     this.content.setForeground(Color.red);
/*  44: 42 */     this.content.setEditable(false);
/*  45: 43 */     this.content.setHorizontalAlignment(0);
/*  46: 44 */     this.content.setFont(new Font("宋体", Font.BOLD, 200));
/*  47:    */     
/*  48: 46 */     setSize(1024, 768);
/*  49: 47 */     setResizable(false);
/*  50: 48 */     setTitle("");
/*  51: 49 */     ImageIcon img = new ImageIcon("bg.JPG");
/*  52: 50 */     JLabel background = new JLabel(img);
/*  53: 51 */     background.setSize(new Dimension(1024, 768));
/*  54: 52 */     background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
/*  55: 53 */     this.pub.setForeground(Color.blue);
/*  56: 54 */     this.pub.setBounds(new Rectangle(400, 600, 400, 50));
/*  57: 55 */     this.pub.setFont(f);
/*  58:    */     
/*  59: 57 */     setContentPane(this.bg);
/*  60: 58 */     this.bg.setLayout(null);
/*  61: 59 */     this.bg.add(this.pub);
/*  62:    */     
/*  63: 61 */     this.bg.setLayout(null);
/*  64: 62 */     this.bg.add(this.content);
/*  65: 63 */     for (int i = 0; i < this.num; i++)
/*  66:    */     {
/*  67: 65 */       this.str2[i] = new JTextField();
/*  68:    */       
/*  69:    */ 
/*  70: 68 */       this.str2[i].setBounds(new Rectangle(750, 600, 150, 50));
/*  71:    */       
/*  72:    */ 
/*  73:    */ 
/*  74:    */ 
/*  75: 73 */       this.str2[i].setText(String.valueOf(""));
/*  76: 74 */       this.str2[i].setForeground(Color.black);
/*  77: 75 */       this.str2[i].setBackground(Color.WHITE);
/*  78: 76 */       this.str2[i].setFont(f);
/*  79:    */       
/*  80: 78 */       this.str2[i].setVisible(false);
/*  81:    */       
/*  82:    */ 
/*  83: 81 */       this.bg.add(this.str2[i]);
/*  84:    */     }
/*  85: 83 */     process(this.num - 1);
/*  86:    */     
/*  87:    */ 
/*  88:    */ 
/*  89:    */ 
/*  90:    */ 
/*  91:    */ 
/*  92: 90 */     this.bg.add(background, new Integer(-2147483648));
/*  93:    */   }
/*  94:    */   
/*  95:    */
private void process(int tmp)
/*  96:    */   {
/*  97: 94 */     final int[] i = new int[1];
/*  98: 95 */     if (tmp > 0) {
/*  99: 95 */       process(tmp - 1);
/* 100:    */     }
/* 101: 96 */     i[0] = tmp;
/* 102: 97 */     this.pub.setText("1号评委打分：");
/* 103: 98 */     this.str2[i[0]].setVisible(true);
/* 104: 99 */     this.str2[i[0]].setFocusable(true);
/* 105:100 */     this.content.setText("");
/* 106:101 */     this.str2[i[0]].addKeyListener(new KeyListener()
/* 107:    */     {
/* 108:    */       public void keyPressed(KeyEvent e)
/* 109:    */       {
/* 110:107 */         if (e.getKeyCode() == 10)
/* 111:    */         {
/* 112:109 */           String number = Counter.this.str2[i[0]].getText();
/* 113:111 */           if (number.length() == 0)
/* 114:    */           {
/* 115:112 */             JOptionPane.showMessageDialog(null, "输入不能为空");
/* 116:    */           }
/* 117:    */           else
/* 118:    */           {
/* 119:114 */             boolean flag = true;
/* 120:115 */             Double n = null;
/* 121:    */             try
/* 122:    */             {
/* 123:117 */               n = Double.parseDouble(number);
/* 124:    */             }
/* 125:    */             catch (NumberFormatException e1)
/* 126:    */             {
/* 127:120 */               JOptionPane.showMessageDialog(null, "输入不是合法数字");
/* 128:121 */               flag = false;
/* 129:    */             }
/* 130:123 */             if (flag) {
/* 131:125 */               if ((n >= 0.0D) && (n <= 100.0D))
/* 132:    */               {
/* 133:126 */                 Counter.this.content.setText(n.toString());
/* 134:127 */                 Counter.this.result[i[0]] = n;
/* 135:128 */                 if ((i[0] >= 0) && 
/* 136:129 */                   (i[0] + 1 + 1 <= Counter.this.num)) {
/* 137:130 */                   Counter.this.pub.setText(i[0] + 1 + 1 + "号评委打分：");
/* 138:    */                 }
/* 139:133 */                 Counter.this.str2[i[0]].setVisible(false);
/* 140:134 */                 if (i[0] >= Counter.this.num - 1)
/* 141:    */                 {
/* 142:135 */                   Result r = new Result(Counter.this.result, Counter.this.num);
/* 143:136 */                   r.setSize(1024, 768);
/* 144:137 */                   r.setVisible(true);
/* 145:138 */                   Counter.this.setVisible(false);
/* 146:    */                 }
/* 147:    */               }
/* 148:    */               else
/* 149:    */               {
/* 150:143 */                 JOptionPane.showMessageDialog(null, "请输入0~100之间的数字");
/* 151:    */               }
/* 152:    */             }
/* 153:    */           }
/* 154:    */         }
/* 155:    */       }
/* 156:    */       
/* 157:    */       public void keyReleased(KeyEvent e) {}
/* 158:    */       
/* 159:    */       public void keyTyped(KeyEvent e) {}
/* 160:    */     });
/* 161:    */   }
/* 162:    */   
/* 163:    */   public static void main(String[] args)
/* 164:    */   {
/* 165:165 */     Counter c = new Counter(5);
/* 166:166 */     c.setDefaultCloseOperation(3);
/* 167:167 */     c.setVisible(true);
/* 168:    */   }
/* 169:    */ }



/* Location:           C:\Users\Administrator\Desktop\计分系统\BiWu.jar

 * Qualified Name:     mtn.bfxy.biwu.Counter

 * JD-Core Version:    0.7.0.1

 */
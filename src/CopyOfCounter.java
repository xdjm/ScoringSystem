/*   1:    */
/*   2:    */ 
/*   3:    */ import java.awt.Color;
/*   4:    */ import java.awt.Dimension;
/*   5:    */ import java.awt.Font;
/*   6:    */ import java.awt.Rectangle;
/*   7:    */ import java.awt.event.KeyEvent;
/*   8:    */ import java.awt.event.KeyListener;
/*  10:    */ import javax.swing.ImageIcon;
/*  11:    */ import javax.swing.JFrame;
/*  12:    */ import javax.swing.JLabel;
/*  13:    */ import javax.swing.JOptionPane;
/*  14:    */ import javax.swing.JPanel;
/*  15:    */ import javax.swing.JTextField;
/*  16:    */ 
/*  17:    */ public class CopyOfCounter
/*  18:    */   extends JFrame
/*  19:    */ {
/*  20:    */   private int num;
/*  21:    */   private JTextField[] str2;
/*  22:    */   private JLabel[] str;
/*  23:    */   private JPanel bg;
/*  24:    */   private double[] result;
/*  25:    */   private JTextField content;
private int j =0;
/*  26:    */   
/*  27:    */
private CopyOfCounter(int n)
/*  28:    */   {
/*  29: 26 */     this.num = n;
/*  30: 27 */     this.str2 = new JTextField[n];
/*  31: 28 */     this.str = new JLabel[n];
/*  32: 29 */     this.result = new double[n];
/*  33: 30 */     this.bg = new JPanel();
/*  34: 31 */     this.content = new JTextField();
/*  35:    */     
/*  36: 33 */     initialize();
/*  37:    */   }
/*  38:    */   
/*  39:    */
private void initialize()
/*  40:    */   {
/*  41: 38 */     Font f = new Font("宋体", Font.BOLD, 50);
/*  42: 39 */     this.content.setBounds(350, 200, 300, 300);
/*  43: 40 */     this.content.setForeground(Color.black);
/*  44: 41 */     this.content.setEditable(false);
/*  45: 42 */     this.content.setFont(new Font("宋体", Font.BOLD, 100));
/*  46:    */     
/*  47: 44 */     setSize(1024, 710);
/*  48: 45 */     setResizable(false);
/*  49: 46 */     setTitle("");
/*  50: 47 */     ImageIcon img = new ImageIcon("101.JPG");
/*  51: 48 */     JLabel background = new JLabel(img);
/*  52: 49 */     background.setSize(new Dimension(1024, 710));
/*  53: 50 */     background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
/*  54: 51 */     setContentPane(this.bg);
/*  55: 52 */     this.bg.setLayout(null);
/*  56:    */     
/*  57:    */ 
/*  58: 55 */     this.bg.setLayout(null);
/*  59: 56 */     this.bg.add(this.content);
/*  60: 57 */     for (int i = 0; i < this.num; i++)
/*  61:    */     {
/*  62: 58 */       this.str[i] = new JLabel();
/*  63: 59 */       this.str2[i] = new JTextField();
/*  64:    */       
/*  65: 61 */       this.str[i].setBounds(new Rectangle(400, 600, 400, 50));
/*  66: 62 */       this.str2[i].setBounds(new Rectangle(750, 600, 150, 50));
/*  67:    */       
/*  68: 64 */       this.str[i].setText(i + 1 + "号评委打分：");
/*  69: 65 */       this.str[i].setForeground(Color.BLUE);
/*  70: 66 */       this.str[i].setFont(f);
/*  71: 67 */       this.str2[i].setText(String.valueOf(""));
/*  72: 68 */       this.str2[i].setForeground(Color.blue);
/*  73: 69 */       this.str2[i].setBackground(Color.WHITE);
/*  74: 70 */       this.str2[i].setFont(f);
/*  75: 71 */       this.str[i].setVisible(false);
/*  76: 72 */       this.str2[i].setVisible(false);
/*  77:    */       
/*  78: 74 */       this.bg.add(this.str[i]);
/*  79: 75 */       this.bg.add(this.str2[i]);
/*  80:    */     }
/*  81: 77 */     process(0);
/*  82: 78 */     this.bg.add(background, new Integer(-2147483648));
/*  83:    */   }
/*  84:    */   
/*  85:    */   private void process(int tmp)
/*  86:    */   {
/*  87: 82 */     final int[] i = new int[1];
/*  88: 83 */     if (tmp < this.num - 1) {
/*  89: 83 */       process(tmp + 1);
/*  90:    */     }
/*  91: 84 */     i[0] = tmp;
/*  92: 85 */     this.str[i[0]].setVisible(true);
/*  93: 86 */     this.str2[i[0]].setVisible(true);
/*  94: 87 */     for (int t = 0; t < this.num; t++) {
/*  95: 88 */       if (t != i[0])
/*  96:    */       {
/*  97: 89 */         this.str[t].setVisible(false);
/*  98: 90 */         this.str2[t].setVisible(false);
/*  99:    */       }
/* 100:    */     }
/* 101: 93 */     this.content.setText("");
/* 102: 94 */     this.str2[i[0]].addKeyListener(new KeyListener()
/* 103:    */     {
/* 104:    */       public void keyPressed(KeyEvent e)
/* 105:    */       {
/* 106: 99 */         if (e.getKeyCode() == 10)
/* 107:    */         {
/* 108:100 */           String number = CopyOfCounter.this.str2[i[0]].getText();
/* 109:102 */           for (; j < number.length(); j++) {
/* 110:103 */             if ((number.charAt(j) < '0') || 
/* 111:104 */               (number.charAt(j) > '9'))
/* 112:    */             {
/* 113:107 */               JOptionPane.showMessageDialog(null, 
/* 114:108 */                 "输入不合法,,请输入大于4且小于50的整数");
/* 115:109 */               break;
/* 116:    */             }
/* 117:    */           }
/* 118:112 */           if (number.length() == 0)
/* 119:    */           {
/* 120:113 */             JOptionPane.showMessageDialog(null, "输入不能为空");
/* 121:    */           }
/* 122:114 */           else if (j >= number.length())
/* 123:    */           {
/* 124:115 */             Double n = Double.parseDouble(number);
/* 125:116 */             CopyOfCounter.this.content.setText(n.toString());
/* 126:117 */             CopyOfCounter.this.result[i[0]] = n;
/* 127:118 */             CopyOfCounter.this.str[i[0]].setVisible(false);
/* 128:119 */             CopyOfCounter.this.str2[i[0]].setVisible(false);
/* 129:120 */             System.out.println(n);
/* 130:    */           }
/* 131:    */         }
/* 132:    */       }
/* 133:    */       
/* 134:    */       public void keyReleased(KeyEvent e) {}
/* 135:    */       
/* 136:    */       public void keyTyped(KeyEvent e) {}
/* 137:    */     });
/* 138:    */   }
/* 139:    */   
/* 140:    */   public static void main(String[] args)
/* 141:    */   {
/* 142:138 */     CopyOfCounter c = new CopyOfCounter(4);
/* 143:139 */     c.setDefaultCloseOperation(3);
/* 144:140 */     c.setVisible(true);
/* 145:    */   }
/* 146:    */ }



/* Location:           C:\Users\Administrator\Desktop\计分系统\BiWu.jar

 * Qualified Name:     mtn.bfxy.biwu.CopyOfCounter

 * JD-Core Version:    0.7.0.1

 */